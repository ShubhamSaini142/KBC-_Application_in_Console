package Project02;

import java.util.Random;
import java.util.Scanner;

public class game2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		User user = new User();
		user.getName();
		user.wlcmMsg();

		Question ob = new Question();
		ob.optionBank();
		ob.quesAnsBank();

		int life = 2, fifty = 1, poll = 1, money = 0, p = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println("\nQuestion " + (i + 1) + ": " + ob.ques[i] + "\nOptions are: ");
			for (int j = 0; j < 4; j++) {
				System.out.println((j + 1) + ". " + ob.option[i][j]);
			}
			System.out.println("\nEnter your choice or 5 for lifeline");
			int opt = sc.nextInt();

//			Selected lifeline
			if (opt == 5) {
				if (life > 0) {

					if (fifty == 1 && poll == 1)
						System.out.println("\n1. Fifty-fifty \n2. Audience Poll. \nselect the lifeline");

					else if (fifty == 0 && poll == 1)
						System.out.println("\nYou have used fifty-fifty. Select option 2 : Audience poll");

					else if (fifty == 1 && poll == 0)
						System.out.println("\nYou have used Audience poll. Select option 1 : fifty-fifty");

					opt = sc.nextInt();
					if (opt == 1) {
						if (fifty == 1) {
							life = life - 1;
							fifty = fifty - 1;
							int tmpAns = ob.ans[i] - 1;
							int selectedNumber = 0;
							Random random = new Random();
							while (selectedNumber == -1 || selectedNumber == tmpAns) {
								selectedNumber = random.nextInt(5);
							}

							System.out.println("Options are:");
							if (tmpAns < selectedNumber) {
								System.out.println((tmpAns + 1) + ". " + ob.option[i][tmpAns] + "\n"
										+ (selectedNumber + 1) + ". " + ob.option[i][selectedNumber]);
							}

							else {
								System.out.println((selectedNumber + 1) + ". " + ob.option[i][selectedNumber] + "\n"
										+ (tmpAns + 1) + ". " + ob.option[i][tmpAns]);
							}

							int selectedAns = sc.nextInt();
							if (selectedAns == ob.ans[i]) {
								money += 1000;
								System.out.println("Correct ans. Your money is: " + money);
							} else {
								p = -1;
								System.out.println(
										"Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
							}
						} else {
							System.out.println("Sorry you don't have fifty-fifty lifeline. Select another option.");
							opt = sc.nextInt();
							if (opt == ob.ans[i]) {
								money += 1000;
								System.out.println("Correct. Your money is : " + money);
							} else {
								p = -1;
								System.out.println(
										"Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
							}
						}
					}

					else if (opt == 2) {
						if (poll == 1) {
							life -= 1;
							poll -= 1;
							int percent[] = new int[4];
							percent[ob.ans[i] - 1] = 70;
							int addno = 5;
							for (int k = 0; k < 4; k++) {
								if (k == (ob.ans[i] - 1))
									continue;
								percent[k] = addno;
								addno += 5;
							}
							System.out.println("Audience poll :");
							for (int k = 0; k < 4; k++)
								System.out.println((k + 1) + "." + ob.option[i][k] + " " + percent[k] + "%");
							System.out.println("Enter your choice");
							int selectedans = sc.nextInt();
							if (selectedans == ob.ans[i]) {
								money += 1000;
								System.out.println("Correct ans. Your money is: " + money);
							} else {
								p = -1;
								System.out.println(
										"Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
							}
						} else {
							System.out.println("Sorry you don't have Audience poll lifeline. Select another option.");
							opt = sc.nextInt();
							if (opt == ob.ans[i]) {
								money += 1000;
								System.out.println("Correct. Your money is : " + money);
							} else {
								p = -1;
								System.out.println(
										"Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
							}
						}
					}
				} else {
					System.out.println("You don't have lifeline left. Select your answer.");
					System.out.println("Select the correct option.");
					opt = sc.nextInt();
					if (opt >= 5) {
						System.out.println("Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
						p = -1;
					} else {
						if (opt == ob.ans[i]) {
							money += 1000;
							System.out.println("Correct. Your money is Rs. " + money);
						} else {
							System.out
									.println("Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
							p = -1;
						}
					}
				}
			}
//			this else is for when the user selects any one of the four option and not the lifeline
			else {
				if (opt == ob.ans[i]) {
					money += 1000;
					System.out.println("Correct. Your money is : Rs. " + money);
				} else {
					System.out.println("Sorry you chose the wrong option. You won Rs. " + money + "\nGAME OVER");
					p = -1;
				}
			}

			if (p == -1)
				break;
			if (i == 9)
				System.out.println("*****MUBARAK HO!! AAP JEETE HAI 7 crores*****");
		}
//		for loop closed
	}
}
