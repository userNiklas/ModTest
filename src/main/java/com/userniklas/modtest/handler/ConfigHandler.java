package com.userniklas.modtest.handler;

import java.io.File;

import com.userniklas.modtest.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
	public static Configuration config;
	public static boolean configValue = false;
	
	public static void init(File configFile)
	{
		if(config == null) config = new Configuration(configFile);
	}
	
	public void loadConfig()
	{
		configValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Config value example");
		if(config.hasChanged()) config.save();
	}
	
	@SubscribeEvent
	public void onConfigChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) loadConfig();
	}
}
