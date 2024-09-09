package rk.Ikrlegido12.retosKilam.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import rk.Ikrlegido12.retosKilam.RetosKilam;

public class InventoryListener implements Listener {

    public InventoryListener(RetosKilam plugin) {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getSlot() >= 0 && event.getSlot() <= 8) { // Hotbar slots (0-8)
            event.setCancelled(true); // Bloquear
        }
    }

}
