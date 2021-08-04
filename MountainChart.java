import java.util.Scanner;
public class MountainChart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your array ");
        int arrayLength = scanner.nextInt();

        int chart [] = new int[arrayLength];

        /* For loop to enter the values in the Array */
        System.out.println("Enter the values of your array ");
        for (int upStream =0 ; upStream < chart.length; upStream++)
        {
        	chart[upStream] = scanner.nextInt();
        }
        int large,small,i;
        //defining length of n
        int n = chart.length;
        large=small=chart[0];
        for(i=1;i<n;++i)
        {
        if(chart[i]>large)
        large=chart[i];

        if(chart[i]<small)
        small=chart[i];
        }
        //Printing values of large and small
        System.out.print("\nThe smallest element is "+ small + "\n");
        System.out.print("\nThe largest element is " + large + "\n");
        //as count start from integer 1
        int Repeat = 1;
        for( int n1=0; n1<arrayLength-1; n1++) {
        if (chart[n1]==chart[n1+1])
          {
           Repeat++;       
          }
        }
       System.out.println("Repeat Count:-  "+Repeat);
       System.out.println("Difference between large and small:" + (large-small));
  }
}