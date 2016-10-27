import java.util.*;
import java.lang.Math;

public class Solution {


	//private static 
	private double MadhuLongitutude;
    private double MadhuLatitude;

	//private List<personInfo> currentInfo;
	private	HashMap<Long, Info> currentInfo;
  //  private Map 

    
    public Solution(double latitude,double Longitutude){
    		this.MadhuLongitutude = Longitutude;
    		this.MadhuLatitude = latitude;
    	//	scanner = new Scanner (System.in);
    		this.currentInfo = new HashMap<Long, Info>();
    }
    
    
  /*  public List<personInfo> getCurrentInfo() {
		return currentInfo;
	}
	public void setCurrentInfo(List<personInfo> currentInfo) {
		this.currentInfo = currentInfo;
	}*/
    private static Double toRadians(Double value) {
        return value * Math.PI / 180;
    }
    
   public static double CalculationByDistance(double initialLat, double initialLong,
		            double finalLat, double finalLong){
		int R = 6371; // km (Earth radius)
		double dLat = toRadians(finalLat-initialLat);
		double dLon = toRadians(finalLong-initialLong);
		initialLat = toRadians(initialLat);
		finalLat = toRadians(finalLat);
		
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(initialLat) * Math.cos(finalLat); 
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
	//	System.out.println( "" +R*c);
		return R * c;
		
		}
		
		 
		    
    /*private boolean checkifinrange(double range, Info temp) {
		// TODO Auto-generated method stub
		//d = 2 × r × arcsin (sqrt (sin2((lat1 - lat2)/2) + cos(lat1) × cos(lat2) × sin2((long1 - long2)/2)))
		double Temp;

		/*double lat1_rad = Math.toRadians(temp.getLatitude());
		double lat2_rad = Math.toRadians(getMadhuLatitude());
		double long1_rad = Math.toRadians(temp.getLongitude());
		double long2_rad = Math.toRadians(getMadhuLongitutude());
		double r= 6378.137 ;
		//Temp = 2  * r * Math.asin(Math.sqrt(Math.sin((lat1_rad - lat2_rad)/2) + Math.cos(lat1_rad) * Math.cos(lat2_rad) * Math.sin((long1_rad - long2_rad)/2)));
		Temp = 2  * r * Math.asin(Math.sqrt(Math.pow(Math.sin((lat1_rad - lat2_rad)/2),2) + Math.cos(lat1_rad) * Math.cos(lat2_rad) * Math.pow(Math.sin((long1_rad - long2_rad)/2),2)));
		*/
		/*final int R = 6371; // Radious of the earth
        Double lat1 = temp.getLatitude();
        Double lon1 = getMadhuLatitude();
        Double lat2 = temp.getLongitude();
        Double lon2 = getMadhuLongitutude();
        Double latDistance = toRad(lat2-lat1);
        Double lonDistance = toRad(lon2-lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
                   Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
                   Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        Double distance = R * c;
		
		
		Location me   = new Location("");
		Location dest = new Location("");

		me.setLatitude(myLat);
		me.setLongitude(myLong);

		dest.setLatitude(destLat);
		dest.setLongitude(destLong);

		float dist = me.distanceTo(dest);
		/*System.out.println("i am sin of long" + Math.sin((long1_rad - long2_rad)));
		System.out.println("i am sin of Lat" + Math.sin((lat1_rad - lat2_rad)/2));
		System.out.println("i am sin of long" + Math.cos(lat1_rad));
		System.out.println("i am sin of long" + Math.cos(lat2_rad));
		System.out.println("i am sin of long" + Math.sin((long1_rad - long2_rad)));
		System.out.println("i am sin of TEMP" + distance);
		
		//if(Temp <=  range){
			return true;
		//}
		
		
		
		//return false;
	}
*/

    
    public double getMadhuLongitutude() {
		return MadhuLongitutude;
	}
	public void setMadhuLongitutude(double madhuLongitutude) {
		MadhuLongitutude = madhuLongitutude;
	}
	public double getMadhuLatitude() {
		return MadhuLatitude;
	}
	public void setMadhuLatitude(double madhuLatitude) {
		MadhuLatitude = madhuLatitude;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner;	
    	scanner = new Scanner (System.in);
    	 String temp_time;
    	 double temp_Longitutude;
    	 double temp_Latitude;
    	 long temp_phoneNumber;
       String[] Info;
      // System.out.println("hi i was created");
    	String s = scanner.nextLine();

   //     System.out.println("getting cut" + s + " lol");
     String[] LongLat =  s.split(",");
    // System.out.println("cuted");
     //System.out.println("" +LongLat[0] + LongLat[1]);
     Solution sol =  new Solution(Double.parseDouble(LongLat[0]),Double.parseDouble(LongLat[1]));
     
     double range = Double.parseDouble(scanner.nextLine());
     int i =0;
    while(scanner.hasNext()){
  //for(int i=0;i<50000;i++){
    	// System.out.println("enter a line");
     s =scanner.nextLine();//.toString();
    // scanner.hasn
    // if(scanner.next().charAt(0) == 'c') break;
     i++;
	// System.out.println("hi i was created" + s);
	 if( i ==1 ){continue;}
	// if(i>= 50000) break;
	// else if (i==1) {}		 
	 //s.getsize() <10 ;
	// else if (s.isEmpty()) {};
  //   System.out.println("line is being processed");
   //  else{ 
    	 Info =  s.split(",");
  // System.out.println("hi");
    temp_time = Info[0];
 //System.out.println("hi i was created" + temp_time);
// System.out.println("second part "+ Info[1]);
    temp_Latitude = Double.parseDouble(Info[1]);
    
  // System.out.println("also here");
    temp_Longitutude = Double.parseDouble(Info[2]);
    temp_phoneNumber = Long.parseLong(Info[3]);
 //  float  temp_phoneNumber = 9020320100; //Integer.parseInt(Info[3]);
   Info temp = new Info(temp_time, temp_Latitude , temp_Longitutude);
   		if(sol.currentInfo.isEmpty()){
   			//System.out.println("info:\n startpoint:\t "+ sol.getMadhuLatitude() + "\t\t long:" + sol.getMadhuLongitutude()+"\n temp:" + temp_Latitude + "\t\t long:"+ temp_Longitutude);
				
   			//sol.checkifinrange(range,temp);
   			if(CalculationByDistance(sol.getMadhuLatitude(),sol.getMadhuLongitutude(),
			            temp_Latitude, temp_Longitutude) <= range){
   			sol.currentInfo.put(temp_phoneNumber, temp);}
   		}
   		else{
   			if(sol.currentInfo.containsKey(temp_phoneNumber)){
   				if(temp.checkifnewer(sol.currentInfo.get(temp_phoneNumber))){
   				//	sol.checkifinrange(range,temp);
   					//System.out.println("info:\n startpoint:\t "+ sol.getMadhuLatitude() + "\t\t long:" + sol.getMadhuLongitutude()+"\n temp:" + temp_Latitude + "\t\t long:"+ temp_Longitutude);
   	   				
   					if( CalculationByDistance(sol.getMadhuLatitude(),sol.getMadhuLongitutude(),
   				            temp_Latitude, temp_Longitutude) <= range){
   					sol.currentInfo.replace(temp_phoneNumber, temp);}
   				}
   			}
   				else{
   				 //	sol.checkifinrange(range,temp);
   					//System.out.println("info:\n startpoint:\t "+ sol.getMadhuLatitude() + "\t\t long:" + sol.getMadhuLongitutude()+"\n temp:" + temp_Latitude + "\t\t long:"+ temp_Longitutude);
   					if( CalculationByDistance(sol.getMadhuLatitude(),sol.getMadhuLongitutude(),
   				            temp_Latitude, temp_Longitutude) <= range){
   					sol.currentInfo.put(temp_phoneNumber, temp);}
   				}
   				}
   				
   			//}
   		}
    
    Map<Long, Info> map = new TreeMap<Long, Info>(sol.currentInfo);
  String output = "";
  int n = 0;
  for ( long key : map.keySet()/*sol.currentInfo.keySet()*/ ) {
	  	n++;
	  	if(n == sol.currentInfo.keySet().size()){
				output+= "" + key ;}
			else{
				output+= key + ",";
				}
		}
  	System.out.println(output);
  
    }
}

    
    
    
    
    

   