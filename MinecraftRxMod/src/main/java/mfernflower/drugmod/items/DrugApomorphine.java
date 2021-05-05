package mfernflower.drugmod.items;

import mfernflower.drugmod.*;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
@SuppressWarnings("deprecation")
public class DrugApomorphine extends Item {

    public DrugApomorphine() {
        super(new Item.Properties()
                .group(MinecraftRx.TAB)
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.HUNGER, 222, 4), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
