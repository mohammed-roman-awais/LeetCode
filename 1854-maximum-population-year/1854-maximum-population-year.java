class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }
        int max = 0, population = 0, year = 1950;
        for (int i = 0; i < 101; i++) {
            population += years[i];
            if (population > max) {
                max = population;
                year = 1950 + i;
            }
        }
        return year;
    }
}