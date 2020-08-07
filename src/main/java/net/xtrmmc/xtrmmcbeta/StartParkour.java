package net.xtrmmc.xtrmmcbeta;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StartParkour implements CommandExecutor {

    Xtrmmcbeta plugin;

    public StartParkour(Xtrmmcbeta plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin.parkourGameManager.start();
        return true;
    }
}
