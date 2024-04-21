package online.sterz.playbook.views.vaadingrids;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import online.sterz.playbook.data.SamplePerson;
import online.sterz.playbook.services.SamplePersonService;
import online.sterz.playbook.views.MainLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Vaadin Grids")
@Route(value = "Vaadin-Grids", layout = MainLayout.class)
@Uses(Icon.class)
public class VaadinGridsView extends Composite<VerticalLayout> {

    public VaadinGridsView() {
        Grid basicGrid = new Grid(SamplePerson.class);
        Hr hr = new Hr();
        Grid multiSelectGrid = new Grid(SamplePerson.class);
        Hr hr2 = new Hr();
        Grid minimalistGrid = new Grid(SamplePerson.class);
        Hr hr3 = new Hr();
        Grid stripedGrid = new Grid(SamplePerson.class);
        getContent().setHeightFull();
        getContent().setWidthFull();
        basicGrid.setWidth("100%");
        basicGrid.setHeight("164px");
        basicGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(basicGrid);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidth("100%");
        multiSelectGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(multiSelectGrid);
        minimalistGrid.addThemeVariants(GridVariant.LUMO_COMPACT, GridVariant.LUMO_NO_BORDER,
                GridVariant.LUMO_NO_ROW_BORDERS);
        minimalistGrid.setWidth("100%");
        minimalistGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(minimalistGrid);
        stripedGrid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        stripedGrid.setWidth("100%");
        stripedGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(stripedGrid);
        getContent().add(basicGrid);
        getContent().add(hr);
        getContent().add(multiSelectGrid);
        getContent().add(hr2);
        getContent().add(minimalistGrid);
        getContent().add(hr3);
        getContent().add(stripedGrid);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;
}
