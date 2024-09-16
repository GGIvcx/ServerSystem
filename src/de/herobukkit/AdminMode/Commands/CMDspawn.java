package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDspawn implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("spawn")) {
			if (sender instanceof Player) {
				if(args.length == 0){
					FileConfiguration config = Main.getInstance().getConfig();
					World world = Bukkit.getWorld(config.getString("spawnpoint.world"));
					double x = config.getDouble("spawnpoint.x");
					double y = config.getDouble("spawnpoint.y");
					double z = config.getDouble("spawnpoint.z");
					float yaw = (float) config.getDouble("spawnpoint.Yaw");
					float pitch = (float) config.getDouble("spawnpoint.Pitch");
					Location location = new Location (world, x, y, z, yaw, pitch);
					p.teleport(location);
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Teleporting to §9Spawn§7...");
				//	p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				} else if(args.length == 1 && p.hasPermission("system.staff")){
					String Name = args[0];
					if(Bukkit.getPlayer(Name) != null){
						Player target = (Player)Bukkit.getPlayer(Name);
						FileConfiguration config = Main.getInstance().getConfig();
						World world = Bukkit.getWorld(config.getString("spawnpoint.world"));
						double x = config.getDouble("spawnpoint.x");
						double y = config.getDouble("spawnpoint.y");
						double z = config.getDouble("spawnpoint.z");
						float yaw = (float) config.getDouble("spawnpoint.Yaw");
						float pitch = (float) config.getDouble("spawnpoint.Pitch");
						Location location = new Location (world, x, y, z, yaw, pitch);
						target.teleport(location);
					} else {
						p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §cCant find Player!");
					}
				} else {
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Please use §9/spawn §7!");
				}
			}
			
		} 
		return false;
		
	}

}
