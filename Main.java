import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
    ArrayList<String> references = new ArrayList<>();
    ArrayList<String> experinces = new ArrayList<>();
    ArrayList<String> codingLanguages = new ArrayList<>();
    ArrayList<String> specialties = new ArrayList<>();
    JobApplication app = new JobApplication("Brandon", "brandon.sucks@gmail.com", "i suckvill",references,experinces, "6356259967");
    DeveloperAppliction devApp = new DeveloperAppliction("Gabe", "gabe.gay@gmail.com", "yourMomsTown", references, experinces, "6769420", "IHateMen", codingLanguages);
    MechanicApplication mechApp = new MechanicApplication("Nathan", "nathan.youExist@gmail.com", "Corvallisvill",references,experinces,"56987597",false,false,specialties);
  }
}