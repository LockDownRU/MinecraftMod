package name.lockdown.mod.registry;


import name.lockdown.mod.Mod;
import name.lockdown.mod.api.Constants;
import name.lockdown.mod.block.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final Block BLOCKTEST;

    static
    {
        BLOCKTEST = registerBlock(new BlockTest(), Constants.ModBlock.BLOCKTEST.getRegName());
    }



    public static void init() {

    }

    public static void initTiles() {

    }


    private static Block registerBlock(Block block, String name) {

        if (block.getRegistryName() == null)
            block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(name));
        Mod.proxy.tryHandleBlockModel(block, name);

        return block;
    }

    private static Block registerBlock(ItemBlock itemBlock, String name) {
        Block block = itemBlock.getBlock();

        if (block.getRegistryName() == null) {
            block.setRegistryName(name);
        }

        GameRegistry.register(block);
        GameRegistry.register(itemBlock.setRegistryName(name));
        Mod.proxy.tryHandleBlockModel(block, name);

        return block;
    }
}
