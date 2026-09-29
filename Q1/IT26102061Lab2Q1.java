public class IT26102061Lab2Q1{
	public static void main(String[] args){
		float perimeter,length,width;
		
		perimeter=100;
		//width=(3/4)*length
		//perimeter=2*(length+width)
		//perimeter=2*(length+(3/4)*length)
		//perrimeter=(7/2)*length
		
		length=(2*perimeter)/7;
		width=(3*length)/4;
		System.out.println("Length of the fence:"+length);
		System.out.println("Width of the fence:"+width);
	}
}
