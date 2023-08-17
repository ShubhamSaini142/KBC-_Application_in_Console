package Project02;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	static String uname;

//	username input
	void getName() {
		System.out.println("Enter User name");
		uname = sc.nextLine();
	}

//	welcome message
	void wlcmMsg() {
		System.out.println("Welcome " + uname + " to the Crorepati Game!");
	}

}
