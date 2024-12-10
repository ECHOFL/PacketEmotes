package me.fliqq.packetemotes;

import org.bukkit.plugin.java.JavaPlugin;

public class PacketEmotes extends JavaPlugin
{
    @Override
    public void onEnable(){
        messages();
    }
        
    private void messages() {
        getLogger().info("***********");
        getLogger().info("PacketEmotes 1.0 enabled");
        getLogger().info("Plugin by Fliqqq");
        getLogger().info("***********");
    }
}
