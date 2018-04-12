package com.jendoliver.cdi;

import java.util.Date;

public class Book
{
	private String title;
	private String description;
	private double price;
	private String id;
	private Date instanciationDate;

	public Book()
	{

	}

	public Book(String title, String description, double price)
	{
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Date getInstanciationDate()
	{
		return instanciationDate;
	}

	public void setInstanciationDate(Date instanciationDate)
	{
		this.instanciationDate = instanciationDate;
	}

	@Override
	public String toString()
	{
		return "Book [title=" + title + ", description=" + description + ", price=" + price + ", id="
				+ id + ", instanciationDate=" + instanciationDate + "]";
	}
}