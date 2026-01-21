class ProfitLossAndPercentage{
    public static void main(String[] args){
	   int cost_p = 129;
	   int selling_p = 191;
	   double profit = selling_p - cost_p;
	   double profit_perc = profit/cost_p*100;
	   System.out.println("The Cost Price is INR "+cost_p+ " and Selling Price is INR "+selling_p + "\nThe Profit is INR "+profit+ " and the Profit Percentage is "+profit_perc);
	}
}