package com.phaseos.csevents.util;

import org.bukkit.ChatColor;

public class StringUtils {
    public static String fmt(String toFormat) {
        return ChatColor.translateAlternateColorCodes('&', toFormat);
    }
}
