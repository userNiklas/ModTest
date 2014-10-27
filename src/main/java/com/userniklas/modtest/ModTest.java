package com.userniklas.modtest;

import com.userniklas.modtest.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ModTest", name = "Mod Test", version = "1.7.10-1.0")
public class ModTest 
{
	@Mod.Instance("ModTest")
	public static ModTest instance;
	
	@SidedProxy(clientSide = "ClientProxy", serverSide = "ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler()
	public void preInit(FMLPreInitializationEvent event)
	{
		
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