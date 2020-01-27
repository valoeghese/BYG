package sporeaoc.byg.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import sporeaoc.byg.catalogs.ItemCatalogs;

public class Init {
    public static ItemGroup creativeTab = new ItemGroup("byg") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemCatalogs.BLACK_PUFF);
        }
    };

    public void init() {
    }
}
