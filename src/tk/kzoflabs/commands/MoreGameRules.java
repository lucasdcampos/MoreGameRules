package tk.kzoflabs.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import tk.kzoflabs.Main;

public class MoreGameRules implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {

            if(args.length==0){
                sender.sendMessage("§a§lMoreGameRules§f 1.0.0");
                sender.sendMessage("§7Made by: §fKzof Labs");
                sender.sendMessage("§7Help: §a/mgr§f help");
                sender.sendMessage("§7Reload: §a/mgr§f reload");
            }else {
                if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage("§a§lMoreGameRules");
                    sender.sendMessage("§7Commands:");
                    sender.sendMessage("§b/gmr reload:§f Reload config.yml");
                    sender.sendMessage("§cGameRules in-game editor coming soon!");
                }else{
                    if(args[0].equalsIgnoreCase("reload")){
                        Main.getInstance().reloadConfig();
                        sender.sendMessage("§a[MoreGameRules]§f successfully reloaded! :)");

                    }
                }
            }
        return true;
        }
}