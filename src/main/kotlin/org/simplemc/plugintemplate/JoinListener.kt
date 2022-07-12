package org.simplemc.plugintemplate

import org.bukkit.ChatColor
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener(private var config: FileConfiguration) : Listener {
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val party = config.getStringList("party")

        var msg = party.random()

        msg = msg.replace("\\rs", ChatColor.RESET.toString())
        msg = msg.replace("\\g", ChatColor.GREEN.toString())

        msg = msg.replace("{name}", event.player.name)

        event.joinMessage = msg
    }
}
