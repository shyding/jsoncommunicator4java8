package com.shimizukenta.jsoncommunicator;

import java.util.EventListener;

public interface JsonCommunicatorLogListener extends EventListener {
	public void put(JsonCommunicatorLog log);
}