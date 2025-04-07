package slicerdroid.thaumcraftresurrected.common.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;
import slicerdroid.thaumcraftresurrected.common.particle.AlexandriteParticles;
import slicerdroid.thaumcraftresurrected.common.registry.ModParticleTypes;

@Mod.EventBusSubscriber(modid = ThaumcraftResurrected.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.ALEXANDRITE.get(), AlexandriteParticles.Provider::new);
    }
}
