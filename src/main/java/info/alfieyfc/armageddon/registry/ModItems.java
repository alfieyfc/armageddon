package info.alfieyfc.armageddon.registry;

import info.alfieyfc.armageddon.Armageddon;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items

    //Block Items
    public static final BlockItem QUEST_BLOCK = new BlockItem(ModBlocks.QUEST_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void  registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Armageddon.MOD_ID, "quest_block"), QUEST_BLOCK);
    }
}
