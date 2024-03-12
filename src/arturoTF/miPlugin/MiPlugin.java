package arturoTF.miPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import arturoTF.miPlugin.comandos.ComandoYoutube;

public class MiPlugin extends JavaPlugin{
	
	PluginDescriptionFile pdFile = getDescription();
	
	public String version = pdFile.getVersion();
	public String nombre = pdFile.getName();

	public static void main(String[] args) {

	}
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Plugin " + ChatColor.RESET  + nombre + ChatColor.GREEN + " Online " + ChatColor.WHITE + "(version: " + ChatColor.GOLD + version + ChatColor.WHITE + ")"
		);
		registrarComandos();
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Plugin " + ChatColor.RESET  + nombre + ChatColor.DARK_RED + " Offline " + ChatColor.WHITE + "(version: " + ChatColor.GOLD + version + ChatColor.WHITE + ")"
		);
	}
	
	public void registrarComandos() {
		this.getCommand("youtube").setExecutor(new ComandoYoutube(this));
	}
}
 