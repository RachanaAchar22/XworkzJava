package com.xworkz.Casting;

public class BrandUtil {
	
	public static void cost(Brand brand)
	{
		System.out.println("Invoking cost in BrandUtil");
		System.out.println(brand.name);
		if(brand instanceof LocalBrand)
		{
			System.out.println("Brand is LocalBrand");
			LocalBrand  localbrand=(LocalBrand)brand;
			System.out.println(localbrand.price);
			localbrand.localInfo();
		}
		if(brand instanceof NationalBrand)
		{
			System.out.println("Brand is NationalBrand");
			NationalBrand  nationalbrand=(NationalBrand)brand;
			System.out.println(nationalbrand.brandName);
			nationalbrand.nationalBrandInfo();
		}
		if(brand instanceof DuplicateBrand)
		{
			System.out.println("Brand is DuplicateBrand");
			DuplicateBrand  duplicatebrand=(DuplicateBrand)brand;
			System.out.println(duplicatebrand.original);
			duplicatebrand.duplicateBrandInfo();
		}
		if(brand instanceof InternationalBrand)
		{
			System.out.println("Brand is InternationalBrand");
			InternationalBrand  internationalbrand=(InternationalBrand)brand;
			System.out.println(internationalbrand.brandPrice);
			internationalbrand.brandInfo();
		}
	}
	

}
