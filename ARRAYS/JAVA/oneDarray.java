/*  
 * AUTHOR
 * GAURAV WALIA(GauravWalia19)
 * © copyright sep 2018
 */
import java.util.*;
public class oneDarray
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter a num");
        int a = scan.nextInt();
        int arr[] = new int[a]; //creating one d array
        for(int i = 0; i<a; i++)
            arr[i] = i+1;
        scan.close();
    }
}
