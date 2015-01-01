package net.minecast.mod.fm.init;

import net.minecast.mod.fm.Main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolBlocks
{
	public static Block kettle;
    public static Block microwave;
    public static Block blender;
    public static Block mixer;
    public static Block frying_pan;
    public static Block oven;
    public static Block fridge;
    public static Block freezer;
    public static Block toaster;
    public static Block tin_opener;
    public static Block cup;
    
    public static void init() 
	{
    	
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(kettle, kettle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cup, cup.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(freezer, freezer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(fridge, fridge.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(toaster, toaster.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blender, blender.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(microwave, microwave.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mixer, mixer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(frying_pan, frying_pan.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blender, blender.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(kettle);
		registerRender(cup);
		registerRender(blender);
		registerRender(frying_pan);
		registerRender(freezer);
		registerRender(fridge);
		registerRender(cup);
		registerRender(oven);
		registerRender(microwave);
		registerRender(mixer);
		registerRender(toaster);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
