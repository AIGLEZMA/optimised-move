# Optimised Move

Useful NametagAPI that can be implemented into Bukkit and Spigot plugins. 48 character support & works with all versions.

* Has multiple events
* Easy to Use
* Free + Open Source

# Todo
* Nothing

# Example:
```java
    @Override
    public void onEnable() {
        new OptimisedMove(this);
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBlockChange(PlayerBlockChangeEvent e) {
        e.getPlayer().sendMessage(ChatColor.GREEN + "You moved from " + e.getFrom().getBlockX() + ", " + e.getFrom().getBlockY() + ", " + e.getFrom().getBlockY() + " to " + e.getTo().getBlockX() + ", " + e.getTo().getBlockY() + ", " + e.getTo().getBlockZ());
    }
```

# Terms
1. No claiming as your own
2. You may include this in premium plugins, with credit

# Contact
Discord - Cole#3895
Twitter - @ThatDevCole
Telegram - @ThatDevCole

&copy; **Runic Holdings LLC. 2019**

