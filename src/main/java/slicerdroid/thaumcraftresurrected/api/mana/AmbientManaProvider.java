package slicerdroid.thaumcraftresurrected.api.mana;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AmbientManaProvider implements ICapabilitySerializable<CompoundTag> {
    public static final Capability<IAmbientMana> AMBIENT_MANA = CapabilityManager.get(new CapabilityToken<IAmbientMana>() {});
    private final IAmbientMana instance = new AmbientMana();
    private final LazyOptional<IAmbientMana> optional = LazyOptional.of(AmbientMana::new);

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return cap == AMBIENT_MANA ? optional.cast() : LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        nbt.putInt("ambient_mana", instance.getAmbientMana());
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        instance.setAmbientMana(nbt.getInt("ambient_mana"));
    }
}
