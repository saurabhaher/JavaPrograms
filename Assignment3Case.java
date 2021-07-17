
class Order {
	private int OrderID;
	private String CustomerName;
	private float orderAmount;
	private String paymentOption;
	
	Order()
	{
		this.OrderID= 0;
		this.CustomerName = null;
		this.orderAmount = 0;
		this.paymentOption = null;
		
	}
	Order(int OrderID, String CustomerName, float orderAmount , String paymentoption)
	{
	
		if ((orderAmount>=100) && ((paymentoption =="CoD") || (paymentoption =="Gift Card") || (paymentoption =="Internet Banking")))
		{
			this.orderAmount = orderAmount;
			this.OrderID= OrderID;
			this.CustomerName = CustomerName;
			this.paymentOption = paymentoption;
		}
		else
		{
			//System.out.println("order amount should be greater than 100");
			//System.out.println("put right payment option");
		}
		
	
}
	int getOrderID()
	{ return OrderID;
	}
	float getorderAmount()
	{
		return orderAmount;
	}
}


class OrderServiceUtil
{
	Order arr1[] =new Order[100];
	int c=0;
	public void addOrder(Order o1)
	{
		arr1[c]= o1;
		c=c+1;
		
	}
	public Order searchOrder(int orderid)
	{
		for (int i=0;i<c;i++)
		{
			if (arr1[i].getOrderID()==orderid)
				return arr1[i];
			
		}
		
		Order oo= new  Order()	;
		return oo;
	}
	public float findTotal()
	{
		float sum=0;
		for (int i=0;i<c;i++)
		{
			sum =sum + arr1[i].getorderAmount();
		}
		return sum;
	}
}

public class Assignment3Case {

	public static void main(String[] args) {
	
	Order o1 = new Order(11,"suresh",200,"Gift Card");
	Order o2 = new Order(12,"syresh",500,"Internet Banking");
	OrderServiceUtil u1 = new OrderServiceUtil();
	u1.addOrder(o1);
	u1.addOrder(o2);
	System.out.println(u1.findTotal());
	
	
	}

}
