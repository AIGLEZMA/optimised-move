package me.colejedwards.optimisedmove;

import me.colejedwards.optimisedmove.listener.PlayerMoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class OptimisedMove {

    public OptimisedMove(Plugin plugin) {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerMoveEvent(), plugin);
    }
}
