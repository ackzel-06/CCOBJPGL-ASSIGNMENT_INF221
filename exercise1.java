public class App {

	static boolean iWillNotCheat = true;
    static boolean iWillWin = true;
	public static void main(String[] args) throws Exception{

		//precondition
        assert iWillNotCheat == true: "just being honest" ;

		enterCompetition();
    
        //postcondition
        assert iWillWin == true: "I am being proud for myself!";

        System.out.println(iWillWin);
	}
	
	static void enterCompetition() {

        iWillWin = false;

	}

}
