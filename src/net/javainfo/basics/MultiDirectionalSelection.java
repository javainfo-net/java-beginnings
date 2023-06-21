package net.javainfo.basics;


import java.util.Scanner;

//Użycie instrukcji/wyrażenia switch - wyboru wielokierunkowego (4 rodzaje)
public class MultiDirectionalSelection {

    static int dayNumber;
    public static int statementWithoutPassingControl(String dayOfWeek){
        int dayNumber = switch (dayOfWeek){
            case "Poniedziałek" -> {
                yield 1;
            }
            case "Wtorek" -> 2;
            default -> -1;
        };
        return dayNumber;
    }

    public static int instructionWithoutPassingControl(String dayOfWeek){
        switch(dayOfWeek){
            case "Środa" -> {return 3;}
            case "Czwartek" -> {return 4;}
            default -> {
                return -1;
            }
        }
    }

    public static int statementWithPassingControl(String dayOfWeek){
        int dayNumber = switch(dayOfWeek){
            case "Piątek" : yield 5;
            case "Sobota" : yield 6;
            default: yield -1;
        };
        return dayNumber;
    }

    public static void instructionWithPassingControl(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Niedziela":
                dayNumber = 7;
            break;
            default:
               break ;
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String dayString;

        do {
            System.out.println("Podaj nazwę dnia tygodnia, a powiem Ci który to dzień liczbowo");

            dayString = scanner.next();
            switch(dayString) {

                case "Poniedziałek","Wtorek" -> dayNumber = statementWithoutPassingControl(dayString);
                case "Środa","Czwartek" -> dayNumber = instructionWithoutPassingControl(dayString);
                case "Piątek", "Sobota" -> dayNumber = statementWithPassingControl(dayString);
                case "Niedziela" -> instructionWithPassingControl(dayString);
                default -> dayNumber = -1;
            }
            if(dayNumber != -1)
            System.out.println(dayString + " jest to " + dayNumber + " dzień tygodnia");
        }while(dayNumber != -1);

    }
}
