
package com.sandip.test.w3global;

public class OnlyThreeInstancesImpl implements OnlyThreeInstances {

	private static int instanceCount = 0;
	private static final int MAX_INSTANCE = 3;

	private OnlyThreeInstancesImpl() {

	}

	public static OnlyThreeInstances getInstance() {
		if (instanceCount < MAX_INSTANCE) {
			instanceCount++;
			return new OnlyThreeInstancesImpl();
		} else {
			throw new IllegalStateException("Maximun number of instances reached");
		}
	}

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		System.out.println("sandip");

	}

}
