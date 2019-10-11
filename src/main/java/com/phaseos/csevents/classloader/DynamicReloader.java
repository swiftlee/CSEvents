package com.phaseos.csevents.classloader;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredListener;

import java.io.File;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class DynamicReloader {

    private void unload(Plugin plugin) {
        String name = plugin.getName();
        PluginManager pluginManager = Bukkit.getPluginManager();
        SimpleCommandMap cmdMap = null;

        List<Plugin> plugins = null;
        Map<String, Plugin> names = null;
        Map<String, Command> commands = null;
        Map<Event, SortedSet<RegisteredListener>> listeners = null;

        boolean reloadListeners = true;

        pluginManager.disablePlugin(plugin);

        try {
            Field pluginsField = Bukkit.getPluginManager().getClass().getDeclaredField("plugins");
            pluginsField.setAccessible(true);
            plugins = (List<Plugin>) pluginsField.get(pluginManager);

            Field lookupNamesField  = Bukkit.getPluginManager().getClass().getDeclaredField("lookupNames");
            lookupNamesField.setAccessible(true);
            names = (Map<String, Plugin>) lookupNamesField.get(pluginManager);



        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    private void load(Plugin plugin) {

    }

    public void performReload(Plugin plugin) {
        if (plugin != null) {
            unload(plugin);
            load(plugin);
        }
    }

}
