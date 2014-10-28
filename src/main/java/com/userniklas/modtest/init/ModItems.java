package com.userniklas.modtest.init;

import com.userniklas.modtest.item.ItemTestMod;
import com.userniklas.modtest.item.ItemUselessItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemTestMod uselessItem = new ItemUselessItem();
	
	public static void init()
	{
		GameRegistry.registerItem(uselessItem, "uselessItem");
	}
}
