package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static java.lang.Math.pow;

public class Mortgage {

    public static Pane layout1() {
        Stage window = new Stage();
        window.setTitle("Mortgage");    //setting a title for mortgage window

        //Creating and stying the buttons
        Button button = new Button();
        button.setText("Calculate");
        button.setPrefWidth(90);
        button.setPrefHeight(40);
        button.setLayoutX(21);
        button.setLayoutY(220);
        button.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating back to start button for go back to the start window from a calculator window
        Button Back = new Button();
        Back.setText("Back to start");
        Back.setPrefWidth(110);
        Back.setPrefHeight(40);
        Back.setLayoutX(235);
        Back.setLayoutY(220);
        Back.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //adding help button
        Button help = new Button();
        help.setPrefWidth(70);
        help.setPrefHeight(40);
        help.setLayoutX(355);
        help.setLayoutY(220);
        help.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //button icon and set on action for help button
        Image img2 = new Image("file:Help.png");
        ImageView view2 = new ImageView(img2);
        view2.setFitHeight(30);
        view2.setPreserveRatio(true);
        help.setGraphic(view2);

        //connecting Mortgage calculator window with help window(setting up set on action for help button)
        help.setOnAction(e -> {
            Help.help();

        });

        //Creating textfield
        TextField tf1 = new TextField();
        tf1.setLayoutX(178);
        tf1.setLayoutY(45);

        TextField tf2 = new TextField();
        tf2.setLayoutX(178);
        tf2.setLayoutY(85);

        TextField tf3 = new TextField();
        tf3.setLayoutX(178);
        tf3.setLayoutY(125);

        TextField tf4 = new TextField();
        tf4.setLayoutX(178);
        tf4.setLayoutY(165);
        tf4.setPromptText("%");

        //Creating and stying Labels
        Label lb1 = new Label("Home Price");
        lb1.setLayoutX(20);
        lb1.setLayoutY(50);

        Label lb2 = new Label("Down payment");
        lb2.setLayoutX(20);
        lb2.setLayoutY(90);

        Label lb3 = new Label("Loan term");
        lb3.setLayoutX(20);
        lb3.setLayoutY(130);

        Label lb4 = new Label("Interest Rate");
        lb4.setLayoutX(20);
        lb4.setLayoutY(170);

        Label lb5 = new Label("Monthly payment");
        lb5.setLayoutX(20);
        lb5.setLayoutY(320);
        lb5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Label lb6 = new Label();
        lb6.setLayoutX(178);
        lb6.setLayoutY(320);
        lb6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //Inserting background image
        Image image = new Image("file:Mort.jpg");
        ImageView img = new ImageView(image);
        img.setImage(image);
        img.setFitHeight(800);
        img.setFitWidth(800);

        //setting up the Mortgage calculations for calculation button (set on action)
        button.setOnAction(e -> {
            try {
            double n=12;
            double num1 = Double.parseDouble(tf1.getText());  //Home Price
            double num2 = Double.parseDouble(tf3.getText());  //Down payment
            double num3 = Double.parseDouble(tf4.getText());  //Loan term
            double num4=  Double.parseDouble(tf2.getText());  //Interest Rate
            double num5=  num1-num4;

            double result;
            result=((num3/n)/100* num5)/(1 - pow((1 +(num3/n)/100 ), -n*num2));
            lb6.setText(String.format("%.2f",result)+ "$");
            /*checking the input type using try and catch if the input isn't belongs
             to the expected type(integer) it will display error message */
            }catch (Exception exception){
                lb6.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //adding clear buttons to clear all the text fields at the same time
        Button clear = new Button("Clear");
        clear.setLayoutX(130);
        clear.setLayoutY(220);
        clear.setPrefWidth(90);
        clear.setPrefHeight(40);
        clear.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //set on action for clear button
        clear.setOnAction(event -> {
            tf1.clear();
            tf2.clear();
            tf3.clear();
            tf4.clear();
        });

        Back.setOnAction(event -> {
            window.close(); //setting up set on action for back to start button
            Main.show();
        });

        //------------------------ON SCREEN KEYBOARD-------------------------------
        //Creating buttons for keypad
        Button button1 = new Button("1");
        button1.setPrefWidth(90);
        button1.setLayoutX(450);
        button1.setLayoutY(50);
        button1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button2 = new Button("2");
        button2.setPrefWidth(90);
        button2.setLayoutX(550);
        button2.setLayoutY(50);
        button2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button3 = new Button("3");
        button3.setPrefWidth(90);
        button3.setLayoutX(650);
        button3.setLayoutY(50);
        button3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button4 = new Button("4");
        button4.setPrefWidth(90);
        button4.setLayoutX(450);
        button4.setLayoutY(90);
        button4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button5 = new Button("5");
        button5.setPrefWidth(90);
        button5.setLayoutX(550);
        button5.setLayoutY(90);
        button5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button6 = new Button("6");
        button6.setPrefWidth(90);
        button6.setLayoutX(650);
        button6.setLayoutY(90);
        button6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button7 = new Button("7");
        button7.setPrefWidth(90);
        button7.setLayoutX(450);
        button7.setLayoutY(130);
        button7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button8 = new Button("8");
        button8.setPrefWidth(90);
        button8.setLayoutX(550);
        button8.setLayoutY(130);
        button8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button button9 = new Button("9");
        button9.setPrefWidth(90);
        button9.setLayoutX(650);
        button9.setLayoutY(130);
        button9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buttonMin = new Button("-");
        buttonMin.setPrefWidth(90);
        buttonMin.setLayoutX(450);
        buttonMin.setLayoutY(170);
        buttonMin.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #d1d1e0; -fx-font-weight: bold;");

        Button button0 = new Button("0");
        button0.setPrefWidth(90);
        button0.setLayoutX(550);
        button0.setLayoutY(170);
        button0.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buttonDec = new Button(".");
        buttonDec.setPrefWidth(90);
        buttonDec.setLayoutX(650);
        buttonDec.setLayoutY(170);
        buttonDec.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buttonDelete = new Button("Back Space");
        buttonDelete.setPrefWidth(288);
        buttonDelete.setLayoutX(450);
        buttonDelete.setLayoutY(210);
        buttonDelete.setStyle("-fx-font: 16 Bahnschrift; -fx-base:#ff8080; -fx-font-weight: bold;");

        /*Lambda function is used to provide the implementation of a functional interface.
        * by using this function we can save lot of code(minimal the code) */

        //setting set on actions for buttons in keyboard(text field1)
        tf1.setOnMouseClicked(event -> {
            button0.setOnAction(event148 -> tf1.setText(tf1.getText() + "0"));
            button1.setOnAction(event147 -> tf1.setText(tf1.getText() + "1"));
            button2.setOnAction(event146 -> tf1.setText(tf1.getText() + "2"));
            button3.setOnAction(event145 -> tf1.setText(tf1.getText() + "3"));
            button4.setOnAction(event144 -> tf1.setText(tf1.getText() + "4"));
            button5.setOnAction(event143 -> tf1.setText(tf1.getText() + "5"));
            button6.setOnAction(event142 -> tf1.setText(tf1.getText() + "6"));
            button7.setOnAction(event141 -> tf1.setText(tf1.getText() + "7"));
            button8.setOnAction(event140 -> tf1.setText(tf1.getText() + "8"));
            button9.setOnAction(event139 -> tf1.setText(tf1.getText() + "9"));
            buttonMin.setOnAction(event138 -> tf1.setText(tf1.getText() + "-"));
            buttonDec.setOnAction(event137 -> tf1.setText(tf1.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf1.setText(tf1.getText().substring(0,tf1.getText().length()-1)));   //Setting back space for text field
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf2.setOnMouseClicked(event -> {
            button0.setOnAction(event136 -> tf2.setText(tf2.getText() + "0"));
            button1.setOnAction(event135 -> tf2.setText(tf2.getText() + "1"));
            button2.setOnAction(event134 -> tf2.setText(tf2.getText() + "2"));
            button3.setOnAction(event133 -> tf2.setText(tf2.getText() + "3"));
            button4.setOnAction(event132 -> tf2.setText(tf2.getText() + "4"));
            button5.setOnAction(event131 -> tf2.setText(tf2.getText() + "5"));
            button6.setOnAction(event130 -> tf2.setText(tf2.getText() + "6"));
            button7.setOnAction(event129 -> tf2.setText(tf2.getText() + "7"));
            button8.setOnAction(event128 -> tf2.setText(tf2.getText() + "8"));
            button9.setOnAction(event127 -> tf2.setText(tf2.getText() + "9"));
            buttonMin.setOnAction(event126 -> tf2.setText(tf2.getText() + "-"));
            buttonDec.setOnAction(event125 -> tf2.setText(tf2.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf2.setText(tf2.getText().substring(0,tf2.getText().length()-1)));   //Setting back space for text field
        });

        //setting set on actions for buttons in keyboard(text field3)
        tf3.setOnMouseClicked(event -> {
            button0.setOnAction(event124 -> tf3.setText(tf3.getText() + "0"));
            button1.setOnAction(event123 -> tf3.setText(tf3.getText() + "1"));
            button2.setOnAction(event122 -> tf3.setText(tf3.getText() + "2"));
            button3.setOnAction(event121 -> tf3.setText(tf3.getText() + "3"));
            button4.setOnAction(event120 -> tf3.setText(tf3.getText() + "4"));
            button5.setOnAction(event119 -> tf3.setText(tf3.getText() + "5"));
            button6.setOnAction(event118 -> tf3.setText(tf3.getText() + "6"));
            button7.setOnAction(event117 -> tf3.setText(tf3.getText() + "7"));
            button8.setOnAction(event116 -> tf3.setText(tf3.getText() + "8"));
            button9.setOnAction(event115 -> tf3.setText(tf3.getText() + "9"));
            buttonMin.setOnAction(event114 -> tf3.setText(tf3.getText() + "-"));
            buttonDec.setOnAction(event113 -> tf3.setText(tf3.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf3.setText(tf3.getText().substring(0,tf3.getText().length()-1)));   //Setting back space for text field
        });

        //setting set on actions for buttons in keyboard(text field4)
        tf4.setOnMouseClicked(event -> {
            button0.setOnAction(event112 -> tf4.setText(tf4.getText() + "0"));
            button1.setOnAction(event111 -> tf4.setText(tf4.getText() + "1"));
            button2.setOnAction(event110 -> tf4.setText(tf4.getText() + "2"));
            button3.setOnAction(event19 -> tf4.setText(tf4.getText() + "3"));
            button4.setOnAction(event18 -> tf4.setText(tf4.getText() + "4"));
            button5.setOnAction(event17 -> tf4.setText(tf4.getText() + "5"));
            button6.setOnAction(event16 -> tf4.setText(tf4.getText() + "6"));
            button7.setOnAction(event15 -> tf4.setText(tf4.getText() + "7"));
            button8.setOnAction(event14 -> tf4.setText(tf4.getText() + "8"));
            button9.setOnAction(event13 -> tf4.setText(tf4.getText() + "9"));
            buttonMin.setOnAction(event12 -> tf4.setText(tf4.getText() + "-"));
            buttonDec.setOnAction(event1 -> tf4.setText(tf4.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf4.setText(tf4.getText().substring(0,tf4.getText().length()-1)));   //Setting back space for text field
        });

        Pane layout1 = new Pane();    //creating a new pane

        //setting up the background for layout1
        layout1.setBackground(new Background(new BackgroundFill(Color.rgb(204, 204, 204), CornerRadii.EMPTY, Insets.EMPTY)));

        //.getChildren() method is used to get the children components.
        //using .addAll() we can add new components in the list
        layout1.getChildren().addAll(img, Back, lb1, lb2, lb3, lb4, lb5, lb6, tf1, tf2, tf3, tf4, button, clear,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonDec,buttonDelete,buttonMin,help);

        Scene scene = new Scene(layout1);   //creating a new scene
        window.setScene(scene); //set the scene
        window.show();
        window.setHeight(450);
        window.setWidth(768);

        return layout1; //returning layout1

    }
}