package edu.unca.rbruce.EventDemo;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * This is the main class of the sample plug-in
 */
public class EventDemo extends JavaPlugin {
	/*
	 * This is called when your plug-in is enabled
	 */
	EventDemoLogger logger;

	@Override
	public void onEnable() {
		// save the configuration file
		saveDefaultConfig();

		logger = new EventDemoLogger(this);
		logger.info("plugin enabled");

		// Create the SampleListener
		new EventDemoListener(this);

		// set the command executor for sample
		this.getCommand("sample").setExecutor(
				new EventDemoCommandExecutor(this));
	}

	/*
	 * This is called when your plug-in shuts down
	 */
	@Override
	public void onDisable() {
		logger.info("plugin disabled");

	}

}
