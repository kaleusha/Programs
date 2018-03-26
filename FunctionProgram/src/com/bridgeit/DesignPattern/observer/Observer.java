/******************************************************************************
 *  Purpose: Observer Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.observer;

public interface Observer 
{
	public void update();
	
	public void setSubject(Subject sub);

}
