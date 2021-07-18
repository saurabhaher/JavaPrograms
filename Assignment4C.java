package com.assign4;

abstract class PrepaidCard
{
	int CardNo=0;
	double availableBalance=0;
	double swipeLimit=0;
	public abstract boolean swipeCard(double amount);
	
    @Override
    public String toString() {
        return String.format(CardNo+"\t"+availableBalance+"\t"+swipeLimit);
    }
    
    public void rechargeCard(double Amount)
    {
    	availableBalance =availableBalance+ Amount;
    }
    
}

interface Rewardable
{
	public int reward(double Amount);
	
}

class TravelCard extends PrepaidCard implements Rewardable
{
	int rewardPoints;
	
	public TravelCard(int rewardPoints, int CardNo, double swipeLimit, double availableBalance) {
		this.rewardPoints = rewardPoints;
		this.CardNo = CardNo;
		this.swipeLimit =swipeLimit;
		this.availableBalance =availableBalance;	
	}
	
	public TravelCard() {
		this.rewardPoints = 0;
		this.CardNo = 0;
		this.swipeLimit =0;
		this.availableBalance =0;	
	}

	public boolean swipeCard(double amount) {
		if ( (amount >swipeLimit) || (amount*1.05>availableBalance))
		{
			System.out.println("sorry cannot withdraw --available bal "+availableBalance + "\t"+ "swipelimit "+swipeLimit );
			return false;
		}
				
		else 
		{
			
			availableBalance =availableBalance - amount*1.05;
			rewardPoints = rewardPoints+ reward(amount);
			System.out.println("withdraw successful --available bal "+availableBalance + "\t"+ "swipelimit "+swipeLimit );
			return true;
		}
	}

	@Override
	public int reward(double Amount) 
	{
		
		int r =((int)(Amount/100)*5);
	
		return r;
		
	}
	
}



public class Assignment4C {

	public static void main(String[] args) 
	{
			TravelCard t1 = new TravelCard(0, 1, 200, 1000);
			t1.swipeCard(40);
			t1.swipeCard(200);
			t1.swipeCard(200);
			t1.swipeCard(200);
			t1.swipeCard(200);
			t1.swipeCard(200);
			System.out.println(t1.rewardPoints); 
			System.out.println("hrgr");
		
	}

}
