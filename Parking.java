
public class Parking {
	public static int Compute(int min) {
		int cost = 0;
		if (min > 30 && min < 61) 
			cost = 2;
		if (min > 60 && min < 1440) {
			cost = 2;
			min -= 60;
			while (min > 0){
				cost += 1;
				min -= 30;
			} 
		}
		if (min > 1439) {
			cost = 24 * (min / 1440);
			min = min % 1440;
			min -= 30;
			if (min > 0)
				cost += 2;
				min -= 30;
			while (min > 0){
				cost += 1;
				min -= 30;
			}
		}
		return cost;
	}
	public static void main(String[] args) {
		System.out.println("The cost of parking for 1471 minutes is $" + Compute(1471));
		System.out.println("The cost of parking for 30 minutes is $" + Compute(30));
		System.out.println("The cost of parking for -4 minutes is $" + Compute(-4));
		System.out.println("The cost of parking for 31 minutes is $" + Compute(31));
		System.out.println("The cost of parking for 63 minutes is $" + Compute(63));
		System.out.println("The cost of parking for 3000 minutes is $" + Compute(3000));
	}

}
