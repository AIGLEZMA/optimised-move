package me.colejedwards.optimisedmove.listener;

import me.colejedwards.optimisedmove.events.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerMoveEvent implements Listener {

    @EventHandler
    public void onMove(org.bukkit.event.player.PlayerMoveEvent e) {
        Location from = e.getFrom();
        Location to = e.getTo();
        Player player = e.getPlayer();

        if (from.getYaw() != to.getYaw()) {
            Bukkit.getServer().getPluginManager().callEvent(new PlayerYawChangeEvent(player, from, to));
            Bukkit.getServer().getPluginManager().callEvent(new PlayerAimChangeEvent(player, from, to));
        }

        if (from.getPitch() != to.getPitch()) {
            Bukkit.getServer().getPluginManager().callEvent(new PlayerPitchChangeEvent(player, from, to));
            Bukkit.getServer().getPluginManager().callEvent(new PlayerAimChangeEvent(player, from, to));
        }

        if (from.getX() != to.getX()) {
            Bukkit.getServer().getPluginManager().callEvent(new PlayerXChangeEvent(player, from, to));
            Bukkit.getServer().getPluginManager().callEvent(new PlayerBlockChangeEvent(player, from, to));
        }

        if (from.getY() != to.getY()) {
            Bukkit.getServer().getPluginManager().callEvent(new PlayerYChangeEvent(player, from, to));
            Bukkit.getServer().getPluginManager().callEvent(new PlayerBlockChangeEvent(player, from, to));
        }

        if (from.getZ() != to.getZ()) {
            Bukkit.getServer().getPluginManager().callEvent(new PlayerZChangeEvent(player, from, to));
            Bukkit.getServer().getPluginManager().callEvent(new PlayerBlockChangeEvent(player, from, to));
        }
    }
}
