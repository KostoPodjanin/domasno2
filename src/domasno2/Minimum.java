package domasno2;

public class Minimum {
	public static int findMin(int n1, int n2, int n3) {
		int min;
		if(n1<n2) {
			min = n1;
		}
		else if(n1<n3) {
			min = n2;
		}
		else {
			min = n3;
			return min;
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Minimumot od trite broja e: "+ findMin(10, 5, 3));
	}

}

