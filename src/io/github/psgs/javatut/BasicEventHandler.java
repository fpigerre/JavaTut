package io.github.psgs.javatut;

import org.bukkit.WeatherType;
import org.bukkit.block.Block;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.entity.Player;

public class BasicEventHandler implements Listener {

    @EventHandler
    public void onPlayerFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("You're fishing!");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        player.giveExp(10);
        player.sendMessage("Congrats! You broke a block!");
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "You're not allowed to place blocks!");
        event.setCancelled(true);
    }

    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();
        player.setPlayerWeather(WeatherType.CLEAR);
        player.sendMessage(ChatColor.GOLD + "When you ignite blocks, your weather is set to clear, and the block breaks instantly!");
        block.breakNaturally();
    }
}
