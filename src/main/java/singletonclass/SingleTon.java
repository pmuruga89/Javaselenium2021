package singletonclass;

class ConnectionPooling {
	
	private static ConnectionPooling connection=null;
	public String s; 
	
	
	
    // Constructor 
    // Here we will be creating private constructor 
    // restricted to this class itself 
    private ConnectionPooling() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
	
    
    // Static method 
    // Static method to create instance of Singleton class 
    public static ConnectionPooling getInstance() 
    { 
        if (connection == null) 
        	connection = new ConnectionPooling(); 
  
        return connection; 
    } 
}

public class SingleTon {

	public static void main(String[] args) {
		
		
		ConnectionPooling connect1 = ConnectionPooling.getInstance();
		ConnectionPooling connect2 = ConnectionPooling.getInstance();
		
		//both will be having the same hashcode. becase only one instance will be creating.
		System.out.println(connect1.hashCode());
		System.out.println(connect2.hashCode());
		
		

	}

}
