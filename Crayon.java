package me.monka;

import java.util.ArrayList;
import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
//@SuppressWarnings("unused")
public class Crayon {

	public static ArrayList<Object> randomColor() {
		ArrayList<ArrayList<Object>> colors = new ArrayList<>();
		colors.add(Crayon.Crayons.RedCrayon.getValues());
		colors.add(Crayon.Crayons.OrangeCrayon.getValues());
		colors.add(Crayon.Crayons.YellowCrayon.getValues());
		colors.add(Crayon.Crayons.GreenCrayon.getValues());
		colors.add(Crayon.Crayons.LimeCrayon.getValues());
		colors.add(Crayon.Crayons.CyanCrayon.getValues());
		colors.add(Crayon.Crayons.LightBlueCrayon.getValues());
		colors.add(Crayon.Crayons.BlueCrayon.getValues());
		colors.add(Crayon.Crayons.PurpleCrayon.getValues());
		colors.add(Crayon.Crayons.PinkCrayon.getValues());
		colors.add(Crayon.Crayons.GrayCrayon.getValues());
		colors.add(Crayon.Crayons.BlackCrayon.getValues());
		Random rand = new Random();
		
		ArrayList<Object> selectedColor = colors.get(rand.nextInt(colors.size()));
		return selectedColor;
	}
	
	public static ItemStack constructCrayonFromlist(ArrayList<Object> value) {
		ItemStack crayonItem = new ItemStack(Material.getMaterial(value.get(0).toString().toUpperCase() + "_CANDLE"));
		ItemMeta meta = crayonItem.getItemMeta();
		meta.setDisplayName(value.get(1)+"Crayon");
		crayonItem.setItemMeta(meta);
		return crayonItem;
	}
	
	public class Crayons  {
        public class RedCrayon{
            public static final String color = "red";
            public static ChatColor colorCode = ChatColor.RED;
            public static Material blockPlaceMaterial = Material.RED_WOOL;
            public static Material blockPlaceMaterial2 = Material.RED_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.RedCrayon.color);
                values.add(Crayons.RedCrayon.colorCode);
                values.add(Crayons.RedCrayon.blockPlaceMaterial);
                values.add(Crayons.RedCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class OrangeCrayon {
            public static String color = "orange";
            public static ChatColor colorCode = ChatColor.GOLD;
            public static Material blockPlaceMaterial = Material.ORANGE_WOOL;
            public static Material blockPlaceMaterial2 = Material.ORANGE_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.OrangeCrayon.color);
                values.add(Crayons.OrangeCrayon.colorCode);
                values.add(Crayons.OrangeCrayon.blockPlaceMaterial);
                values.add(Crayons.OrangeCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class YellowCrayon {
            public static String color = "yellow";
            public static ChatColor colorCode = ChatColor.YELLOW;
            public static Material blockPlaceMaterial = Material.YELLOW_WOOL;
            public static Material blockPlaceMaterial2 = Material.YELLOW_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.YellowCrayon.color);
                values.add(Crayons.YellowCrayon.colorCode);
                values.add(Crayons.YellowCrayon.blockPlaceMaterial);
                values.add(Crayons.YellowCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class GreenCrayon {
            public static String color = "green";
            public static ChatColor colorCode = ChatColor.GREEN;
            public static Material blockPlaceMaterial = Material.GREEN_WOOL;
            public static Material blockPlaceMaterial2 = Material.GREEN_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.GreenCrayon.color);
                values.add(Crayons.GreenCrayon.colorCode);
                values.add(Crayons.GreenCrayon.blockPlaceMaterial);
                values.add(Crayons.GreenCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class LimeCrayon {
            public static String color = "lime";
            public static ChatColor colorCode = ChatColor.GREEN;
            public static Material blockPlaceMaterial = Material.LIME_WOOL;
            public static Material blockPlaceMaterial2 = Material.LIME_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.LimeCrayon.color);
                values.add(Crayons.LimeCrayon.colorCode);
                values.add(Crayons.LimeCrayon.blockPlaceMaterial);
                values.add(Crayons.LimeCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class CyanCrayon {
            public static String color = "cyan";
            public static ChatColor colorCode = ChatColor.BLUE;
            public static Material blockPlaceMaterial = Material.CYAN_WOOL;
            public static Material blockPlaceMaterial2 = Material.CYAN_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.CyanCrayon.color);
                values.add(Crayons.CyanCrayon.colorCode);
                values.add(Crayons.CyanCrayon.blockPlaceMaterial);
                values.add(Crayons.CyanCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class LightBlueCrayon {
            public static String color = "light_blue";
            public static ChatColor colorCode = ChatColor.BLUE;
            public static Material blockPlaceMaterial = Material.LIGHT_BLUE_WOOL;
            public static Material blockPlaceMaterial2 = Material.LIGHT_BLUE_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.LightBlueCrayon.color);
                values.add(Crayons.LightBlueCrayon.colorCode);
                values.add(Crayons.LightBlueCrayon.blockPlaceMaterial);
                values.add(Crayons.LightBlueCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class BlueCrayon {
            public static String color = "blue";
            public static ChatColor colorCode = ChatColor.BLUE;
            public static Material blockPlaceMaterial = Material.BLUE_WOOL;
            public static Material blockPlaceMaterial2 = Material.BLUE_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.BlueCrayon.color);
                values.add(Crayons.BlueCrayon.colorCode);
                values.add(Crayons.BlueCrayon.blockPlaceMaterial);
                values.add(Crayons.BlueCrayon.blockPlaceMaterial2);
                return values;
            }
        }
        public class PurpleCrayon {
            public static String color = "purple";
            public static ChatColor colorCode = ChatColor.LIGHT_PURPLE;
            public static Material blockPlaceMaterial = Material.PURPLE_WOOL;
            public static Material blockPlaceMaterial2 = Material.PURPLE_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.PurpleCrayon.color);
                values.add(Crayons.PurpleCrayon.colorCode);
                values.add(Crayons.PurpleCrayon.blockPlaceMaterial);
                values.add(Crayons.PurpleCrayon.blockPlaceMaterial2);
                return values;
            }
        }

        public class PinkCrayon {
            public static String color = "pink";
            public static ChatColor colorCode = ChatColor.LIGHT_PURPLE;
            public static Material blockPlaceMaterial = Material.PINK_WOOL;
            public static Material blockPlaceMaterial2 = Material.PINK_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.PinkCrayon.color);
                values.add(Crayons.PinkCrayon.colorCode);
                values.add(Crayons.PinkCrayon.blockPlaceMaterial);
                values.add(Crayons.PinkCrayon.blockPlaceMaterial2);
                return values;
            }
        }

        public class GrayCrayon {
            public static String color = "gray";
            public static ChatColor colorCode = ChatColor.GRAY;
            public static Material blockPlaceMaterial = Material.GRAY_WOOL;
            public static Material blockPlaceMaterial2 = Material.GRAY_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.GrayCrayon.color);
                values.add(Crayons.GrayCrayon.colorCode);
                values.add(Crayons.GrayCrayon.blockPlaceMaterial);
                values.add(Crayons.GrayCrayon.blockPlaceMaterial2);
                return values;
            }
        }

        public class BlackCrayon {
            public static String color = "black";
            public static ChatColor colorCode = ChatColor.BLACK;
            public static Material blockPlaceMaterial = Material.BLACK_WOOL;
            public static Material blockPlaceMaterial2 = Material.BLACK_CONCRETE_POWDER;
            public static ArrayList<Object> getValues() {
                ArrayList<Object> values = new ArrayList<>();
                values.add(Crayons.BlackCrayon.color);
                values.add(Crayons.BlackCrayon.colorCode);
                values.add(Crayons.BlackCrayon.blockPlaceMaterial);
                values.add(Crayons.BlackCrayon.blockPlaceMaterial2);
                return values;
            }
        }
	}

}

