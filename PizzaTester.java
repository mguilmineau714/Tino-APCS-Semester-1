
public class PizzaTester{
public static void main(String[] args){
PizzaParlor diner = new PizzaParlor();
diner.orderCheese();
diner.orderCheese();
diner.orderPepperoni();
diner.orderCheese();
diner.orderPepperoni();
diner.orderVeggie();
diner.orderCheese();
diner.orderVeggie();
diner.orderPepperoni();
diner.orderCheese();
System.out.println("# of Cheese ordered is "
+ diner.getNumCheesePizzas());
System.out.println("# of Pepperoni ordered is "
+ diner.getNumPepperoniPizzas());
System.out.println("# of Veggie ordered is "
+ diner.getNumVeggiePizzas());

System.out.print("\nRemaining supply of cheese in ounces is: ");
System.out.println(diner.getCheeseSupply());
System.out.print("Remaining supply of pepperoni in ounces is: ");
System.out.println(diner.getPepperoniSupply());
System.out.print("Remaining supply of veggies in ounces is: ");
System.out.println(diner.getVeggieSupply());

System.out.println("\nRevenue is $" + diner.getRevenueTotal());
System.out.println("Bank balance is now $"

+ diner.getBankAccountBalance());

}
}