import java.util.Scanner;

public class login {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the username");
        String un = scanner.next();
        l.setUn(un);
        System.out.println("Enter the password");
        pwd = scanner.next();
        l.setPwd(pwd);
        
        flag = ldao.loginCust(un, pwd);
        if(flag)
        {
            System.out.println("Successfully Login");
        }
        else
        {
            System.out.println("Incorrect password or username");
        }
	}

}
