package de.herobukkit.AdminMode.Commands;


import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDapply implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("apply") || cmd.getName().equalsIgnoreCase("bewerben")) {
			if (sender instanceof Player) {
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Apply hear: §e" + Main.getInstance().getConfig().getString("ServerSystem.faq.apply"));
				//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		} else {
			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Please use §9/apply §7!");
		}
		return false;
		
	}
	
    
	

}
