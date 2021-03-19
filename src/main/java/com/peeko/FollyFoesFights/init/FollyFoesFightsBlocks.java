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
    //Salt
    public static final RegistryObject<Block> SALT = register("salt_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SALT_ORE = register("salt_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    //Titanium
    public static final RegistryObject<Block> TITANIUM = register("titanium_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_PILLAR = register("titanium_pillar", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_TILES = register("titanium_tile", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    //Uranium
    public static final RegistryObject<Block> URANIUM = register("uranium_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> URANIUM_ORE = register("uranium_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_URANIUM_ORE = register("nether_uranium_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> URANIUM_TILES = register("uranium_tile", () -> new Block(AbstractBlock.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> URANIUM_TNT = register("uranium_tnt", () -> new Block(AbstractBlock.Properties.copy(Blocks.TNT).sound(SoundType.GRASS).requiresCorrectToolForDrops()));

    //Ruby
    public static final RegistryObject<Block> RUBY = register("ruby_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_TILES = register("ruby_tile", () -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_PILLAR = register("ruby_pillar", () -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    //Pearlslate
    public static final RegistryObject<Block> PEARLSLATE = register("pearlslate", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PEARLSLATE_BRICKS = register("pearlslate_bricks", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PEARLSLATE_TILES = register("pearlslate_tile", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_PEARLSLATE = register("chiseled_pearlslate", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_PEARLSLATE_BRICKS = register("cracked_pearlslate_bricks", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_PEARLSLATE = register("polished_pearlslate", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENCRUSTED_PEARLSLATE = register("encrusted_pearlslate", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.BASALT).requiresCorrectToolForDrops()));

    //Pink Crystal
    public static final RegistryObject<Block> PINK_CRYSTAL_BLOCK = register("pink_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CRYSTAL_BRICKS = register("pink_crystal_bricks", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CRYSTAL_PILLAR = register("pink_crystal_pillar", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_PINK_CRYSTAL_BLOCK = register("polished_pink_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_PINK_CRYSTAL_BLOCK = register("chiseled_pink_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    //Blue Crystal
    public static final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = register("blue_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CRYSTAL_BRICKS = register("blue_crystal_bricks", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CRYSTAL_PILLAR = register("blue_crystal_pillar", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_BLUE_CRYSTAL_BLOCK = register("polished_blue_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_BLUE_CRYSTAL_BLOCK = register("chiseled_blue_crystal_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    //Crystals
    public static final RegistryObject<Block> BLUE_CRYSTAL_CLUSTER = register("blue_crystal_cluster", () -> new Block(AbstractBlock.Properties.copy(Blocks.BROWN_MUSHROOM).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CRYSTAL_CLUSTER = register("pink_crystal_cluster", () -> new Block(AbstractBlock.Properties.copy(Blocks.BROWN_MUSHROOM).sound(SoundType.GLASS).requiresCorrectToolForDrops()));



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
