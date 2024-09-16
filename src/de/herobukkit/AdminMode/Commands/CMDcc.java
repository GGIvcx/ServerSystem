package de.herobukkit.AdminMode.Commands;

//Lass es einfach so :D
//PS, Der chatclear ist für alle sichtbar

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDcc implements CommandExecutor {
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		if(cmd.getName().equalsIgnoreCase("cc")) {
			if (sender instanceof Player) {
				Player p = (Player)sender;
				if(p.hasPermission("system.cc")){
					if(args.length == 0) {
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Chat was cleared!");
					}
				} else {
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §cMod §7or higher");
				}
				
					
				}
			}
			
		
		return false;
		
	}

}
