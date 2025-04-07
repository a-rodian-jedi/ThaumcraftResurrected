package slicerdroid.thaumcraftresurrected.common.registry;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slicerdroid.thaumcraftresurrected.ThaumcraftResurrected;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ThaumcraftResurrected.MOD_ID);

    public static final RegistryObject<SimpleParticleType> ALEXANDRITE = PARTICLE_TYPES.register("alexandrite", () -> new SimpleParticleType(true));
}
