package tk.kzoflabs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tk.kzoflabs.commands.Reload;
import tk.kzoflabs.commands.System;
import tk.kzoflabs.events.PlayerManager;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new PlayerManager(), this);
        getCommand("moregamerules").setExecutor(new System());
        getCommand("moregamerules-reload").setExecutor(new Reload());
        Bukkit.getConsoleSender().sendMessage("§a[MoreGameRules]§f online!");
        instance = this;
                getServer();
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[MoreGameRules] §foffline!");
    }


    private static Main instance;

    public static Main getInstance() { return instance; }



}