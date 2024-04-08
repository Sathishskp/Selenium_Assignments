package wk3.day2;

public interface DatabaseConnection {
	
	public abstract void connect();
	
	public abstract void disconnect();
	
	public abstract void executeUpdate();
	

}
