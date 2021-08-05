package tk.kzoflabs.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import tk.kzoflabs.Main;

public class UnbreakableItems implements Listener {

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e){
        Player p = e.getPlayer();
        if(Main.getInstance().getConfig().getBoolean("unbreakable-items"))
            e.setCancelled(true);
            p.updateInventory();
    }
}
