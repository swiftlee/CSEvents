package com.phaseos.csevents;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public final class CSEvents extends JavaPlugin {

    private Set<Module> modules;
    private GameEvent activeEvent;

    @Override
    public void onEnable() {
        modules = new HashSet<>();
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private <T extends Module> T registerModule(Function<CSEvents, T> manager) {
        try {
            T module;
            modules.add(module = manager.apply(this));
            return module;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
