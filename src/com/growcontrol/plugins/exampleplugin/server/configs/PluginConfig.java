package com.growcontrol.plugins.exampleplugin.server.configs;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.growcontrol.common.gcCommonDefines;
import com.growcontrol.plugins.exampleplugin.PluginDefines;
import com.poixson.commonapp.config.xConfig;
import com.poixson.commonapp.config.xConfigException;


public class PluginConfig extends xConfig {

	public final String version;
	public final String message;
	public final List<Integer> numbers;
	public final String tickThis;



	public PluginConfig(final Map<String, Object> datamap)
			throws xConfigException {
		super(datamap);
		this.version = this.getString(gcCommonDefines.CONFIG_VERSION);
		this.message = this.getStr(
				PluginDefines.CONFIG_MESSAGE,
				PluginDefines.DEFAULT_MESSAGE
		);
		this.numbers = this.loadNumbers();
		this.tickThis = this.getString(PluginDefines.CONFIG_TICKTHIS);
	}
	private List<Integer> loadNumbers() throws xConfigException {
		final List<Integer> numbers = this.getList(
				Integer.class,
				PluginDefines.CONFIG_NUMBERS
		);
		return Collections.unmodifiableList(numbers);
	}



	public String getVersion() {
		return this.version;
	}
	public String getMessage() {
		return this.message;
	}
	public List<Integer> getNumbers() {
		return this.numbers;
	}
	public String getTickThis() {
		return this.tickThis;
	}



}
