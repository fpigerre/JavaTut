package io.github.psgs.javatut;

/**
 * The package a class is located in must always be defined at the top of a class.
 * The package must use a certain java naming convention, as demonstrated here.
 *
 *  'io.github.psgs.javatut'
 *
 *  @Information io.github.psgs.javatut.java.Introduction.java;
 *  (Line 46)
 */

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Logger;

/*
* Above this comment are several import statements.
* Import statements import classes from other packages, to be used in this specific class.
* Import statements use the same naming convention as packages.
* Eg. org.bukkit.plugin.java.JavaPlugin;
 */

public class JavaTut extends JavaPlugin {

    /*
    * Here, this class name is defined.
    * This class' name is 'JavaTut'.
    * You'll also notice this class extends another class, called JavaPlugin.
    * This means JavaTut is a subclass of JavaPlugin.
    *
    * @Information io.github.psgs.javatut.java.Introduction.java;
    * (Line 57)
     */

    JavaTut plugin;
    private Logger logger;

    /*
    * 'JavaTut plugin;' and 'private Logger logger;' are fields.
    * They define certain objects within a class.
    *
    * JavaTut plugin; is defining the class 'JavaTut' as a JavaPlugin.
    * private Logger logger; is defining a new logger for this class.
     */

    public JavaTut(JavaTut plugin) {
        this.plugin = plugin;
    }

    /*
    * This is the class constructor.
    * The class constructor is a method that initiates the class.
    * The constructor always uses the same name as the class itself.
     */

    @Override
    public void onEnable() {
    /*
    * This is the plugin's onEnable method.
    * The onEnable method is a hardcoded method, and will be triggered when the plugin is loaded by a server.
    *
     */
        File config = new File(this.getDataFolder(), "config.yml");
        if (!config.exists()) {
            this.saveDefaultConfig();
            this.getConfig().options().copyHeader(true);
            log(0, "No config.yml detected. Config.yml created!");
        }
        log(0, "is enabled!");
    }


    @Override
    public void onDisable() {
        log(0, "is disabled!");
    }

    public void setLogger(java.util.logging.Logger logger) {
        this.logger = logger;
    }

    public void log(int priority, String msg) {
        if (logger != null) {
            if (priority == 0) {
                logger.info("[ " + plugin.getName() + " ] " + msg);
            } else {
                if (priority == 1) {
                    logger.warning("[ " + plugin.getName() + " ] " + msg);
                } else {
                    if (priority == 2) {
                        logger.severe("[ " + plugin.getName() + " ] " + msg);
                    }
                }
            }
        }
    }
}
