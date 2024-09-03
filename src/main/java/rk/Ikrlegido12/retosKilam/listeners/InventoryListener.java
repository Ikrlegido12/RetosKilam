package rk.Ikrlegido12.retosKilam.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getSlot() >= 0 && event.getSlot() <= 8) { // Hotbar slots (0-8)
            event.setCancelled(true); // Bloquear
        }
    }

}
