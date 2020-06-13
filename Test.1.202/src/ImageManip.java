
public class ImageManip {


	private double[][] image;
	private double[][] newimage;
	

	
	
	 


	public  ImageManip(double[][] data) {
		image(data);
	}


	private double findaverage(double[][] array) {
		double total = 0;
		double areacounter =0;
		for (int i=0; i<array.length; i++) {
			for (int j= 0; j<array[i].length; j++) {
				total = array[i][j]+total;
				areacounter++;
			}
		}
		
		return (total/areacounter);
	}
	 
	 
	private void image(double[][] input){
		this.image = input;
		
				
		this.newimage = new double[this.image.length][this.image[0].length];
		
	}

	 void findFigure(double threshold) {
		double cutoff = threshold * findaverage(this.image);
		
		for (int i=0; i<this.image.length; i++) {
			for (int j= 0; j<this.image[i].length; j++) {
				if (this.image[i][j]>cutoff) {
					newimage[i][j]= 1.0;
					
				}else {
					this.newimage[i][j]= 0.0;
				}
			
			}
		}
		
	}
	
	String originalImage() {
		String imagestring = "";
		for (int i=0; i<this.image.length; i++) {
			
			imagestring += "\n";
			for (int j= 0; j<this.image[i].length; j++) {
				
				imagestring = imagestring + this.image[i][j] + "\t";
				
			}
		}
	
		return imagestring;
		 
	}
	
	String newImage() {
		String newimagestring = "";
		for (int i=0; i<this.newimage.length; i++) {
			newimagestring += "\n";
			//System.out.println("");
			for (int j= 0; j<this.newimage[i].length; j++) {
				newimagestring = newimagestring + this.newimage[i][j] + "\t";
				//System.out.print(this.newimage[i][j] + "\t");
				
			}
		}
		//System.out.println("...");
		return newimagestring;
	}
}
