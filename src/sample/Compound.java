package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Compound {

    public static Pane Layout1() {
        Stage window = new Stage();
        window.setTitle("Compound Interest Savings");        //setting a title for compound window

        //creating button for calculations
        Button button = new Button();
        button.setText("Calculate");
        button.setPrefWidth(80);
        button.setPrefHeight(40);
        button.setLayoutX(21);
        button.setLayoutY(220);
        button.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //Back to start button
        Button Back = new Button();
        Back.setText("Back to start");
        Back.setPrefWidth(110);
        Back.setPrefHeight(40);
        Back.setLayoutX(230);
        Back.setLayoutY(220);
        Back.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //adding help button
        Button help = new Button();
        help.setPrefWidth(80);
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

        //connecting Compound calculator window with help window(setting up set on action for help button)
        help.setOnAction(e -> {
            Help.help();
        });

        //creating text field
        TextField tf1 = new TextField();
        tf1.setLayoutX(182);
        tf1.setLayoutY(45);

        TextField tf2 = new TextField();
        tf2.setLayoutX(182);
        tf2.setLayoutY(85);

        TextField tf3 = new TextField();
        tf3.setLayoutX(182);
        tf3.setLayoutY(125);

        TextField tf4 = new TextField();
        tf4.setLayoutX(182);
        tf4.setLayoutY(165);

        //creating labels
        Label lb1 = new Label("Principal Amount (P)");
        lb1.setLayoutX(20);
        lb1.setLayoutY(50);

        Label lb2 = new Label("Interest Rate(Annually-R)");
        lb2.setLayoutX(20);
        lb2.setLayoutY(90);

        Label lb3 = new Label("Time (T)");
        lb3.setLayoutX(20);
        lb3.setLayoutY(130);
        tf3.setPromptText("Years");

        Label lb4 = new Label("Number of Time(N)");
        lb4.setLayoutX(20);
        lb4.setLayoutY(170);

        Label lb5 = new Label("Compound Interest");
        lb5.setLayoutX(20);
        lb5.setLayoutY(300);
        lb5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Label lb6 = new Label();
        lb6.setLayoutX(235);
        lb6.setLayoutY(300);
        lb6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //adding image
        Image image = new Image("file:BG6.jpg");
        ImageView img=new ImageView(image);
        img.setImage(image);
        img.setFitHeight(800);
        img.setFitWidth(800);

        button.setOnAction(e -> {
            try {
            //Principal Amount
            double P = Double.parseDouble(tf1.getText());   //Principal Amount (P)
            //Interest rate(Annually)
            double R = Double.parseDouble(tf2.getText())/100;   //Interest Rate(Annually-R)
            //Time
            double T = Double.parseDouble(tf3.getText());   //Time (T)
            //Number of Time
            double N = Double.parseDouble(tf4.getText());   //Number of Time(N)

            double result = P * Math.pow(1 + (R / N), N * T);
            double compound_interest = result - P;
            lb6.setText(String.format("%.2f",compound_interest)+ "$");
            /*checking the input type using try and catch if the input isn't belongs
            to the expected type(integer) it will display error message */
            }catch (Exception exception){
                lb6.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //adding clear button
        Button clear = new Button("Clear");
        clear.setLayoutX(130);
        clear.setLayoutY(220);
        clear.setPrefWidth(80);
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
            window.close();
            Main.show();  //setting up set on action for back to start button
        });

        //-------------------ON SCREEN KEYBOARD---------------------
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

        //setting set on actions for buttons in keyboard(text field1)
        tf1.setOnMouseClicked(event -> {
            button0.setOnAction(event112 -> tf1.setText(tf1.getText() + "0"));
            button1.setOnAction(event111 -> tf1.setText(tf1.getText() + "1"));
            button2.setOnAction(event110 -> tf1.setText(tf1.getText() + "2"));
            button3.setOnAction(event19 -> tf1.setText(tf1.getText() + "3"));
            button4.setOnAction(event18 -> tf1.setText(tf1.getText() + "4"));
            button5.setOnAction(event17 -> tf1.setText(tf1.getText() + "5"));
            button6.setOnAction(event16 -> tf1.setText(tf1.getText() + "6"));
            button7.setOnAction(event15 -> tf1.setText(tf1.getText() + "7"));
            button8.setOnAction(event14 -> tf1.setText(tf1.getText() + "8"));
            button9.setOnAction(event13 -> tf1.setText(tf1.getText() + "9"));
            buttonMin.setOnAction(event12 -> tf1.setText(tf1.getText() + "-"));
            buttonDec.setOnAction(event1 -> tf1.setText(tf1.getText() + "."));
            //Setting back space for text field
            buttonDelete.setOnAction(event1 -> tf1.setText(tf1.getText().substring(0,tf1.getText().length()-1)));
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
            //Setting back space for text field
            buttonDelete.setOnAction(event1 -> tf2.setText(tf2.getText().substring(0,tf2.getText().length()-1)));
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
            //Setting back space for text field
            buttonDelete.setOnAction(event1 -> tf3.setText(tf3.getText().substring(0,tf3.getText().length()-1)));
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
            //Setting backspace for text field
            buttonDelete.setOnAction(event1 -> tf4.setText(tf4.getText().substring(0,tf4.getText().length()-1)));
        });

        Pane layout1 = new Pane(); //creating a new Pane
        layout1.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));

        //.getChildren() method is used to get the children components.
        //using .addAll() we can add new components in the list
        layout1.getChildren().addAll(img,Back,lb1, lb2, lb3, lb4, lb5,lb6, tf1,tf2, tf3,tf4,button,clear,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonDec,buttonDelete,buttonMin,help);

        Scene scene = new Scene(layout1);   //creating new scene
        window.setScene(scene);     //set scene
        window.show();
        window.setHeight(450);
        window.setWidth(768);

        return layout1;
    }
}
