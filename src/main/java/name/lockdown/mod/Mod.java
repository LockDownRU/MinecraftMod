package name.lockdown.mod;

import name.lockdown.mod.api.Constants;
import name.lockdown.mod.api.util.helper.LogHelper;
import name.lockdown.mod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@net.minecraftforge.fml.common.Mod(modid = Constants.Mod.MODID, name = Constants.Mod.NAME, version = Constants.Mod.VERSION, dependencies = Constants.Mod.DEPENDENCIES)
public class Mod
{
    @SidedProxy(serverSide = "name.lockdown.mod.proxy.CommonProxy", clientSide = "name.lockdown.mod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @net.minecraftforge.fml.common.Mod.Instance(Constants.Mod.MODID)
    public static Mod instance;

    public static CreativeTabs tabMod = new CreativeTabs(Constants.Mod.MODID + ".creativeTab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.DIAMOND);
        }
    };

    private static boolean isDev = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");

    private LogHelper logger = new LogHelper(Constants.Mod.MODID);

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
