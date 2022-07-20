package com.iannoguez.forgeproyect;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("forgeproyect")
public class ForgeProyect {

    public ForgeProyect(){
        MinecraftForge.EVENT_BUS.register(this);
    }

}
