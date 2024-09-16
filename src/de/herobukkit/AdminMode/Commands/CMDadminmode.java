package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.herobukkit.AdminMode.Main;

//Hier solltest du nichts ändern wenn du es nicht verstehst :D

public class CMDadminmode implements CommandExecutor {	

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("admin")) {
			if (sender instanceof Player){
				
				Player p = (Player)sender;
				
				if(p.hasPermission("system.adminmode")) {
					if(args.length == 0) {
						if(Main.adminmode.contains(p)) {
							Main.adminmode.remove(p);
							p.setGameMode(GameMode.SURVIVAL);
							p.sendTitle("§6Adminmode","§8 » §cDeactivatet");
							p.sendMessage("§7");
							p.sendMessage("§7");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-x-x-x-x-x-");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §eAdminMode §7- §cdisabled");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §8Invisibility §7- §coff");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §8Nightvision §7- §coff");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-x-x-x-x-x-");
							p.removePotionEffect(PotionEffectType.NIGHT_VISION);
							for(int i=0;i<=10;i++){
								p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
							}
						    //p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
							p.setPlayerListName(p.getName());
							
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.showPlayer(p);
							}
						} else {
							Main.adminmode.add(p);
							p.setGameMode(GameMode.CREATIVE);
							p.sendTitle("§6Adminmode","§8 » §aActivatet");
							p.sendMessage("§7");
							p.sendMessage("§7");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-x-x-x-x-x-");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §eAdminMode §7- §aenabled");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §8Invisibility §7- §aon");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §8Nightvision §7- §aon");
							p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7-x-x-x-x-x-x-x-x-x-x-");
							p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 250), true);
							for(int i=0;i<=10;i++){
								p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
							}
							//p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
							
							p.setPlayerListName("§9Hidden §8» §r" + p.getName());
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.hidePlayer(p);
								if(all.hasPermission("system.showthehidden")) {
									all.showPlayer(p);
								}
									
							}
							
						}
					} else {
						p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §cPlease use §4/Admin");
					}
					
				} else {
					p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §4Admin §7or higher");
				}
			}
		
		}

		return false;
		}

}
