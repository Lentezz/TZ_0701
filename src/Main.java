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
            }
        }
    }
}
