package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// polymorphism �ok bi�imlilik demektir.

//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesaj�");
//		}
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
