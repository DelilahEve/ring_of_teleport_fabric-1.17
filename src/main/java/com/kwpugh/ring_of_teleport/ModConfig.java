package com.kwpugh.ring_of_teleport;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "ring_of_teleport")
public class ModConfig extends PartitioningSerializer.GlobalData
{
    public General GENERAL = new General();

    @Config(name = "general")
    public static class General implements ConfigData
    {
        @Comment("\n"
                + "\n"
                + "\n"
                + "******************************"
                + "\nSettings"
                + "\n******************************")
        public boolean TBD = true;

    }

}