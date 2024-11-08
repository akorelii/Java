import java.util.Scanner;

public class LoginApp {

	static boolean active = true;
	static int attemptsLeft = 3;
	
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		if(active)
		{
			if(attemptsLeft>0)
			{
				while(active)
				{
					System.out.print("Enter your username: ");
					String userName = scanner.nextLine();
					System.out.print("Enter your password: ");
					String password = scanner.nextLine();
					
					boolean result = login(userName, password);
					if(result) {
						System.out.println("Login successful.");
						break;
					}else{
						if(attemptsLeft==0) {
							active = false;
							System.out.println("Your account has been locked.");
							break;
						}
						
					}
				}
			}
		}
	}
	
	public static boolean login(String userName,String password) 
	{
		//Ahmet --- 123
		if(userName.equals("Ahmet") && password.equals("123"))
		{
			return true;
		}else {
			attemptsLeft--;
			System.out.println("Invalid username or password." + attemptsLeft + " attempts left.");
			return false;
		}
	}
	
	

}
