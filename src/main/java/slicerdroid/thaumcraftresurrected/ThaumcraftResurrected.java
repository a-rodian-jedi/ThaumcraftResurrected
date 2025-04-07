package slicerdroid.thaumcraftresurrected;

import slicerdroid.thaumcraftresurrected.common.registry.ModCreativeTabs;
import slicerdroid.thaumcraftresurrected.common.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import slicerdroid.thaumcraftresurrected.common.registry.ModParticleTypes;

@Mod(ThaumcraftResurrected.MOD_ID)
public class ThaumcraftResurrected
{
    public static final String MOD_ID = "thaumcraftresurrected";
    public static final Logger LOGGER = LogManager.getLogger();

    public ThaumcraftResurrected() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_TABS.register(modEventBus);
        ModParticleTypes.PARTICLE_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
