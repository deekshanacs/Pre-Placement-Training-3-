import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class GradientSorter {
    public static double getLuminance(Color c) {
        return (0.2126 * c.getRed()) + (0.7152 * c.getGreen()) + (0.0722 * c.getBlue());
    }

    public static void sortColorsByBrightness(List<Color> palette) {
        int n = palette.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (getLuminance(palette.get(j)) > getLuminance(palette.get(j + 1))) {
                    Color temp = palette.get(j);
                    palette.set(j, palette.get(j + 1));
                    palette.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        List<Color> colors = Arrays.asList(
            Color.WHITE, 
            Color.BLACK, 
            Color.BLUE, 
            Color.YELLOW
        );

        sortColorsByBrightness(colors);
        System.out.println(colors);
    }
}
