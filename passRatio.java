import java.util.PriorityQueue;

public class passRatio {
    static void ratio(int [][] classes , int extraStudents){
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        // Calculate the initial gain for each class and add it to the heap.
        for (int[] c : classes) {
            double pass = c[0];
            double total = c[1];
            double gain = (pass + 1) / (total + 1) - pass / total;
            maxHeap.offer(new double[]{gain, pass, total});
        }

        // Distribute the extra students one by one to the class with the highest gain.
        while (extraStudents > 0) {
            // Get the class with the maximum potential gain (O(log C) operation).
            double[] bestClass = maxHeap.poll();

            // Update its pass and total student counts.
            double pass = bestClass[1] + 1;
            double total = bestClass[2] + 1;

            // Recalculate the new gain for this updated class.
            double newGain = (pass + 1) / (total + 1) - pass / total;

            // Add the updated class back to the heap (O(log C) operation).
            maxHeap.offer(new double[]{newGain, pass, total});

            extraStudents--;
        }

        // Calculate the sum of the final ratios.
        double totalRatioSum = 0;
        while (!maxHeap.isEmpty()) {
            double[] c = maxHeap.poll();
            totalRatioSum += c[1] / c[2]; // Add the final pass/total ratio.
        }

        // Return the average ratio.
        System.out.println(totalRatioSum / classes.length);
    }
    static int min (int[][] classes){
        double bestgain = -1;
        int index=-1;
        for(int i =0;i<classes.length;i++) {
            double currentgain = ((double) (classes[i][0]+1) / (classes[i][1]+1)) - ((double) (classes[i][0]) / (classes[i][1]));
            if(currentgain>bestgain){
                bestgain=currentgain;
                index=i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[][] stu={{2,4},{3,9},{4,5},{2,10}};
        ratio(stu,4);
    }
}
