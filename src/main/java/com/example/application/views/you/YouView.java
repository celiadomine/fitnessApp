package com.example.application.views.you;

import com.example.application.components.avataritem.AvatarItem;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("You")
@Route("you")
@Menu(order = 2, icon = LineAwesomeIconUrl.FIRE_ALT_SOLID)
public class YouView extends Composite<VerticalLayout> {

    public YouView() {
        //create objects
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        H2 H2 = new H2();
        Avatar avatar = new Avatar();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        AvatarItem avatarItem = new AvatarItem();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        H2 H22 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary2 = new Button();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        H2 H23 = new H2();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        Span badge = new Span();
        Span badge2 = new Span();
        Span badge3 = new Span();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        
        //top menu
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.XLARGE);
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setMinWidth("326px");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("Devices");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        H2.setText("BURN IT 🔥");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, H2);
        H2.setWidth("max-content");

        avatar.setName("Firstname Lastname");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, avatar);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.START, avatarItem);
        avatarItem.setWidth("min-content");

        //add the infos to the avatar
        setAvatarItemSampleData(avatarItem);

        layoutRow5.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("30px");
        H22.setText("Goals");
        H22.setWidth("max-content");
        layoutRow3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("40px");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);

        //goals
        buttonPrimary2.setText("Sleep");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Activity");
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Health");
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        //random space
        layoutRow6.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.setHeight("30px");

        //badges
        H23.setText("Badges");
        H23.setWidth("max-content");
        layoutRow4.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.LARGE);
        layoutRow4.addClassName(Padding.SMALL);
        layoutRow4.setWidth("100%");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.CENTER);
        badge.setText("🐧");
        badge.setWidth("min-content");
        badge.addClassName("badge");
        badge.getElement().getThemeList().add("badge");
        badge2.setText("🏃");
        badge2.setWidth("min-content");
        badge2.addClassName("badge");
        badge2.getElement().getThemeList().add("badge");
        badge3.setText("🎀");
        badge3.setWidth("min-content");
        badge3.addClassName("badge");
        badge3.getElement().getThemeList().add("badge");

        //put everything together
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(H2);
        layoutRow2.add(avatar);
        getContent().add(layoutColumn2);
        layoutColumn2.add(avatarItem);
        layoutColumn2.add(layoutRow5);
        layoutColumn2.add(H22);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(buttonPrimary2);
        layoutRow3.add(buttonPrimary3);
        layoutRow3.add(buttonPrimary4);
        layoutColumn2.add(layoutRow6);
        layoutColumn2.add(H23);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(badge);
        layoutRow4.add(badge2);
        layoutRow4.add(badge3);
    }

    //data of the avatar
    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
        avatarItem.addClassName("avatar");
    }
}
