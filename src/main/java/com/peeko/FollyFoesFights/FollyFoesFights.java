package com.peeko.FollyFoesFights;

import com.peeko.FollyFoesFights.client.model.RoboJefferyModel;
import com.peeko.FollyFoesFights.entities.RoboJefferyEntity;
import com.peeko.FollyFoesFights.init.FollyFoesFightsBlocks;
import com.peeko.FollyFoesFights.init.FollyFoesFightsEntities;
import com.peeko.FollyFoesFights.init.FollyFoesFightsItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod("folfoefit")
@Mod.EventBusSubscriber(modid = FollyFoesFights.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FollyFoesFights
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "folfoefit";

    public FollyFoesFights() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        DeferredRegister<?>[] registers = {
                FollyFoesFightsEntities.ENTITIES,
                FollyFoesFightsBlocks.BLOCKS,
                FollyFoesFightsItems.ITEMS
        };

        for (DeferredRegister<?> register : registers) {
            register.register(bus);
        }

    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }


}
