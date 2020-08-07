package net.xtrmmc.xtrmmcbeta.parkour.events;

import net.xtrmmc.xtrmmcbeta.Xtrmmcbeta;
import net.xtrmmc.xtrmmcbeta.enums.Game;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawn implements Listener {

    Xtrmmcbeta plugin;

    public PlayerRespawn(Xtrmmcbeta plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        if (plugin.gamesManager.getGame().equals(Game.PARKOUR)) {
            int cp = plugin.parkourGameManager.parkourPlayerHandler.getCP(event.getPlayer().getUniqueId());
            switch (cp) {
                case 0: {
                    Location location = new Location(Bukkit.getWorld("PKTest"), 0.5, 64, 1.5);
                    event.setRespawnLocation(location);
                    //event.getPlayer().teleport(location);
                    break;
                }
                case 1: {
                    Location location = new Location(Bukkit.getWorld("PKTest"), 6.5, 66, 26.5);
                    event.setRespawnLocation(location);
                    //event.getPlayer().teleport(location);
                    break;
                }
                case 2: {
                    Location location = new Location(Bukkit.getWorld("PKTest"), 8.5 ,70, 69.5);
                    event.setRespawnLocation(location);
                    //event.getPlayer().teleport(location);
                    break;
                }
                case 3: {
                    Location location = new Location(Bukkit.getWorld("PKTest"), 8.5, 70, 94.5);
                    event.setRespawnLocation(location);
                    //event.getPlayer().teleport(location);
                    break;
                }
                case 4: {
                    Location location = new Location(Bukkit.getWorld("PKTest"), 8.5, 70, 122.5);
                    event.setRespawnLocation(location);
                    //event.getPlayer().teleport(location);
                    break;
                }
            }
        }
    }
}
