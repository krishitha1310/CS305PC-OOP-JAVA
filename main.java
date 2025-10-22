import java.math.*;
class MathUtils{
	public static class Geometry{
		public static double calculateCircleArea(double radius){
			return (double)Math.PI*radius*radius;
		}
	}
	public static void main(String...args){
		double area=MathUtils.Geometry.calculateCircleArea(10);
		System.out.print(area);
        }
}
