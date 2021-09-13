//Create your user-defined exception class 

package Assignment2.Program6;

public class User_Defined_Exception extends Exception {
	String msg;
	User_Defined_Exception(String str){
		msg = str;
	}
	
	public String sendMsg(String msg) {
		return ("Send Message is "+msg);
	}
	
	public String receiveMsg(String msg) {
		return ("Receive Message is "+msg);
	}
}
