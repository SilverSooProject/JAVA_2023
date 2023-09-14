class Sports{
	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sports{
	String getName() {
		return "축구";
	}
	int getPlayers() {
		return 11;
	}
}

public class SoccerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soccer obj = new Soccer();
		
		System.out.println("경기 이름: "+obj.getName());
		System.out.println("경기자 수: "+obj.getPlayers());

	}

}