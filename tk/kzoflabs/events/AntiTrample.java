package tk.kzoflabs.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import tk.kzoflabs.Main;

public class AntiTrample implements Listener {
    @EventHandler
    public void onTrample(PlayerInteractEvent e) {

        if (Main.getInstance().getConfig().getBoolean("anti-soil-trampling") && e.getAction() == Action.PHYSICAL &&
                e.getClickedBlock().getType() == Material.SOIL) {
            e.setCancelled(true);
        }
    }
}
