import java.util.*;
enum Fruits{
	
	Apple('a'),Banana('b'),Citrus('c'),DragonFruit('d'),Fig('e'),Guava('f');
	 char a;
	Fruits(char a){
		this.a=a;	
		System.out.println("cons");
	}
	public char get(){
		return a;
	}
}
class EnumEx{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=s.charAt(0);
		ch=Character.toLowerCase(ch);
		for(Fruits f:Fruits.values()){
			if(f.get()==ch)
				System.out.println(f);
		}
		
}
}
