package com.example.application.views.workout;

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
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Workout")
@Route("workout")
@Menu(order = 1, icon = LineAwesomeIconUrl.DUMBBELL_SOLID)
public class WorkoutView extends Composite<VerticalLayout> {

    public WorkoutView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        H3 h3 = new H3();
        Avatar avatar = new Avatar();
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
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        h3.setText("BURN IT");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        avatar.setName("Firstname Lastname");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        h5.setText("for...");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h5);
        h5.setWidth("max-content");
        h32.setText("Strength");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h32);
        h32.setWidth("max-content");
        h32.setHeight("31px");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        h52.setText("for...");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h52);
        h52.setWidth("max-content");
        h33.setText("Endurance");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h33);
        h33.setWidth("max-content");
        h33.setHeight("31px");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        h53.setText("for...");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h53);
        h53.setWidth("max-content");
        h34.setText("Mobility");
        getContent().setAlignSelf(FlexComponent.Alignment.START, h34);
        h34.setWidth("max-content");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
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
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }
}
