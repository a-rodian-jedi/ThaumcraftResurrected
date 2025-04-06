package hermeticblock.thaumcraft;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Thaumcraft.MOD_ID)
public class Thaumcraft
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "thaumcraftresurrected";

    public Thaumcraft() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
