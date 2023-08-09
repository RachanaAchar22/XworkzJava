package com.xworkz.Polymorphism;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("Invoking mainMethod in Bakery");
		Bakery bakery = new BakeryInfo();
		bakery.sweet();
		bakery.sweet("Champakali");
		bakery.sweet("Champakali", 20);
		bakery.sweet("Champakali", 20, 1);
		bakery.sweet("Champakali", 20, 1, true);
		bakery.sweet("Champakali", 20, 1, true, "Yellow");

		Bakery bakery1 = new Bakery();
		bakery1.sweet();
		bakery1.sweet("Champakali");
		bakery1.sweet("Champakali", 20);
		bakery1.sweet("Champakali", 20, 1);
		bakery1.sweet("Champakali", 20, 1, true);
		bakery1.sweet("Champakali", 20, 1, true, "Yellow");

		System.out.println("============================================");
		System.out.println("Invoking MainMethod in Hotel");
		Hotel hotel = new LuxuryHotel();
		hotel.food();
		hotel.food("Parota");
		hotel.food("Parota", 100);
		hotel.food("Parota", 50, 2);
		hotel.food("Parota", 50, 2, "rajajinagar");
		hotel.food("Parota", 50, 2, "rajajinagar", true);

		Hotel hotel1 = new Hotel();
		hotel1.food();
		hotel1.food("Parota");
		hotel1.food("Parota", 100);
		hotel1.food("Parota", 50, 2);
		hotel1.food("Parota", 50, 2, "rajajinagar");
		hotel1.food("Parota", 50, 2, "rajajinagar", true);

		System.out.println("============================================");
		System.out.println("Invoking MainMethod in Hospital");
		Hospital hospital = new NeurologyHospital();
		hospital.treatment();
		hospital.treatment("Apollo Hospital");
		hospital.treatment("Apollo Hospital", "Stroke");
		hospital.treatment("Apollo Hospital", "Stroke", 1000);
		hospital.treatment("Apollo Hospital", "Stroke", 1000, "Rajajinagar");
		hospital.treatment("Apollo Hospital", "Stroke", 1000, "Rajajinagar", 10);

		Hospital hospital1 = new Hospital();
		hospital1.treatment();
		hospital1.treatment("Apollo Hospital");
		hospital1.treatment("Apollo Hospital", "Stroke");
		hospital1.treatment("Apollo Hospital", "Stroke", 1000);
		hospital1.treatment("Apollo Hospital", "Stroke", 1000, "Rajajinagar");
		hospital1.treatment("Apollo Hospital", "Stroke", 1000, "Rajajinagar", 10);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Hostel");
		Hostel hostel = new Pg();
		hostel.students();
		hostel.students("SJR");
		hostel.students("SJR", 500);
		hostel.students("SJR", 500, "Rajajinagar");
		hostel.students("SJR", 500, "Rajajinagar", 3);
		hostel.students("SJR", 500, "Rajajinagar", 3, "4 sharing Room");

		Hostel hostel1 = new Hostel();
		hostel1.students();
		hostel1.students("SJR");
		hostel1.students("SJR", 500);
		hostel1.students("SJR", 500, "Rajajinagar");
		hostel1.students("SJR", 500, "Rajajinagar", 3);
		hostel1.students("SJR", 500, "Rajajinagar", 3, "4 sharing Room");

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Mall");
		Mall mall = new Shopes();
		mall.store();
		mall.store("LuLu mall");
		mall.store("LuLu mall", "Majestic");
		mall.store("LuLu mall", "Majestic", 200);
		mall.store("LuLu mall", "Majestic", 200, true);
		mall.store("LuLu mall", "Majestic", 200, true, 4);

		Mall mall1 = new Mall();
		mall1.store();
		mall1.store("LuLu mall");
		mall1.store("LuLu mall", "Majestic");
		mall1.store("LuLu mall", "Majestic", 200);
		mall1.store("LuLu mall", "Majestic", 200, true);
		mall1.store("LuLu mall", "Majestic", 200, true, 4);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Theater");
		Theater theater = new Movie();
		theater.ticket();
		theater.ticket("Nagalakshmi");
		theater.ticket("Nagalakshmi", 200);
		theater.ticket("Nagalakshmi", 200, 20);
		theater.ticket("Nagalakshmi", 200, 20, "Malleshwaram");
		theater.ticket("Nagalakshmi", 200, 20, "Malleshwaram", "Bahubali");

		Theater theater1 = new Theater();
		theater1.ticket();
		theater1.ticket("Nagalakshmi");
		theater1.ticket("Nagalakshmi", 200);
		theater1.ticket("Nagalakshmi", 200, 20);
		theater1.ticket("Nagalakshmi", 200, 20, "Malleshwaram");
		theater1.ticket("Nagalakshmi", 200, 20, "Malleshwaram", "Bahubali");

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Library");
		Library library = new PublicLibrary();
		library.book();
		library.book("Janani");
		library.book("Janani", "Prakasha Hemavathi");
		library.book("Janani", "Prakasha Hemavathi", 200);
		library.book("Janani", "Prakasha Hemavathi", 200, "ebook");
		library.book("Janani", "Prakasha Hemavathi", 200, "ebook", 2022);

		Library library1 = new Library();
		library1.book();
		library1.book("Janani");
		library1.book("Janani", "Prakasha Hemavathi");
		library1.book("Janani", "Prakasha Hemavathi", 200);
		library1.book("Janani", "Prakasha Hemavathi", 200, "ebook");
		library1.book("Janani", "Prakasha Hemavathi", 200, "ebook", 2022);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Temple");
		Temple temple = new Tradition();
		temple.Pray();
		temple.Pray("Iskan Temple");
		temple.Pray("Iskan Temple", "Gratitude");
		temple.Pray("Iskan Temple", "Gratitude", 20);
		temple.Pray("Iskan Temple", "Gratitude", 20, "Strength");
		temple.Pray("Iskan Temple", "Gratitude", 20, "Strength", "Meditation");

		Temple temple1 = new Temple();
		temple1.Pray();
		temple1.Pray("Iskan Temple");
		temple1.Pray("Iskan Temple", "Gratitude");
		temple1.Pray("Iskan Temple", "Gratitude", 20);
		temple1.Pray("Iskan Temple", "Gratitude", 20, "Strength");
		temple1.Pray("Iskan Temple", "Gratitude", 20, "Strength", "Meditation");

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Market");
		Market market = new SuperMarket();
		market.purchase();
		market.purchase("Pickle");
		market.purchase("Pickle", 150);
		market.purchase("Pickle", 150, 350);
		market.purchase("Pickle", 150, 350, "MTR");
		market.purchase("Pickle", 150, 350, "MTR", "Vijayanagar");

		Market market1 = new Market();
		market1.purchase();
		market1.purchase("Pickle");
		market1.purchase("Pickle", 150);
		market1.purchase("Pickle", 150, 350);
		market1.purchase("Pickle", 150, 350, "MTR");
		market1.purchase("Pickle", 150, 350, "MTR", "Vijayanagar");

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Street");
		Street street = new Block();
		street.light();
		street.light("White");
		street.light("White", 10);
		street.light("White", 10, 10);
		street.light("White", 10, 10, 15);
		street.light("White", 10, 10, 15, "Jayanagar");

		Street street1 = new Street();
		street1.light();
		street1.light("White");
		street1.light("White", 10);
		street1.light("White", 10, 10);
		street1.light("White", 10, 10, 15);
		street1.light("White", 10, 10, 15, "Jayanagar");

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Zoo");
		Zoo zoo = new SafariPark();
		zoo.zooInfo();
		zoo.zooInfo("Bannerghatta");
		zoo.zooInfo("Bannerghatta", "Bangalore");
		zoo.zooInfo("Bannerghatta", "Bangalore", 500);
		zoo.zooInfo("Bannerghatta", "Bangalore", 500, 600);
		zoo.zooInfo("Bannerghatta", "Bangalore", 500, 600, 1000);

		Zoo zoo1 = new Zoo();
		zoo1.zooInfo();
		zoo1.zooInfo("Bannerghatta");
		zoo1.zooInfo("Bannerghatta", "Bangalore");
		zoo1.zooInfo("Bannerghatta", "Bangalore", 500);
		zoo1.zooInfo("Bannerghatta", "Bangalore", 500, 600);
		zoo1.zooInfo("Bannerghatta", "Bangalore", 500, 600, 1000);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in City");
		City city = new Town();
		city.cityInfo();
		city.cityInfo("Chikkamagaluru");
		city.cityInfo("Chikkamagaluru", 577101);
		city.cityInfo("Chikkamagaluru", 577101, "Urban");
		city.cityInfo("Chikkamagaluru", 577101, "Urban", 50577987);
		city.cityInfo("Chikkamagaluru", 577101, "Urban", 50577987, 30);

		City city1 = new City();
		city1.cityInfo();
		city1.cityInfo("Chikkamagaluru");
		city1.cityInfo("Chikkamagaluru", 577101);
		city1.cityInfo("Chikkamagaluru", 577101, "Urban");
		city1.cityInfo("Chikkamagaluru", 577101, "Urban", 50577987);
		city1.cityInfo("Chikkamagaluru", 577101, "Urban", 50577987, 30);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in Pub");
		Pub pub = new Bar();
		pub.pubInfo();
		pub.pubInfo("Toit BrewPub");
		pub.pubInfo("Toit BrewPub", "Bangalore");
		pub.pubInfo("Toit BrewPub", "Bangalore", "8 Hours");
		pub.pubInfo("Toit BrewPub", "Bangalore", "8 Hours", 100);
		pub.pubInfo("Toit BrewPub", "Bangalore", "8 Hours", 100, 20);

		Pub pub1 = new Pub();
		pub1.pubInfo();
		pub1.pubInfo("Toit BrewPub");
		pub1.pubInfo("Toit BrewPub", "Bangalore");
		pub1.pubInfo("Toit BrewPub", "Bangalore", "8 Hours");
		pub1.pubInfo("Toit BrewPub", "Bangalore", "8 Hours", 100);
		pub1.pubInfo("Toit BrewPub", "Bangalore", "8 Hours", 100, 20);

		System.out.println("====================================================");
		System.out.println("Invoking MainMethod in PoliceStation");
		PoliceStation policestation = new Jail();
		policestation.criminal();
		policestation.criminal("V V Puram Police Station");
		policestation.criminal("V V Puram Police Station", "Tippu Sultan Place Rd");
		policestation.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20);
		policestation.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20, "Murder");
		policestation.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20, "Murder", "Kiran");

		PoliceStation policestation1 = new PoliceStation();
		policestation1.criminal();
		policestation1.criminal("V V Puram Police Station");
		policestation1.criminal("V V Puram Police Station", "Tippu Sultan Place Rd");
		policestation1.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20);
		policestation1.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20, "Murder");
		policestation1.criminal("V V Puram Police Station", "Tippu Sultan Place Rd", 20, "Murder", "Kiran");
	}
	

}
