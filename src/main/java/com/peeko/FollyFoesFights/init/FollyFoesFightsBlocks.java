package com.peeko.FollyFoesFights.init;

import com.peeko.FollyFoesFights.FollyFoesFights;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;


public class FollyFoesFightsBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FollyFoesFights.MOD_ID);

    public static final RegistryObject<Block> SALT = register("salt_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SALT_ORE = register("salt_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM = register("titanium_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_PILLAR = register("titanium_pillar", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_TILES = register("titanium_tile", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));




    private static <T extends Block> RegistryObject<T> baseRegister(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> register = BLOCKS.register(name, block);
        FollyFoesFightsItems.ITEMS.register(name, item.apply(register));
        return register;
    }

    private static <B extends Block> RegistryObject<B> register(String name, Supplier<? extends Block> block) {
        return (RegistryObject<B>)baseRegister(name, block, FollyFoesFightsBlocks::registerBlockItem);
    }

    private static <T extends Block> Supplier<BlockItem> registerBlockItem(final RegistryObject<T> block) {
        return () -> new BlockItem(Objects.requireNonNull(block.get()), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));
    }
}
