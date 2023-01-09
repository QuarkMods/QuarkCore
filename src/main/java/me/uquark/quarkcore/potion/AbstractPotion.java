package me.uquark.quarkcore.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractPotion extends Potion {
    public final Identifier id;

    public AbstractPotion(String modid, String name, StatusEffectInstance... type) {
        super(type);
        id = new Identifier(modid, name);
    }

    public void register() {
        Registry.register(Registries.POTION, id, this);
    }
}
