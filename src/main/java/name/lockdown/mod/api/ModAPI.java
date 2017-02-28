package name.lockdown.mod.api;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModAPI {
    @Getter
    @Setter
    private static boolean loggingEnabled;

    public static Item getItem(String name)
    {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(Constants.Mod.MODID, name));
    }

    public static Item getItem(Constants.ModItem modItem)
    {
        return getItem(modItem.getRegName());
    }

    public static Block getBlock(String name)
    {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Constants.Mod.MODID, name));
    }

    public static Block getBlock(Constants.ModBlock modBlock)
    {
        return getBlock(modBlock.getRegName());
    }

}
