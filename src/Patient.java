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
        System.out.println(name + " " + id + " " + symptoms + " " + registrationDate);
    }
}
