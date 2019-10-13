package com.phaseos.csevents;

import org.bukkit.configuration.file.YamlConfiguration;

public class MessageHandler {

   private YamlConfiguration config;

    public MessageHandler(YamlConfiguration config) {
        this.config = config;
    }

    public enum Message {
        NO_PERMISSIONS;

        private YamlConfiguration config;
        private String message;

        public String message() {
            switch (this) {
                case NO_PERMISSIONS: return config.getString("message.no-permission");
                default: return "";
            }
        }
    }

}
