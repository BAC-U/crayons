package me.monka;

import java.util.Random;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

@SuppressWarnings("unused")
public class Item {
	public static ItemStack giveCrayon(String color, ChatColor colorCode) {
		ItemStack crayon = new ItemStack(Material.getMaterial(color.toUpperCase() + "_CANDLE")); //Ruh roh code
		ItemMeta meta = crayon.getItemMeta();
		meta.setDisplayName(colorCode+"Crayon");
		crayon.setItemMeta(meta);
		return crayon;
	}
	public static ItemStack removeItem(ItemStack item, int amount) {
		if (item.getAmount()-amount <= 0) {
			return new ItemStack(Material.AIR);
		}
		item.setAmount(item.getAmount()-amount);
		return item;
	}
	public static String randomColor() {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("lime");
		colors.add("cyan");
		colors.add("light_blue");
		colors.add("blue");
		colors.add("purple");
		colors.add("pink");
		colors.add("gray");
		colors.add("black");
		//Very efficient code ^
		Random rand = new Random();

		return colors.get(rand.nextInt(colors.size()));
	}
	public static ChatColor getColorCodeFromString(String str) {
		String color = str.toLowerCase();
		
		//Not me making shit tons of if statements to solve my problems instead of making a few classes then running a loop over them.
		//                                                                                                                           (I'm lazy )
		if (color == "red") {
			return ChatColor.RED;
		}
		if (color == "orange") {
			return ChatColor.GOLD;
		}
		if (color == "yellow") {
			return ChatColor.YELLOW;
		}
		if (color == "green") {
			return ChatColor.GREEN;
		}
		if (color == "lime") {
			return ChatColor.GREEN;
		}
		if (color == "cyan") {
			return ChatColor.BLUE;
		}
		if (color == "light_blue") {
			return ChatColor.BLUE;
		}
		if (color == "blue") {
			return ChatColor.BLUE;
		}
		if (color == "purple") {
			return ChatColor.LIGHT_PURPLE;
		}
		if (color == "pink") {
			return ChatColor.LIGHT_PURPLE;
		}
		if (color == "gray") {
			return ChatColor.GRAY;
		}
		if (color == "black") {
			return ChatColor.BLACK;
		}
		//Gayming code
		return ChatColor.WHITE; 
	}
	public static boolean arrayContainsString(String message, ArrayList<String> ref) {
		for (String str : ref) {
			if (message.toLowerCase().contains(str.toLowerCase())) {
				return true;
			}
		}
		return false;
    //Gaymer Class
	}
}
