package de.herobukkit.AdminMode.Commands;


import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDforum implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("forum")) {
			if (sender instanceof Player) {
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Our Forum: §e" + Main.getInstance().getConfig().getString("ServerSystem.Forum"));
				//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		} else {
			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Please use §9/forum§7!");
		}
		return false;
		
	}
	
    
	

}
