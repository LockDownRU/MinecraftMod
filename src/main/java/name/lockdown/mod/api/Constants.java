package name.lockdown.mod.api;

import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Constants {

    public static class Mod {
        public static final String MODID = "mod";
        public static final String NAME = "My Mod :3";
        public static final String VERSION = "@VERSION@";
        public static final String DEPENDENCIES = "";
    }

    public enum ModItem
    {
        ITEMTEST("ItemTest");

        @Getter
        private final String regName;

        ModItem(String regName)
        {
            this.regName = regName;
        }

        public Item getItem()
        {
            return ModAPI.getItem(getRegName());
        }
    }

    public enum ModBlock
    {
        BLOCKTEST("BlockTest"),
        BLOCKTESTTILE("blocktesttile");

        @Getter
        private final String regName;

        ModBlock(String regName) {
            this.regName = regName;
        }

        public Block getBlock() {
            return ModAPI.getBlock(getRegName());
        }
    }

}
