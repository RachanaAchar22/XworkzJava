package com.xworkz.Casting;

public class BrandRunner {

	public static void main(String[] args) {
		System.out.println("Invoking  main in BrandRunner");
		System.out.println("----------------------------");
		Brand brand=new Brand();
		LocalBrand localBrand=new LocalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		DuplicateBrand duplicatebrand=new DuplicateBrand();
		InternationalBrand internationalbrand=new InternationalBrand();
		BrandUtil.cost(localBrand);
		System.out.println("----------------------------");
		BrandUtil.cost(nationalBrand);
		System.out.println("----------------------------");
		BrandUtil.cost(duplicatebrand);
		System.out.println("----------------------------");
		BrandUtil.cost(internationalbrand);
		

	}

}
