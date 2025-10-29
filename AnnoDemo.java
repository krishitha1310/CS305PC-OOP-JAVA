class AnnoP{
	@Deprecated
	public void DepM(){
		System.out.println("Depricated method");
	}
	public void ovR(){
		System.out.println("parent class");
	}
}
MyAnno(usage="My And def")
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("child class");
	}
	
}
class AnnoDemo{
	 @SuppressWarnings("deprecation")
	 public static void main(String...args){
	 Class<?> ct=AnnoC.class;
	       
		AnnoC ac=new AnnoC();
		ac.ovR();
		ac.DepM();
		System.out.println(ct.isAnnotationPresent(MyAnno.class));
	System.out.println(ma.usage());
	}
}
