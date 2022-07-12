package org.simplemc.plugintemplate

import org.bukkit.plugin.java.JavaPlugin

/**
 * KotlinPluginTemplate plugin
 */
class KotlinPluginTemplate : JavaPlugin() {

    override fun onEnable() {
        // ensure config file exists
        saveDefaultConfig()
        reloadConfig()

        server.pluginManager.registerEvents(JoinListener(config), this)
        logger.info("${description.name} version ${description.version} enabled!")
    }

    override fun onDisable() {
        logger.info("${description.name} disabled.")
    }
}
