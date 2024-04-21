package online.sterz.playbook.views.vaadintabs;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import online.sterz.playbook.views.MainLayout;

@PageTitle("Vaadin Tabs")
@Route(value = "Vaadin-Tabs", layout = MainLayout.class)
@Uses(Icon.class)
public class VaadinTabsView extends Composite<VerticalLayout> {

    public VaadinTabsView() {
        Tabs tabs = new Tabs();
        Hr hr = new Hr();
        TabSheet tabSheet = new TabSheet();
        getContent().setHeightFull();
        getContent().setWidthFull();
        tabs.setWidth("100%");
        setTabsSampleData(tabs);
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        getContent().add(tabs);
        getContent().add(hr);
        getContent().add(tabSheet);
    }

    private void setTabsSampleData(Tabs tabs) {
        tabs.add(new Tab("Dashboard"));
        tabs.add(new Tab("Payment"));
        tabs.add(new Tab("Shipping"));
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }
}
