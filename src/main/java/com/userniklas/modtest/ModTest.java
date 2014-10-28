package com.userniklas.modtest;

import java.io.File;

import com.userniklas.modtest.handler.ConfigHandler;
import com.userniklas.modtest.proxy.IProxy;
import com.userniklas.modtest.reference.Reference;

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
	}
	
	@Mod.EventHandler()
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler()
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}