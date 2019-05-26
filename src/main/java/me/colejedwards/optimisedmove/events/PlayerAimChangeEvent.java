package me.colejedwards.optimisedmove.events;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class PlayerAimChangeEvent extends Event implements Cancellable {

    private static final HandlerList handlerList = new HandlerList();
    private Player player;
    private Location from;
    private Location to;
    private boolean isCancelled;

    public PlayerAimChangeEvent(Player player, Location from, Location to) {
        this.player = player;
        this.from = from;
        this.to = to;
        this.isCancelled = false;
    }

    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }
}
