package tk.kzoflabs.commands;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import tk.kzoflabs.Main;

import java.util.ArrayList;

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
            sender.sendMessage("§b/mgr reload:§f Reload config.yml");
            sender.sendMessage("§cGameRules in-game editor coming soon!");
        }else{
            if(args[0].equalsIgnoreCase("reload")){
                Main.getInstance().saveDefaultConfig();
                Main.getInstance().reloadConfig();
                    sender.sendMessage("§a[MoreGameRules]§f successfully reloaded! :)");
            }else{
                // In-game editor:

                if(args[0].equalsIgnoreCase("menu")){
                    Player p = (Player)sender;
                    Inventory inv = Bukkit.createInventory(null, 3*9, "§8MoreGameRules - Editor");
                    p.openInventory(inv);
                    //AntiJoinMessage item
                    ItemStack antijoinmessage = new ItemStack(Material.IRON_DOOR, 1);
                    ItemMeta antijoinmessageItemMeta = antijoinmessage.getItemMeta();
                    antijoinmessageItemMeta.setDisplayName("§aJoin/Quit Messages");
                    ArrayList<String> antijoinmessagelore = new ArrayList<String>();
                    antijoinmessagelore.add("§7Removes player join/quit message:" + "§b " + Main.getInstance().getConfig().getBoolean("no-join-quit-messages"));
                    antijoinmessageItemMeta.setLore(antijoinmessagelore);
                    antijoinmessage.setItemMeta(antijoinmessageItemMeta);
                    inv.setItem(10,antijoinmessage);



                    //No-Hunger item
                    ItemStack nohunger = new ItemStack(Material.BREAD, 1);
                    ItemMeta nohungerItemMeta = nohunger.getItemMeta();
                    nohungerItemMeta.setDisplayName("§aRemoves Hunger");
                    ArrayList<String> nohungerlore = new ArrayList<String>();
                    nohungerlore.add("§7Removes Hunger:" + "§b " + Main.getInstance().getConfig().getBoolean("no-hunger"));
                    nohungerItemMeta.setLore(nohungerlore);
                    nohunger.setItemMeta(nohungerItemMeta);
                    inv.setItem(11,nohunger);



                    //Unbreakable-Items item
                    ItemStack unbreakableitems = new ItemStack(Material.DIAMOND_PICKAXE, 1);
                    ItemMeta unbreakableitemsItemMeta = unbreakableitems.getItemMeta();
                    unbreakableitemsItemMeta.setDisplayName("§aUnbreakable Items");
                    ArrayList<String> unbreakableitemslore = new ArrayList<String>();
                    unbreakableitemslore.add("§7Makes all items unbreakable:" + "§b " + Main.getInstance().getConfig().getBoolean("unbreakable-items"));
                    unbreakableitemsItemMeta.setLore(unbreakableitemslore);
                    unbreakableitems.setItemMeta(unbreakableitemsItemMeta);
                    inv.setItem(12,unbreakableitems);


                    //anti-soil-trampling item
                    ItemStack antisoiltrampling = new ItemStack(Material.WHEAT, 1);
                    ItemMeta antisoiltramplingItemMeta = antisoiltrampling.getItemMeta();
                    antisoiltramplingItemMeta.setDisplayName("§aAnti Soil Trampling");
                    ArrayList<String> antisoiltramplinglore = new ArrayList<String>();
                    antisoiltramplinglore.add("§7Anti Soil Trampling:" + "§b " + Main.getInstance().getConfig().getBoolean("anti-soil-trampling"));
                    antisoiltramplingItemMeta.setLore(antisoiltramplinglore);
                    antisoiltrampling.setItemMeta(antisoiltramplingItemMeta);
                    inv.setItem(13,antisoiltrampling);


                    //anti-modify-blocks item
                    ItemStack antimodifyblocks = new ItemStack(Material.BEDROCK, 1);
                    ItemMeta antimodifyblocksItemMeta = antimodifyblocks.getItemMeta();
                    antimodifyblocksItemMeta.setDisplayName("§aModify Blocks");
                    ArrayList<String> antimodifyblockslore = new ArrayList<String>();
                    antimodifyblockslore.add("§7Place and Break blocks:" + "§b " + Main.getInstance().getConfig().getBoolean("anti-modify-blocks"));
                    antimodifyblocksItemMeta.setLore(antimodifyblockslore);
                    antimodifyblocks.setItemMeta(antimodifyblocksItemMeta);
                    inv.setItem(14,antimodifyblocks);


                    //invincible
                    ItemStack invincible = new ItemStack(Material.GOLDEN_APPLE, 1);
                    ItemMeta invincibleItemMeta = invincible.getItemMeta();
                    invincibleItemMeta.setDisplayName("§aInvincible");
                    ArrayList<String> invinciblelore = new ArrayList<String>();
                    invinciblelore.add("§7Makes you invincible. Allowed:" + "§b " + Main.getInstance().getConfig().getBoolean("invincible"));
                    invincibleItemMeta.setLore(invinciblelore);
                    invincible.setItemMeta(invincibleItemMeta);
                    inv.setItem(15,invincible);

                    ItemStack background = new ItemStack(Material.STAINED_GLASS_PANE);

                    //Reload
                    ItemStack reload = new ItemStack(Material.EMERALD_BLOCK, 1);
                    ItemMeta reloadItemMeta = reload.getItemMeta();
                    reloadItemMeta.setDisplayName("§aReload");
                    ArrayList<String> reloadlore = new ArrayList<String>();
                    reloadlore.add("§7Reload §bconfig.yml§7 and save changes");
                    reloadItemMeta.setLore(reloadlore);
                    reload.setItemMeta(reloadItemMeta);
                    inv.setItem(16,reload);
                    inv.setItem(7, background);
                    inv.setItem(25, background);






                }
            }
        }
    }
return true;
    }
}