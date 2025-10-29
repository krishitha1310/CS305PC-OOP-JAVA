class AnnoP{
	@Deprecated
	public void DepM(){
		System.out.println("Depricated method");
	}
	public void ovR(){
		System.out.println("parent class");
	}
}
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("child class");
	}
	
}
class AnnoDemo{
	 @SuppressWarnings("deprecation")
	 public static void main(String...args){
	       
		AnnoC ac=new AnnoC();
		ac.ovR();
		ac.DepM();
		
	}
}
