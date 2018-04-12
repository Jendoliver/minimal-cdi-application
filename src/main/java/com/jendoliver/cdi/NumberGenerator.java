package com.jendoliver.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NumberGenerator
{
	public String generateNumber()
	{
		return "33";
	}
}
