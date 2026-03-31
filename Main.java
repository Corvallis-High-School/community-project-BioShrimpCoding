import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
    ArrayList<String> references = new ArrayList<>();
    ArrayList<String> experinces = new ArrayList<>();
    JobApplication app = new JobApplication("Brandon", "brandon.sucks@gmail.com", "i suckvill",references,experinces, "6356259967");
    app.print();
    // call all of the objects methods to test them
  }
}