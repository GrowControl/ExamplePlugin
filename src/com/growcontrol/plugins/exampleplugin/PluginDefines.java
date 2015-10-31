package com.growcontrol.plugins.exampleplugin;

import com.poixson.commonjava.Utils.utilsDirFile;


public final class PluginDefines {
	private PluginDefines() {}


	// defaults
	public static final String DEFAULT_MESSAGE = "Failed to load message, this one is default";


	// plugin config
	public static final String CONFIG_PATH = utilsDirFile.mergePaths("plugins", "ExamplePlugin");
	public static final String CONFIG_FILE = "ExamplePlugin.yml";
	// config keys
	public static final String CONFIG_MESSAGE = "Message";
	public static final String CONFIG_NUMBERS = "Numbers";
	public static final String CONFIG_TICKTHIS = "Tick This";


}
