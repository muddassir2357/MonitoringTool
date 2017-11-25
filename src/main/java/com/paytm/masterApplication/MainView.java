package com.paytm.masterApplication;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = "/masterPage")
@Theme("valo")
@Title("Master Application")


public class MainView extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		
		GenerateSsoToken screen1= new GenerateSsoToken(request);
		setContent(screen1.getLayout());
		
		
	}

}
