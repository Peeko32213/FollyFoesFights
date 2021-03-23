package com.peeko.FollyFoesFights;


import com.peeko.FollyFoesFights.client.ClientRegister;
import com.peeko.FollyFoesFights.registry.FollyFoesFightsBlocks;
import com.peeko.FollyFoesFights.registry.FollyFoesFightsEntities;
import com.peeko.FollyFoesFights.registry.FollyFoesFightsItems;
import com.peeko.FollyFoesFights.registry.other.FollyFoesFightsEntityAttributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

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

    void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            FollyFoesFightsEntityAttributes.putAttributes();
        });
    }

    @OnlyIn(Dist.CLIENT)
    public void clientSetup(final FMLClientSetupEvent event) {
        ClientRegister.registerBlockRenderers();
        ClientRegister.registerEntityRenderers();
    }


}
