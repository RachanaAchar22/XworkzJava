package com.xworkz.Inheritance;

public class PlantRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in plantRunner");
		
		Plant plant1=new Plant();
		Plant plant2=new Tree();
		Plant plant3=new Flower();
		Plant plant4=new Fruit();
		plant1.plantInfo();
		System.out.println(plant1.name);
		
		Tree tree1=new Tree();
		Tree tree2=new Flower();
		Tree tree3=new Fruit();
		tree1.treeInfo();
		System.out.println(tree1.treeName);
		
		Flower flower1=new Flower();
		Flower flower2=new Fruit();
		flower1.FlowerInfo();
		System.out.println(flower1.color);
		
		Fruit fruit=new Fruit();
		fruit.FruitInfo();
		System.out.println(fruit.fruitName);
		
		
	}

}
