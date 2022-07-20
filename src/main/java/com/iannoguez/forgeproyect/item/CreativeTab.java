package com.iannoguez.forgeproyect.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab PROYECT_TAB = new CreativeModeTab("proyecttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZINC.get());
        }
    };
}
