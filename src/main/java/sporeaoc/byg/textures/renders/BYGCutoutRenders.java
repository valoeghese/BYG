package sporeaoc.byg.textures.renders;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGCutoutRenders {
    public void renderCutOuts(FMLCommonSetupEvent e) {
        RenderTypeLookup.setRenderLayer(BYGBlockList.);
    }
}
