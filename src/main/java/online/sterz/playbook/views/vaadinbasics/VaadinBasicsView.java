package online.sterz.playbook.views.vaadinbasics;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.avatar.AvatarGroup;
import com.vaadin.flow.component.avatar.AvatarGroup.AvatarGroupItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import online.sterz.playbook.components.phonenumberfield.PhoneNumberField;
import online.sterz.playbook.components.pricefield.PriceField;
import online.sterz.playbook.views.MainLayout;

@PageTitle("Vaadin Basics")
@Route(value = "Vaadin-Basic", layout = MainLayout.class)
@Uses(Icon.class)
public class VaadinBasicsView extends Composite<VerticalLayout> {

    public VaadinBasicsView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Avatar avatar = new Avatar();
        AvatarGroup avatarGroup = new AvatarGroup();
        Icon icon = new Icon();
        Span badge = new Span();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        Button buttonTertiary = new Button();
        MenuBar menuBar = new MenuBar();
        MenuBar menu = new MenuBar();
        Hr hr = new Hr();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TextField textField = new TextField();
        EmailField emailField = new EmailField();
        PasswordField passwordField = new PasswordField();
        PhoneNumberField phoneNumber = new PhoneNumberField();
        Hr hr2 = new Hr();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        NumberField numberField = new NumberField();
        PriceField price = new PriceField();
        TimePicker timePicker = new TimePicker();
        DatePicker datePicker = new DatePicker();
        Hr hr3 = new Hr();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        Select select = new Select();
        ComboBox comboBox = new ComboBox();
        MultiSelectComboBox multiSelectComboBox = new MultiSelectComboBox();
        Checkbox checkbox = new Checkbox();
        Hr hr4 = new Hr();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        MessageInput messageInput = new MessageInput();
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setHeight("625px");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("64px");
        avatar.setName("Firstname Lastname");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, avatar);
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, avatarGroup);
        avatarGroup.setWidth("min-content");
        setAvatarGroupSampleData(avatarGroup);
        icon.getElement().setAttribute("icon", "lumo:user");
        badge.setText("Badge");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, badge);
        badge.setWidth("min-content");
        badge.setHeight("48px");
        badge.getElement().getThemeList().add("badge");
        buttonPrimary.setText("Primary");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Secondary");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonSecondary);
        buttonSecondary.setWidth("min-content");
        buttonTertiary.setText("Tertiary");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, buttonTertiary);
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, menuBar);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, menu);
        menu.setWidth("min-content");
        setMenuSampleData(menu);
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("86px");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        passwordField.setLabel("Password field");
        passwordField.setWidth("min-content");
        phoneNumber.setLabel("Phone number");
        phoneNumber.setWidth("min-content");
        layoutRow3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("86px");
        numberField.setLabel("Number field");
        numberField.setWidth("min-content");
        price.setLabel("Price");
        price.setWidth("min-content");
        timePicker.setLabel("Time picker");
        timePicker.setWidth("min-content");
        datePicker.setLabel("Date picker");
        datePicker.setWidth("min-content");
        layoutRow4.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("86px");
        select.setLabel("Select");
        select.setWidth("min-content");
        setSelectSampleData(select);
        comboBox.setLabel("Combo Box");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        multiSelectComboBox.setLabel("Multi-Select Combo Box");
        multiSelectComboBox.setWidth("min-content");
        setMultiSelectComboBoxSampleData(multiSelectComboBox);
        checkbox.setLabel("Checkbox");
        layoutRow4.setAlignSelf(FlexComponent.Alignment.CENTER, checkbox);
        checkbox.setWidth("min-content");
        layoutRow5.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, messageInput);
        messageInput.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(avatar);
        layoutRow.add(avatarGroup);
        layoutRow.add(icon);
        layoutRow.add(badge);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
        layoutRow.add(buttonTertiary);
        layoutRow.add(menuBar);
        layoutRow.add(menu);
        layoutColumn2.add(hr);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(textField);
        layoutRow2.add(emailField);
        layoutRow2.add(passwordField);
        layoutRow2.add(phoneNumber);
        layoutColumn2.add(hr2);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(numberField);
        layoutRow3.add(price);
        layoutRow3.add(timePicker);
        layoutRow3.add(datePicker);
        layoutColumn2.add(hr3);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(select);
        layoutRow4.add(comboBox);
        layoutRow4.add(multiSelectComboBox);
        layoutRow4.add(checkbox);
        layoutColumn2.add(hr4);
        layoutColumn2.add(layoutRow5);
        layoutRow5.add(messageInput);
    }

    private void setAvatarGroupSampleData(AvatarGroup avatarGroup) {
        avatarGroup.add(new AvatarGroupItem("A B"));
        avatarGroup.add(new AvatarGroupItem("C D"));
        avatarGroup.add(new AvatarGroupItem("E F"));
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    private void setMenuSampleData(MenuBar menuBar) {
        menuBar.addThemeVariants(MenuBarVariant.LUMO_ICON);
        MenuItem share = menuBar.addItem(new Text("Share"));
        share.add(new Icon(VaadinIcon.ANGLE_DOWN));
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook");
        socialMediaSubMenu.addItem("Twitter");
        socialMediaSubMenu.addItem("Instagram");
        shareSubMenu.addItem("By email");
        shareSubMenu.addItem("Get Link");
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select select) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        select.setItems(sampleItems);
        select.setItemLabelGenerator(item -> ((SampleItem) item).label());
        select.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setMultiSelectComboBoxSampleData(MultiSelectComboBox multiSelectComboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectComboBox.setItems(sampleItems);
        multiSelectComboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
