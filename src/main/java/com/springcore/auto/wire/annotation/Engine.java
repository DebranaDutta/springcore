package com.springcore.auto.wire.annotation;

public class Engine {
	private int MAX_POWER;
	private int MAX_TORQUE;
	private String COOLING_SYSTEM;
	private String TRANSMISSION_TYPE;
	
	public Engine() {}

	public Engine(int mAX_POWER, int mAX_TORQUE, String cOOLING_SYSTEM, String tRANSMISSION_TYPE) {
		super();
		MAX_POWER = mAX_POWER;
		MAX_TORQUE = mAX_TORQUE;
		COOLING_SYSTEM = cOOLING_SYSTEM;
		TRANSMISSION_TYPE = tRANSMISSION_TYPE;
	}

	public int getMAX_POWER() {
		return MAX_POWER;
	}

	public void setMAX_POWER(int mAX_POWER) {
		MAX_POWER = mAX_POWER;
	}

	public int getMAX_TORQUE() {
		return MAX_TORQUE;
	}

	public void setMAX_TORQUE(int mAX_TORQUE) {
		MAX_TORQUE = mAX_TORQUE;
	}

	public String getCOOLING_SYSTEM() {
		return COOLING_SYSTEM;
	}

	public void setCOOLING_SYSTEM(String cOOLING_SYSTEM) {
		COOLING_SYSTEM = cOOLING_SYSTEM;
	}

	public String getTRANSMISSION_TYPE() {
		return TRANSMISSION_TYPE;
	}

	public void setTRANSMISSION_TYPE(String tRANSMISSION_TYPE) {
		TRANSMISSION_TYPE = tRANSMISSION_TYPE;
	}

	@Override
	public String toString() {
		return "Engine [MAX_POWER=" + MAX_POWER + ", MAX_TORQUE=" + MAX_TORQUE + ", COOLING_SYSTEM=" + COOLING_SYSTEM
				+ ", TRANSMISSION_TYPE=" + TRANSMISSION_TYPE + "]";
	}
	
}
