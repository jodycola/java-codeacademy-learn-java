public class Droid{

    int batteryLevel;
    String name;
  
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task){
      System.out.println(name+ " is performing task: "+task);
      batteryLevel-= 10;
    }
  
    public void energyTransfer(int energy, String droidName){
      System.out.println(name+ " just transfered "+energy+ "% energy to "+droidName);
    }
  
    public void energyReport(){
      System.out.println(name+ " 's battery level is "+batteryLevel+"%");
    }
  
    public String toString(){
      return "Hello, I'm the droid: "+name;
    }
  
  
    public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      Droid Purple = new Droid("Purple");
  
      System.out.println(Codey);
      System.out.println(Codey.name);
      Codey.energyReport();
      Codey.performTask("dancing");
      Codey.energyReport();
      Purple.energyTransfer(30, "Codey");
    }
  }