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

    File configFile;
    FileConfiguration config;
    
    
	@Override
	public void onDisable() {
		saveYamls();
		getLogger().info("[BlockWarner] Disabled plugin!");
	}
	
	@Override
	public void onEnable() {
		configFile = new File(getDataFolder(), "config.yml");
        try {
            firstRun();
        } catch (Exception e) {
            e.printStackTrace();
        }
        config = new YamlConfiguration();
        loadYamls();
		getLogger().info("[BlockWarner] Enabled plugin!");
	}
	
	 private void firstRun() throws Exception {
		 if(!configFile.exists()){                        // checks if the yaml does not exists
			 configFile.getParentFile().mkdirs();         // creates the /plugins/<pluginName>/ directory if not found
			 copy(getResource("config.yml"), configFile); // copies the yaml from your jar to the folder /plugin/<pluginName>
	        }
	 }
	 
	    private void copy(InputStream in, File file) {
	        try {
	            OutputStream out = new FileOutputStream(file);
	            byte[] buf = new byte[1024];
	            int len;
	            while((len=in.read(buf))>0){
	                out.write(buf,0,len);
	            }
	            out.close();
	            in.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void loadYamls() {
	        try {
	            config.load(configFile); //loads the contents of the File to its FileConfiguration
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void saveYamls() {
	        try {
	            config.save(configFile); //saves the FileConfiguration to its File
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	

}