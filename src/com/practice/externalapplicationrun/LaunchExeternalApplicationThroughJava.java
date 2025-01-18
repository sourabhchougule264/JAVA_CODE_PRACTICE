package com.practice.externalapplicationrun;

import java.io.IOException;

public class LaunchExeternalApplicationThroughJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad.exe");

	}
}
