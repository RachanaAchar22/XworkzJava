class PhotoMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking PhotoFrame in PhotoMain");
		PhotoFrame photoframe=new PhotoFrame();
		
		System.out.println("-------------------------------");
		PhotoFrame photoframe1=new PhotoFrame("square",300,2);
		System.out.println(photoframe1.shape);
		System.out.println(photoframe1.price);
		System.out.println(photoframe1.noOfImages);
		
	}
}