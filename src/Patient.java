import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Patient{
    private int id;

    private String symptoms;

    private String registrationDate;

    private String name;

    public Patient(String name, int id, String symptoms, String registrationDate) {
        this.name = name;
        this.id = id;
        this.symptoms = symptoms;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println(getName() + " " + getId() + " " + getSymptoms() + " " + getRegistrationDate());
    }

    public void addToFile(File myFile) {
        try (FileWriter writer = new FileWriter(myFile, true)){
            System.out.print("Name: " + this.name);
            System.out.print("Id: " + this.id);
            System.out.print("Symptoms: " + this.symptoms);
            System.out.print("Registration date: " + this.registrationDate);

            writer.write(getName() + "\r\n");
            writer.write(getId() + "\r\n");
            writer.write(getSymptoms() + "\r\n");
            writer.write(getRegistrationDate() + "\r\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", symptoms='" + symptoms + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
