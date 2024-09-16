package de.herobukkit.AdminMode;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import net.md_5.bungee.api.ChatColor;


public class ScoreboardClass {
	
	
	public static void sendScoreboard(Player player) {
		
		
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective objective = board.getObjective("aaa") != null ? board.getObjective("aaa") : board.registerNewObjective("aaa", "bbb");
		
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName("§9§l" + Main.getInstance().getConfig().getString("ServerSystem.ServerName"));
		objective.getScore("        ").setScore(11);
		objective.getScore("§7Rank:").setScore(10);
		if(player.getName().equalsIgnoreCase("Ivcx")) {
			objective.getScore("§8 » §9idiot :)").setScore(9);
		} else if(player.hasPermission("system.1")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix1"))).setScore(9);
		} else if (player.hasPermission("system.2")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix2"))).setScore(9);
		} else if (player.hasPermission("system.3")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix3"))).setScore(9);
		} else if (player.hasPermission("system.4")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix4"))).setScore(9);
		} else if (player.hasPermission("system.5")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix5"))).setScore(9);
		} else if (player.hasPermission("system.6")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix6"))).setScore(9);
		} else if (player.hasPermission("system.7")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix7"))).setScore(9);
		} else if (player.hasPermission("system.8")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix8"))).setScore(9);
		} else if (player.hasPermission("system.9")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix9"))).setScore(9);
		} else if (player.hasPermission("system.10")) {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.Prefix10"))).setScore(9);
		} else {
			objective.getScore("§8 » " + ChatColor.translateAlternateColorCodes ('&', Main.getInstance().getConfig().getString("ServerSystem.PrefixStandart"))).setScore(8);
		}
		objective.getScore("     ").setScore(8);
		objective.getScore("§7Name:").setScore(7);
		objective.getScore("§8 » §e" + player.getName()).setScore(7);
		objective.getScore("        ").setScore(6);
		objective.getScore("§7TeamSpeak:").setScore(5);
		objective.getScore("§8 » §e" + Main.getInstance().getConfig().getString("ServerSystem.TeamSpeak")).setScore(4);
		objective.getScore("       ").setScore(3);
		objective.getScore("§7Forum:").setScore(2);
		objective.getScore("§8 » §e" + Main.getInstance().getConfig().getString("ServerSystem.Forum")).setScore(1);
		
		if (Main.getInstance().getConfig().getBoolean("ServerSystem.Scoreboard") == true) {
			player.setScoreboard(board);
			System.out.println("[ServerSystem] Scoreboard is enabled");
		} else if (Main.getInstance().getConfig().getBoolean("ServerSystem.Scoreboard") == false) {
			System.out.println("[ServerSystem] Scoreboard is disabled");
		}
	}
	
	

}
