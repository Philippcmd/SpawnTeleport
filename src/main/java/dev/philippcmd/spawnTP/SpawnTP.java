package dev.philippcmd.spawnTP;

import dev.philippcmd.spawnTP.command.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnTP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("spawn").setExecutor(new SpawnCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
