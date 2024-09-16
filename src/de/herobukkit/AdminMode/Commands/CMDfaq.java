package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;


public class CMDfaq implements CommandExecutor{
		
	
	
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		if(cmd.getName().equalsIgnoreCase("faq")) {
			if (sender instanceof Player) {
				
				Player p = (Player)sender;
				if(p.hasPermission("system.faq")){
					if(args.length == 0) {
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cHow can i support the Server?");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |  §8-> §7By visiting our shop §3" + Main.getInstance().getConfig().getString("ServerSystem.faq.shop"));
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cI want to join the §4" + Main.getInstance().getConfig().getString("ServerSystem.ServerName") + " §cTeam!");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |  §8-> §7Apply at §3" + Main.getInstance().getConfig().getString("ServerSystem.faq.apply"));
						Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cHow can i report a Hacker?");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |  §8-> §3" + Main.getInstance().getConfig().getString("ServerSystem.faq.report"));
						Bukkit.broadcastMessage("§7");
						//Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cWem gehört der Server?");
						//Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |  §8-> §7Die Serverleitung unterliegt der §cAdministration");
						//Bukkit.broadcastMessage("§7");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cI need a Staffmember!");
						Bukkit.broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |  §8-> §7Use §3/support");
						Bukkit.broadcastMessage("§7");
						//p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					}
				} else {
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §cMod §7or higher");
				}
				}
				
			}

		return false;
		
	}
}