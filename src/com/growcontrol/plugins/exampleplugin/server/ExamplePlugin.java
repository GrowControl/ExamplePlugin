package com.growcontrol.plugins.exampleplugin.server;

import com.growcontrol.api.serverapi.plugins.apiServerPlugin;
import com.growcontrol.plugins.exampleplugin.PluginDefines;
import com.growcontrol.plugins.exampleplugin.server.configs.PluginConfig;
import com.poixson.commonapp.config.xConfig;
import com.poixson.commonapp.config.xConfigException;
import com.poixson.commonjava.xLogger.xLog;


public class ExamplePlugin extends apiServerPlugin {
	public static final String LOG_NAME = "ExamplePlugin";

	private volatile PluginConfig config = null;



	@Override
	protected void onEnable() {
		// load config
		try {
			this.config = (PluginConfig) xConfig.Load(
					getLogger(),
					PluginDefines.CONFIG_PATH,
					PluginDefines.CONFIG_FILE,
					PluginConfig.class,
					ExamplePlugin.class
			);
		} catch (xConfigException e) {
			this.log().trace(e);
			this.config = null;
		}
		if(this.config == null) {
			this.fail("Failed to load "+PluginDefines.CONFIG_FILE);
			return;
		}
		// do something useful
		System.out.println();
		System.out.println("Message from config file: "+this.config.getMessage());
		System.out.println("And some numbers..");
		for(final Integer i : this.config.getNumbers()) {
			System.out.println(i);
		}
		System.out.println();
	}



	@Override
	protected void onDisable() {
	}



	// logger
	private static volatile xLog _log = null;
	public static xLog getLogger() {
		if(_log == null)
			_log = xLog.getRoot(LOG_NAME);
		return _log;
	}
	public static xLog getLogger(final String name) {
		return getLogger().get(name);
	}



}
