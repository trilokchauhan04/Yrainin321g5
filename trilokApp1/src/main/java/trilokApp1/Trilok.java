package trilokApp1;

 class trilok2 {
	
	private int userId;
	private String userName;
	private float userSalary;


public  trilok2(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) {
		this.userSalary = userSalary;
	}
 }
 
public class Trilok {

		public static void main(String[] args)
		{  
			
			trilok2 user=new trilok2(10,"rere",10);
			System.out.println("user info");
			System.out.println("\tId"+user.getUserId());
			System.out.println("\tname"+user.getUserName());
			System.out.println("\tSalary"+user.getUserSalary());
			
			
			
		
}
 }	















