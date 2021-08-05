package tk.kzoflabs.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import tk.kzoflabs.Main;

public class ModifyBlock implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if(Main.getInstance().getConfig().getBoolean("anti-modify-blocks"))
            if(Main.getInstance().getConfig().getBoolean("bypass-with-permission"))
                if(p.hasPermission("moregamerules.build"));
                    else{
                e.setCancelled(true);
            }else{
                e.setCancelled(true);
            }

    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if(Main.getInstance().getConfig().getBoolean("anti-modify-blocks"))
            if(Main.getInstance().getConfig().getBoolean("bypass-with-permission"))
                if(p.hasPermission("moregamerules.build"));
                else{
                    e.setCancelled(true);
                }else{
                e.setCancelled(true);
            }
            e.setCancelled(true);
    }
}
