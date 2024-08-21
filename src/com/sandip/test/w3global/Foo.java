package com.sandip.test.w3global;

public class Foo {
	private static volatile Foo onlyObj;

	private Foo() {
	}

	public static Foo getInstance() {
		if (onlyObj == null) { // First check
			synchronized (Foo.class) {
				if (onlyObj == null) { // Second check inside synchronized block
					onlyObj = new Foo();
				}
			}
		}
		return onlyObj;
	}

}
