package net.xtrmmc.xtrmmcbeta.parkour;

import net.xtrmmc.xtrmmcbeta.Xtrmmcbeta;
import net.xtrmmc.xtrmmcbeta.enums.Game;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public class GameHandler {

    Xtrmmcbeta plugin;

    public ParkourPlayerHandler parkourPlayerHandler = new ParkourPlayerHandler();

    // Task ID. (Used for cancelling the task!)
    private int startCountdownTask;

    // Timer. That's it.
    int startCountdown;

    public GameHandler(Xtrmmcbeta plugin) {
        this.plugin = plugin;
    }

    public void start() {

        BukkitScheduler scheduler = Bukkit.getScheduler();

        startCountdown = 10;

        startCountdownTask = scheduler.scheduleSyncRepeatingTask(plugin, () -> {
            if (startCountdown == 0) {
                plugin.gamesManager.setGame(Game.PARKOUR);
                teleportToParkour();
                parkourPlayerHandler.init();
                cancelTask(scheduler, startCountdownTask);
                return;
            } else if (startCountdown % 5 == 0) {
                Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Timer" + ChatColor.DARK_GRAY + "]" + ChatColor.YELLOW + " Parkour " + ChatColor.AQUA + startCountdown + ChatColor.YELLOW + " seconds");
            }
            startCountdown = startCountdown - 1;
        }, 0L, 20L);
    }

    private void cancelTask(BukkitScheduler scheduler, int task) {
        scheduler.cancelTask(task);
    }

    private void teleportToParkour() {
        Location location = new Location(Bukkit.getWorld("PKTest"), 0.5, 64, 1.5);
        for (Player player : plugin.getServer().getOnlinePlayers()) {
            player.teleport(location);
        }
    }

    public void end() {
        plugin.gamesManager.setGame(Game.NONE);
    }

}
