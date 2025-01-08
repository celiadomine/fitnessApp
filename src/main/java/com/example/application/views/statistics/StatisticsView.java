package com.example.application.views.statistics;

import com.example.application.views.you.YouView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

/**
 * The StatisticsView class represents a view for displaying various statistics in the application.
 * It extends the Composite class with a VerticalLayout as the content.
 * 
 * Annotations:
 * - @PageTitle: Sets the title of the page to "Statistics".
 * - @Route: Defines the route for this view as the root ("/").
 * - @Menu: Adds this view to the menu with order 0 and an icon.
 */

@PageTitle("Statistics")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.CHART_BAR_SOLID)
public class StatisticsView extends Composite<VerticalLayout> {

    public StatisticsView() {
        //create objects
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        H2 H2 = new H2();
        Avatar avatar = new Avatar();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        ProgressBar progressBar2 = new ProgressBar();
        H1 h2 = new H1();
        H2 H22 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        ProgressBar progressBar3 = new ProgressBar();
        H5 h5 = new H5();
        H5 h52 = new H5();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        ProgressBar progressBar4 = new ProgressBar();
        H5 h53 = new H5();
        H5 h54 = new H5();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        ProgressBar progressBar5 = new ProgressBar();
        H5 h55 = new H5();
        H5 h56 = new H5();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        VerticalLayout layoutColumn6 = new VerticalLayout();
        Button buttonSecondary = new Button();
        Button buttonSecondary2 = new Button();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        VerticalLayout layoutColumn7 = new VerticalLayout();
        Button buttonSecondary3 = new Button();
        Button buttonSecondary4 = new Button();
        Button buttonPrimary2 = new Button();

        //styles

        //top menu
        layoutRow.addClassName("layoutRow");
        layoutRow.addClassName(Gap.XLARGE);
        
        buttonPrimary.setText("Devices");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        H2.setText("BURN IT 🔥");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, H2);
        H2.setWidth("max-content");

        avatar.setName("Firstname Lastname");
        
        //big statistics
        layoutRow2.addClassName("layoutRow2");
        layoutRow2.addClassName(Gap.LARGE);
        layoutColumn2.addClassName("layoutColumn2");
        progressBar2.setValue(0.5);
        h2.setText("8'305");
        h2.setWidth("max-content");
        h2.getStyle().set("font-weight", "bold");
        H22.setText("Steps");
        H22.setWidth("max-content");

        //small stats
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.XSMALL);
        layoutRow3.addClassName(Padding.XSMALL);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);

        //left stat
        layoutColumn3.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100px");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutColumn3.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn3.setAlignItems(Alignment.CENTER);
        progressBar3.setValue(0.5);
        h5.setText("1");
        layoutColumn3.setAlignSelf(FlexComponent.Alignment.CENTER, h5);
        h5.setWidth("max-content");
        h52.setText("Zone min");
        layoutColumn3.setAlignSelf(FlexComponent.Alignment.CENTER, h52);
        h52.setWidth("max-content");
        layoutColumn4.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn4);

        //middle stat
        layoutColumn4.setWidth("min-content");
        layoutColumn4.setMinWidth("100px");
        layoutColumn4.getStyle().set("flex-grow", "3");
        layoutColumn4.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn4.setAlignItems(Alignment.CENTER);
        progressBar4.setValue(0.5);
        h53.setText("6.28");
        layoutColumn4.setAlignSelf(FlexComponent.Alignment.CENTER, h53);
        h53.setWidth("max-content");
        h54.setText("km");
        layoutColumn4.setAlignSelf(FlexComponent.Alignment.CENTER, h54);
        h54.setWidth("max-content");

        //right stat
        layoutColumn5.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth("100px");
        layoutColumn5.getStyle().set("flex-grow", "1");
        progressBar5.setValue(0.5);
        h55.setText("1'837");
        layoutColumn5.setAlignSelf(FlexComponent.Alignment.CENTER, h55);
        h55.setWidth("max-content");
        h56.setText("cal");
        layoutColumn5.setAlignSelf(FlexComponent.Alignment.CENTER, h56);
        h56.setWidth("max-content");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);

        //styles
        layoutRow4.addClassName(Gap.XSMALL);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow5.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.XSMALL);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutColumn6.setHeightFull();
        layoutRow5.setFlexGrow(1.0, layoutColumn6);
        layoutColumn6.addClassName(Gap.XSMALL);
        layoutColumn6.addClassName(Padding.SMALL);
        layoutColumn6.getStyle().set("flex-grow", "1");
        buttonSecondary.setText("7h 32m of sleep");
        buttonSecondary.addClassName("statistics-card");
        buttonSecondary2.setText("23 active minutes");
        buttonSecondary2.addClassName("statistics-card");
        layoutRow6.setHeightFull();
        layoutRow5.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.XSMALL);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutColumn7.setHeightFull();
        layoutRow6.setFlexGrow(1.0, layoutColumn7);
        layoutColumn7.addClassName(Gap.XSMALL);
        layoutColumn7.addClassName(Padding.SMALL);
        layoutColumn7.setWidth("100%");
        layoutColumn7.getStyle().set("flex-grow", "1");
        buttonSecondary3.setText("6 of 9 active hours");
        buttonSecondary3.addClassName("statistics-card");
        buttonSecondary4.setText("5 floors walked");
        buttonSecondary4.addClassName("statistics-card");
        buttonPrimary2.setText("more");
        buttonPrimary2.addClassName("more");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary2);
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        //put everything together
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(H2);
        layoutRow.add(avatar);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(progressBar2);
        layoutColumn2.add(h2);
        layoutColumn2.add(H22);
        getContent().add(layoutRow3);
        layoutRow3.add(layoutColumn3);
        layoutColumn3.add(progressBar3);
        layoutColumn3.add(h5);
        layoutColumn3.add(h52);
        layoutRow3.add(layoutColumn4);
        layoutColumn4.add(progressBar4);
        layoutColumn4.add(h53);
        layoutColumn4.add(h54);
        layoutRow3.add(layoutColumn5);
        layoutColumn5.add(progressBar5);
        layoutColumn5.add(h55);
        layoutColumn5.add(h56);
        getContent().add(layoutRow4);
        layoutRow4.add(layoutRow5);
        layoutRow5.add(layoutColumn6);
        layoutColumn6.add(buttonSecondary);
        layoutColumn6.add(buttonSecondary2);
        layoutRow5.add(layoutRow6);
        layoutRow6.add(layoutColumn7);
        layoutColumn7.add(buttonSecondary3);
        layoutColumn7.add(buttonSecondary4);
        getContent().add(buttonPrimary2);
    }
}
