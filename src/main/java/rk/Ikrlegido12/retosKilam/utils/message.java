package rk.Ikrlegido12.retosKilam.utils;

import org.bukkit.ChatColor;
import rk.Ikrlegido12.retosKilam.RetosKilam;

public class message {
    private static RetosKilam plugin;

    private static final String prefix = "&7[&bRetos&1Kilam&7]&f ";
    public static String sendMsg(String Message){
        return ChatColor.translateAlternateColorCodes('&',prefix+Message);
    }
    public static String sendMsgWoP(String Message){
        return ChatColor.translateAlternateColorCodes('&',Message);
    }
}
