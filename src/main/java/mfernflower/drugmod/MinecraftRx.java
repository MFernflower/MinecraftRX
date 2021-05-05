package mfernflower.drugmod;

import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mcrx")
public class MinecraftRx {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcrx";

    public MinecraftRx() {
        DrugRegister.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        LOGGER.info("MinecraftRx comes in a little glass vial!");
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Creative tab
    public static final ItemGroup TAB = new ItemGroup("rxTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.WARPED_ROOTS);
        }
    };
}
