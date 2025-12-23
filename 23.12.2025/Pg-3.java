public class RadarScanner {

    public static void cocktailShakerSort(int[] signalStrengths) {
        boolean swapped = true;
        int start = 0;
        int end = signalStrengths.length;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (signalStrengths[i] > signalStrengths[i + 1]) {
                    int temp = signalStrengths[i];
                    signalStrengths[i] = signalStrengths[i + 1];
                    signalStrengths[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; 

            swapped = false;
            end = end - 1; 
            for (int i = end - 1; i >= start; i--) {
                if (signalStrengths[i] > signalStrengths[i + 1]) {
                    int temp = signalStrengths[i];
                    signalStrengths[i] = signalStrengths[i + 1];
                    signalStrengths[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
    
    public static void main(String[] args) {
        int[] radarData = {5, 1, 4, 2, 8, 0, 2};
        cocktailShakerSort(radarData);
        System.out.println(java.util.Arrays.toString(radarData));
    }
}
