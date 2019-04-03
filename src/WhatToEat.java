import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, Im glad you picked Franklin Co. for your party essentials, what kind of event are you throwing? casual? formal? or semi-formal?");
		
		String eventType = input.nextLine();
		
		
		switch (eventType) {
		case "casual":
			System.out.println("For a casual event you should make sandwiches for your guest.");
			break;
			
		case "semi-formal":
			System.out.println("For a semi-formal event you should go with fried chicken.");
			break;
			
		case "formal":
			System.out.println("If your throwing a formal event you should go with Chicken Parmesean.");
			break;
			
		default:
			System.out.println("Does not recognize text, enter either casual, formal or semi-formal(hyphen included)");
			
		
		}
		
		System.out.println("Ok now lets move on to the size of your event, How many people are coming?");
		
		int partySize = input.nextInt();
		
		if(partySize < 2) {
			System.out.println("If your gathering consist of no more than one person, you can get away with using a microwave.");
		}
		else if(partySize < 12) {
			System.out.println("If the size of your party will be less than 12 people, You can probably get away with cooking in your own home kitchen just be prepared for a mess.");		
		}
		else if(partySize > 12) {
			System.out.println("If your event will be more than 12, you're better off hiring a caterer.");
		}
		else {
			System.out.println("Your response was unrecognizable, Try Again.");
			
		}
		
		String result = (eventType + " and " + partySize);
		
		System.out.println("You choose " + result + " I hope the information for such a party was useful. Good Luck and Have Fun!");
	}
	
}
