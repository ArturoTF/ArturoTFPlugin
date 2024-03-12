package miPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MiPlugin extends JavaPlugin{
	
	PluginDescriptionFile pdFile = getDescription();
	
	public String version = pdFile.getVersion();
	public String nombre = pdFile.getName();

	public static void main(String[] args) {

	}
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(
				"El Plugin "+nombre+" ha sido activado (version: "+version+")"
		);
	}

}
