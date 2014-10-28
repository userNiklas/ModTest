package com.userniklas.modtest.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.userniklas.modtest.reference.Reference;

public class ItemTestMod extends Item
{
	public ItemTestMod()
	{
		super();
	}
	
	
	@Override
	public String getUnlocalizedName()
	{
		return "item." + Reference.MOD_ID.toLowerCase() + getUnwrappedUnlocalizedName(super.getUnlocalizedName());
	}
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return this.getUnlocalizedName();
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
