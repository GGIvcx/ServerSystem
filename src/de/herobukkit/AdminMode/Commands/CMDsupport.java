package de.herobukkit.AdminMode.Commands;


import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.herobukkit.AdminMode.Main;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.TextComponent;

public class CMDsupport implements CommandExecutor{
	
	public boolean onCommand (CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("support")) {
			if (sender instanceof Player) {
				Player p = (Player)sender;
				p.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §eSuccessfully requested support!");
				//p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				TextComponent tc = new TextComponent();
				for (Player all : Bukkit.getOnlinePlayers()) {
					if (all.hasPermission("system.support.get")) {
						all.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §eThe Player §6" + p.getName() + " §eneeds Support!");
						//all.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
						tc.setText("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + " §8| §c[Teleport to Player]");
						tc.setClickEvent(new ClickEvent(Action.RUN_COMMAND, Main.getInstance().getConfig().getString("ServerSystem.support.CommandToTeleportToPlayer") +" " + p.getName()));
						all.spigot().sendMessage(tc);
						
						
					}
				}
			}
			
		}
		return false;
		
	}
	
    
	

}
