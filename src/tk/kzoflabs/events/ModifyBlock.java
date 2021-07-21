package tk.kzoflabs.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import tk.kzoflabs.Main;

public class ModifyBlock implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        if(Main.getInstance().getConfig().getBoolean("anti-modify-blocks"))
            e.setCancelled(true);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        if(Main.getInstance().getConfig().getBoolean("anti-modify-blocks"))
            e.setCancelled(true);
    }
}
