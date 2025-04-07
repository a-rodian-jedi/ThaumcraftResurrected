package slicerdroid.thaumcraftresurrected.common.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AlexandriteParticles extends TextureSheetParticle {
    protected AlexandriteParticles(ClientLevel pLevel, double pX, double pY, double pZ,
                                   SpriteSet spriteSet, double pXSpeed, double pYSpeed, double pZSpeed) {
        super(pLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed);

        this.friction = 0.8F;

        this.xd = pXSpeed;
        this.yd = pYSpeed;
        this.zd = pZSpeed;

        // Set the initial size of the particle
        this.quadSize *= 0.75F;
        // Set lifetime of particle in ticks (20 ticks = 1 second)
        this.lifetime = 10;

        this.setSpriteFromAge(spriteSet);

        // RGB
        this.rCol = 1F;
        this.gCol = 1F;
        this.bCol = 1F;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet pSpriteSet) {
            this.spriteSet = pSpriteSet;
        }

        public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ,
                                       double pXSpeed, double pYSpeed, double pZSpeed) {
            return new AlexandriteParticles(pLevel, pX, pY, pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
        }
    }
}
