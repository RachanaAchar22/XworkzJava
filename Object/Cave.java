package com.xworkz.app.Object;

public class Cave {
	
	private String location;
	private String name;
	private String lightSource;
	private String style;
	private String king;
	private boolean echo;
	private boolean history;
	private boolean ancient;
	private String formation;
	private String waterResource;
	
	public Cave() {
		System.out.println("Invoking constructor in Cave");
	}

	public Cave(String location, String name, String lightSource, String style, String king, boolean echo,
			boolean history, boolean ancient, String formation, String waterResource) {
		super();
		this.location = location;
		this.name = name;
		this.lightSource = lightSource;
		this.style = style;
		this.king = king;
		this.echo = echo;
		this.history = history;
		this.ancient = ancient;
		this.formation = formation;
		this.waterResource = waterResource;
	}

	@Override
	public String toString() {
		return "location=" + location + ", name=" + name + ", lightSource=" + lightSource + ", style="
				+ style + ", king=" + king + ", echo=" + echo + ", history=" + history + ", ancient=" + ancient
				+ ", formation=" + formation + ", waterResource=" + waterResource + "";
	}
	
	
	

}
