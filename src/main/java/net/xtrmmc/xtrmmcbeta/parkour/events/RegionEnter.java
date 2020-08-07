package net.xtrmmc.xtrmmcbeta.parkour.events;

import net.raidstone.wgevents.events.RegionEnteredEvent;
import net.xtrmmc.xtrmmcbeta.Xtrmmcbeta;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class RegionEnter implements Listener {

    Xtrmmcbeta plugin;

    public RegionEnter(Xtrmmcbeta plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRegionEnter(RegionEnteredEvent event) {
        switch (event.getRegionName()) {
            case "cp1": {
                if (plugin.parkourGameManager.parkourPlayerHandler.getCP(event.getPlayer().getUniqueId()) < 1) {
                    plugin.parkourGameManager.parkourPlayerHandler.setCP(event.getPlayer().getUniqueId(), 1);
                    plugin.parkourGameManager.parkourPlayerHandler.addPlayerToCP(event.getPlayer().getUniqueId(), 1);
                    int place = plugin.parkourGameManager.parkourPlayerHandler.getPlayerPlaceInCP(event.getPlayer().getUniqueId(), 1);
                    event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Parkour" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " Checkpoint! " + ChatColor.DARK_GREEN + "(You are the " + place + " to get here!)");
                    event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, SoundCategory.MASTER, 1, 1);

                    // Add points
                }
                break;
            }
            case "cp2": {
                if (plugin.parkourGameManager.parkourPlayerHandler.getCP(event.getPlayer().getUniqueId()) < 2) {
                    plugin.parkourGameManager.parkourPlayerHandler.setCP(event.getPlayer().getUniqueId(), 2);
                    plugin.parkourGameManager.parkourPlayerHandler.addPlayerToCP(event.getPlayer().getUniqueId(), 2);
                    int place = plugin.parkourGameManager.parkourPlayerHandler.getPlayerPlaceInCP(event.getPlayer().getUniqueId(), 2);
                    event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Parkour" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " Checkpoint! " + ChatColor.DARK_GREEN + "(You are the " + place + " to get here!)");
                    event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, SoundCategory.MASTER, 1, 1);

                    // Add points
                }
                break;
            }
            case "cp3": {
                if (plugin.parkourGameManager.parkourPlayerHandler.getCP(event.getPlayer().getUniqueId()) < 3) {
                    plugin.parkourGameManager.parkourPlayerHandler.setCP(event.getPlayer().getUniqueId(), 3);
                    plugin.parkourGameManager.parkourPlayerHandler.addPlayerToCP(event.getPlayer().getUniqueId(), 3);
                    int place = plugin.parkourGameManager.parkourPlayerHandler.getPlayerPlaceInCP(event.getPlayer().getUniqueId(), 3);
                    event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Parkour" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " Checkpoint! " + ChatColor.DARK_GREEN + "(You are the " + place + " to get here!)");
                    event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, SoundCategory.MASTER, 1, 1);

                    // Add points
                }
                break;
            }
            case "cp4": {
                if (plugin.parkourGameManager.parkourPlayerHandler.getCP(event.getPlayer().getUniqueId()) < 4) {
                    plugin.parkourGameManager.parkourPlayerHandler.setCP(event.getPlayer().getUniqueId(), 4);
                    plugin.parkourGameManager.parkourPlayerHandler.addPlayerToCP(event.getPlayer().getUniqueId(), 4);
                    int place = plugin.parkourGameManager.parkourPlayerHandler.getPlayerPlaceInCP(event.getPlayer().getUniqueId(), 4);
                    event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Parkour" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " Checkpoint! " + ChatColor.DARK_GREEN + "(You are the " + place + " to get here!)");
                    event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, SoundCategory.MASTER, 1, 1);

                    // Add points
                }
                break;
            }
            case "pkfinish": {

            }
        }
    }
}
