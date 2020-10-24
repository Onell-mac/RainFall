import java.util.Scanner;
public class rainfallAverage {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double average = 0;

        System.out.println("\nEnter the amount of years");
        int years = input.nextInt();



        if (years > 0) {
            for(int y = 1; y <= years; y++){
                for(int m = 1; m <= 12; m++){
                 System.out.println("\nThis is Year #" + y);

                 System.out.println("Amount of inches of rainfall at month #" + m);
                 int i = input.nextInt();

                    if( i < 0){
                     System.out.println("Try again! No Negative values!");
                     break;
                    }
                    

                 
                 average += i; 
                


                }
                double averageTwo = average / 12;
                System.out.println("\nThe average for that year was " + averageTwo + " Inches");
                System.out.println("Total inches of rainfall " + average);
            }

        }
        else{
            System.out.println("Try again!");
        }



    }
    
}
