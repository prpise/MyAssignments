package week2.day1;

public class Car {
	
	
	public void driveCar() {
		String name = "FORD";
		System.out.println("I am driving" + " " + name + " " );
			
		}
	
	private void applybrake() {
		System.out.println("I am applying brake");
	}
	
	protected void soundHorn() {
		
		System.out.println("SoundHorn");
		
	}
		
    public void isPuncture() {
    	System.out.println(false);

    }
    
   

public static void main(String []args) {
	
	Car obj=new Car();
	obj.driveCar();
	obj.applybrake();
	obj.soundHorn();
	obj.isPuncture();
	
}

}

 


