import java.util.ArrayList;

class JobApplication {
    private String name;
    private String email;
    private String address;
    private ArrayList<String> experience;
    private ArrayList<String> references;
    private String contact_information;

    // Constructor
    public JobApplication(String name, String email, String address, ArrayList<String> references, ArrayList<String> experience, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.references = references;
        this.experience = experience;
        this.contact_information = phoneNumber;
    }

    // Print Method
    public void print() {
        String formattedReferences = String.join(", ", getContacts());
        
        System.out.println("Name: " + this.name + 
                           "\nEmail: " + this.email + 
                           "\nAddress: " + this.address + 
                           "\nPast Jobs: " + this.getExperience() + 
                           "\nPeople to contact: " + formattedReferences + 
                           "\nPhone number: " + this.contact_information);
    }

    public String getExperience() {
        String result = "";
        for (int i = 0; i < experience.size(); i++) {
            result += experience.get(i) + ", ";
        }
        return result;
    }

public String getContacts() {
        String result = "";
        for (int i = 0; i < references.size(); i++) {
            result += references.get(i) + ", ";
        }
        return result;
    }

public String getName(){
    return this.name;
}
public String getEmail(){
    return this.email;
}
public String getAddress(){
    return this.address;
}
public String getPhoneNumber(){
    return this.contact_information;
}
public void setName(String name){
    this.name = name;
}
public void setEmail(String Email){
    this.email = Email;
}
public void setAddress(String address){
    this.address = address;
}
public void setPhoneNumber(String number){
    this.contact_information = number;
}
}


class DeveloperAppliction extends JobApplication{

    private String githubProfile;
    private ArrayList<String> languages;

    public DeveloperAppliction(String name, String email, String address, ArrayList<String> references, ArrayList<String> experience, String phoneNumber, String githubProfile, ArrayList<String> programmingLanguages){
        super(name, email, address, references, experience,phoneNumber);
        this.githubProfile = githubProfile;
        this.languages = programmingLanguages;

    }



}
















