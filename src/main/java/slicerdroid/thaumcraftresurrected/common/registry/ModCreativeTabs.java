package slicerdroid.thaumcraftresurrected.common.registry;

import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThaumcraftResurrected.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TAB_THAUMCRAFT = CREATIVE_TABS.register(ThaumcraftResurrected.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.thaumcraftresurrected"))
                    .icon(() -> new ItemStack(Items.GOAT_HORN.asItem()))
                    .displayItems((parameters, output) -> {
                        ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get()));
                        //ModBlocks.CREATIVE_TAB_BLOCKS.forEach((block) -> output.accept(block.get()));
                    })
                    .build());
}
