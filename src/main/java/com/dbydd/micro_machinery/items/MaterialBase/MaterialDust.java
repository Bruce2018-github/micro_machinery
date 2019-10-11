package com.dbydd.micro_machinery.items.MaterialBase;

import com.dbydd.micro_machinery.Micro_Machinery;
import com.dbydd.micro_machinery.init.ModItems;
import com.dbydd.micro_machinery.util.IHasModel;

import net.minecraft.item.Item;

public class MaterialDust extends Item implements IHasModel {

	public MaterialDust(String material) {
		String itemname = "Dust" + material;
		setUnlocalizedName(itemname);
		setRegistryName(itemname);
		setCreativeTab(Micro_Machinery.Micro_Machinery);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Micro_Machinery.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
