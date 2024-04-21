package online.sterz.playbook.views.component;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import online.sterz.playbook.views.MainLayout;

@PageTitle("Component")
@Route(value = "component", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class ComponentView extends Composite<VerticalLayout> {

    public ComponentView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        getContent().add(layoutColumn2);
        getContent().add(layoutRow);
    }
}
