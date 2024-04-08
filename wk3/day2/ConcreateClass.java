package wk3.day2;

public class ConcreateClass implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute and Update");
	}

	public static void main(String[] args) {
		
		ConcreateClass objCC = new ConcreateClass();
		objCC.connect();
		objCC.disconnect();
		objCC.executeUpdate();
	}
}
