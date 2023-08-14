package com.xworkz.Abstract;

public class MainRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in Movie");
		Movie movie=new HorrorMovie();
		movie.theme();
		movie.dance();
		movie.inspiration();
		movie.audio();
		movie.climax();
		movie.Trailer();
		movie.visualStimulation();
		
		System.out.println("=================================");
		System.out.println("Invoking main in Vehicle");
		Vehicle vehicle=new ElectricVehicle();
		vehicle.convenience();;
		vehicle.capacity();
		vehicle.control();
		vehicle.connectivity();
		vehicle.durability();
		vehicle.transportation();
		vehicle.comfort();
		
		System.out.println("=================================");
		System.out.println("Invoking main in Job");
		Job job=new JobRole();
		job.creativity();
		job.volunteering();
		job.tasks();
		job.leadership();
		job.timeManagement();
		job.skills();
		job.language();
		
		System.out.println("=================================");
		System.out.println("Invoking main in Ticket");
		Ticket ticket=new MovieTicket();
		ticket.starttime();
		ticket.venue();
		ticket.stop();
		ticket.validation();
		ticket.reservation();
		ticket.cost();
		ticket.event();
		
		System.out.println("=================================");
		System.out.println("Invoking main in Socialmedia");
		Socialmedia socialmedia=new WhatsApp();
		socialmedia.post();
		socialmedia.privacy();
		socialmedia.statusviews();
		socialmedia.notification();
		socialmedia.sharePhoto();
		socialmedia.groups();
		socialmedia.profile();
		
	}

}
