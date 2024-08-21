package com.sandip.test.w3global;

import java.util.Arrays;

public final class MakeItImmutable {

	private final char[] charArray;

	public MakeItImmutable(char[] value) {
		if (value == null || value.length == 0)
			this.charArray = null;
		else
			this.charArray = Arrays.copyOf(value, value.length);
	}

	public char[] getCharArray() {
		if (charArray == null)
			return null;
		return Arrays.copyOf(charArray, charArray.length);
	}

}
