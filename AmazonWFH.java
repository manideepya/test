/*Q1. In Amazon work from home,employees  earn at the basic hourly wage of Rs.50. In addition to this, they also receive a commission
 on the sales they generate while tending the counter. The commission given to them is calculated according to the following table:

Total Sales Commmision Rate
Rs. 100 to less than Rs. 1000 1%
Rs. 1000 to less than Rs. 10000 2%
Rs. 10000 to less than Rs. 25000 3%
Rs. 25000 and above 3.5%
Write a program in Java that inputs the number of hours worked and the total sales. Compute the wages of the employees.
*/
class AmazonWFH{
static int basichourly=50;
public static void disply(int hour,double totalsale){
double totalhourssal=0;
double commission=0;
if(totalsale>=100 && totalsale<1000){
commission = hour*basichourly*0.01;
}
else if(totalsale>=1000 && totalsale<10000){
commission = hour*basichourly*0.02;
}
else if(totalsale>=10000 && totalsale<25000){
commission = hour*basichourly*0.03;
}
else if(totalsale>=25000){
commission = hour*basichourly*0.035;
}
else{
commission = hour*basichourly*0.0;
}
totalhourssal = hour*basichourly+commission;
System.out.println(totalhourssal);
}
public static void main(String... args){
disply(12,25000);
}
}












