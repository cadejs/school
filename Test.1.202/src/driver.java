
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] data = {{1.2, 1.3, 4.5, 6.0}, 
				{1.7,3.3,4.4,10.5},
				{1.1,4.5,2.1,25.3},
				{1.0,9.5,8.3,2.9}};

ImageManip image = new ImageManip(data);

System.out.println("The orginal image array is " + 
	image.originalImage() );
image.findFigure(1.4);
System.out.println("The image array with a threshold of 1.4 is" +
	image.newImage());
image.findFigure(0.6);		
System.out.println("The image array with a threshold of 0.6 is" + 
image.newImage());



}
}

