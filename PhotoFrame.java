class PhotoFrame{
	String shape="Round";
	int price=500;
	int noOfImages=5;
	
	PhotoFrame()
	{
		System.out.println("Shape of the frame "+this.shape);
		System.out.println("Price of the frame "+this.price);
		System.out.println("Number of images in the frame "+this.noOfImages);
	}
	PhotoFrame(String shape,int price,int noOfImages)
	{
		this.shape=shape;
		this.price=price;
		this.noOfImages=noOfImages;
		System.out.println("Shape of the frame "+this.shape);
		System.out.println("Price of the frame "+this.price);
		System.out.println("Number of images in the frame "+this.noOfImages);
	}
}