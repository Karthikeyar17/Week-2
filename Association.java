package Week_2;
class CSP{
	private String CSname;
	private int totalCab;
	public double rewardPrice;
	
	CSP(String CSname,int totalCab){
		this.CSname=CSname;
		this.totalCab=totalCab;
		
	}

	public String getCSname() {
		return CSname;
	}

	public void setCSname(String cSname) {
		CSname = cSname;
	}

	public int getTotalCab() {
		return totalCab;
	}

	public void setTotalCab(int totalCab) {
		this.totalCab = totalCab;
	}

	public double getRewardPrice() {
		return rewardPrice;
	}

	public void setRewardPrice(double rewardPrice) {
		this.rewardPrice = rewardPrice;
	}
	double CRP(Driver driver) {
		if(CSname=="Halo") {
			if(driver.getAvgRating()>=4.5 && driver.getAvgRating()<=5) {
				rewardPrice=10*driver.getAvgRating();
			}
			else if(driver.getAvgRating()>=4 &&driver.getAvgRating()<=4.5) {
				rewardPrice=5*driver.getAvgRating();
			}
			else {
				return rewardPrice=0;
			}
			}
			else if(CSname=="Aber") {
				if(driver.getAvgRating()>=4.5 && driver.getAvgRating()<=5) {
					rewardPrice=8*driver.getAvgRating();
				}
				else if(driver.getAvgRating()>=4 &&driver.getAvgRating()<=4.5) {
					rewardPrice=3*driver.getAvgRating();
				}
				else {
					return rewardPrice=0; 
			}
		}
		return rewardPrice;
			
	}
}

class Driver {
	
	private String driverName;
	private float avgRating;
	
	public Driver(String driverName, float avgRating){
		this.driverName=driverName;
		this.avgRating=avgRating;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	
	
}

class Association {
	
	public static void main(String args[]){
	    CSP CSP1 = new CSP("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = CSP1.CRP(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		
	}
}
