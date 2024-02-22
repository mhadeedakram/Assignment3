package Assignment3;

public class Assign3Q3 {
    
    public static void main(String[] args) {

        int currentValue=5;

        System.out.println("The number is: "+ currentValue);
        
        int fac=1;
        int i=1;
        while (i<=currentValue){
            fac=i*fac;
            i++;
        }
        System.out.println("The factorial is: " + fac);

    }
}
