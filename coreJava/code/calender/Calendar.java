//this program will print a calender


import java.time.*;

public class Calendar{
    public static void main(String[] args){
        //create a new date object
        LocalDate date= LocalDate.now();
        int month= date.getMonthValue();
        int today= date.getDayOfMonth();

        //put the day to the first day of month
        date= date.minusDays(today-1);

        //find the day of the week

        DayOfWeek weekDay= date.getDayOfWeek();
        int value= weekDay.getValue();  //1=monday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=0;i<value;i++){
            System.out.print("   ");
        }

        //now print the whole calender
        while(date.getMonthValue()==month){
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue()!=1)
            System.out.println();
    }
}


