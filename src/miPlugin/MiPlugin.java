package miPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MiPlugin extends JavaPlugin{
	
	PluginDescriptionFile pdFile = getDescription();
	
	public String version = pdFile.getVersion();
	public String nombre = ChatColor.YELLOW+"["+ChatColor.BLUE+pdFile.getName()+ChatColor.YELLOW+"]";

	public static void main(String[] args) {

	}
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.DARK_PURPLE+"El Plugin "+nombre+ChatColor.WHITE+" ha sido activado (version: "+ChatColor.RED+version+ChatColor.WHITE+")"
		);
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.DARK_PURPLE+"El Plugin "+nombre+ChatColor.WHITE+" ha sido desactivado (version: "+ChatColor.RED+version+ChatColor.WHITE+")"
		);
	}
}
