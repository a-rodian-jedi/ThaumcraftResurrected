package slicerdroid.thaumcraftresurrected.common.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.level.ChunkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;
import slicerdroid.thaumcraftresurrected.api.mana.AmbientManaProvider;

@Mod.EventBusSubscriber(modid = ThaumcraftResurrected.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WorldGenEvents {
    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<LevelChunk> event) {
        event.addCapability(ResourceLocation.parse(ThaumcraftResurrected.MOD_ID), new AmbientManaProvider());
    }

    @SubscribeEvent
    public static void onChunkDataLoad(ChunkEvent.Load event) {
        if (event.getChunk() instanceof LevelChunk chunk && event.isNewChunk()) {
            chunk.getCapability(AmbientManaProvider.AMBIENT_MANA).ifPresent(mana -> {
                mana.setAmbientMana(50);
                ThaumcraftResurrected.LOGGER.info(mana.getAmbientMana() + " mana given to chunk " + chunk.getPos());
            });
        }
    }
}
