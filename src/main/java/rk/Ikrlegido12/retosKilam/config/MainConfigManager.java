package rk.Ikrlegido12.retosKilam.config;

import rk.Ikrlegido12.retosKilam.RetosKilam;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;


public class MainConfigManager {

    private CustomConfig configFile;
    private RetosKilam plugin;

    private String banMessage;

    public MainConfigManager(RetosKilam plugin){
        this.plugin = plugin;
        configFile = new CustomConfig("config.yml",null,plugin,false);
        configFile.registerConfig();
        loadConfig();
    }

    public void loadConfig(){
        FileConfiguration config = configFile.getConfig();
        banMessage = config.getString("messages.ban_message");
    }

    public void reloadConfig(){
        configFile.reloadConfig();
        loadConfig();
    }

    public String getBanMessage() {
        return banMessage;
    }
}