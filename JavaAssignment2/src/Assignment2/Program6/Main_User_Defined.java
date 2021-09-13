//Create your user-defined exception class 

package Assignment2.Program6;

public class Main_User_Defined {
public static void main(String[] args) {
	try {
		throw new User_Defined_Exception("This is User Defined Exception");
	}
	catch(User_Defined_Exception e) {
		System.out.println(e.sendMsg("Hii"));
		System.out.println(e.receiveMsg("Hii"));
	}
}
}
