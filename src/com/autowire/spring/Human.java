package com.autowire.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;
	
	public Human() {
		super();
	}

	//@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	@Autowired
	@Qualifier("octopousHeart")
	public void setHeart(Heart heart) {
		System.out.println("setHeart is Calling !! ");
		this.heart = heart;
	}
	
	public void startPumping()
	{
		if(heart != null)
		{
			heart.pump();
			System.out.println("Name of the Animal is : " + heart.getNameOfAnimal() + "No Of Heart :" + heart.getNoOfHeart());
		}
		else
		{
			System.out.println("You are Dead ! ");
		}
	}
}
