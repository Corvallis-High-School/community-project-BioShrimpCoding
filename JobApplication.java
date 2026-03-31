import java.util.*;

class JobApplication {
    private String name;
    private String email;
    private String address;
    private ArrayList<String> experience;
    private ArrayList<String> references;
    private String contact_information;
    protected Scanner input = new Scanner(System.in);

    // Constructor
    public JobApplication(){
        name = "";
        email = "";
        address = "";
        experience = null;
        references = null;
        contact_information = "";
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
    public String toString() {
        String formattedReferences = String.join(", ", getContacts());
        
        return "Name: " + this.name + 
                           "\nEmail: " + this.email + 
                           "\nAddress: " + this.address + 
                           "\nPast Jobs: " + this.getExperience() + 
                           "\nPeople to contact: " + formattedReferences + 
                           "\nPhone number: " + this.contact_information;
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
public void getSkills() {
    boolean keepGoing = true;
    
    while (keepGoing) {
            System.out.println("What are some of your experiences?");
            this.experience.add(input.nextLine()); 
            System.out.println("Do you have more skills? (yes/no)");
            String response = input.nextLine();
        if (!response.equalsIgnoreCase("yes")) {
            keepGoing = false;
        }
    }
}
}



class DeveloperAppliction extends JobApplication{

    private String githubProfile;
    private ArrayList<String> languages;

    public DeveloperAppliction(){
        githubProfile = "";
        languages = null;
    }
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
    public String toString() {
        super.toString(); 
        
        String languagesFormatted = String.join(", ", this.languages);
        return "GitHub Profile: " + this.githubProfile + 
                           "\nProgramming Languages: " + languagesFormatted;
    }

    @Override
    public void getSkills() {
    boolean keepGoing = true;
    
    while (keepGoing) {
            System.out.println("What programming language can you program in");
            this.languages.add(input.nextLine()); 
            System.out.println("Do you have more languages? (yes/no)");
            String response = input.nextLine();
        if (!response.equalsIgnoreCase("yes")) {
            keepGoing = false;
        }
    }
}

}

class MechanicApplication extends JobApplication{

    private boolean aseCertified;
    private boolean hasTools;
    private ArrayList<String> specialties;


    public MechanicApplication(){
        aseCertified = false;
        hasTools = false;
        specialties = null;
    }
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
    public String toString() {
        super.toString(); 
        
        String certifiedText = this.aseCertified ? "Yes" : "No";
        String toolsText = this.hasTools ? "Yes" : "No";
        
        String specialtiesFormatted = "";
        if (this.specialties != null && !this.specialties.isEmpty()) {
            specialtiesFormatted = String.join(", ", this.specialties);
        } else {
            specialtiesFormatted = "None listed";
        }
        
        // Print the mechanic-specific details
        return "ASE Certified: " + certifiedText + 
                           "\nHas Own Tools: " + toolsText + 
                           "\nSpecialties: " + specialtiesFormatted;
    }

    @Override
    public void getSkills() {
    boolean keepGoing = true;
    
    while (keepGoing) {
            System.out.println("What are some of your specialties");
            this.specialties.add(input.nextLine()); 
            System.out.println("Do you have more specialties? (yes/no)");
            String response = input.nextLine();
        if (!response.equalsIgnoreCase("yes")) {
            keepGoing = false;
        }
    }
}
}