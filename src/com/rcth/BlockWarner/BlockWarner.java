package com.rcth.BlockWarner;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

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