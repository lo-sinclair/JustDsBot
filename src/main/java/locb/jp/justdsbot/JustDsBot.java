package locb.jp.justdsbot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class JustDsBot extends JavaPlugin implements Listener {

    public ConsoleCommandSender console;

    @Override
    public void onEnable() {
        console = getServer().getConsoleSender();
        console.sendMessage(ChatColor.GOLD + "[JustDsBot] " + ChatColor.GRAY + "Hi!");
        new DiscordListener(this);

    }
}
