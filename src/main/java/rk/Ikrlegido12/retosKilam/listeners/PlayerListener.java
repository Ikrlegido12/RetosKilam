package rk.Ikrlegido12.retosKilam.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import rk.Ikrlegido12.retosKilam.RetosKilam;

public class PlayerListener implements Listener {
    private RetosKilam plugin;
    public PlayerListener(RetosKilam retosKilam) {
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity(); // obtener jugador
        Location deathLocation = event.getEntity().getLocation(); // obtener ubicacion
        String name = event.getEntity().getName(); // obtener String del IGN
        Bukkit.getBanList(BanList.Type.NAME).addBan(name, ChatColor.translateAlternateColorCodes('&',"&4Has MUERTO."),null,"RetosKilam");
        player.kickPlayer(ChatColor.translateAlternateColorCodes('&',"&4Has MUERTO."));


        //generado por ChatGPT
        deathLocation.getBlock().setType(Material.PLAYER_HEAD);
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwningPlayer(player);
        skull.setItemMeta(skullMeta);
        deathLocation.getBlock().getState().update(true);


    }
}
