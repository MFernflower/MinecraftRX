package mfernflower.drugmod.items;
import mfernflower.drugmod.*;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
@SuppressWarnings("deprecation")
public class DrugCaffeine extends Item {

    public DrugCaffeine() {
        super(new Item.Properties()
                .group(MinecraftRx.TAB)
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.SPEED, 315, 2), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
