package de.herobukkit.AdminMode.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDsetspawn implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("setspawn")){
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(player.hasPermission("system.setspawn")){
				if(args.length == 0){
					
					FileConfiguration config = Main.getInstance().getConfig();
					config.set("spawnpoint.world", player.getWorld().getName());
					config.set("spawnpoint.x", player.getLocation().getX());
					config.set("spawnpoint.y", player.getLocation().getY());
					config.set("spawnpoint.z", player.getLocation().getZ());
					config.set("spawnpoint.Yaw", player.getLocation().getYaw());
					config.set("spawnpoint.Pitch", player.getLocation().getPitch());
					Main.getInstance().saveConfig();
					player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §aSaved current location!");
				} else {
					player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cPlease use §e/setspawn§c!");
				}
			} else {
				player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cInsufficient permissions!");
			}
			
		}
	}
		return false;

  }

}
