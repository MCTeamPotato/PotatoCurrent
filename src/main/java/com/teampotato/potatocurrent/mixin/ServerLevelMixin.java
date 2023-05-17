package com.teampotato.potatocurrent.mixin;

import com.teampotato.potatocurrent.access.IServerLevel;
import com.teampotato.potatocurrent.wire.WireHandler;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ServerWorld.class)
public abstract class ServerLevelMixin implements IServerLevel {

    private final WireHandler wireHandler = new WireHandler((ServerWorld)(Object)this);

    @Override
    public WireHandler getWireHandler() {
        return wireHandler;
    }
}
