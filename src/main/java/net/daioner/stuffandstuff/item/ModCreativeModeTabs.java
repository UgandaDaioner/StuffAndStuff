package net.daioner.stuffandstuff.item;

import net.daioner.stuffandstuff.StuffAndStuff;
import net.daioner.stuffandstuff.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StuffAndStuff.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STUFFANDSTUFF_CREATIVE_TAB = CREATIVE_MODE_TAB.register("stuffandstuff_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISIO.get()))
                    .title(Component.translatable("creativetab.stuffandstuff.stuffandstuff_creative_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISIO.get());
                        output.accept(ModItems.RAWBISIO.get());
                        output.accept(ModBlocks.BISIOORE.get());
                        output.accept(ModBlocks.BISIOBLOCK.get());
                        output.accept(ModItems.BISIOLLA.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
