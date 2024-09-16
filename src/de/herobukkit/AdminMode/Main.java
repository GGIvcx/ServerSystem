package de.herobukkit.AdminMode;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import de.herobukkit.AdminMode.Commands.CMDadminmode;
import de.herobukkit.AdminMode.Commands.CMDapply;
import de.herobukkit.AdminMode.Commands.CMDbc;
import de.herobukkit.AdminMode.Commands.CMDbring;
import de.herobukkit.AdminMode.Commands.CMDcc;
import de.herobukkit.AdminMode.Commands.CMDdc;
import de.herobukkit.AdminMode.Commands.CMDfaq;
import de.herobukkit.AdminMode.Commands.CMDforum;
import de.herobukkit.AdminMode.Commands.CMDheal;
import de.herobukkit.AdminMode.Commands.CMDhelp;
import de.herobukkit.AdminMode.Commands.CMDhide;
import de.herobukkit.AdminMode.Commands.CMDjumpto;
import de.herobukkit.AdminMode.Commands.CMDscoreboard;
import de.herobukkit.AdminMode.Commands.CMDsetspawn;
import de.herobukkit.AdminMode.Commands.CMDsetspec;
import de.herobukkit.AdminMode.Commands.CMDshop;
import de.herobukkit.AdminMode.Commands.CMDshow;
import de.herobukkit.AdminMode.Commands.CMDspawn;
import de.herobukkit.AdminMode.Commands.CMDspec;
import de.herobukkit.AdminMode.Commands.CMDsupport;
import de.herobukkit.AdminMode.Commands.CMDts;
import de.herobukkit.AdminMode.Listener.Events;

public class Main extends JavaPlugin {
	
	
	
	public static ArrayList<Player> adminmode = new ArrayList<Player>();
	public static ArrayList<Player> spec = new ArrayList<Player>();
//	public static String prefix2 = "§6 System §8| §7";

	private static Main instance;

	@EventHandler
	public void onEnable() {
		
    instance = this;
	
	getCommand("admin").setExecutor(new CMDadminmode());
	getCommand("faq").setExecutor(new CMDfaq());
	getCommand("cc").setExecutor(new CMDcc());
	getCommand("show").setExecutor(new CMDshow());
	getCommand("support").setExecutor(new CMDsupport());
	getCommand("spec").setExecutor(new CMDspec());
	getCommand("jumpto").setExecutor(new CMDjumpto());
	getCommand("setspec").setExecutor(new CMDsetspec());
	getCommand("bring").setExecutor(new CMDbring());
	getCommand("setspawn").setExecutor(new CMDsetspawn());
	getCommand("hide").setExecutor(new CMDhide());
	getCommand("heal").setExecutor(new CMDheal());
	getCommand("teamspeak").setExecutor(new CMDts());
	getCommand("ts").setExecutor(new CMDts());
	getCommand("forum").setExecutor(new CMDforum());
	getCommand("apply").setExecutor(new CMDapply());
	getCommand("bewerben").setExecutor(new CMDapply());
	getCommand("shop").setExecutor(new CMDshop());
	getCommand("donate").setExecutor(new CMDshop());
	getCommand("hilfe").setExecutor(new CMDhelp());
	getCommand("help").setExecutor(new CMDhelp());
	getCommand("?").setExecutor(new CMDhelp());
	getCommand("bc").setExecutor(new CMDbc());
	getCommand("sb").setExecutor(new CMDscoreboard());
	getCommand("spawn").setExecutor(new CMDspawn());
	getCommand("dc").setExecutor(new CMDdc());
	getCommand("discord").setExecutor(new CMDdc());
	getServer().getPluginManager().registerEvents(new Events(), this);
	
	initConfig();
	
	
	
	System.out.println("[ServerSystem] " + Main.getInstance().getConfig().getString("ServerSystem.ServerName") + " Started successfully");
	}

	public static Main getInstance() {
		return instance;
	}
	
    public void initConfig(){

		this.reloadConfig();			
		
		this.getConfig().options().header("Hier kannst du mein Plugin Konfigurieren, Bitte verändere die Koordinaten die später mit /setspawn, /setspec gesetzt werden nicht in dieser Datei, nur inGame durch die Befehle -Hero");
		this.getConfig().addDefault("ServerSystem.ServerName", "YourServer");
		this.getConfig().addDefault("ServerSystem.Prefix", "System");
		this.getConfig().addDefault("ServerSystem.TeamSpeak", "ts.YourServer.de");
		this.getConfig().addDefault("ServerSystem.Forum", "forum.YourServer.de");
		this.getConfig().addDefault("ServerSystem.Discord", "discord.gg/YourServer");
		this.getConfig().addDefault("ServerSystem.faq.shop", "shop.YourServer.de");
		this.getConfig().addDefault("ServerSystem.faq.apply", "apply.YourServer.de");
		this.getConfig().addDefault("ServerSystem.faq.report", "/report [Hacker] [Reason]");
		this.getConfig().addDefault("ServerSystem.support.CommandToTeleportToPlayer", "/jumpto");
		this.getConfig().addDefault("ServerSystem.Scoreboard", true);
		this.getConfig().addDefault("ServerSystem.TeleportToSpawnOnJoin", true);
		this.getConfig().addDefault("ServerSystem.Prefix1", "&4Administrator");
		this.getConfig().addDefault("ServerSystem.Prefix2", "&bSrDeveloper");
		this.getConfig().addDefault("ServerSystem.Prefix3", "&bDeveloper");
		this.getConfig().addDefault("ServerSystem.Prefix4", "&cSrModerator");
		this.getConfig().addDefault("ServerSystem.Prefix5", "&cModerator");
		this.getConfig().addDefault("ServerSystem.Prefix6", "&9Helper");
		this.getConfig().addDefault("ServerSystem.Prefix7", "&5YouTuber");
		this.getConfig().addDefault("ServerSystem.Prefix8", "&6VIP");
		this.getConfig().addDefault("ServerSystem.Prefix9", "&6Premium+");
		this.getConfig().addDefault("ServerSystem.Prefix10", "&6Premium");
		this.getConfig().addDefault("ServerSystem.PrefixStandart", "&aPlayer");
		
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		System.out.println("[ServerSystem] config.yml succesfully (re)loaded");
    }
    
   
    
}

//Main.getInstance().getConfig().getString("ServerSystem.faq.messages.report")
//§6System §8| §7