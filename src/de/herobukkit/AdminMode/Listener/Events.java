package de.herobukkit.AdminMode.Listener;



import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.help.HelpTopic;
import org.bukkit.potion.PotionEffectType;

import de.herobukkit.AdminMode.Main;
import de.herobukkit.AdminMode.ScoreboardClass;

public class Events implements Listener {
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		for (Player all : Bukkit.getOnlinePlayers()) {
			ScoreboardClass.sendScoreboard(all);
		}
     //   ScoreboardClass.sendScoreboard(p);
		if (p.getName().equalsIgnoreCase("Ivcx")) {
			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Du wurdest als §9Entwickler §7erkannt :)");
			p.setDisplayName("§4" + p.getName() + "§f");
			p.setPlayerListName(p.getDisplayName());
		}
		if (p.hasPermission("system.staff")) {
			e.setJoinMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Staffmember §6" + p.getName() + " §7joined the game");
			p.setGameMode(GameMode.SURVIVAL);
			p.sendTitle("§6Welcome","§7" + "§eStaffmember §7 " + p.getName());
			//p.playSound(p.getLocation(), Sound.block.anvil.land, 1, 1);
			p.removePotionEffect(PotionEffectType.NIGHT_VISION);
			p.removePotionEffect(PotionEffectType.INVISIBILITY);
			
			if (Main.getInstance().getConfig().getBoolean("ServerSystem.TeleportToSpawnOnJoin") == true) {
				FileConfiguration config = Main.getInstance().getConfig();
				World world = Bukkit.getWorld(config.getString("spawnpoint.world"));
				double x = config.getDouble("spawnpoint.x");
				double y = config.getDouble("spawnpoint.y");
				double z = config.getDouble("spawnpoint.z");
				float yaw = (float) config.getDouble("spawnpoint.Yaw");
				float pitch = (float) config.getDouble("spawnpoint.Pitch");
				Location location = new Location (world, x, y, z, yaw, pitch);
				p.teleport(location);
			}
			
			p.setDisplayName("§7" + p.getName());
			p.setPlayerListName(p.getDisplayName());
			
			
		} else {
			
			for (Player all : Bukkit.getOnlinePlayers()) {
				ScoreboardClass.sendScoreboard(all);
			}
			FileConfiguration config = Main.getInstance().getConfig();
			World world = Bukkit.getWorld(config.getString("spawnpoint.world"));
			double x = config.getDouble("spawnpoint.x");
			double y = config.getDouble("spawnpoint.y");
			double z = config.getDouble("spawnpoint.z");
			float yaw = (float) config.getDouble("spawnpoint.Yaw");
			float pitch = (float) config.getDouble("spawnpoint.Pitch");
			Location location = new Location (world, x, y, z, yaw, pitch);
			p.teleport(location);
			
			p.setGameMode(GameMode.SURVIVAL);
		    p.sendTitle("§6Welcome","§7" + p.getName());
		    //p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
		    e.setJoinMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Player §6" + p.getName() + " §7joined the game");
		    
		}
		for (Player admin : Main.adminmode) {
			p.hidePlayer(admin);
		}
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (p.hasPermission("system.staff")) {
			e.setQuitMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Staffmember §6" + p.getName() + " §7left the game");
		} else {
			e.setQuitMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7The Player §6"+ p.getName() + " §7left the game");
		}
		
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onfalseCommand(PlayerCommandPreprocessEvent event) {
    	if (!(event.isCancelled())) {
    		Player p = event.getPlayer();
    		String msg = event.getMessage().split(" ")[0];
    		HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
    		if (topic == null) {
    			p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §7Unknown command");
    			event.setCancelled(true);
    		}
    	}
    }
	
		
}
	

