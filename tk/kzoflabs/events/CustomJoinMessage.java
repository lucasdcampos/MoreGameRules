package tk.kzoflabs.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import tk.kzoflabs.Main;

public class CustomJoinMessage implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if(Main.getInstance().getConfig().getBoolean("no-join-quit-messages")){
            e.setJoinMessage("");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if(Main.getInstance().getConfig().getBoolean("no-join-quit-messages")){
            e.setQuitMessage("");
        }
    }
}
