package dk.xfos.algaemod.item;

import dk.xfos.algaemod.AlgaeMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlgaeMod.MODID);

    public static final RegistryObject<CreativeModeTab> ALGAE_TAB = CREATIVE_MODE_TABS.register("algae_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALGAE.get()))
                    .title(Component.translatable("creativtab.algae_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ALGAE.get());
                        pOutput.accept(ModItems.BLUE_ALGAE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}