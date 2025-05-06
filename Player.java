public class Player{

	public static int totalPlayers=0;
	public String playerName;

	public static void main(String [] args){

		Player player1 = new Player();
		player1.playerName="Alice";
		Player.totalPlayers++;
		
		Player player2 = new Player();
		player2.playerName="Ramesh";
		Player.totalPlayers++;

		System.out.println("Total Player: " + Player.totalPlayers);
}
}


	