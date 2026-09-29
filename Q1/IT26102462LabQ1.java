public class IT26102462LabQ1{
     public static void main(String[] args){
	 int perimeter=100;
	 double length;
	 double width;
	 double width_ratio=0.75;
	 length=perimeter/(2*(1+width_ratio));
	 width = width_ratio*length;
	 
	 System.out.print("length of the fense"+ length);
	 System.out.print("width of the fense"+ width);
	 
}	 


}