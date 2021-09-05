package tk.kzoflabs.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import tk.kzoflabs.Main;

public class OnlyMobSpawners implements Listener {

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (Main.getInstance().getConfig().getBoolean("only-mob-spawners")
                && (e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.SPAWNER_EGG
                && e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.SPAWNER))

            if(e.getLocation().getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("nature-spawn-on-world")))
            e.setCancelled(false);
            else{
                e.setCancelled(true);
            }
    }
}