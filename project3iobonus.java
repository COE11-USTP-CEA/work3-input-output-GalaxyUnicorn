import java.io.*;
class project3iobonus{
    public static void main(String[]args){
        System.out.println("The Pyramid ");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader g = new BufferedReader(r);
        System.out.println("Enter height of the Pyramid: ");
        int num = 0;
        try{
            num=Integer.valueOf(g.readLine());
        }
        catch(Exception j){
            System.out.println("Invalid Digit");
        }
        for(int i=1; i<=num; i++){
            for( int k=1; k<num -(i-1); k++){
                System.out.print(" ");
            }
            for( int j=1; j<=i; j++){
                System.out.print("*");
                for( int j1=1; j1<j; j1+=j){
                System.out.print("*");
                }
            }
            System.out.println("");
        }   
    }
}