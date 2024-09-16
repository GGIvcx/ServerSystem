![banner](https://raw.githubusercontent.com/GGIvcx/ServerSystem/main/images/banner.png)
# What does the Plugin do?
This plugin implements some helpful commands to manage your server.

# Supportet Versions
- Spigot 1.21.1

## Features
- Toggleable Adminmode
- Teleportation commands
- Custom help page
- Vanish
- Custom scoreboard
- Custom Spawnpoint (Toggleable if players can use it)
- Custom Spectator mode with fixed Spawnpoint (For minigames like GunGame etc.)
- Command to request support.
- Many informational Commands to share official links (Discord, Forum, Shop, Apply, Teamspeak etc.)
- New join and leave messages

# Config
Some small settings can be edited in the config.yml
```
ServerSystem:
  ServerName: YourServer
  Prefix: System
  TeamSpeak: ts.YourServer.de
  Forum: forum.YourServer.de
  Discord: discord.gg/YourServer
  faq:
    shop: shop.YourServer.de
    apply: apply.YourServer.de
    report: /report [Hacker] [Reason]
  support:
    CommandToTeleportToPlayer: /jumpto
  Scoreboard: true
  TeleportToSpawnOnJoin: true
  Prefix1: '&4Administrator'
  Prefix2: '&bSrDeveloper'
  Prefix3: '&bDeveloper'
  Prefix4: '&cSrModerator'
  Prefix5: '&cModerator'
  Prefix6: '&9Helper'
  Prefix7: '&5YouTuber'
  Prefix8: '&6VIP'
  Prefix9: '&6Premium+'
  Prefix10: '&6Premium'
  PrefixStandart: '&aPlayer'
```
