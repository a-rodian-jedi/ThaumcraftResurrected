package slicerdroid.thaumcraftresurrected.api.mana;

import net.minecraftforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public interface IAmbientMana {
    /**
     * @return the amount of ambient mana in the world
     */
    int getAmbientMana();

    /**
     * @param amount the amount of ambient mana to set
     */
    void setAmbientMana(int amount);

    /**
     * @param amount the amount of ambient mana to add
     */
    void addAmbientMana(int amount);

    /**
     * @param amount the amount of ambient mana to remove
     */
    void removeAmbientMana(int amount);
}
