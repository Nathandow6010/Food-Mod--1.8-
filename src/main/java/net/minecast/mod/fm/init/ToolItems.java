package net.minecast.mod.fm.init;

import net.minecast.mod.fm.Main.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolItems
{
	public static Item kettle;
    public static Item microwave;
    public static Item blender;
    public static Item mixer;
    public static Item frying_pan;
    public static Item oven;
    public static Item fridge;
    public static Item freezer;
    public static Item toaster;
    public static Item knife;
    public static Item spoon;
    public static Item fork;
    public static Item tin_opener;
    public static Item cup;
    
    public static void init() 
	{
    	kettle = new Item().setUnlocalizedName("kettle");
    	microwave = new Item().setUnlocalizedName("microwave");
    	blender = new Item().setUnlocalizedName("blender");
    	mixer = new Item().setUnlocalizedName("mixer");
    	frying_pan = new Item().setUnlocalizedName("frying_pan");
    	oven = new Item().setUnlocalizedName("oven");
    	fridge = new Item().setUnlocalizedName("fridge");
    	freezer = new Item().setUnlocalizedName("freezer");
    	toaster = new Item().setUnlocalizedName("toaster");
    	knife = new Item().setUnlocalizedName("knife");
    	spoon = new Item().setUnlocalizedName("spoon");
    	fork = new Item().setUnlocalizedName("fork");
    	tin_opener = new Item().setUnlocalizedName("tin_opener");
    	cup = new Item_cup().setUnlocalizedName("cup");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(kettle, kettle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cup, cup.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fork, fork.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(knife, knife.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(freezer, freezer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fridge, fridge.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tin_opener, tin_opener.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(toaster, toaster.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blender, blender.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(microwave, microwave.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mixer, mixer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(frying_pan, frying_pan.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spoon, spoon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blender, blender.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(kettle);
		registerRender(cup);
		registerRender(fork);
		registerRender(knife);
		registerRender(blender);
		registerRender(frying_pan);
		registerRender(freezer);
		registerRender(fridge);
		registerRender(tin_opener);
		registerRender(cup);
		registerRender(oven);
		registerRender(microwave);
		registerRender(mixer);
		registerRender(toaster);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
