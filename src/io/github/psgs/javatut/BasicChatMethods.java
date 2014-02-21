package io.github.psgs.javatut;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class BasicChatMethods {

    String coloredMessage = ChatColor.LIGHT_PURPLE + "This " + ChatColor.GREEN + "is a message in green " + ChatColor.LIGHT_PURPLE + "and in purple!";

    public void broadcast(String message) {
        Bukkit.broadcastMessage(message);
    }

    public void broadcastColor(String message) {
        Bukkit.broadcastMessage(ChatColor.RED + message);
    }
}
