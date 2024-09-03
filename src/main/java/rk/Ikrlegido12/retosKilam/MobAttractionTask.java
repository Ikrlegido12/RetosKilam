package rk.Ikrlegido12.retosKilam;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class MobAttractionTask extends BukkitRunnable {

    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player.getLocation();

            // Verifica si el jugador está cerca de mobs hostiles y aplica la atracción
            for (Entity entity : player.getNearbyEntities(20, 20, 20)) {
                if (entity instanceof LivingEntity && isHostileMob(entity)) {
                    Location mobLocation = entity.getLocation();
                    Vector direction = mobLocation.toVector().subtract(playerLocation.toVector()).normalize();
                    player.setVelocity(direction.multiply(0.2)); // Ajusta la fuerza multiplicando el vector
                }
            }

            // Haz que los cerdos persigan a los gatos
            for (Entity entity : player.getNearbyEntities(15, 15, 15)) {
                if (entity instanceof Pig) {
                    for (Entity nearbyEntity : entity.getNearbyEntities(15, 15, 15)) {
                        if (nearbyEntity instanceof Cat) {
                            Location pigLocation = entity.getLocation();
                            Location catLocation = nearbyEntity.getLocation();
                            Vector direction = catLocation.toVector().subtract(pigLocation.toVector()).normalize();
                            entity.setVelocity(direction.multiply(0.3)); // Ajusta la fuerza multiplicando el vector
                        }
                    }
                }
            }
        }
    }

    private boolean isHostileMob(Entity entity) {
        return entity.getType() == EntityType.ZOMBIE ||
                entity.getType() == EntityType.SKELETON ||
                entity.getType() == EntityType.CREEPER ||
                entity.getType() == EntityType.SPIDER ||
                entity.getType() == EntityType.ENDERMAN ||
                entity.getType() == EntityType.WITCH ||
                entity.getType() == EntityType.BLAZE ||
                entity.getType() == EntityType.GHAST ||
                entity.getType() == EntityType.SLIME ||
                entity.getType() == EntityType.MAGMA_CUBE ||
                entity.getType() == EntityType.WITHER_SKELETON ||
                entity.getType() == EntityType.GUARDIAN ||
                entity.getType() == EntityType.ELDER_GUARDIAN ||
                entity.getType() == EntityType.SHULKER ||
                entity.getType() == EntityType.SILVERFISH ||
                entity.getType() == EntityType.ENDERMITE ||
                entity.getType() == EntityType.VEX ||
                entity.getType() == EntityType.VINDICATOR ||
                entity.getType() == EntityType.EVOKER ||
                entity.getType() == EntityType.PILLAGER ||
                entity.getType() == EntityType.RAVAGER ||
                entity.getType() == EntityType.HUSK ||
                entity.getType() == EntityType.STRAY ||
                entity.getType() == EntityType.DROWNED ||
                entity.getType() == EntityType.PHANTOM ||
                entity.getType() == EntityType.PIGLIN ||
                entity.getType() == EntityType.PIGLIN_BRUTE ||
                entity.getType() == EntityType.HOGLIN ||
                entity.getType() == EntityType.ZOGLIN ||
                entity.getType() == EntityType.WARDEN ||
                entity.getType() == EntityType.WITHER ||
                entity.getType() == EntityType.ENDER_DRAGON;
    }

}
