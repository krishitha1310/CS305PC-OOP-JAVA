//METHOD OVERLOADING
class Lab3p2{
	public int x(int x){
		return x;
	}
	public int x(int x,int y){
		return x+y;
	}
	public static void main(String...args){
		Lab3p2 l=new Lab3p2();
		int m=l.x(5);
		int n=l.x(10,5);
		System.out.println(m);
		System.out.println(n);
	}
}
