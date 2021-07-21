package tk.kzoflabs;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import tk.kzoflabs.commands.MoreGameRules;
import tk.kzoflabs.commands.Reload;
import tk.kzoflabs.events.*;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerEvents();
        registerCommands();
        Bukkit.getConsoleSender().sendMessage("§a[MoreGameRules]§f online!");
        instance = this;
                getServer();
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[MoreGameRules] §foffline!");
    }


    private static Main instance;

    public static Main getInstance() { return instance; }


    public void registerEvents(){
        Bukkit.getPluginManager().registerEvents(new AntiTrample(), this);
        Bukkit.getPluginManager().registerEvents(new CustomJoinMessage(), this);
        Bukkit.getPluginManager().registerEvents(new Invincible(), this);
        Bukkit.getPluginManager().registerEvents(new ModifyBlock(), this);
        Bukkit.getPluginManager().registerEvents(new NoHunger(), this);
        Bukkit.getPluginManager().registerEvents(new TimeCycle(), this);
        Bukkit.getPluginManager().registerEvents(new UnbreakableItems(), this);
    }

    public void registerCommands(){
        getCommand("moregamerules").setExecutor(new MoreGameRules());
        getCommand("moregamerules-reload").setExecutor(new Reload());
    }
}