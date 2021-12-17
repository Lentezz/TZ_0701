import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File myFile = new File("MyFile.txt");
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        while(true){
            System.out.println("----------------MENU--------------------");
            System.out.print("1 - add object in file\n2 - read n objects from file and add them to the end ArrayList\n3 - print array in console\n4 - clear array\n5 - exit\n----------------------------------------\n");
            System.out.println("Print your command: ");
            char command = scan.next().charAt(0);
            switch(command){
                case '1':
                    scan.nextLine();
                    System.out.println("Patient name: ");
                    String name = scan.nextLine();
                    System.out.println("Patient ID: ");
                    int ID = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Patient symptoms: ");
                    String symptoms = scan.nextLine();
                    System.out.println("Patient registration date: ");
                    String registrationDate = scan.nextLine();
                    Patient patient = new Patient(name, ID, symptoms, registrationDate);
                    patient.addToFile(myFile);
                    break;
                case '2':
                    System.out.println("How many objects read from file to array? n = ");
                    char n1;
                    n1 = scan.next().charAt(0);
                    int n = Character.getNumericValue(n1);
                    addToArray(myFile, n, patientArrayList);
                    break;
                case '3':
                    System.out.print("Скільки обєктів прочитати з файлу у масив? n= ");
                    n1 = scan.next().charAt(0);
                    n = Character.getNumericValue(n1);
                    System.out.print("Прочитані обєкти вставляти у масив починаючи з елементу m= ");
                    char m1 = scan.next().charAt(0);
                    int m = Character.getNumericValue(n1);
//                    setToArray()    Реалізувати метод
                    break;
            }
        }
    }

    private static void addToArray(File myFile, int n, ArrayList<Patient> patientArrayList) {
        try(Scanner scanFile = new Scanner(myFile)){
            int j = 0;
            System.out.println("-------Read from file in array n objects-------");
            while(j < n){

            }
        }
    }
}
