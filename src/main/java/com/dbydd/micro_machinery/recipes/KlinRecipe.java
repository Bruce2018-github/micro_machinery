package com.dbydd.micro_machinery.recipes;

import com.dbydd.micro_machinery.init.ModRecipes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class KlinRecipe {


    public ItemStack input1 = null;
    public ItemStack input2 = null;
    public FluidStack outputfluidstack = null;
    public int melttime;
    public boolean issingle = false;


    public KlinRecipe(FluidStack outputfluidstack, ItemStack input1, ItemStack input2, int melttime) {
        this.input1 = input1;
        this.input2 = input2;
        this.outputfluidstack = outputfluidstack;
        this.melttime = melttime;

        ModRecipes.tofluidrecipes.add(this);
    }

    public KlinRecipe(FluidStack outputfluidstack, ItemStack input1, int melttime) {
        this.input1 = input1;
        this.input2 = ItemStack.EMPTY;
        this.outputfluidstack = outputfluidstack;
        this.melttime = melttime;
        issingle = true;

        ModRecipes.tofluidrecipes.add(this);
    }

}
