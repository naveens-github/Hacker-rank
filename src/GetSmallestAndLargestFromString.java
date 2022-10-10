import java.util.Scanner;

public class GetSmallestAndLargestFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s,k));
    }

    public static String getSmallestAndLargest(String s, int k){
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for(int i=1; i<s.length()-k+1; i++){
            String substr = s.substring(i, i+k);
            if(smallest.compareTo(substr)>0)
                smallest = substr;
            if(largest.compareTo(substr)<0)
                largest = substr;
        }
        return smallest + "\n" + largest;
    }
}
