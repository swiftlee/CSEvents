package com.phaseos.csevents.cmds;

import com.phaseos.csevents.CSEvents;
import com.phaseos.csevents.Permission;
import com.phaseos.csevents.util.StringUtils;
import org.bukkit.command.CommandSender;
import com.phaseos.csevents.command.ArgumentParser;

public class ReloadPluginCommand extends com.phaseos.csevents.command.Command {

    private CSEvents plugin;

    public ReloadPluginCommand(CSEvents plugin) {
        super("csreload", "csr");
        this.plugin = plugin;
    }

    @Override
    protected void execute(CommandSender sender, ArgumentParser ap) {
        if (sender.hasPermission(Permission.RELOAD_PLUGIN.toString())) {

        } else {
            // TODO: messages as enums in a Message enum (load from config)
            sender.sendMessage(StringUtils.fmt("&"));
        }
    }
}
