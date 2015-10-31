package com.growcontrol.plugins.exampleplugin.server;

import com.growcontrol.common.meta.MetaRouter;
import com.growcontrol.common.meta.metaTypes.MetaIO;
import com.poixson.commonjava.scheduler.ticker.xTickEvent;
import com.poixson.commonjava.scheduler.ticker.xTickListener;


public class TickExample implements xTickListener {

	private final String destAddr;

	private volatile boolean blink = false;



	public TickExample(final String destAddr) {
		this.destAddr = destAddr;
	}



	@Override
	public void onTick(final xTickEvent event) {
		MetaRouter.get().route(
				this.destAddr,
				MetaIO.get(this.blink)
		);
		this.blink = !this.blink;
	}



	@Override
	public String getName() {
		return "TickExample";
	}
	@Override
	public String toString() {
		return this.getName();
	}



}
