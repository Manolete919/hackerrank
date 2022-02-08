package com.hacker.rank;

class LowestCostSolution {
	public static void main(String[] args) throws java.lang.Exception {
		//System.out.println(calculateMinCost(new int[] { 1, 4, 6, 7, 28, 30 }));
		//System.out.println(calculateMinCost(new int[] { 1, 7, 8, 9, 10 }));
		System.out.println(calculateMinCost(new int[] { 1, 7 }));
		//System.out.println(calculateMinCost(new int[] { 1, 7, 8, 9, 10, 15 }));
	}

	public static int calculateMinCost(int[] arr) {
		
		boolean[] isDayWithTrip = new boolean[31]; // note: initializes to false
		
		for (final int dayWithTrip : arr) {
			isDayWithTrip[dayWithTrip] = true;
		}

		int[] minCostUpThroughDay = new int[31];
		
		minCostUpThroughDay[0] = 0; // technically redundant
		
		//itera todos los dias
		for (int d = 1; d < 31; ++d) {
			//si ese dia no es un dia de viaje
			if (!isDayWithTrip[d]) {
				// el costo minimo de ese dia es igual al anterior
				minCostUpThroughDay[d] = minCostUpThroughDay[d - 1];
				continue;
			}

			int minCost;
			// Possibility #1: one-day pass on day d:
			 // costo en dolares
			minCost = minCostUpThroughDay[d - 1] + 2;
			// Possibility #2: seven-day pass ending on or after day d:
			minCost = Math.min(minCost, minCostUpThroughDay[Math.max(0, d - 7)] + 7);
			// Possibility #3: 30-day pass for the whole period:
			minCost = Math.min(minCost, 25);

			minCostUpThroughDay[d] = minCost;
		}

		return minCostUpThroughDay[30];
	}
}
