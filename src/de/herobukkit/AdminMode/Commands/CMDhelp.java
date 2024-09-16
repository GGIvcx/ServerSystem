package de.herobukkit.AdminMode.Commands;


import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDhelp implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("help") || cmd.getName().equalsIgnoreCase("hilfe") || cmd.getName().equalsIgnoreCase("?")) {
			if (sender instanceof Player) {
				p.sendMessage("§7");
				p.sendMessage("§7");
				p.sendMessage("§7");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-§aHilfecenter§7-x-x-x-x-x-x-");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7TeamSpeak §9/ts §7or §9/teamspeak");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Shop §9/shop §7or §9/donate");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Forum §9/forum");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Apply §9/apply §7or §9/bewerben");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Report a Player §9/report");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Request support §9/support");
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-§aHilfecenter§7-x-x-x-x-x-x-");
				p.sendMessage("§7");
				
				if(p.hasPermission("system.support.get") || p.hasPermission("system.showthehidden")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§7-x-x-x-x-x-§bPassive§7-x-x-x-x-x-x-");}
				if(p.hasPermission("system.support.get")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You get Supportrequests because of your permissions!");}
				if(p.hasPermission("system.showthehidden")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You can see hidden players because of your permissions!");}
				if(p.hasPermission("system.staff")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You where recognized as a Staffmember because of your permissions!");}
				if(p.hasPermission("system.support.get") || p.hasPermission("system.showthehidden")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§7-x-x-x-x-x-§bPassive§7-x-x-x-x-x-x-");}
				p.sendMessage("§7");
				
				if(p.hasPermission("system.show") || p.hasPermission("system.hide") || p.hasPermission("system.heal") || p.hasPermission("system.faq") || p.hasPermission("system.cc") || p.hasPermission("system.bring") || p.hasPermission("system.bc") || p.hasPermission("system.adminmode") || p.hasPermission("system.jumpto") || p.hasPermission("system.scoreboard") || p.hasPermission("system.setspawn") || p.hasPermission("system.setspec") || p.hasPermission("system.spec")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§7-x-x-x-x-x-§cStaff§7-x-x-x-x-x-x-");}
				if(p.hasPermission("system.adminmode")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Toggle Adminmode §9/admin");}
				if(p.hasPermission("system.bc")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Broadcast a message §9/bc <Message>");}
				if(p.hasPermission("system.bring")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Bring a Player to you §9/bring <Player>");}
				if(p.hasPermission("system.cc")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Clear the Chat §9/cc");}
				if(p.hasPermission("system.faq")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Send the FAQ in Chat §9/faq");}
				if(p.hasPermission("system.heal")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Heal a Player §9/heal <Player>");}
				if(p.hasPermission("system.hide")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Hide a Player §9/hide <Player>");}
				if(p.hasPermission("system.show")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Show a Player §9/show <Play>");}
				if(p.hasPermission("system.jumpto")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Teleport to a Player §9/jumpto <Player>");}
				if(p.hasPermission("system.scoreboard")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Toggle the Scoreboard §9/sb <True / False>");}
				if(p.hasPermission("system.setspawn")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Set the Spawnpoint §9/setspawn");}
				if(p.hasPermission("system.setspec")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Set the Spectator spawnpoint §9/setspec");}
				if(p.hasPermission("system.spec")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Toggle the Spectatormode §9/spec");}
				if(p.hasPermission("system.show") || p.hasPermission("system.hide") || p.hasPermission("system.heal") || p.hasPermission("system.faq") || p.hasPermission("system.cc") || p.hasPermission("system.bring") || p.hasPermission("system.bc") || p.hasPermission("system.adminmode") || p.hasPermission("system.jumpto") || p.hasPermission("system.scoreboard") || p.hasPermission("system.setspawn") || p.hasPermission("system.setspec") || p.hasPermission("system.spec")){p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§7-x-x-x-x-x-§cStaff§7-x-x-x-x-x-x-");}
				p.sendMessage("§7");
				
				
				
				
				
				
				
				//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		} else {
			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Bitte benutze §9/help §7!");
		}
		return false;
		
	}
	
    
	

}
