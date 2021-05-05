package mfernflower.drugmod.items;
import mfernflower.drugmod.*;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
@SuppressWarnings("deprecation")
public class DrugPsilocybin extends Item {

    public DrugPsilocybin() {
        super(new Item.Properties()
                .group(MinecraftRx.TAB)
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.NAUSEA, 300, 3), 1)
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 300, 1), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
