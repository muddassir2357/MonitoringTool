package com.paytm.utils;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

public class ComponentUtility {
	
	public HorizontalLayout getPanelwithHorizontalLayout(){
		
		Panel panel= new Panel();
		HorizontalLayout panelLayout = new HorizontalLayout(); 
		panelLayout.setMargin(true);
		panelLayout.setSpacing(true);
		panel.setSizeUndefined();
		panel.setContent(panelLayout);
		return panelLayout;
	}
	
	public void getPanelwithVerticalLayout(String label){
		
	}
	public void getButton(String label){
		
	}
	public void getTextField(String Label){
		
	}
	

}
