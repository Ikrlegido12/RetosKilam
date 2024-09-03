package rk.Ikrlegido12.retosKilam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import rk.Ikrlegido12.retosKilam.commands.MainCommand;
import rk.Ikrlegido12.retosKilam.listeners.EntityListener;
import rk.Ikrlegido12.retosKilam.listeners.PlayerListener;

public final class RetosKilam extends JavaPlugin {
    public final String prefix = "&7[&bRetos&1Kilam&7]&f ";
    public final String version = getDescription().getVersion();
    @Override
    public void onEnable() {
        new MobAttractionTask().runTaskTimer(this, 0L, 1L); //BukkitRunnable
        registerEvents();
        registerCommands();
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&',prefix+"Sistema cargado. &eVersión:&6 "+version));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(
                ChatColor.translateAlternateColorCodes('&',prefix+"Sistema desactivado. &eVersión:&6 "+version));

    }
    public void registerCommands(){
        this.getCommand("RetosKilam").setExecutor(new MainCommand(this));
    }
    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new PlayerListener(this),this);
        getServer().getPluginManager().registerEvents(new EntityListener(this),this);
    }
}
