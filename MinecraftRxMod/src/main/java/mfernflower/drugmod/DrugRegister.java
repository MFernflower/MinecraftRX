package mfernflower.drugmod;
;import mfernflower.drugmod.items.*;
import mfernflower.drugmod.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DrugRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftRx.MOD_ID);
    public static final RegistryObject<DrugPsilocybin> ModShrooms = ITEMS.register("pcybin", DrugPsilocybin::new);
    public static final RegistryObject<ItemSolvent> ModSolvent = ITEMS.register("solventvial", ItemSolvent::new);
    public static final RegistryObject<GelCap> ModGelCap = ITEMS.register("gelcap", GelCap::new);
    public static final RegistryObject<DrugMuscimol> ModFlyAgaric = ITEMS.register("muscimol", DrugMuscimol::new);
    public static final RegistryObject<DrugApomorphine> ModVomitPills = ITEMS.register("apomorphine", DrugApomorphine::new);
    public static final RegistryObject<DrugASA> ModWintergreen = ITEMS.register("asa", DrugASA::new);
    public static final RegistryObject<DrugPickle> ModPickle = ITEMS.register("picklepill", DrugPickle::new);
    public static final RegistryObject<DrugCaffeine> ModCaffeine= ITEMS.register("caffeine", DrugCaffeine::new);

}
