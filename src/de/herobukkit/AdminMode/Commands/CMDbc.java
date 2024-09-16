package de.herobukkit.AdminMode.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import de.herobukkit.AdminMode.Main;

public class CMDbc implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String labels, String[] args) {
		//Broadcast Message
        if(labels.equalsIgnoreCase("bc")){
            if(!sender.hasPermission("system.bc")) {
                sender.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7You need to be §cMod §7or higher");
                return true;
            }
                if(args.length == 0) {
                    sender.sendMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 | §7Use §9/bc <Message>§7!");
                }else {
                    String message = "";
                    for (String part : args) {
                            if (message != "") message += " ";
                            message += part;
        }
                        Bukkit.getServer().broadcastMessage("§6" + Main.getInstance().getConfig().getString("ServerSystem.Prefix") + "§8 |" + " " + ChatColor.YELLOW + message);
                }
 
 
        }
		return false;
	}

}
