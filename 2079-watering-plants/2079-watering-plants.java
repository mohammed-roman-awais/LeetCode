class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0,water=capacity;
        for(int i=0;i<plants.length;i++){
            if(water<plants[i]){
                steps+=2*i+1;
                water=capacity;
            }else steps++;
            water-=plants[i];
        }
        return steps;
    }
}