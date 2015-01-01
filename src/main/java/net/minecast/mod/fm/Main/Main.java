package net.minecast.mod.fm.Main;

import net.minecast.mod.fm.init.FoodItems;
import net.minecast.mod.fm.init.ToolItems;
import net.minecast.mod.fm.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "fm";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Foods Mod";
    public static final String CLIENT_PROXY_CLASS = "net.minecast.mod.fm.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.minecast.mod.fm.proxy.CommonProxy";
    
    //Blocks
    public static Block BlockKettle;
    public static Block BlockMicrowave;
    public static Block BlockBlender;
    public static Block BlockMixer;
    public static Block BlockFrying_Pan;
    public static Block BlockOven;
    public static Block BlockFridge;
    public static Block BlockFreezer;
    public static Block BlockToaster;    
    
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {
    	FoodItems.init();
    	FoodItems.register();
    	
    	ToolItems.init();
    	ToolItems.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {
    	
    }
}
