package com.userniklas.modtest;

import java.io.File;

import com.userniklas.modtest.handler.ConfigHandler;
import com.userniklas.modtest.init.ModItems;
import com.userniklas.modtest.proxy.IProxy;
import com.userniklas.modtest.reference.Reference;
import com.userniklas.modtest.util.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ModTest 
{
	@Mod.Instance(Reference.MOD_ID)
	public static ModTest instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler()
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		ModItems.init();
		
		Logger.info("PreInit");
	}
	
	@Mod.EventHandler()
	public void init(FMLInitializationEvent event)
	{
		Logger.info("Init");
	}
	
	@Mod.EventHandler()
	public void postInit(FMLPostInitializationEvent event)
	{
		Logger.info("PostInit");
	}
}