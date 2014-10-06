
public class Wand{
public static void main(String[] args){
	System.out.println("Choose E for expelliarmus or L for Lumos ");
	java.util.Scanner terminalInput = new java.util.Scanner(System.in);
	String spell = terminalInput.nextLine();
	if(spell.equals("E") || spell.equals("e")){
		System.out.println("You've disarmed Voldemort! nice");
}	
 	if(spell.equals("L") || spell.equals("l")){
		System.out.println("You just turned your wand into a flashlight! sucks for you");
}
	else{
	System.out.println("you suck at this");
}
}
	

}
