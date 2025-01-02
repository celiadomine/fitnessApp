package com.example.application.views.workout;

import com.example.application.views.you.YouView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.vaadin.lineawesome.LineAwesomeIconUrl;
import com.vaadin.flow.component.html.Image;

@PageTitle("Workout")
@Route("workout")
@Menu(order = 1, icon = LineAwesomeIconUrl.DUMBBELL_SOLID)
public class WorkoutView extends Composite<VerticalLayout> {

    public WorkoutView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        H3 h3 = new H3();
        Avatar avatar = new Avatar();
        RouterLink link = new RouterLink("", YouView.class);
        link.add(avatar);
        TabSheet tabSheet = new TabSheet();
        H5 h5 = new H5();
        H3 h32 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H5 h52 = new H5();
        H3 h33 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H5 h53 = new H5();
        H3 h34 = new H3();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.XLARGE);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("44px");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("Devices");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        h3.setText("BURN IT 🔥");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        avatar.setName("Firstname Lastname");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        getContent().setAlignSelf(FlexComponent.Alignment.START, h5);
        h5.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h32);
        h32.setWidth("max-content");
        h32.setHeight("31px");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h52);
        h52.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h33);
        h33.setWidth("max-content");
        h33.setHeight("31px");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        getContent().setAlignSelf(FlexComponent.Alignment.START, h53);
        h53.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h34);
        h34.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(h3);
        layoutRow.add(avatar);
        getContent().add(tabSheet);
        getContent().add(h5);
        getContent().add(h32);
        getContent().add(layoutRow2);
        getContent().add(h52);
        getContent().add(h33);
        getContent().add(layoutRow3);
        getContent().add(h53);
        getContent().add(h34);
        getContent().add(layoutRow4);
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        // Dashboard Tab Content
        VerticalLayout beginnerContent = new VerticalLayout();
        beginnerContent.setSpacing(true);
        beginnerContent.setWidthFull();
    
        // First Row
        H5 h5 = new H5("for...");
        h5.setWidth("max-content");
    
        H3 h32 = new H3("Strength");
        h32.setWidth("max-content");
        h32.setHeight("31px");
    
        // HorizontalLayout layoutRow2 = new HorizontalLayout();
        // layoutRow2.setWidthFull();
        // layoutRow2.addClassName(Gap.MEDIUM);

        // Create an image component
        Image imgSB1 = new Image("/imgs/imgSB1.png", "Strength Image 1");
        imgSB1.setWidth("auto");
        imgSB1.setHeight("100px");
        imgSB1.getStyle().set("border-radius", "10px");
    
        // Second Row
        H5 h52 = new H5("for...");
        h52.setWidth("max-content");
    
        H3 h33 = new H3("Endurance");
        h33.setWidth("max-content");
        h33.setHeight("31px");
    
        Image imgEB1 = new Image("/imgs/imgEB1.png", "Endurance Image 1");
        imgEB1.setWidth("auto");
        imgEB1.setHeight("100px");
        imgEB1.getStyle().set("border-radius", "10px");

        // Third Row
        H5 h53 = new H5("for...");
        h53.setWidth("max-content");
    
        H3 h34 = new H3("Mobility");
        h34.setWidth("max-content");

        Image imgMB1 = new Image("/imgs/imgMB1.png", "Mobility Image 1");
        imgMB1.setWidth("auto");
        imgMB1.setHeight("100px");
        imgMB1.getStyle().set("border-radius", "10px");
    
        // Add components to rows
        // layoutRow2.add(h32);
    
        // Add all components to dashboard content
        beginnerContent.add(h5, h32, imgSB1, h52, h33, imgEB1, h53, h34, imgMB1);
    
        // Add dashboard content to TabSheet
        tabSheet.add("Beginner", beginnerContent);
    
        // Payment Tab Content
        Div paymentContent = new Div();
        paymentContent.add(new Text("This is the Payment tab content."));
        tabSheet.add("Intermediate", paymentContent);
    
        // Shipping Tab Content
        Div shippingContent = new Div();
        shippingContent.add(new Text("This is the Shipping tab content."));
        tabSheet.add("Pro", shippingContent);
    }
    
}
