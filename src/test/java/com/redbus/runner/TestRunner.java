package com.redbus.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.google.main.RedBusHome;

@RunWith(Suite.class)
@SuiteClasses({ RedBusHome.class })
public class TestRunner {
	public static void main(String[] args) {
		System.out.println("Sasiprabha");
		System.out.println("Sasiprabha one more changes added");
	}

}
