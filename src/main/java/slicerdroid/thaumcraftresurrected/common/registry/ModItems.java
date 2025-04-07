package slicerdroid.thaumcraftresurrected.common.registry;

import com.google.common.collect.Sets;
import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;
import slicerdroid.thaumcraftresurrected.common.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThaumcraftResurrected.MOD_ID);
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    // Items
    public static final RegistryObject<Item> SALIS_MUNDUS = registerWithTab("salis_mundus",
            () -> new SalisMundusItem(new Item.Properties()));
}
