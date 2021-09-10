package com.kwpugh.ring_of_teleport;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RingOfTeleport implements ModInitializer
{
    public static final String MOD_ID = "ring_of_teleport";
    public Item RING_OF_TELEPORT = new ItemRingTeleport(new Item.Settings().group(ItemGroup.MISC));
    public Item RING_OF_TELEPORT2 = new ItemRingTeleport2(new Item.Settings().group(ItemGroup.MISC));
    public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ring_of_teleport"), RING_OF_TELEPORT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ring_of_teleport2"), RING_OF_TELEPORT2);
    }
}