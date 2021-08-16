package info.alfieyfc.armageddon;

import info.alfieyfc.armageddon.registry.ModBlocks;
import info.alfieyfc.armageddon.registry.ModItems;
import net.fabricmc.api.ModInitializer;


public class Armageddon implements ModInitializer {

    public static final String MOD_ID = "armageddon";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
