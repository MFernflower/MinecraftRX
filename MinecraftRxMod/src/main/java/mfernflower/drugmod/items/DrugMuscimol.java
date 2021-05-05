package mfernflower.drugmod.items;
import mfernflower.drugmod.*;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
@SuppressWarnings("deprecation")
public class DrugMuscimol extends Item {

    public DrugMuscimol() {
        super(new Item.Properties()
                .group(MinecraftRx.TAB)
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.BLINDNESS, 350, 3), 1)
                        .effect(new EffectInstance(Effects.GLOWING, 350, 1), 1)
                        .effect(new EffectInstance(Effects.NAUSEA, 350, 1), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
