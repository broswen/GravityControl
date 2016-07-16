package com.broswen.gravitycontrol;

import org.bukkit.craftbukkit.v1_10_R1.Overridden;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Brad S. on 7/15/2016.
 */

public class GravityControl extends JavaPlugin implements Listener {

    private static List<UUID> zeroG;

    @Override
    public void onEnable(){
        zeroG = new ArrayList<>();
        //load config
    }

    @Override
    public void onDisable(){

    }

    public static boolean isZeroG(UUID uuid){
        return zeroG.contains(uuid);
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Action a = e.getAction();
        if(e.getItem() == null) return;
        ItemStack item = e.getItem();



    }
}
