
public class Info{
  
	int day ;
    int month;
    int year;
    int hour;
    int minute;
    int[] time;
    double Longitude;
    double Latitude;
    
    public Info(String time, double Latitude,double longitude ){
    	String[] temp;
    	String date;
    	String timer;
    //	System.out.println("hi " + time);
    	temp = time.split(" ");
    
    	date = temp[0];
    //	System.out.println("hi " + date);
    	timer = temp[1];
    	temp = date.split("/");
    	if(Integer.parseInt(temp[0]) >0 && Integer.parseInt(temp[0])<=12){
    	this.day = Integer.parseInt(temp[0]);
    	}
    	else{ this.day = 00;}
    	if(Integer.parseInt(temp[1])> 0 && Integer.parseInt(temp[1])<=30){
    		this.month =Integer.parseInt(temp[1]);
    	}else{ this.month = 00;}
    	this.year = Integer.parseInt(temp[2]);
    	
    	temp = timer.split(":");
    	if(Integer.parseInt(temp[0]) >= 0 && Integer.parseInt(temp[0])<=23){
        	this.day = Integer.parseInt(temp[0]);
        	}
        	else{ this.day = 00;}
     	if(Integer.parseInt(temp[1])>= 0 && Integer.parseInt(temp[1])<=59){
    		this.month =Integer.parseInt(temp[1]);
    	}else{ this.month = 00;}
    	

        this.Longitude = longitude;
        this.Latitude= Latitude;      
        
        
    }
    
    public boolean checkifnewer(Info old_info){
    	if(this.getMonth() == 00) {
    		return false;
    	}
    	if(this.getDay() == 00){
    		return false;
    	}
    	if(this.getYear() >= old_info.getYear()){
    		if(this.getMonth() >= old_info.getMonth()){
    			if(this.getMinute() >= old_info.getMinute()){return true;}
    		}
    	}
    	return false;
    	
    }
    
    public double getDay() {
  		return day;
  	}

  	public void setDay(int day) {
  		this.day = day;
  	}

  	public double getMonth() {
  		return month;
  	}

  	public void setMonth(int month) {
  		this.month = month;
  	}

  	public double getYear() {
  		return year;
  	}

  	public void setYear(int year) {
  		this.year = year;
  	}

  	public double getHour() {
  		return hour;
  	}

  	public void setHour(int hour) {
  		this.hour = hour;
  	}

  	public double getMinute() {
  		return minute;
  	}

  	public void setMinute(int minute) {
  		this.minute = minute;
  	}

  	public double getLongitude() {
  		return Longitude;
  	}

  	public void setLongitude(int longitude) {
  		Longitude = longitude;
  	}

  	public double getLatitude() {
  		return Latitude;
  	}

  	public void setLatitude(int latitude) {
  		Latitude = latitude;
  	}
}



  	
    