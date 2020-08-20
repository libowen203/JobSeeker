package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "your_instance";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "your_dbname";
	private static final String USERNAME = "your_username";
	private static final String PASSWORD = "your_password";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
