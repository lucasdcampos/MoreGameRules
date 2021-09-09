package tk.kzoflabs.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import tk.kzoflabs.Main;

public class OnlyMobSpawners implements Listener {

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (Main.getInstance().getConfig().getBoolean("only-mob-spawners")
                && (e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.SPAWNER_EGG
                && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.SPAWNER && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.DISPENSE_EGG
                && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.BUILD_IRONGOLEM && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.BUILD_SNOWMAN
                && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.CUSTOM))

            if(e.getLocation().getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("nature-spawn-on-world")))
            e.setCancelled(false);
            else{
                if (e.getEntity().getType().equals(EntityType.ARMOR_STAND))
                e.setCancelled(false);
                else{
                    e.setCancelled(true);
                }
            }
    }
}