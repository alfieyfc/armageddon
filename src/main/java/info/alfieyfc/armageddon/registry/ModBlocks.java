package info.alfieyfc.armageddon.registry;

import info.alfieyfc.armageddon.Armageddon;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block QUEST_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOD).strength(Blocks.BEDROCK.getHardness(),Blocks.BEDROCK.getBlastResistance())
    );

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Armageddon.MOD_ID, "quest_block"), QUEST_BLOCK);
    }
}
