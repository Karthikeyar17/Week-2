package Week_2;

class Static_1{
   private static int counter=9001;
   private String billId="B";
   private String paymentMode;
   
   public Static_1(String paymentMode) {
	   this.paymentMode=paymentMode;
	   
   }
   public String getBillId() {
	   return billId+getCounter();
   }
   public void setBillId(String billId) {
	   this.billId=billId;
   }public String getPaymentMode() {
	   return paymentMode ;
	   
   }
   public void setPaymentMode(String paymentMode) {
	   this.paymentMode=paymentMode;
   }
   public int getCounter()
   {
	   return counter++;
   }
}

class Tester {
    public static void main(String[] args) {

        Static_1 bill1 = new Static_1("DebitCard");
        Static_1 bill2 = new Static_1("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Static_1[] bills = { bill1, bill2 };
              
        for (Static_1 bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}

