package io.github.psgs.javatut;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BasicCommandMethod implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("This is a test!");
        }

        if (cmd.getName().equalsIgnoreCase("broadcast")) {
            Bukkit.broadcastMessage(args[0]);
        }

        if (cmd.getName().equalsIgnoreCase("kick")) {
            if (args != null) {
                Player target = Bukkit.getPlayer(args[0]);
                target.kickPlayer("You've been kicked!");
                sender.sendMessage("You kicked " + args[0]);
            }
        }
        return false;
    }
}
