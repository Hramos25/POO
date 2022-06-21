package Aula5;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int input;
		Date date = new Date(1, 1, 2000);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			input = Date.getInt("Escolha uma operação: ", sc);

			switch (input) {
				case 1:
					int day = Date.getInt("Introduza o dia: ", sc);
					int month = Date.getInt("Introduza o mês: ", sc);
					int year = Date.getInt("Introduza o ano: ", sc);

					date = new Date(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					date.increment();
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					date.decrement();
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}
		} while (input != 0);



	}

        
		
}

/*
class Date{
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		if (!valid(day, month, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
	}

    // public static String getString(String message, Scanner sc){
    //     System.out.print(message);
    //     return sc.nextLine();
    // }
    public static int getInt(String message, Scanner sc){
        System.out.print(message);
        return sc.nextInt();
    }
    public static Boolean validMonth(int month){
        
        if(month < 1 || month > 12){
            return false;
        }
        else{
            return true;
        }
    }
    public static int monthDays(int month, int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        else if(month == 2){
            if(year % 4 == 0){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            return 0;
        }

    }
    public Boolean isLeapYear(int year){
        if(year % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public Boolean valid(int day, int month, int year){
        if(day < 1 || day > monthDays(month, year)){
            return false;
        }
        else{
            return true;
        }
    }
    public void set(int day, int month, int year){
        assert valid(day, month, year);

        if (valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else{
            System.out.println("Invalid date");
        }
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String increment(){
        int day = this.day;
        int month = this.month;
        int year = this.year;
        if (day == monthDays(month, year)){
            this.day= 1;
            if(month == 12){
                this.month = 1;
                this.year++;
            }
            else{
                this.month++;
            }
        }else {
            if (day < monthDays(month, year)){
                this.day++;
            }

        }
    
        return this.toString();
    }
    public String decrement() {
		int day = this.day;
		int month = this.month;
		int year = this.year;

		if (day == 1) {
			this.day = monthDays(month, year);
			if (month == 1) {
				this.month = 12;
				this.year--;
			} else {
				this.month--;
			}
		} else {
			this.day--;
		}
        return this.toString();
    }
    public String toString() {
		return String.format("%04d-%02d-%02d", this.day, this.month, this.year);
	}
}
*/