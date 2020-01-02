import java.util.*;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int toppNum=0;
	public static int pizzaNum=0;
	public static int cusSize;
	public static int cusTop;
	
	//pizza data
	public static String[] toppings = {"sausage", "pepperoni", "canadian bacon", "hamburger", "pineapples", "veggies", "anchovies", "chicken", "no topping"};
	public static String[] sizes = {"small", "medium", "large"};
	
	//customers final order
	public static ArrayList<String> cusOrder = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the best pizza delivery system!!!");
		pizza();
		
		System.out.println("Thank you for your order!!!");
		System.out.println("your order is "+cusOrder);
		/*for(String strArr:cusOrder) {
			System.out.println(strArr);
		}*/
	}

	//pizza creation
	public static void pizza(){
		System.out.println("How many pizzas would you like?");
		pizzaNum=sc.nextInt();
		//size selection
		for(int i =0; i<pizzaNum; i++) {
			System.out.println("what size pizza would you like");
			System.out.println("1: "+sizes[0]+", 2: "+sizes[1]+", 3: "+sizes[2]);
			cusSize=sc.nextInt();
			//Separating different sizes and adding toppings
			if(cusSize==1) {
				cusOrder.add(sizes[0]);
				toppings();
			}
			
			else if(cusSize==2) {
				cusOrder.add(sizes[1]);
				toppings();
			}
			
			else if(cusSize==3) {
				cusOrder.add(sizes[2]);
				toppings();
			}
			
			else {
				System.out.println("please enter a valid size");

			}
		}
	}
	// topping selection 
	public static void toppings() {
		System.out.println("How many Toppings would you like?");
		toppNum = sc.nextInt();
		//separating different toppings
		for(int i = 0; i<toppNum; i++) {		
			if(toppNum==1) {
				System.out.println("Pick your topping");
				System.out.println("1: "+toppings[0]+ ", 2: "+toppings[1]+", 3: "+toppings[2]+", 4: "+toppings[3]+", 5: "+toppings[4]+", 6: "+toppings[5]+", 7: "+toppings[6]+", 8 : "+toppings[7]+", 9:"+toppings[8]);
				cusTop=sc.nextInt();
				
				if(cusTop==1) {
					cusOrder.add(toppings[0]);
				}
				
				else if(cusTop==2) {
					cusOrder.add(toppings[1]);
				}
				
				else if(cusTop==3) {
					cusOrder.add(toppings[2]);		
				}
				
				else if(cusTop==4) {
					cusOrder.add(toppings[3]);
				}
				
				else if(cusTop==5) {
					cusOrder.add(toppings[4]);
				}
				
				else if(cusTop==6) {
					cusOrder.add(toppings[5]);
				}
				
				else if(cusTop==7) {
					cusOrder.add(toppings[6]);
				}
				
				else if(cusTop==8) {
					cusOrder.add(toppings[7]);
				}
				
				else if(cusTop==9) {
					cusOrder.add(toppings[8]);
				}
				else {
					System.out.println("please enter a valid number");
				}
			}
			//separating multiple toppings
			else if(toppNum>1 && i<toppNum) {
				System.out.println("pick your toppings");
				System.out.println("1: "+toppings[0]+ ", 2: "+toppings[1]+", 3: "+toppings[2]+", 4: "+toppings[3]+", 5: "+toppings[4]+", 6: "+toppings[5]+", 7: "+toppings[6]+", 8 : "+toppings[7]+", 9:"+toppings[8]);
				cusTop=sc.nextInt();
				if(cusTop==1) {
					cusOrder.add(toppings[0]);
				}
				else if(cusTop==2) {
					cusOrder.add(toppings[1]);
				}
				else if(cusTop==3) {
					cusOrder.add(toppings[2]);		
				}
				else if(cusTop==4) {
					cusOrder.add(toppings[3]);
				}
				else if(cusTop==5) {
					cusOrder.add(toppings[4]);
				}
				else if(cusTop==6) {
					cusOrder.add(toppings[5]);
				}
				else if(cusTop==7) {
					cusOrder.add(toppings[6]);
				}
				else if(cusTop==8) {
					cusOrder.add(toppings[7]);
				}
				else if(cusTop==9) {
					cusOrder.add(toppings[8]);
				}
				else {
					System.out.println("please enter a valid number");
				}
			}
			
			else {
				System.out.println("Thank You!");
			}
		}
	}
}
