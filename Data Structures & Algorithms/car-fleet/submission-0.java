class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][]cars=new double[position.length][2];

        for(int i=0;i<cars.length;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];// time to reach to the destination

        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0])); // sort on the basis of the who reach first 

        int fleet=0;
        double maxsp=0.0;
        for(int i=0;i<cars.length;i++){
            double cursp=cars[i][1];
            if(cursp>maxsp){
                maxsp=cursp;
                fleet++;
            }
        }
        return fleet;
    }
}
