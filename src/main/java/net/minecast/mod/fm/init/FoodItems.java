package net.minecast.mod.fm.init;

import net.minecast.mod.fm.Main.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodItems {
	
	public static Item fried_egg;//
    public static Item scrambled_egg;//
    public static Item chips;//
    public static Item crisps;//
    public static Item biscuit;//
    public static Item salad;//
 
	
	public static void init() 
	{
		fried_egg = new Item().setUnlocalizedName("fried_egg");
		chips = new Item().setUnlocalizedName("chips");
		crisps = new Item().setUnlocalizedName("crisps");
		biscuit = new Item().setUnlocalizedName("biscuit");
		salad = new Item().setUnlocalizedName("salad");
		scrambled_egg = new Item().setUnlocalizedName("scrambled_egg");
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(fried_egg, fried_egg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chips, chips.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(crisps, crisps.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(biscuit, biscuit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scrambled_egg, scrambled_egg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(salad, salad.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(fried_egg);
		registerRender(chips);
		registerRender(crisps);
		registerRender(biscuit);
		registerRender(scrambled_egg);
		registerRender(salad);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
