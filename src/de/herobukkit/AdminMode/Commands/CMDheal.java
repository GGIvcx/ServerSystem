package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDheal implements CommandExecutor{
	
public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("heal")) {
			if (sender instanceof Player) {
				Player p = (Player)sender;
				if(p.hasPermission("system.heal")){
					if(args.length == 0) {
						p.setHealth(20);
						p.setFoodLevel(20);
						p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Your where §ahealt");
						//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);

					} else if(args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if(target != null){
							target.setHealth(20);
							target.setFoodLevel(20);
							target.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Your where §ahealt");
							
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Player §e" + target.getName() + " §7was §ahealt");
							
						} else
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cThe Player §e" + args[0] + " §ccannot be found!");
					} else
						p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Please use §9/heal <Player>§7!");
					
				} else {
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §cMod §7or higher");
				}
				
			}
			
		}
		return false;
		
		
	}
}
	
