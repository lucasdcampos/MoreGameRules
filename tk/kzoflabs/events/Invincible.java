package tk.kzoflabs.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import tk.kzoflabs.Main;

public class Invincible implements Listener {
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e){
        if(e.getEntityType().equals(EntityType.PLAYER) && Main.getInstance().getConfig().getBoolean("invincible"))
            e.setCancelled(true);

    }
}
