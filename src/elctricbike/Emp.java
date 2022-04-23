package elctricbike;

import java.util.Scanner;

public class Emp {

			public static void main(String[] args) {
				
				Scanner s = new Scanner(System.in);
				
				System.out.println(" enter your name :");
				String name = s.next();
				System.out.println("username is :"+name);
				
				System.out.println(" enter your id");
				int id = s.nextInt();
				System.out.println("userid is :"+id);
				
				System.out.println(" enter your  number :");
				long num = s.nextLong();
				System.out.println("usernumber is :"+num);
				
				System.out.println(" enter email-id :");
				String eid = s.next();
				System.out.println("userid is :"+eid);
				
				System.out.println(" enter your salary :");
				Double sal = s.nextDouble();
				System.out.println("usersalary is :"+sal);
				
			
			}
}

