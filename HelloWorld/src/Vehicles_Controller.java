


public class Vehicles_Controller 
{
	private Vehicles_Controller model;
	private Vehicles_Controller view;
	private String year;
	
	public Vehicles_Controller(Vehicles_Controller model,Vehicles_Controller view)
	{
		this.model=model;
	}
	
	
	
	public void setVehicles_Name(String name)
	{
		model.setVehicles_Name(name);
	}
	
	public String getVehicles_Name()
	{
		return model.getVehicles_Name();
	}
	
	
	public void setVehicles_Year(int year)
	{
		model.setVehicles_Year(year);
	}
	
	public int getVehicles_Year()
	{
		return model.getVehicles_Year();
	}
	
	public void setVehicles_Engine(String engine)
	{
		model.setVehicles_Engine(engine);
	}
	
	public String getVehiclesEngine()
	{
		return model.getVehiclesEngine();
	}
	
	public void updateView()
	{                     
		view.printVehiclesDetails(model.getVehicles_Name(),model.getVehicles_Year(),model.getVehiclesEngine());
	}



	private void printVehiclesDetails(String name, int year, String engine) {
		 System.out.println("Vehicles Details: ");
       
		System.out.println("Name: " + name);
         System.out.println("Vehicles Year" + year);
      
		System.out.println("Vehicles Engine: " + engine);
	}
}
