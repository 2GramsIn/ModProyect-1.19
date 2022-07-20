package com.iannoguez.forgeproyect.item;

import com.iannoguez.forgeproyect.ForgeProyect;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeProyect.MOD_ID);

    public static final RegistryObject<Item> ZINC = ITEMS.register("zinc",() -> new Item(new Item.Properties().tab(CreativeTab.PROYECT_TAB)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",() -> new Item(new Item.Properties().tab(CreativeTab.PROYECT_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
