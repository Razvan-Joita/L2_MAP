
public class HelloWorld {
	public static void main(String [] args)
	{
		int x=1;
		System.out.println(x);
		Model_Layer_Vehicles_Repo model=new Model_Layer_Vehicles_Repo();
		View_Vehicles vehicle=new View_Vehicles();
		//Vehicles_Controller controller=new Vehicles_Controller();
		
	}
	
	 private static Model_Layer_Vehicles_Repo retriveCourseFromDatabase(){
         Model_Layer_Vehicles_Repo vehicle = new Model_Layer_Vehicles_Repo();
         vehicle.set_year(2020);
         vehicle.set_name("Passat");
         vehicle.set_engine("Diesel");
         return vehicle;
      }
}
