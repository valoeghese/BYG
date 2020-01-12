package sporeaoc.byg.ModSetup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import sporeaoc.byg.block.LeaveBlocks;

public class ModSetup {
    // Creative Mod Tab
    public static ItemGroup itemGroup = new ItemGroup("nature") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(LeaveBlocks.APPLE_SKYRIS_LEAVES);
        }
    };

    public void init() {
    }
}
