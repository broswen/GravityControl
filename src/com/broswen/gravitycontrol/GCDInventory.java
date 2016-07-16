package com.broswen.gravitycontrol;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

/**
 * Created by Brad S. on 7/15/2016.
 */
public class GCDInventory implements Listener{

    boolean enabled;
    Player p;
    public GCDInventory(Player p, boolean enabled){
        this.p = p;
        this.enabled = enabled;
    }


    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        Inventory inv = e.getInventory();
    }
}
