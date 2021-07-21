package tk.kzoflabs.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import tk.kzoflabs.Main;

public class UnbreakableItems implements Listener {

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e){
        if(Main.getInstance().getConfig().getBoolean("unbreakable-items"))
            e.setCancelled(true);
    }
}
