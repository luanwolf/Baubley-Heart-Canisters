package kiba.bhc.proxy;

import kiba.bhc.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        registerRenderers();
    }
    @Override
    public void Init(FMLInitializationEvent event){
      super.Init(event);
    }
    @Override
    public void registerRenderers(){
        ModItems.initModels();
    }
}
