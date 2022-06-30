package vehicle;

public class vehical {
	
	private int idvehicle;
	private String Regno;
	private String Brand;
	private String Year;
	private String Mileage;
	private String Oname;
    private String Price;
	private String Filepath;
	
	public vehical(int idvehicle, String regno, String brand, String year,
			String mileage, String oname, String price, String filepath) {
		
		this.idvehicle = idvehicle;
		this.Regno = regno;
		this.Brand = brand;
		this.Year = year;
		this.Mileage = mileage;
		this.Oname = oname;
		this.Price= price;
		this.Filepath = filepath ;
		 
	}

	public int getIdvehicle() {
		return idvehicle;
	}
	
	public String getRegno() {
		return Regno;
	}
	
	public String getBrand() {
		return Brand;
	}

	public String getYear() {
		return Year;
	}
	

	
	public String getMileage() {
		return Mileage;
	}

	public String getOname() {
		return Oname;
	}
	
	public String getPrice() {
		return Price;
	}
	
	public String getFilepath() {
		return Filepath;
	}
	
	
	

	
	

}