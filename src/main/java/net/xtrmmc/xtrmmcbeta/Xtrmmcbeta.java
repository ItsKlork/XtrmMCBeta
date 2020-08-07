package net.xtrmmc.xtrmmcbeta;

import net.xtrmmc.xtrmmcbeta.managers.GamesManager;
import net.xtrmmc.xtrmmcbeta.parkour.GameHandler;
import net.xtrmmc.xtrmmcbeta.parkour.events.PlayerRespawn;
import net.xtrmmc.xtrmmcbeta.parkour.events.RegionEnter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Xtrmmcbeta extends JavaPlugin {

    public GameHandler parkourGameManager = new GameHandler(this);

    StartParkour startParkour = new StartParkour(this);

    public GamesManager gamesManager = new GamesManager();

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("testparkour")).setExecutor(startParkour);

        getServer().getPluginManager().registerEvents(new RegionEnter(this), this);
        getServer().getPluginManager().registerEvents(new PlayerRespawn(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
