package com.phaseos.csevents;

public enum Permission {
    RELOAD_PLUGIN("csevents.reloadplugin");

    private String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return this.permission;
    }
}
