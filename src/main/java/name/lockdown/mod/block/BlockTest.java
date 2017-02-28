package name.lockdown.mod.block;


import name.lockdown.mod.Mod;
import name.lockdown.mod.api.Constants;
import name.lockdown.mod.client.IVariantProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class BlockTest extends Block implements IVariantProvider {

    public BlockTest()
    {
        super(Material.ROCK);

        setUnlocalizedName(Constants.Mod.MODID + ".blocktest");
        setCreativeTab(Mod.tabMod);
        setHardness(2.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 1);
    }


    // IVariantProvider
    @Override
    public List<Pair<Integer, String>> getVariants()
    {
        List<Pair<Integer, String>> ret = new ArrayList<Pair<Integer, String>>();
        ret.add(new ImmutablePair<Integer, String>(0, "normal"));
        return ret;
    }
}
