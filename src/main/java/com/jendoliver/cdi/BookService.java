package com.jendoliver.cdi;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BookService
{
	@Inject
	private NumberGenerator numberGenerator;
	
	@Inject
	private CdiDAO cdiDAO;
	
	private Date instanciationDate;

	@PostConstruct
	private void setInstanciationDate()
	{
		instanciationDate = new Date();
	}

	public Book createBook(String title, String description, double price)
	{

		Book book = new Book(title, description, price);
		book.setId(numberGenerator.generateNumber());
		book.setInstanciationDate(instanciationDate);

		return book;
	}
	
	public String getJenduliva()
	{
		return cdiDAO.getJenduliva();
	}
}
