package com.sunilos.p11thread;

/**
 * Message object is used by WaiterThread and NotifierThread.
 * 
 * WaiterThread get lock(monitor) on Message object and release lock by wait()
 * method.
 * 
 * NotifierThread notify back to WaiterThread to process the message by calling
 * notify() and notifyall() methods.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class Message {

	private String msg;

	public Message(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String str) {
		this.msg = str;
	}

}
