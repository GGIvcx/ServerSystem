package de.herobukkit.AdminMode.Commands;


import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDbring implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("bring")) {
			if (sender instanceof Player) {
				Player player = (Player)sender;
				if(player.hasPermission("system.bring")){
				if(args.length == 1){
					String Name = args[0];
					if(Bukkit.getPlayer(Name) != null){
						Player target = (Player)Bukkit.getPlayer(Name);
						 target.teleport(player);
						 player.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " �8| �eThe Player �6" + target.getName() + " �ewas brought to you");
						 //player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
						 return true;
					} else {
						player.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " �8| �cCant find Player!");
					}
				} else {
					player.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " �8| �cTo many or to little argument!");
                    return false;
				}
			} else {
				player.sendMessage("�6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "�8 | �7You need to be �cMod �7or higher");
			}
		}
	}
		return false;
 }
}