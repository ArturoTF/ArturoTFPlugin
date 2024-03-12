package arturoTF.miPlugin.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import arturoTF.miPlugin.MiPlugin;


public class ComandoYoutube implements CommandExecutor{
	
	private MiPlugin plugin;
	
	public ComandoYoutube(MiPlugin plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			//From console
			Bukkit.getConsoleSender().sendMessage(plugin.nombre+ChatColor.WHITE+"-> No puedes ejecutar comandos desde la consola");
			return false;
		}else {
			//From Player
			Player jugador = (Player) sender;
			jugador.sendMessage(ChatColor.DARK_RED+"--------------------------------------------------");
			jugador.sendMessage(ChatColor.YELLOW+"Visita nuestro canal de youtube: "+ChatColor.RED+" https://www.youtube.com/@xNanoEL6x");
			jugador.sendMessage(ChatColor.DARK_RED+"--------------------------------------------------");
			return true;
		}
		
	}

}
