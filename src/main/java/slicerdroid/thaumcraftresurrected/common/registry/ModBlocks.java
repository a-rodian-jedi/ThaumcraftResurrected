package slicerdroid.thaumcraftresurrected.common.registry;

import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThaumcraftResurrected.MOD_ID);

    public static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
    }
}
