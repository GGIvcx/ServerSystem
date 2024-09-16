package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;
import de.herobukkit.AdminMode.ScoreboardClass;

public class CMDscoreboard implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("sb")){
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(player.hasPermission("system.scoreboard")){
				if(args.length == 1){
					if (args[0].equalsIgnoreCase("true")) {
						FileConfiguration config = Main.getInstance().getConfig();
						config.set("ServerSystem.Scoreboard", true);
						Main.getInstance().saveConfig();
						for (Player all : Bukkit.getOnlinePlayers()) {
							ScoreboardClass.sendScoreboard(all);
						}
						player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §7Saved and §aenabled!");
					} else if (args[0].equalsIgnoreCase("false")) {
						FileConfiguration config = Main.getInstance().getConfig();
						config.set("ServerSystem.Scoreboard", false);
						Main.getInstance().saveConfig();
						player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §7Saved and §cdisabled!");
						for (Player all : Bukkit.getOnlinePlayers()) {
							all.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
						}
					} else {
						player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cPlease use §e/sb [True/False]§c!");
					}
					
					
				} else {
					player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cPlease use §e/sb [True/False]§c!");
				}
			} else {
				player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cInsufficient permissions!");
			}
			
		}
	}
		return false;

  }
	

}
