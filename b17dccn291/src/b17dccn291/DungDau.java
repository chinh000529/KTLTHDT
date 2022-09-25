package b17dccn291;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DungDau {
    static int n;
    static int[] a = new int[11];
    static int[] check = new int[11];
    static String[] res = new String[11];
    static String first;
    static List<String> listName = new ArrayList<>();
    public static void main(String[] args) {
        String names;
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); in.nextLine();
        names = in.nextLine();
        first = in.nextLine();

        res = names.split("\\s+");
        Arrays.sort(res);

        for (int i = 0; i< n; i++) {
            if (!res[i].equals(first))
                listName.add(res[i]);
        }

        Try(1);
    }

    public static void Try(int i){
        int j;
        for (j = 1; j<=n-1; j++){
            if (check[j] == 0){
                check[j] = 1;
                a[i] = j;
                if (i == n-1) in();
                else Try(i+1);
                check[j] = 0;
            }
        }
    }

    public static void in(){

        for (int i = 1; i<=n-1; i++){
            System.out.print( listName.get(a[i] - 1)+ " ");
        }
        System.out.print(first + " ");
        System.out.println();
    }
}
