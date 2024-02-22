package Assignment3;

public class Assign3Q2 {

    public static void main(String[] args) {

        String currentMonth="June";

        switch (currentMonth){
            case "January":
                System.out.println("The current month "+currentMonth+" and it have 31 days.");
                break;
            case "February":
                System.out.println("The current month  "+currentMonth+" and it have 28 or 29 days.");
                break;
            case "March":
                System.out.println("The current month "+currentMonth+" and  it have 31 days.");
                break;
            case "April":
                System.out.println("The current month "+currentMonth+" and it have 30 days.");
                break;
            case "May":
                System.out.println("The current month "+currentMonth+" and it have 31 days.");
                break;
            case "June":
                System.out.println("The current month "+currentMonth+" and it have 30 days.");
                break;
            case "July":
                System.out.println("The current month "+currentMonth+" and it have 31 days.");
                break;
            case "August":
                System.out.println("The current month "+currentMonth+" and it have 31 days.");
                break;
            case "September":
                System.out.println("The current month "+currentMonth+" and it have 30 days.");
                break;
            case "October":
                System.out.println("The current month "+currentMonth+" and it have 31 days.");
                break;
            case "November":
                System.out.println("The current month "+currentMonth+" and it have 30 days.");
                break;
            case "December":
                System.out.println("The current month "+currentMonth+"and it have 31 days.");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }

    }
    
}
