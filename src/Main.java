import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File myFile = new File("MyFile.txt");
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        while (true) {
            System.out.println("----------------MENU--------------------");
            System.out.print("1 - add object in file\n2 - read n objects from file and add them to the end ArrayList\n" +
                    "3 - change ArrayList element on chosen elements from file\n" +
                    "4 - print array in console\n5 - clear array\n6 - exit\n----------------------------------------\n");
            System.out.println("Print your command: ");
            char command = scan.next().charAt(0);
            switch (command) {
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
                    System.out.print("How many objects read from file to array? n = ");
                    n1 = scan.next().charAt(0);
                    n = Character.getNumericValue(n1);
                    System.out.print("Read object pasting in array started with m = ");
                    char m1 = scan.next().charAt(0);
                    int m = Character.getNumericValue(m1);
                    setToArray(myFile, n, m, patientArrayList);
                    break;
                case '4':
                    showArray(patientArrayList);
                    break;
                case '5':
                    clearArray(patientArrayList);
                    break;
                case '6':
                    scan.close();
                    System.out.println("Exiting program..");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void setToArray(File myFile, int n, int m, ArrayList<Patient> patientArrayList) {
        Integer id;
        String name, symp, date;
        try (Scanner fl = new Scanner(myFile)) {
            int j = m;
            while (j < n) {

                name = fl.nextLine();
                id = fl.nextInt();
                symp = fl.nextLine();
                date = fl.nextLine();

                patientArrayList.set(m, new Patient(name, id, symp, date));
                j++;
                m++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void addToArray(File myFile, int n, ArrayList<Patient> patientArrayList) {
        Integer id;
        String name, date, symp;
        try (Scanner scanFile = new Scanner(myFile)) {
            int j = 0;
            System.out.println("-------Read from file in array n objects-------");
            while (j < n) {
                name = scanFile.nextLine();
                id = scanFile.nextInt();
                scanFile.nextLine();
                symp = scanFile.nextLine();
                date = scanFile.nextLine();
                //scanFile.close();
                System.out.println("j = " + j + " n = " + n + "\t name: " + name);
                System.out.println("\tID: " + id);
                System.out.println("\tSymptoms: " + symp);
                System.out.println("\tDate of registration: " + date);

                patientArrayList.add(new Patient(name, id, symp, date));
                j++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showArray(ArrayList<Patient> patientArrayList) {
        System.out.println("-------------Вивести масив на екран----------------");
        System.out.println(patientArrayList.toString());

    }

    public static void clearArray(ArrayList<Patient> patientArrayList) {
        System.out.println("----------------Очистка масиву--------------------");
        for (int i = 0; i < patientArrayList.size(); i++) {
            patientArrayList.get(i).clear();
        }
    }

}
