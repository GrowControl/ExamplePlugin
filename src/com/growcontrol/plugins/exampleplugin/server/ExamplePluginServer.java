package com.growcontrol.plugins.exampleplugin.server;

import com.growcontrol.server.plugins.gcServerPlugin;
import com.poixson.app.plugin.xPluginManager;
import com.poixson.app.plugin.xPluginYML;


public class ExamplePluginServer extends gcServerPlugin {



	public ExamplePluginServer(final xPluginManager<?> manager, final xPluginYML yml) {
		super(manager, yml);
	}



	@Override
	protected void onEnable() {
	}
	@Override
	protected void onDisable() {
	}



/*
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
		{
			System.out.println();
			System.out.println("Message from config file: "+this.config.getMessage());
			System.out.println("And some numbers..");
			for(final Integer i : this.config.getNumbers()) {
				System.out.println(i);
			}
			System.out.println();
		}
		// blink something
		if(utils.notEmpty(this.config.getTickThis())) {
			final TickExample tickExample = new TickExample(
					this.config.getTickThis()
			);
			xTickHandler.get()
				.register(tickExample);
		}
	}
*/



}
