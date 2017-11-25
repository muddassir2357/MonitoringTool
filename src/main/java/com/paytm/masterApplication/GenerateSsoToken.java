package com.paytm.masterApplication;

import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



public class GenerateSsoToken extends UI {

	private AbstractOrderedLayout layout;

	public GenerateSsoToken(VaadinRequest request) {
		init(request);
	}

	private static final long serialVersionUID = 9134436043461886398L;

	@Override
	protected void init(VaadinRequest request) {
		layout = new VerticalLayout();

		// Generation of Header
		Label header = new Label("<h2><b>Generate Tokens</b></h2><br><br>", ContentMode.HTML);
		header.setSizeUndefined();

		// SSO Token
		// Generation of Panel
		Panel panel = new Panel();
		HorizontalLayout panelLayout = new HorizontalLayout();
		panelLayout.setMargin(true);
		panelLayout.setSpacing(true);
		panel.setSizeUndefined();
		panel.setDescription("Click button to generate ssoToken");
		panel.setContent(panelLayout);

		// Generation of Button
		Button ssoTokenGenerateButton = new Button("Generate SSO Token");
		ssoTokenGenerateButton.setWidth("250px");
		panelLayout.addComponent(ssoTokenGenerateButton);
		panelLayout.setComponentAlignment(ssoTokenGenerateButton, Alignment.MIDDLE_CENTER);

		// Generation of text field
		final TextField ssoTokenText = new TextField();
		ssoTokenText.setWidth("300px");
		panelLayout.addComponent(ssoTokenText);
		panelLayout.setComponentAlignment(ssoTokenText, Alignment.MIDDLE_CENTER);

		// Adding listener to the button
		ssoTokenGenerateButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				ssoTokenText.setValue("a123-1213-dfw4-3dwz");

			}
		});

		// Auth Token

		// Generation of Panel
		Panel authPanel = new Panel();
		HorizontalLayout authPanelLayout = new HorizontalLayout();
		authPanelLayout.setMargin(true);
		authPanelLayout.setSpacing(true);
		authPanel.setSizeUndefined();
		authPanel.setDescription("Click button to generate Auth Token");
		authPanel.setContent(authPanelLayout);

		// Generation of Button
		Button authTokenGenerateButton = new Button("Generate Auth Token");
		authTokenGenerateButton.setWidth("250px");
		authPanelLayout.addComponent(authTokenGenerateButton);
		authPanelLayout.setComponentAlignment(authTokenGenerateButton, Alignment.MIDDLE_CENTER);

		// Generation of text field
		final TextField authTokenText = new TextField();
		authTokenText.setWidth("300px");
		authPanelLayout.addComponent(authTokenText);
		authPanelLayout.setComponentAlignment(authTokenText, Alignment.MIDDLE_CENTER);

		// Adding listener to the button
		authTokenGenerateButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				authTokenText.setValue("sjdg28992-21i721-jhj72722ee");

			}
		});
		
		//Generation of AdminAuth Token
		
		// AdminAuth Token

		// Generation of Panel
		Panel adminPanel = new Panel();
		HorizontalLayout adminPanelLayout = new HorizontalLayout();
		adminPanelLayout.setMargin(true);
		adminPanelLayout.setSpacing(true);
		adminPanel.setSizeUndefined();
		adminPanel.setDescription("Click button to generate Admin Auth Token");
		adminPanel.setContent(adminPanelLayout);

		// Generation of Button
		Button adminTokenGenerateButton = new Button("Generate Admin Token");
		adminTokenGenerateButton.setWidth("250px");
		adminPanelLayout.addComponent(adminTokenGenerateButton);
		adminPanelLayout.setComponentAlignment(adminTokenGenerateButton, Alignment.MIDDLE_CENTER);

		// Generation of text field
		final TextField adminTokenText = new TextField();
		adminTokenText.setWidth("300px");
		adminPanelLayout.addComponent(adminTokenText);
		adminPanelLayout.setComponentAlignment(adminTokenText, Alignment.MIDDLE_CENTER);

		// Adding listener to the button
		adminTokenGenerateButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				adminTokenText.setValue("sjdg28992-21i721-jhj72722ee");

			}
		});


		layout.addComponent(header);
		layout.addComponent(panel);
		layout.addComponent(authPanel);
		layout.addComponent(adminPanel);
		layout.setComponentAlignment(header, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(authPanel, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(adminPanel, Alignment.MIDDLE_CENTER);
		/*
		 * layout.addComponent(ssoTokenGenerateButton);
		 * layout.setComponentAlignment(ssoTokenGenerateButton,
		 * Alignment.MIDDLE_CENTER); layout.addComponent(ssoTokenText);
		 * layout.setComponentAlignment(ssoTokenText, Alignment.MIDDLE_CENTER);
		 */

	}

	public AbstractOrderedLayout getLayout() {
		return this.layout;
	}

}
