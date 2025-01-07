package com.example.application.views;

import com.example.application.views.statistics.StatisticsView;
import com.example.application.views.workout.WorkoutView;
import com.example.application.views.you.YouView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.Layout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.*;

import org.vaadin.lineawesome.LineAwesomeIcon;

@Layout
@AnonymousAllowed
public class MainLayout extends AppLayout {

    public static class MenuItemInfo extends Div {

        private final Class<? extends Component> view;

        public MenuItemInfo(String menuTitle, Component icon, Class<? extends Component> view) {
            this.view = view;
            RouterLink link = new RouterLink();
            link.addClassNames(Display.FLEX, Gap.SMALL, AlignItems.CENTER, Padding.Horizontal.XSMALL, TextColor.BODY);
            link.setRoute(view);

            Div text = new Div();
            text.setText(menuTitle);
            text.addClassNames(FontWeight.BOLD, FontSize.MEDIUM, TextColor.PRIMARY);

            if (icon != null) {
                link.add(icon);
            }
            link.add(text);
            add(link);
        }

        public Class<?> getView() {
            return view;
        }
    }

    public MainLayout() {
        // Add content for the application (main view)
        Div content = new Div();
        content.addClassNames(Display.FLEX, FlexDirection.COLUMN, Width.FULL, Height.FULL);
        setContent(content);

        // Add the bottom navbar
        addToNavbar(true, createBottomNavbar());
    }

    private Component createBottomNavbar() {
        Footer footer = new Footer();
        footer.addClassNames(BoxSizing.BORDER, Display.FLEX, FlexDirection.COLUMN, Width.FULL, Height.FULL);

        Nav nav = new Nav();
        nav.addClassNames(Display.FLEX, JustifyContent.EVENLY, Width.FULL);
       
        UnorderedList list = new UnorderedList();
        list.addClassNames(Display.FLEX, ListStyleType.NONE, Padding.NONE, Margin.NONE);
        list.getStyle().set("gap", "16px");

        for (MenuItemInfo menuItem : createMenuItems()) {
            list.add(menuItem);
        }

        nav.add(list);
        footer.add(nav);
        return footer;
    }

    private MenuItemInfo[] createMenuItems() {
        return new MenuItemInfo[]{
                new MenuItemInfo("Statistics", LineAwesomeIcon.CHART_BAR_SOLID.create(), StatisticsView.class),
                new MenuItemInfo("Workout", LineAwesomeIcon.DUMBBELL_SOLID.create(), WorkoutView.class),
                new MenuItemInfo("You", LineAwesomeIcon.FIRE_ALT_SOLID.create(), YouView.class),
        };
    }
}
