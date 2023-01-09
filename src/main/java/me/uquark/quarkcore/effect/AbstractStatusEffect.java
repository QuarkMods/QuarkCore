package me.uquark.quarkcore.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractStatusEffect extends StatusEffect {
    public final Identifier id;

    protected AbstractStatusEffect(String modid, String name, StatusEffectCategory type, int color) {
        super(type, color);
        id = new Identifier(modid, name);
    }

    public void register() {
        Registry.register(Registries.STATUS_EFFECT, id, this);
    }
}
