import java.util.Scanner;
public class ShareMarketChart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 ,crest = 0 ,trough = 0;
        System.out.println("Enter the length of your array ");
        int arrayLength = scanner.nextInt();

        int chart [] = new int[arrayLength];

        /* For loop to enter the values in the Array */
        System.out.println("Enter the values of your array ");
        for (int upStream =0 ; upStream < chart.length; upStream++)
        {
        	chart[upStream] = scanner.nextInt();
        }
        for(n1=0; n1<arrayLength-1; n1++) {
        if (chart[n1]>chart[n1+1])
          {
        	crest++;       
          }
        else if(chart[n1+1]>chart[n1])
        {
        	trough++;
        }
        }
       System.out.println("Repeat crest:-  "+crest);
       System.out.println("Repeat trough:-  "+trough);
    }
    }