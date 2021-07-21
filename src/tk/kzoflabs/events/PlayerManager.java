package tk.kzoflabs.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import tk.kzoflabs.Main;

public class PlayerManager implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage("");

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage("");

    }

    @EventHandler
    public void onTrample(PlayerInteractEvent e) {

        if (Main.getInstance().getConfig().getBoolean("anti-soil-trampling") && e.getAction() == Action.PHYSICAL &&
                e.getClickedBlock().getType() == Material.SOIL) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent e) {
        if(Main.getInstance().getConfig().getBoolean("no-hunger"))
        e.setCancelled(true);
    }


    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e){
        //When I create this IF the GameRule stop working, If you know how to fix it please open a Pull Request
        if(Main.getInstance().getConfig().getBoolean("unbreakable-items"))
        e.setCancelled(true);
    }

}


