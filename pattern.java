import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        //  * * * * * 
        for(int i = 0;i < 5;i++){                   
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //  * 
        //  * * 
        //  * * * 
        //  * * * *
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //  * * * * * * 
        //  * * * * * * 
        //  * * * * * * 
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

            //                * * * * * * 
            //              * * * * * * 
            //            * * * * * * 
            //          * * * * * * 
            //        * * * * * * 
            //      * * * * * * 

        for(int i=0;i<6;i++){
            //spaces logic
            for(int j=0;j<6-i;j++){
                System.out.print("  ");
            }

            //start logic
            for(int k=0;k<6;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good


        //  * * * * * * 
        //  * * * * * 
        //  * * * * 
        //  * * * 
        //  * * 
        //  * 
        for(int i=0;i<6;i++){
            for(int j=1;j<6-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        //          * 
        //        * * * 
        //      * * * * * 
        //    * * * * * * * 
        //  * * * * * * * * * 

        for(int i=0;i<6;i++){
            // space
            for(int j=0;j<6-i;j++){
                System.out.print("  ");
            }

            // stars
            for(int k=0;k<2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // for looking good

        
        sc.close();
    }
}