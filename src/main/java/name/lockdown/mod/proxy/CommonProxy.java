package name.lockdown.mod.proxy;

import name.lockdown.mod.Mod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CommonProxy {

    public void preInit()
    {

        registerRenderers();
    }

    public void init()
    {

    }

    public void postInit()
    {

    }

    public void registerRenderers()
    {

    }

    public void tryHandleBlockModel(Block block, String name)
    {
        // NO-OP
    }

    public void tryHandleItemModel(Item item, String name)
    {
        // NO-OP
    }

}
