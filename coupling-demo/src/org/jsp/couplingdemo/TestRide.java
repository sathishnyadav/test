package org.jsp.couplingdemo;

public class TestRide {
	public static void main(String[] args) {
		Ride r = new Ride();
		r.setV(new Car());// dependency Injection
		r.getV().start();
	}
}
