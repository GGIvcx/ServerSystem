package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;

public class CMDspec implements CommandExecutor{
	
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String labels, String[] args) {
		
	
		if (cmd.getName().equalsIgnoreCase("spec")){
			if (sender instanceof Player){
				Player p = (Player)sender;
				if (p.hasPermission("system.spec")){
					if(args.length == 0) {
						if(Main.spec.contains(p)) {
							Main.spec.remove(p);
							
							FileConfiguration config = Main.getInstance().getConfig();
							World world = Bukkit.getWorld(config.getString("spectator.world"));
							double x = config.getDouble("spectator.x");
							double y = config.getDouble("spectator.y");
							double z = config.getDouble("spectator.z");
							float yaw = (float) config.getDouble("spectator.Yaw");
							float pitch = (float) config.getDouble("spectator.Pitch");
							Location location = new Location (world, x, y, z, yaw, pitch);
							p.teleport(location);
							
							p.sendTitle("§6Spectatormode","§8 » §cDeactivatet");
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You are now a §eSpectator§7");
							//p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
							p.setPlayerListName(p.getName());
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.showPlayer(p);
								}
							
									
					} else {
						
						Main.spec.add(p);
						
						FileConfiguration config = Main.getInstance().getConfig();
						World world = Bukkit.getWorld(config.getString("spectator.world"));
						double x = config.getDouble("spectator.x");
						double y = config.getDouble("spectator.y");
						double z = config.getDouble("spectator.z");
						float yaw = (float) config.getDouble("spectator.Yaw");
						float pitch = (float) config.getDouble("spectator.Pitch");
						Location location = new Location (world, x, y, z, yaw, pitch);
						p.teleport(location);
						
						p.sendTitle("§6Spectatormode","§8 » §aActivatet");
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You are no longe a §eSpectator§7");
						//p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
						p.setPlayerListName("§9Hidden §8» §r" + p.getName());
						for (Player all : Bukkit.getOnlinePlayers()) {
							all.hidePlayer(p);
							if(all.hasPermission("system.showthehidden")) {
								all.showPlayer(p);
							}
						}
						
						}
					}
							
						} else {
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §cMod §7or higher");
							
						}
								
							
							
						} 
							
						
					}
					
				
					
					
				
			
			
		
		return false;
	}
	

}

// DAS ALLES HIER IST IRRELEVANT:
//Du musst:                        Hier die Welt und Koordinaten einfügen
//                                           |       |    |    |
//p.teleport(new Location(Bukkit.getWorld("world"), 100, 100, 100));
//
// Das ist nur ein Beispiel die eigentlichen Daten musst du oben in die zwei gleichen zeilen eingeben
//WICHTIG::!! Du darfst dich dort nicht verschreiben!!!! Die Angaben müssen bei beiden identisch sein!!!!
//
//Diese angaben legen fest zu welchen punkt auf der Map man teleportiert wird wenn man "/spec" ausführt

//p.teleport(new Location(Bukkit.getWorld(Main.getInstance().getConfig().getString("ServerSystem.spectate.Welt")), 196, 77, 81));