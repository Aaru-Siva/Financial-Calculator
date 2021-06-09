package sample;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //main method
    public static void show() {

    //creating new stage
        Stage Main = new Stage();
        Stage First = new Stage();
        First.setTitle("Start");
        Main.setTitle("Home");  //setting title

        //creating new stack pane
        StackPane startPane = new StackPane();

        //Pane for starting up the financial calculator
        Pane Start = new Pane();
        Pane Home = new Pane(); //creating a new pane for home

        //stying the home background using background colour
        Home.setBackground(new Background(new BackgroundFill(Color.rgb(0,153,153), CornerRadii.EMPTY, Insets.EMPTY)));

        //creating start button
        Button start = new Button();
        start.setText("Get Start");
        start.setPrefHeight(50);
        start.setPrefWidth(150);
        start.setLayoutX(200);
        start.setLayoutY(215);
        start.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6;-fx-font-weight: bold;-fx-text-fill:#008080;");
        Image imge1 = new Image("file:ON.png");     //adding image icon inside button
        ImageView view = new ImageView(imge1);
        view.setFitHeight(35);
        view.setPreserveRatio(true);
        start.setGraphic(view);

        //---------------Set on action for Start button-----------------//
        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                startPane.getChildren().add(Home);
                FadeTransition hideEditorRootTransition = new FadeTransition(Duration.millis(500), start);
                hideEditorRootTransition.setFromValue(1.0);
                hideEditorRootTransition.setToValue(0.0);

                FadeTransition showFileRootTransition = new FadeTransition(Duration.millis(500), Home);
                showFileRootTransition.setFromValue(0.0);
                showFileRootTransition.setToValue(1.0);
                hideEditorRootTransition.play();
                showFileRootTransition.play();
            }
        });

        //adding image to background
        Image image = new Image("file:start.jpg");
        ImageView img = new ImageView(image);
        img.setImage(image);
        img.setFitHeight(800);
        img.setFitWidth(800);

        Start.getChildren().addAll(img,start);
        startPane.getChildren().addAll(Start);

        //------------------------Home PAGE SET UP------------------------------------
        Button Savings_button = new Button();   //creating savings button in home page
        Savings_button.setText("Savings");
        Savings_button.setPrefHeight(50);
        Savings_button.setPrefWidth(150);
        Savings_button.setLayoutX(200);
        Savings_button.setLayoutY(100);
        Savings_button.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6;-fx-font-weight: bold;-fx-text-fill:#008080;");

        //set on action to savings button
        Savings_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Finance.fPane();
                Main.close();
            }
        });

        Button Loan_button = new Button();   //creating loan button in home page
        Loan_button.setText("Loan");
        Loan_button.setPrefWidth(150);
        Loan_button.setPrefHeight(50);
        Loan_button.setLayoutX(200);
        Loan_button.setLayoutY(150);
        Loan_button.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6;-fx-font-weight: bold;-fx-text-fill:#008080;");

        //set on action to loan button
        Loan_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Loan.layout1();
                Main.close();
            }
        });

        Button Mortgage_button = new Button();
        Mortgage_button.setText("Mortgage");
        Mortgage_button.setPrefHeight(50);
        Mortgage_button.setPrefWidth(150);
        Mortgage_button.setLayoutX(200);
        Mortgage_button.setLayoutY(200);
        Mortgage_button.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6;-fx-font-weight: bold;-fx-text-fill:#008080;");

        //set on action to Mortgage
        Mortgage_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Mortgage.layout1();
                Main.close();
            }
        });

        Button Compound_button = new Button();
        Compound_button.setText("Compound");
        Compound_button.setPrefWidth(150);
        Compound_button.setPrefHeight(50);
        Compound_button.setLayoutX(200);
        Compound_button.setLayoutY(250);
        Compound_button.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6;-fx-font-weight: bold;-fx-text-fill:#008080;");

        //set on action to Compound
        Compound_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Compound.Layout1();
                Main.close();
            }
        });

        Button Help_button = new Button();
        Help_button.setText("Help");
        Help_button.setPrefWidth(150);
        Help_button.setPrefHeight(50);
        Help_button.setLayoutX(200);
        Help_button.setLayoutY(350);
        Help_button.setStyle("-fx-font: 15 Bahnschrift; -fx-base: #c2d6d6; -fx-font-weight: bold;-fx-text-fill:#008080;");

        //set on action to Help
        Help_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Help.help();
                Main.close(); //setting up set on action for back to start button
            }
        });

        //Setting title for home window
        Label lb1 = new Label("Financial Calculator");
        lb1.setFont(Font.font(30));
        lb1.setLayoutX(150);
        lb1.setLayoutY(35);
        lb1.setStyle("-fx-text-fill:white; -fx-font-weight: bold;");

        //.getChildren() method is used to get the children components.
        //using .addAll() we can add new components in the list
        Home.getChildren().addAll(Savings_button,Loan_button,Mortgage_button,Compound_button,Help_button,lb1);

        Scene scene = new Scene(startPane);  //creating new scene
        Main.setScene(scene);   //set the scene
        Main.show();
        Main.setHeight(555);
        Main.setWidth(550);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root2 = new Pane();
        Main.show();
    }
}