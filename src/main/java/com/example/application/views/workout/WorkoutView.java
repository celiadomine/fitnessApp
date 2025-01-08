package com.example.application.views.workout;

import com.example.application.views.you.YouView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
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
        //create objects
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        H2 H2 = new H2();
        Avatar avatar = new Avatar();
        RouterLink link = new RouterLink("", YouView.class);
        link.add(avatar);
        TabSheet tabSheet = new TabSheet();
        H5 h5 = new H5();
        H2 H22 = new H2();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H5 h52 = new H5();
        H2 H23 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H5 h53 = new H5();
        H2 H24 = new H2();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
       
        //top menu
        layoutRow.addClassName("menu-workout");
        layoutRow.addClassName(Gap.XLARGE);
        
        buttonPrimary.setText("Devices");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        H2.setText("BURN IT 🔥");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, H2);
        H2.setWidth("max-content");

        avatar.setName("Firstname Lastname");

        //workouts tabs
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);

        getContent().setAlignSelf(FlexComponent.Alignment.START, h5);
        h5.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, H22);
        H22.setWidth("max-content");
        H22.setHeight("31px");
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        getContent().setAlignSelf(FlexComponent.Alignment.START, h52);
        h52.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, H23);
        H23.setWidth("max-content");
        H23.setHeight("31px");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        getContent().setAlignSelf(FlexComponent.Alignment.START, h53);
        h53.setWidth("max-content");
        getContent().setAlignSelf(FlexComponent.Alignment.START, H24);
        H24.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(H2);
        layoutRow.add(avatar);

        //put everything together
        getContent().add(tabSheet);
        getContent().add(h5);
        getContent().add(H22);
        getContent().add(layoutRow2);
        getContent().add(h52);
        getContent().add(H23);
        getContent().add(layoutRow3);
        getContent().add(h53);
        getContent().add(H24);
        getContent().add(layoutRow4);
    }

    //THE WORKOUTSSS
    private void setTabSheetSampleData(TabSheet tabSheet) {

        // BEGINNER TAG CONTENT

        //settings
        VerticalLayout beginnerContent = new VerticalLayout();
        beginnerContent.setSpacing(true);
        beginnerContent.setWidthFull();

        H5 h5 = new H5("for...");
        h5.setWidth("max-content");
    
        H2 H22 = new H2("Strength");
        H22.setWidth("max-content");
        H22.setHeight("31px");

        //Strength Beginner
        Image imgSB1 = new Image("/imgs/beginner/imgSB1.png", "Strength Image 1");
        imgSB1.addClassName("image");

        Image imgSB2 = new Image("/imgs/beginner/imgSB2.png", "Strength Image 2");
        imgSB2.addClassName("image");

        Image imgSB3 = new Image("/imgs/beginner/imgSB1.png", "Strength Image 3");
        imgSB3.addClassName("image");

        //for the workout "line"
        HorizontalLayout beginnerContentImgs = new HorizontalLayout();
        beginnerContentImgs.add(imgSB1, imgSB2, imgSB3);
        beginnerContentImgs.addClassName("horizontal-scrolling");
    
        H5 h52 = new H5("for...");
        h52.setWidth("max-content");
    
        H2 H23 = new H2("Endurance");
        H23.setWidth("max-content");
        H23.setHeight("31px");

        //Endurance Beginner
        Image imgEB1 = new Image("/imgs/beginner/imgEB1.png", "Endurance Image 1");
        imgEB1.addClassName("image");

        Image imgEB2 = new Image("/imgs/beginner/imgEB2.png", "Endurance Image 2");
        imgEB2.addClassName("image");

        Image imgEB3 = new Image("/imgs/beginner/imgEB1.png", "Endurance Image 3");
        imgEB3.addClassName("image");

        //for the workout "line"
        HorizontalLayout beginnerContentImgs2 = new HorizontalLayout();
        beginnerContentImgs2.add(imgEB1, imgEB2, imgEB3);
        beginnerContentImgs2.addClassName("horizontal-scrolling");

        H5 h53 = new H5("for...");
        h53.setWidth("max-content");
    
        H2 H24 = new H2("Mobility");
        H24.setWidth("max-content");

        //Mobility Beginner
        Image imgMB1 = new Image("/imgs/beginner/imgMB1.png", "Mobility Image 1");
        imgMB1.addClassName("image");

        Image imgMB2 = new Image("/imgs/beginner/imgMB2.png", "Mobility Image 2");
        imgMB2.addClassName("image");

        Image imgMB3 = new Image("/imgs/beginner/imgMB1.png", "Mobility Image 3");
        imgMB3.addClassName("image");

        //for the workout "line"
        HorizontalLayout beginnerContentImgs3 = new HorizontalLayout();
        beginnerContentImgs3.add(imgMB1, imgMB2, imgMB3);
        beginnerContentImgs3.addClassName("horizontal-scrolling");

        // Add all components to dashboard content
        beginnerContent.add(h5, H22, beginnerContentImgs, h52, H23, beginnerContentImgs2, h53, H24, beginnerContentImgs3);
        tabSheet.add("Beginner", beginnerContent);


        // Intermediate Tab Content

        //settings
        VerticalLayout intermediateContent = new VerticalLayout();
        intermediateContent.setSpacing(true);
        intermediateContent.setWidthFull();

        H5 h51 = new H5("for...");
        h51.setWidth("max-content");
    
        H2 H25 = new H2("Strength");
        H25.setWidth("max-content");
        H25.setHeight("31px");
    
        //Strength Intermediate
        Image imgSI1 = new Image("/imgs/intermediate/imgSI1.png", "Strength Image 1");
        imgSI1.addClassName("image");

        Image imgSI2 = new Image("/imgs/intermediate/imgSI2.png", "Strength Image 2");
        imgSI2.addClassName("image");

        Image imgSI3 = new Image("/imgs/intermediate/imgSI1.png", "Strength Image 1");
        imgSI3.addClassName("image");

        //for the workout "line"
        HorizontalLayout intermediateContentImgs = new HorizontalLayout();
        intermediateContentImgs.add(imgSI1, imgSI2, imgSI3);
        intermediateContentImgs.addClassName("horizontal-scrolling");
    
        H5 h54 = new H5("for...");
        h54.setWidth("max-content");
    
        H2 H26 = new H2("Endurance");
        H23.setWidth("max-content");
        H23.setHeight("31px");
    
        //Endurance Intermediate
        Image imgEI1 = new Image("/imgs/intermediate/imgEI1.png", "Strength Image 1");
        imgEI1.addClassName("image");

        Image imgEI2 = new Image("/imgs/intermediate/imgEI2.png", "Strength Image 2");
        imgEI2.addClassName("image");

        Image imgEI3 = new Image("/imgs/intermediate/imgEI1.png", "Strength Image 1");
        imgEI3.addClassName("image");

        //for the workout "line"
        HorizontalLayout intermediateContentImgs2 = new HorizontalLayout();
        intermediateContentImgs2.add(imgEI1, imgEI2, imgEI3);
        intermediateContentImgs2.addClassName("horizontal-scrolling");

        H5 h55 = new H5("for...");
        h53.setWidth("max-content");
    
        H2 H27 = new H2("Mobility");
        H24.setWidth("max-content");

        //Mobility Intermediate
        Image imgMI1 = new Image("/imgs/intermediate/imgMI1.png", "Strength Image 1");
        imgMI1.addClassName("image");

        Image imgMI2 = new Image("/imgs/intermediate/imgMI2.png", "Strength Image 2");
        imgMI2.addClassName("image");

        Image imgMI3 = new Image("/imgs/intermediate/imgMI1.png", "Strength Image 1");
        imgMI3.addClassName("image");

        //for the workout "line"
        HorizontalLayout intermediateContentImgs3 = new HorizontalLayout();
        intermediateContentImgs3.add(imgMI1, imgMI2, imgMI3);
        intermediateContentImgs3.addClassName("horizontal-scrolling");
    
        intermediateContent.add(h51, H25, intermediateContentImgs, h54, H26, intermediateContentImgs2, h55, H27, intermediateContentImgs3);
        tabSheet.add("Intermediate", intermediateContent);
    
        // PRO TAB CONTENT

        //settings
        VerticalLayout proContent = new VerticalLayout();
        proContent.setSpacing(true);
        proContent.setWidthFull();

        H5 h56 = new H5("for...");
        h51.setWidth("max-content");
    
        H2 H28 = new H2("Strength");
        H25.setWidth("max-content");
        H25.setHeight("31px");
    
        //Profi Strength
        Image imgSP1 = new Image("/imgs/profi/imgSP1.png", "Strength Image 1");
        imgSP1.addClassName("image");

        Image imgSP2 = new Image("/imgs/profi/imgSP2.png", "Strength Image 2");
        imgSP2.addClassName("image");

        Image imgSP3 = new Image("/imgs/profi/imgSP1.png", "Strength Image 1");
        imgSP3.addClassName("image");

        //for the workout "line"
        HorizontalLayout proContentImgs = new HorizontalLayout();
        proContentImgs.add(imgSP1, imgSP2, imgSP3);
        proContentImgs.addClassName("horizontal-scrolling");
    
        H5 h57 = new H5("for...");
        h54.setWidth("max-content");
    
        H2 H29 = new H2("Endurance");
        H23.setWidth("max-content");
        H23.setHeight("31px");
    
        //Profi Endurance
        Image imgEP1 = new Image("/imgs/profi/imgEP1.png", "Strength Image 1");
        imgEP1.addClassName("image");

        Image imgEP2 = new Image("/imgs/profi/imgEP2.png", "Strength Image 2");
        imgEP2.addClassName("image");

        Image imgEP3 = new Image("/imgs/profi/imgEP1.png", "Strength Image 1");
        imgEP3.addClassName("image");

        //for the workout "line"
        HorizontalLayout proContentImgs2 = new HorizontalLayout();
        proContentImgs2.add(imgEP1, imgEP2, imgEP3);
        proContentImgs2.addClassName("horizontal-scrolling");

        H5 h58 = new H5("for...");
        h53.setWidth("max-content");
    
        H2 H291 = new H2("Mobility");
        H24.setWidth("max-content");

        //Profi Mobility
        Image imgMP1 = new Image("/imgs/profi/imgMP1.png", "Strength Image 1");
        imgMP1.addClassName("image");

        Image imgMP2 = new Image("/imgs/profi/imgMP2.png", "Strength Image 2");
        imgMP2.addClassName("image");

        Image imgMP3 = new Image("/imgs/profi/imgMP1.png", "Strength Image 1");
        imgMP3.addClassName("image");

        //for the workout "line"
        HorizontalLayout proContentImgs3 = new HorizontalLayout();
        proContentImgs3.add(imgMP1, imgMP2, imgMP3);
        proContentImgs3.addClassName("horizontal-scrolling");

     
        proContent.add(h56, H28, proContentImgs, h57, H29, proContentImgs2, h58, H291, proContentImgs3);
        tabSheet.add("Pro", proContent);
    }
    
}
