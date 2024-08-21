package problemsolving.stack;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		int[] height = {4,2,0,3,2,5}; //Output: 9
		int sum = trap(height);
		System.out.print(sum);
	}
	
	public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        //max height to left
        int leftMax = 0;
        for(int i=0; i<height.length; i++){
            leftMax = Math.max(leftMax, height[i]);
            left[i] = leftMax;
        }

         //max height to right
         int rightMax =0;
        for(int i=height.length-1; i>=0; i--){
            rightMax = Math.max(rightMax, height[i]);
            right[i] = rightMax;
        }

        //total trapped water
        int sum = 0;
        for(int i=0; i<height.length; i++){
            sum += Math.min(left[i], right[i])-height[i];
        }
        return sum;
    }

}
