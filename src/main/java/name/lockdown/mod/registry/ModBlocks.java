package name.lockdown.mod.registry;


import name.lockdown.mod.Mod;
import name.lockdown.mod.api.Constants;
import name.lockdown.mod.block.BlockTest;
import name.lockdown.mod.block.BlockTestTile;
import name.lockdown.mod.tile.TileTestTile;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final Block BLOCKTEST;
    public static final Block BLOCKTESTTILE;

    static
    {
        BLOCKTEST = registerBlock(new BlockTest(), Constants.ModBlock.BLOCKTEST.getRegName());
        BLOCKTESTTILE = registerBlock(new BlockTestTile(), Constants.ModBlock.BLOCKTESTTILE.getRegName());
    }



    public static void init() {

        initTiles();
    }

    public static void initTiles() {
        GameRegistry.registerTileEntity(TileTestTile.class, Constants.Mod.MODID + ":" + TileTestTile.class.getSimpleName());
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
