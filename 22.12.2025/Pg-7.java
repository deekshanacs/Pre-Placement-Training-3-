public class PromoReverser {
    public static void main(String[] args) {
        String inputCode = "JAVA2025";
        
        StringBuilder sb = new StringBuilder(inputCode);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + inputCode);
        System.out.println("Mirrored Code: " + reversed);
        
        if(reversed.equals("5202AVAJ")) System.out.println("Winning Code!");
    }
}
