/******************************************************************************
 *  Purpose: Observer Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.observer;

public interface Subject
{
		public void register(Observer obj);
		public void unregister(Observer obj);
		public void notifyObservers();
		public Object getUpdate(Observer obj);

}
