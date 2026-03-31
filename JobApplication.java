import java.util.ArrayList;

class JobApplication {
    private String name;
    private String email;
    private String address;
    private ArrayList<String> experience;
    private ArrayList<String> references;
    private String contact_information;

    // Constructor
    public JobApplication(){

    }
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

    public String getProfile(){
        return this.githubProfile;

    }
    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setProfile(String profile){
        this.githubProfile = profile;
    }
    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }
    @Override
    public void print() {
        // Call the parent class's print method to output the basic info
        super.print(); 
        
        // Output the new info specific to DeveloperApplication
        String languagesFormatted = String.join(", ", this.languages);
        System.out.println("GitHub Profile: " + this.githubProfile + 
                           "\nProgramming Languages: " + languagesFormatted);
    }

}

class MechanicApplication extends JobApplication{

    private boolean aseCertified;
    private boolean hasTools;
    private ArrayList<String> specialties;

    public MechanicApplication(String name, String email, String address, ArrayList<String> references, ArrayList<String> experience,  String phoneNumber, boolean aseCertified,  boolean hasOwnTools, ArrayList<String> specialties) {
        
        super(name, email, address, references, experience, phoneNumber);
        
        this.aseCertified = aseCertified;
        this.hasTools = hasOwnTools;
        this.specialties = specialties;
    }

    public boolean isAseCertified() {
        return this.aseCertified;
    }

    public void setAseCertified(boolean aseCertified) {
        this.aseCertified = aseCertified;
    }

    public boolean getHasOwnTools() {
        return this.hasTools;
    }

    public void setHasOwnTools(boolean hasOwnTools) {
        this.hasTools = hasOwnTools;
    }

    public ArrayList<String> getSpecialties() {
        return this.specialties;
    }

    public void setSpecialties(ArrayList<String> specialties) {
        this.specialties = specialties;
    }

    @Override
    public void print() {
        super.print(); 
        
        String certifiedText = this.aseCertified ? "Yes" : "No";
        String toolsText = this.hasTools ? "Yes" : "No";
        
        String specialtiesFormatted = "";
        if (this.specialties != null && !this.specialties.isEmpty()) {
            specialtiesFormatted = String.join(", ", this.specialties);
        } else {
            specialtiesFormatted = "None listed";
        }
        
        // Print the mechanic-specific details
        System.out.println("ASE Certified: " + certifiedText + 
                           "\nHas Own Tools: " + toolsText + 
                           "\nSpecialties: " + specialtiesFormatted);
    }




}
















