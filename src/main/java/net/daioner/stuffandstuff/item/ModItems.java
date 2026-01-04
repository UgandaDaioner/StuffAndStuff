package net.daioner.stuffandstuff.item;

import net.daioner.stuffandstuff.StuffAndStuff;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StuffAndStuff.MOD_ID);

    public static final RegistryObject<Item> BISIO = ITEMS.register("bisio",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAWBISIO = ITEMS.register("raw_bisio",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BISIETTO = ITEMS.register("bisietto",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAWBISIETTO = ITEMS.register("raw_bisietto",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BISIOLLA = ITEMS.register("bisiolla",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FILTER = ITEMS.register("filter",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
