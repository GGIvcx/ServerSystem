package de.herobukkit.AdminMode.Commands;


import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDshop implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("shop") || cmd.getName().equalsIgnoreCase("donate")) {
			if (sender instanceof Player) {
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Our Shop: §e" + Main.getInstance().getConfig().getString("ServerSystem.faq.shop"));
				//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		} else {
			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Please use §9/shop §7or §9/donate§7!");
		}
		return false;
		
	}
	
    
	

}
