package edu.unca.rbruce.EventDemo;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;

public class EventDemoLogger {

	private final EventDemo plugin;
	private final Logger logger;

	public EventDemoLogger(EventDemo plugin) {
		this.plugin = plugin;
		logger = Logger.getLogger("Minecraft");
	}

	private String buildMessage(String message) {
		PluginDescriptionFile yml = plugin.getDescription();
		String output = yml.getName() + yml.getVersion() + ": " + message;
		return output;
	}

	public void info(String msg) {
		logger.info(this.buildMessage(msg));
	}

	public void warn(String msg) {
		logger.warning(this.buildMessage(msg));
	}

}
