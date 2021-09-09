package tk.kzoflabs.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import tk.kzoflabs.Main;

public class NoHunger implements Listener {

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent e) {
        if(Main.getInstance().getConfig().getBoolean("no-hunger"))
            e.setCancelled(true);
    }
}