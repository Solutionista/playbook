package online.sterz.playbook.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;
import online.sterz.playbook.views.component.ComponentView;
import online.sterz.playbook.views.vaadinadvanced.VaadinAdvancedView;
import online.sterz.playbook.views.vaadinbasics.VaadinBasicsView;
import online.sterz.playbook.views.vaadingrids.VaadinGridsView;
import online.sterz.playbook.views.vaadintabs.VaadinTabsView;
import org.vaadin.lineawesome.LineAwesomeIcon;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H2 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("Vaadin Cookbook");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNavigation() {
        SideNav nav = new SideNav();

        nav.addItem(new SideNavItem("Component", ComponentView.class, LineAwesomeIcon.ELEMENTOR.create()));
        nav.addItem(new SideNavItem("Vaadin Basics", VaadinBasicsView.class, LineAwesomeIcon.ELEMENTOR.create()));
        nav.addItem(new SideNavItem("Vaadin Advanced", VaadinAdvancedView.class, LineAwesomeIcon.ELEMENTOR.create()));
        nav.addItem(new SideNavItem("Vaadin Grids", VaadinGridsView.class, LineAwesomeIcon.ELEMENTOR.create()));
        nav.addItem(new SideNavItem("Vaadin Tabs", VaadinTabsView.class, LineAwesomeIcon.ELEMENTOR.create()));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
