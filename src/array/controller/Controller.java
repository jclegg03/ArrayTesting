package array.controller;

import array.view.Popup;

public class Controller
{
	private Popup view;
	
	public Controller()
	{
		this.view = new Popup();
	}
	
	public void start()
	{
		view.displayMessage("Hello there.");
	}
}
