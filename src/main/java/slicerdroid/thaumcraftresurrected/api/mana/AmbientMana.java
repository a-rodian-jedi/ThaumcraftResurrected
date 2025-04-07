package slicerdroid.thaumcraftresurrected.api.mana;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AmbientMana implements IAmbientMana {
    private int ambientMana = 0;

    @Override
    public int getAmbientMana() {
        return ambientMana;
    }

    @Override
    public void setAmbientMana(int amount) {
        this.ambientMana = amount;
    }

    @Override
    public void addAmbientMana(int amount) {
        this.ambientMana = this.ambientMana + amount;
    }

    @Override
    public void removeAmbientMana(int amount) {
        this.ambientMana = this.ambientMana - amount;
    }
}

