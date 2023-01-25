package net.brynnleymods.jbstone.item;

import net.brynnleymods.jbstone.JBStone;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
        DeferredRegister.create(ForgeRegistries.ITEMS, JBStone.MOD_ID);

    public static final RegistryObject<Item> FINEPEBBLE = ITEMS.register("fine_pebble",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)) );

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
