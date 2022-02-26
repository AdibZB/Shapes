package com.example.shapes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shapes extends Application {
    @Override
    public void start(Stage stage) {
        // create text field for input of shapes
        TextField shapeText = new TextField();
        shapeText.setMaxWidth(200);

        // create text field for input of colour
        TextField colourText = new TextField();
        colourText.setMaxWidth(200);

        // create button to display shape
        Button shapeButton = new Button();
        shapeButton.setText("Type the shape you want to see (Triangle, Rectangle or Hexagon)");

        // create button to colour in shape
        Button colourButton = new Button();
        colourButton.setText("Type the colour you want your shape to be (Red, Green or Grey");

        // create Triangle shapes
        Polygon plainTriangle = new Polygon(100, 100, 200, 100, 200, 150);
        plainTriangle.setFill(Color.WHITE);
        plainTriangle.setStroke(Color.BLACK);

        Polygon redTriangle = new Polygon(100, 100, 200, 100, 200, 150);
        redTriangle.setStroke(Color.BLACK);
        redTriangle.setFill(Color.RED);

        Polygon greenTriangle = new Polygon(100, 100, 200, 100, 200, 150);
        greenTriangle.setStroke(Color.BLACK);
        greenTriangle.setFill(Color.GREEN);

        Polygon greyTriangle = new Polygon(100, 100, 200, 100, 200, 150);
        greyTriangle.setStroke(Color.BLACK);
        greyTriangle.setFill(Color.GREY);

        // create Hexagon shapes
        Polygon plainHexagon = new Polygon(100, 100, 150, 150, 200, 100, 200, 50, 150, 0, 100, 50);
        plainHexagon.setStroke(Color.BLACK);
        plainHexagon.setFill(Color.WHITE);

        Polygon redHexagon = new Polygon(100, 100, 150, 150, 200, 100, 200, 50, 150, 0, 100, 50);
        redHexagon.setStroke(Color.BLACK);
        redHexagon.setFill(Color.RED);

        Polygon greenHexagon = new Polygon(100, 100, 150, 150, 200, 100, 200, 50, 150, 0, 100, 50);
        greenHexagon.setStroke(Color.BLACK);
        greenHexagon.setFill(Color.GREEN);

        Polygon greyHexagon = new Polygon(100, 100, 150, 150, 200, 100, 200, 50, 150, 0, 100, 50);
        greyHexagon.setStroke(Color.BLACK);
        greyHexagon.setFill(Color.GREY);

        //Create Rectangle Shapes
        Rectangle plainRectangle = new Rectangle(100, 100, 150, 70);
        plainRectangle.setStroke(Color.BLACK);
        plainRectangle.setFill(Color.WHITE);

        Rectangle redRectangle = new Rectangle(100, 100, 150, 70);
        redRectangle.setStroke(Color.BLACK);
        redRectangle.setFill(Color.RED);

        Rectangle greenRectangle = new Rectangle(100, 100, 150, 70);
        greenRectangle.setStroke(Color.BLACK);
        greenRectangle.setFill(Color.GREEN);

        Rectangle greyRectangle = new Rectangle(100, 100, 150, 70);
        greyRectangle.setStroke(Color.BLACK);
        greyRectangle.setFill(Color.GREY);

        // Create Text box for error messages
        TextArea display = new TextArea();
        display.setEditable(false);
        display.setMinSize(270, 50);
        display.setMaxSize(270, 50);

        // Create Vbox to hold components
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(shapeText, shapeButton, colourText, colourButton, display);

        // Set the scene
        Scene scene = new Scene(root, 400, 400);

        // Create action for the buttons to display and colour shapes
        shapeButton.setOnAction(e ->
                {
                    if (shapeText.getText().isEmpty()) {
                        if (root.getChildren().contains(display) == true) {
                            display.setText("Please enter the shape you would like to see");
                        } else {
                            root.getChildren().remove(4);
                            root.getChildren().add(display);
                            display.setText("Please enter the shape you would like to see");
                        }
                    } else if (shapeText.getText().equalsIgnoreCase("triangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(plainTriangle);
                    } else if (shapeText.getText().equalsIgnoreCase("hexagon")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(plainHexagon);
                    } else if (shapeText.getText().equalsIgnoreCase("rectangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(plainRectangle);
                    } else {
                        root.getChildren().remove(4);
                        root.getChildren().add(display);
                        display.setText("Invalid shape please enter triangle, rectangle or hexagon");
                    }
                }
        );

        colourButton.setOnAction(e ->
                {
                    if (colourText.getText().isEmpty()) {
                        root.getChildren().remove(4);
                        root.getChildren().add(display);
                        display.setText("Please enter a colour");
                    } else if (colourText.getText().equalsIgnoreCase("red") && shapeText.getText().equalsIgnoreCase("triangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(redTriangle);
                    } else if (colourText.getText().equalsIgnoreCase("green") && shapeText.getText().equalsIgnoreCase("triangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greenTriangle);
                    } else if (colourText.getText().equalsIgnoreCase("grey") && shapeText.getText().equalsIgnoreCase("triangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greyTriangle);
                    } else if (colourText.getText().equalsIgnoreCase("red") && shapeText.getText().equalsIgnoreCase("rectangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(redRectangle);
                    } else if (colourText.getText().equalsIgnoreCase("green") && shapeText.getText().equalsIgnoreCase("rectangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greenRectangle);
                    } else if (colourText.getText().equalsIgnoreCase("grey") && shapeText.getText().equalsIgnoreCase("rectangle")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greyRectangle);
                    } else if (colourText.getText().equalsIgnoreCase("red") && shapeText.getText().equalsIgnoreCase("hexagon")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(redHexagon);
                    } else if (colourText.getText().equalsIgnoreCase("green") && shapeText.getText().equalsIgnoreCase("hexagon")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greenHexagon);
                    } else if (colourText.getText().equalsIgnoreCase("grey") && shapeText.getText().equalsIgnoreCase("hexagon")) {
                        root.getChildren().remove(4);
                        root.getChildren().add(greyHexagon);
                    } else {
                        root.getChildren().remove(4);
                        root.getChildren().add(display);
                        display.setText("Invalid colour please type red, green or grey");
                    }


                }
        );

        // make the stage
        stage.setScene(scene);
        stage.setTitle("Shapes");
        stage.show();
    }
}    