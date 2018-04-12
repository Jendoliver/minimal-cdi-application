package com.jendoliver.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Esta clase sería lo que te genera el jodido motor
 * 
 * @author aalvarezm
 *
 */
public class CdiApplication
{
	private Weld weld;
	private WeldContainer container;
	private BookService bookService;

	private void init()
	{
		weld = new Weld();
		container = weld.initialize();
		bookService = container.instance().select(BookService.class).get();
	}

	private void start()
	{
		Book book = bookService.createBook("My title", "My description", 23.95);
		System.out.println(book);
		System.out.println(bookService.getJenduliva());
	}

	private void shutdown()
	{
		weld.shutdown();
	}

	public static void main(String[] args)
	{
		CdiApplication application = new CdiApplication();
		application.init();
		application.start();
		application.shutdown();
	}
}