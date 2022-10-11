
public class Model_Layer_Vehicles_Repo
{
	private String name;
	
	private int year;
	private String engine;
	Model_Layer_Vehicles_Repo(String name,int year,String engine)
	{
		this.name=name;
		this.year=year;
		this.engine=engine;
	}
	
	
	
	public Model_Layer_Vehicles_Repo() {
		// TODO Auto-generated constructor stub
	}



	public String get_name()
	{
		return this.name;
		
	}
	
	public void set_name(String name)
	{
		this.name=name;
	}
	
	

	public int get_year()
	{
		return this.year;
		
	}
	
	
	
	public void set_year(int year)
	{
		this.year=year;
	}
	
	public String get_engine()
	{
		return this.engine;
	}
	
	
	public void set_engine(String engine)
	{
		this.engine=engine;
	}
	
	
	
	
}
