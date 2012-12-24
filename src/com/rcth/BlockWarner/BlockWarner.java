package com.rcth.BlockWarner;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public final class BlockWarner extends JavaPlugin {
	
    
	@Override
	public void onEnable() {
		getLogger().info("[BlockWarner] Enabled plugin!");
	}
	
	
	@Override
	public void onDisable() {
		getLogger().info("[BlockWarner] Disabled plugin!");
	}
}