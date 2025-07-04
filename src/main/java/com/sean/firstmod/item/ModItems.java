package com.sean.firstmod.item;

import com.sean.firstmod.FirstMod;
import com.sean.firstmod.item.custom.ChiselItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Base
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    // New Item
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));

   // Adding baja blast
   public static final RegistryObject<Item> BAJABLAST = ITEMS.register("bajablast",
           () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build())));

   public static final RegistryObject<Item> CHISEL_ITEM = ITEMS.register("chisel",
           () -> new ChiselItem(new Item.Properties().durability(32)));



    // Base
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
