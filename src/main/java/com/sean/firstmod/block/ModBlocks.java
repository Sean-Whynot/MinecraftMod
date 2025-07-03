package com.sean.firstmod.block;


import com.sean.firstmod.FirstMod;
import com.sean.firstmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
// set up
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MODID);


    public static final  RegistryObject<Block> COIN_BLOCK = registerBlock("coin_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(1f).strength(4f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final  RegistryObject<Block> CAGE_BLOCK = registerBlock("cage_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(1.5f).strength(4f).sound(SoundType.AMETHYST)));





    //set up
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}


