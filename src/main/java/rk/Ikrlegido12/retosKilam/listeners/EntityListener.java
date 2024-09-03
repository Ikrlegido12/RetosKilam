package rk.Ikrlegido12.retosKilam.listeners;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import rk.Ikrlegido12.retosKilam.RetosKilam;

public class EntityListener implements Listener {

    private RetosKilam plugin;
    public EntityListener(RetosKilam retosKilam) {}

    @EventHandler
    public void desertBlaze(EntitySpawnEvent event){
        Location location = event.getLocation(); // Coge ubicacion de un spawneo
        Biome biome = location.getBlock().getBiome();
        if (biome == Biome.DESERT){
            location.getWorld().spawnEntity(location, EntityType.BLAZE);
        }
    }



}
