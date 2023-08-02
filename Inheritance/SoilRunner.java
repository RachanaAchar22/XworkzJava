package com.xworkz.Inheritance;

public class SoilRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in soilRunner");
		
		Soil soil1=new Soil();
		Soil soil2=new Seed();
		Soil soil3=new Root();
		Soil soil4=new Stem();
		Soil soil5=new PlantName();
		Soil soil6=new TreeName();
		Soil soil7=new FlowerName();
		Soil soil8=new FruitName();
		soil1.soilInfo();
		System.out.println(soil1.soilName);
		
		
		Seed seed1=new Seed();
		Seed seed2=new Root();
		Seed seed3=new Stem();
		Seed seed4=new PlantName();
		Seed seed5=new TreeName();
		Seed seed6=new FlowerName();
		Seed seed7=new FruitName();
		seed1.seedInfo();
		System.out.println(seed1.price);
		
		Root root1=new Root();
		Root root2=new Stem();
		Root root3=new PlantName();
		Root root4=new TreeName();
		Root root5=new FlowerName();
		Root root6=new FruitName();
		root1.rootInfo();
		System.out.println(root1.rootName);
		
		Stem stem1=new Stem();
		Stem stem2=new PlantName();
		Stem stem3=new TreeName();
		Stem stem4=new FlowerName();
		Stem stem5=new FruitName();
		stem1.stemInfo();
		System.out.println(stem1.color);
		
		PlantName plantname1=new PlantName();
		PlantName plantname2=new TreeName();
		PlantName plantname3=new FlowerName();
		PlantName plantname4=new FruitName();
		plantname1.plantNameInfo();
		System.out.println(plantname1.plantName);
		
		TreeName treename1=new TreeName();
		TreeName treename2=new FlowerName();
		TreeName treename3=new FruitName();
		treename1.treeNameInfo();
		System.out.println(treename1.treeName);
		
		FlowerName flowername1=new FlowerName();
		FlowerName flowername2=new FruitName();
		flowername1.flowerNameInfo();
		System.out.println(flowername1.color);
		
		FruitName fruitname=new FruitName();
		fruitname.fruitNameInfo();
		System.out.println(fruitname.name);
		
		
		
		

	}

}
