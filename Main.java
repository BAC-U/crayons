package me.monka;

//You expected my code to look nice?
//You expected my code to actually be good?
//This is a crayons mod! Of course we added random things that it doesnt need, Of course we have random imports!

//Dont judge the amazing code, Its a crayons mod!


/*
------------------------------------READ ME------------------------------------
This contains inappropriate words!
Just warning you now.
*/
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.damage.DamageSource;
import org.bukkit.damage.DamageType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerSignOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin implements Listener {
	
	 FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
        config.addDefault("customChat", true);
        config.options().copyDefaults(true);
        saveConfig();
    	Bukkit.getPluginManager().registerEvents(this,this);
	}
	@Override
	public void onDisable() {
		
	}
    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent e) {
		String message = e.getMessage();
		
		e.setCancelled(true);
		
		ArrayList<String> Ref = new ArrayList<>();
		Ref.add("im down on my luck");
		Ref.add("down on luck");
		Ref.add("no luck");
		Ref.add("pick me up");
		Ref.add("i need a feel good");
		Ref.add("need a feel good");
		Ref.add("dont feel great");
		Ref.add("I need crayons, I love smoking crayons. They let me feel good");
		Ref.add("crayon");
		Ref.add("church"); //Why are you even looking at the code
		if (config.getBoolean("customChat")) {
		Bukkit.broadcastMessage(ChatColor.DARK_GRAY + e.getPlayer().getDisplayName() +": "+ChatColor.GRAY + e.getMessage());
		} else {
			e.setCancelled(false);
		}
		if (Item.arrayContainsString(message, Ref)) {
			e.getPlayer().sendRawMessage(" ");
			e.getPlayer().sendRawMessage(ChatColor.GRAY+"Need a pick me up?");
			e.getPlayer().sendRawMessage(ChatColor.GRAY+"Down on your luck?");
			e.getPlayer().sendRawMessage(ChatColor.GRAY+"Try"+ChatColor.LIGHT_PURPLE+" Crayons"+ChatColor.GRAY+", They give you the high you need to start you day");
			String CrayonColor = Item.randomColor();
			e.getPlayer().getInventory().addItem(Item.giveCrayon(CrayonColor,Item.getColorCodeFromString(CrayonColor)));
		}
	}
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
    	Player player = e.getPlayer();
    	Inventory inv = player.getInventory();
    	String mainhand = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().toLowerCase();
    	String offhand = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().toLowerCase();
    	if (mainhand.contains("crayon") || offhand.contains("crayon")) {
    		e.setCancelled(true);
    		e.getBlock().setType(Material.AIR);
    	}
    	
    }
    @EventHandler
    public void onClick(PlayerInteractEvent e) {
    	Player player = e.getPlayer();
    	ItemStack item = e.getItem();
    	if (item == null) {
    		return;
    	}
    	if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
    		if (item.getItemMeta().getDisplayName().toLowerCase().contains("crayon")) {
    			e.setCancelled(true);
    			PotionEffect confussion = new PotionEffect(PotionEffectType.CONFUSION,400,20);
    			PotionEffect speed = new PotionEffect(PotionEffectType.SPEED,400,20);

    			player.addPotionEffect(confussion);
    			player.addPotionEffect(speed);
    			
    			/*Random random = new Random();
    			if (random.nextInt(10) == 5) {
    				
    				player.damage(random.nextInt(6),(Entity) DamageSource.builder(DamageType.STALAGMITE));
    				
    			}*/
    			player.getInventory().setItem(player.getInventory().getHeldItemSlot(), Item.removeItem(item, 1));
    		}
    	}
    }
}
