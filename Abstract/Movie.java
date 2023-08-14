package com.xworkz.Abstract;

public abstract class Movie {
	
	public void Trailer()
	{
		System.out.println("Invoking trailer in movie");
	}
	public void visualStimulation()
	{
		System.out.println("Invoking visualStimulation in movie");
	}
	public void entertainment()
	{
		System.out.println("Invoking Entertainment in movie");
	}
	public void expression()
	{
		System.out.println("Invoking expression in Movie");
	}
	public void storyTelling()
	{
		System.out.println("Invoking StoryTelling in Movie");
	}
	public abstract void theme();
	
	public abstract boolean dance();
	
	public abstract void inspiration();
	
	public abstract void audio();
	
	public abstract void climax();

}
