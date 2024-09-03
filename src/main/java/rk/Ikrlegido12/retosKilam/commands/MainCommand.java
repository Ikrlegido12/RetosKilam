package rk.Ikrlegido12.retosKilam.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import rk.Ikrlegido12.retosKilam.RetosKilam;
import rk.Ikrlegido12.retosKilam.utils.message;

public class MainCommand implements CommandExecutor {
    private RetosKilam plugin;
    public MainCommand(RetosKilam plugin) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        final String version = plugin.getDescription().getVersion();
        sender.sendMessage(message.sendMsg("&bRetosKilam &f- &eVersion &6"+version));
        return true;

    }
}
