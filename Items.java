package me.monka;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

@SuppressWarnings("unused")
public class Item {
	public static ItemStack removeItem(ItemStack item, int amount) {
		if (item.getAmount()-amount <= 0) {
			return new ItemStack(Material.AIR);
		}
		item.setAmount(item.getAmount()-amount);
		return item;
	}
}
