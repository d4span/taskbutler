package org.taskbutler.drivers

import com.vaadin.flow.component.Key
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.dependency.CssImport
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.router.Route

@Route
class MainUI : VerticalLayout() {

    init {
        val textField = TextField("Your name")
        textField.addThemeName("bordered")

        // Button click listeners can be defined as lambda expressions
        val button = Button("Say hello") { Notification.show("Hello World!") }

        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY)
        button.addClickShortcut(Key.ENTER)

        addClassName("centered-content")
        add(textField, button)
    }
}