package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDshow implements CommandExecutor{
	
public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("show")) {
			if (sender instanceof Player) {
				Player p = (Player)sender;
				if(p.hasPermission("system.show")){
					if(args.length == 0) {
						//p.removePotionEffect(PotionEffectType.INVISIBILITY);
						p.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �7You are now �3visible");
						//p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
						p.setPlayerListName(p.getName());
						for(int i=0;i<=10;i++){
							p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
						}
						
						for (Player all : Bukkit.getOnlinePlayers()) {
							all.showPlayer(p);
						}
					} else if(args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if(target != null){
							target.setPlayerListName(target.getName());
							for(int i=0;i<=10;i++){
								p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
							}
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.showPlayer(target);
								
							}
							p.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �7The Player �e" + target.getName() + " �7is now �3visible");
							
						} else
							p.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �cThe Player �e" + args[0] + " �ccannot be found");
					} else
						p.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �7Please use �9/show <Player>�7!");
					
				} else {
					p.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �7You need to be �cMod �7or higher");
				}
				
			}
			
		}
		return false;
		
		
	}
	

}
//Hier solltest du nichts machen ;)
//Geht eig. alles so