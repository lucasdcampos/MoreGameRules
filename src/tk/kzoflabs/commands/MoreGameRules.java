package tk.kzoflabs.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MoreGameRules implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        commandSender.sendMessage("§a§lMoreGameRules§f 1.0.0");
        commandSender.sendMessage("§7Author: §fKzof Labs");
        commandSender.sendMessage("§7Help: §a/mgr§f help");
        commandSender.sendMessage("§7Reload: §a/mgr§f reload");

        return true;
    }
}
