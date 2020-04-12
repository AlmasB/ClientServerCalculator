package com.almasb.cscalc;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class View extends VBox {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;

        var field1 = new TextField();
        field1.setFont(Font.font(24.0));
        var field2 = new TextField();
        field2.setFont(Font.font(24.0));

        var output = new Text();
        output.setFont(Font.font(24.0));

        var btnAdd = new Button("Add");
        btnAdd.setOnAction(e -> {
            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());

            var future = controller.onAdd(num1, num2);
            future.thenAccept(result -> output.setText(String.valueOf(result)));
        });

        var btnSub = new Button("Sub");
        btnSub.setOnAction(e -> {
            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());

            var future = controller.onSub(num1, num2);
            future.thenAccept(result -> output.setText(String.valueOf(result)));
        });

        setPadding(new Insets(15));
        setSpacing(15);

        getChildren().addAll(field1, field2, output, btnAdd, btnSub);
    }
}
