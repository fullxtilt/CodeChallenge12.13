
public class MainDriver {
	public static void main(String[] args) {
		int[] testValues = {0, 1, 2, 5};
		
		for (int num : testValues) {
			System.out.println("waysToClimb(" + num + ") -> " + waysToClimb(num));
		}
	}
	
	public static int waysToClimb(int nStairs) {
		
		if (nStairs == 0)
			return 1;
		else if (nStairs < 0)
			return 0;
		
		return waysToClimb(nStairs-1) + waysToClimb(nStairs-2);
	}
}
