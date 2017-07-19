
public class car extends vehicle {

	private String carType;
	private String Model ;
	private int ManYear ;
	private String CarColor ;
	private String Transmission ;
	private int Maxspeed ;

	public car(){

	}
	public car (String carType,String Model, int ManYear, String CarColor, String Transmission,int Maxspeed ){
		this.carType = carType;
		this.Model = Model;
		this.ManYear = ManYear;
		this.CarColor = CarColor;
		this.Transmission = Transmission;
		this.Maxspeed = Maxspeed;
	}
	
	
	
	public String model(){
		return "The " + carType + "   is amazing" ;
	}
	@Override
	public String  accelerate(){
		return "The " + carType +"  " + Model + " has never override accelerating";
	}
	public String moving(){
		return "The " + carType +"  " + Model + "traveling in " + Maxspeed;
	}
	public String  stop(){
		return "The car has override";
	}
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getManYear() {
		return ManYear;
	}

	public void setManYear(int manYear) {
		ManYear = manYear;
	}

	public String getCarColor() {
		return CarColor;
	}

	public void setCarColor(String carColor) {
		CarColor = carColor;
	}

	public String getTransmission() {
		return Transmission;
	}

	public void setTransmission(String transmission) {
		Transmission = transmission;
	}

	public int getMaxspeed() {
		return Maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
	

}
