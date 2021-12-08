package Task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PhoneDictionary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HashMap<String, ArrayList<Users>> hm = new HashMap<>();
		Set entrySet = hm.entrySet();
		ArrayList<Users> Us = new ArrayList<>();
		Users U1 = new Users("Nirmala", 234578);
		Users U2 = new Users("Supriya", 9876123);
		Users U3 = new Users("Sheetal", 5678233);
		Users U4 = new Users("Vishal", 345987);
		Us.add(U1);
		Us.add(U2);
		Us.add(U3);
		Us.add(U4);
		hm.put("Phone Dictionary", Us);

		Set<String> Dict = hm.keySet();
		for (String st : Dict) {
			System.out.println("Display All Entries of >>" + st);
			ArrayList<Users> Ulist = hm.get(st);
			for (Users user : Ulist) {
				System.out.println(user);
			}
		}
		System.out.println("Would you like to add a User?  Type YES or NO: ");
		String a = in.next();
		if (a.equalsIgnoreCase("yes")) {
			String b = in.nextLine();
			System.out.println("Enter a new name: ");
			String name = in.next();
			System.out.println("Enter a new phoneNo: ");
			int phoneNo = in.nextInt();
			ArrayList<Users> grade = new ArrayList<>();
			Users A = new Users(name, phoneNo);
			hm.put(name, grade);
			System.out.println("Usert added Sucsessfully");
		} else if (a.equalsIgnoreCase("no")) {
		}

		System.out.println("if would you like to remove User? Type YES or NO: ");
		String z = in.next();
		if (z.equalsIgnoreCase("yes")) {
			//String c = in.nextLine();
			System.out.println("Remove user name");
			String name = in.next();
			hm.remove(name);
			System.out.println("User removed");
		} else if (z.equalsIgnoreCase("no")) {

		}
		Iterator it1 = entrySet.iterator();
		System.out.println("Updated Phone Dictionary: ");
		while (it1.hasNext()) {
			Map.Entry me = (Map.Entry) it1.next();
			System.out.print("name: " + me.getKey() + "," + " phoneNo: " + me.getValue());
		    
		}
		System.out.println();
	}
}
