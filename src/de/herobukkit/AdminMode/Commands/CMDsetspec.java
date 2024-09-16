package de.herobukkit.AdminMode.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDsetspec implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("setspec")){
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(player.hasPermission("system.setspec")){
				if(args.length == 0){
					
					FileConfiguration config = Main.getInstance().getConfig();
					config.set("spectator.world", player.getWorld().getName());
					config.set("spectator.x", player.getLocation().getX());
					config.set("spectator.y", player.getLocation().getY());
					config.set("spectator.z", player.getLocation().getZ());
					config.set("spectator.Yaw", player.getLocation().getYaw());
					config.set("spectator.Pitch", player.getLocation().getPitch());
					Main.getInstance().saveConfig();
					player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §aSaved current location!");
				} else {
					player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cNutze bitte §e/setspec§c!");
				}
			} else {
				player.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cInsufficient permissions!");
			}
			
		}
	}
		return false;

  }
}
