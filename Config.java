public class Config{

	public static String configName="System Config";
	public String settingValue;

	public static void main (String [] args){

		Config config1 = new Config();
		config1.settingValue = "Dark Mode";

		Config config2 = new Config();
		config2.settingValue = "Light Mode";

		System.out.println("Config Name: " + Config.configName);
		System.out.println("Setting 1: " + config1.settingValue);
		System.out.println("Setting 2: " + config2.settingValue);
}
}