package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Finance {

    public static Pane fPane() {
        Stage window = new Stage();
        window.setTitle("Finance");     //setting a title for Finance window

        //-----------future value calculations-----------------
        //creating a button for calculate
        Button button = new Button();
        button.setText("Calculate");
        button.setPrefWidth(90);
        button.setPrefHeight(40);
        button.setLayoutX(21);
        button.setLayoutY(230);
        button.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");  //stying the buttons

        //creating a button for clear
        Button clear = new Button();
        clear.setPrefWidth(90);
        clear.setPrefHeight(40);
        clear.setText("clear");
        clear.setLayoutX(130);
        clear.setLayoutY(230);
        clear.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        Button Back1 = new Button();
        Back1.setText("Back to start");
        Back1.setPrefWidth(110);        //back button
        Back1.setPrefHeight(40);
        Back1.setLayoutX(235);
        Back1.setLayoutY(230);
        Back1.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //adding help button
        Button help = new Button();
        help.setPrefWidth(70);
        help.setPrefHeight(40);     //help button
        help.setLayoutX(355);
        help.setLayoutY(271);
        help.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //button icon and set on action for help button
        Image img2 = new Image("file:Help.png");
        ImageView view2 = new ImageView(img2);
        view2.setFitHeight(30);
        view2.setPreserveRatio(true);
        help.setGraphic(view2);

        help.setOnAction(e -> {
            Help.help();
        });

        //creating text field for finance calculations
        TextField tf1 = new TextField();
        tf1.setLayoutX(178);
        tf1.setLayoutY(45);

        TextField tf2 = new TextField();
        tf2.setLayoutX(178);
        tf2.setLayoutY(85);

        TextField tf3 = new TextField();
        tf3.setLayoutX(178);
        tf3.setLayoutY(125);
        tf3.setPromptText("%");

        TextField tf4 = new TextField();
        tf4.setLayoutX(178);
        tf4.setLayoutY(165);

        //creating label for finance calculations
        Label lb1 = new Label("N (# of periods)");
        lb1.setLayoutX(20);
        lb1.setLayoutY(50);

        Label lb2 = new Label("Start Principal");
        lb2.setLayoutX(20);
        lb2.setLayoutY(90);

        Label lb3 = new Label("I/Y (Interest)");
        lb3.setLayoutX(20);
        lb3.setLayoutY(130);

        Label lb4 = new Label("PMT(Annuity Payment)");
        lb4.setLayoutX(20);
        lb4.setLayoutY(170);

        Label lb5 = new Label("Future Value is");
        lb5.setLayoutX(20);
        lb5.setLayoutY(280);
        lb5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //label for getting output
        Label lbE = new Label("");
        lbE.setLayoutX(140);
        lbE.setLayoutY(280);
        lbE.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //--------------------PMT calculations---------------------
        //creating a button for calculations
        Button Key1 = new Button();
        Key1.setText("Calculate");
        Key1.setPrefWidth(90);
        Key1.setPrefHeight(40);
        Key1.setLayoutX(21);
        Key1.setLayoutY(230);
        Key1.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating a clear button
        Button clear1 = new Button();
        clear1.setText("Clear");
        clear1.setPrefWidth(90);
        clear1.setPrefHeight(40);
        clear1.setLayoutX(130);
        clear1.setLayoutY(230);
        clear1.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        Button Back2 = new Button();
        Back2.setText("Back to start");
        Back2.setPrefWidth(110);
        Back2.setPrefHeight(40);
        Back2.setLayoutX(235);
        Back2.setLayoutY(230);
        Back2.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating text field for PMT calculations
        TextField tf5 = new TextField();
        tf5.setLayoutX(178);
        tf5.setLayoutY(45);

        TextField tf6 = new TextField();
        tf6.setLayoutX(178);
        tf6.setLayoutY(85);

        TextField tf7 = new TextField();
        tf7.setLayoutX(178);
        tf7.setLayoutY(125);

        TextField tf8 = new TextField();
        tf8.setLayoutX(178);
        tf8.setLayoutY(165);
        tf8.setPromptText("%");

        //creating labels for PMT calculations
        Label lb6 = new Label("FV (Future Value)");
        lb6.setLayoutX(20);
        lb6.setLayoutY(50);

        Label lb7 = new Label("N (# of periods)");
        lb7.setLayoutX(20);
        lb7.setLayoutY(90);

        Label lb8 = new Label("Start Principal");
        lb8.setLayoutX(20);
        lb8.setLayoutY(130);

        Label lb9 = new Label("I/Y (Interest)");
        lb9.setLayoutX(20);
        lb9.setLayoutY(170);

        Label lbO1 = new Label("PMT is ");
        lbO1.setLayoutX(20);
        lbO1.setLayoutY(280);
        lbO1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //label for getting output
        Label lbE1 = new Label("");
        lbE1.setLayoutX(140);
        lbE1.setLayoutY(280);
        lbE1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //-------------------------------Interest rate calculations---------------------------
        //creating a button for calculations
        Button key2 = new Button();
        key2.setText("Calculate");
        key2.setPrefWidth(90);
        key2.setPrefHeight(40);
        key2.setLayoutX(21);
        key2.setLayoutY(230);
        key2.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating a clear button
        Button clear2 = new Button();
        clear2.setText("Clear");
        clear2.setPrefWidth(90);
        clear2.setPrefHeight(40);
        clear2.setLayoutX(130);
        clear2.setLayoutY(230);
        clear2.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        Button Back3 = new Button();
        Back3.setText("Back to start");
        Back3.setPrefWidth(110);
        Back3.setPrefHeight(40);
        Back3.setLayoutX(235);
        Back3.setLayoutY(230);
        Back3.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating text fields for interest rate
        TextField tf9 = new TextField();
        tf9.setLayoutX(178);
        tf9.setLayoutY(45);

        TextField tf10 = new TextField();
        tf10.setLayoutX(178);
        tf10.setLayoutY(85);

        TextField tf11 = new TextField();
        tf11.setLayoutX(178);
        tf11.setLayoutY(125);

        TextField tf12 = new TextField();
        tf12.setLayoutX(178);
        tf12.setLayoutY(165);

        //creating labels for interst rate
        Label lb10 = new Label("FV (Future Value)");
        lb10.setLayoutX(20);
        lb10.setLayoutY(50);

        Label lb11 = new Label("N (# of periods)");
        lb11.setLayoutX(20);
        lb11.setLayoutY(90);

        Label lb12 = new Label("Start Principal");
        lb12.setLayoutX(20);
        lb12.setLayoutY(130);

        Label lb13 = new Label("PMT (Annuity Payment)");
        lb13.setLayoutX(20);
        lb13.setLayoutY(170);

        Label lbO2 = new Label("Interest is");
        lbO2.setLayoutX(20);
        lbO2.setLayoutY(280);
        lbO2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //label for getting outputs
        Label lbE2 = new Label("");
        lbE2.setLayoutX(140);
        lbE2.setLayoutY(280);
        lbE2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //------------------------------Number of period calculations--------------------
        //creating a new button for calculations
        Button key3 = new Button();
        key3.setText("Calculate");
        key3.setPrefWidth(90);
        key3.setPrefHeight(40);
        key3.setLayoutX(21);
        key3.setLayoutY(230);
        key3.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating a clear button
        Button clear3 = new Button();
        clear3.setText("Clear");
        clear3.setPrefWidth(90);
        clear3.setPrefHeight(40);
        clear3.setLayoutX(130);
        clear3.setLayoutY(230);
        clear3.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        Button Back4 = new Button();
        Back4.setText("Back to start");
        Back4.setPrefWidth(110);
        Back4.setPrefHeight(40);
        Back4.setLayoutX(235);
        Back4.setLayoutY(230);
        Back4.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating text fields for Number of period calculations
        TextField tf13 = new TextField();
        tf13.setLayoutX(178);
        tf13.setLayoutY(45);
        tf13.setPromptText("%");

        TextField tf14 = new TextField();
        tf14.setLayoutX(178);
        tf14.setLayoutY(85);

        TextField tf15 = new TextField();
        tf15.setLayoutX(178);
        tf15.setLayoutY(125);

        TextField tf16 = new TextField();
        tf16.setLayoutX(178);
        tf16.setLayoutY(165);

        //creating labels for Number of period calculations
        Label lb14 = new Label("I/Y (Interest)");
        lb14.setLayoutX(20);
        lb14.setLayoutY(50);

        Label lb15 = new Label("Future value");
        lb15.setLayoutX(20);
        lb15.setLayoutY(90);

        Label lb16 = new Label("Start Principal");
        lb16.setLayoutX(20);
        lb16.setLayoutY(130);

        Label lb17 = new Label("PMT (Annuity Payment)");
        lb17.setLayoutX(20);
        lb17.setLayoutY(170);

        Label lbO3 = new Label("Number of period is ");
        lbO3.setLayoutX(20);
        lbO3.setLayoutY(280);
        lbO3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //label for getting output
        Label lbE3 = new Label("");
        lbE3.setLayoutX(190);
        lbE3.setLayoutY(280);
        lbE3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //----------------------------Start principals calculations--------------------
        //creating a butoon for calculations
        Button key4 = new Button();
        key4.setText("Calculate");
        key4.setPrefWidth(90);
        key4.setPrefHeight(40);
        key4.setLayoutX(21);
        key4.setLayoutY(230);
        key4.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating a button called calculations
        Button clear4 = new Button();
        clear4.setText("Clear");
        clear4.setPrefWidth(90);
        clear4.setPrefHeight(40);
        clear4.setLayoutX(130);
        clear4.setLayoutY(230);
        clear4.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        Button Back5 = new Button();
        Back5.setText("Back to start");
        Back5.setPrefWidth(110);
        Back5.setPrefHeight(40);
        Back5.setLayoutX(235);
        Back5.setLayoutY(230);
        Back5.setStyle("-fx-font: 14 Bahnschrift; -fx-base: #c2d6d6;");

        //creating text fields for Start principals calculations
        TextField tf17 = new TextField();
        tf17.setLayoutX(178);
        tf17.setLayoutY(45);
        tf17.setPromptText("%");

        TextField tf18 = new TextField();
        tf18.setLayoutX(178);
        tf18.setLayoutY(85);

        TextField tf19 = new TextField();
        tf19.setLayoutX(178);
        tf19.setLayoutY(125);

        TextField tf20 = new TextField();
        tf20.setLayoutX(178);
        tf20.setLayoutY(165);

        //creating labels for Start principals calculations
        Label lb18 = new Label("I/Y (Interest rate)");
        lb18.setLayoutX(20);
        lb18.setLayoutY(50);

        Label lb19 = new Label("Future value");
        lb19.setLayoutX(20);
        lb19.setLayoutY(90);

        Label lb20 = new Label("N (# of periods)");
        lb20.setLayoutX(20);
        lb20.setLayoutY(130);

        Label lb21 = new Label("PMT (Annuity Payment)");
        lb21.setLayoutX(20);
        lb21.setLayoutY(170);

        Label lbO4 = new Label("Start Principal");
        lbO4.setLayoutX(20);
        lbO4.setLayoutY(280);
        lbO4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //label for getting output
        Label lbE4 = new Label("");
        lbE4.setLayoutX(140);
        lbE4.setLayoutY(280);
        lbE4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        //creating tab pane
        TabPane tabPane = new TabPane();

        //creating tabs
        Tab tab1 = new Tab("FV");
        tab1.setClosable(false);
        Tab tab2 = new Tab("PMT");
        tab2.setClosable(false);
        Tab tab3 = new Tab("I/Y");
        tab3.setClosable(false);
        Tab tab4 = new Tab("N" );
        tab4.setClosable(false);
        Tab tab5 = new Tab("Start Principal");
        tab5.setClosable(false);

        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);
        tabPane.getTabs().add(tab5);

        //inserting image for background
        Image image = new Image("file:BG.jpeg");
        ImageView img=new ImageView(image);
        Group rt= new Group();
        rt.getChildren().addAll(img);

        //set on actions and calculations for calculation buttons
        //-----savings(FV)------
        button.setOnAction(event -> {
            try {
            double n = 12;
            double number1 = Double.parseDouble(tf1.getText()); //number of period
            double number2 = Double.parseDouble(tf2.getText()); //start principal
            double number3 = Double.parseDouble(tf3.getText())/100; //Interest rate
            double number4 = Double.parseDouble(tf4.getText()); //PMT

            double result;
            result = (number4*(((pow((1+(number3/n)),(n*number1))-1))/(number3/n))+(number2*(pow((1+(number3/n)),(n*number1)))));
            lbE.setText(String.format("%.2f",result)+ "$");
                //checking the input type using try and catch if the input isn't belongs to the relavent type it will display error message
            }catch (Exception exception){
                lbE.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //------PMT-------
        Key1.setOnAction(event -> {
            try {
            double n = 12;
            double number5 = Double.parseDouble(tf5.getText()); //FV
            double number6 = Double.parseDouble(tf6.getText()); //Number of period
            double number7 = Double.parseDouble(tf7.getText()); //Start principal
            double number8 = Double.parseDouble(tf8.getText())/100; //Interest

            double result1;
            result1 = (number5-(number7*pow((1+(number8/n)),(n*number6))))/((pow((1+(number8/n)),(n*number6))-1)/(number8/n));
            lbE1.setText(String.format("%.2f",result1)+ "$");
            }catch (Exception exception){
                lbE1.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //------Interest rate----
        key2.setOnAction(event -> {
            try {
            double n = 12;
            double number9 = Double.parseDouble(tf9.getText());
            double number10 = Double.parseDouble(tf10.getText());
            double number11 = Double.parseDouble(tf11.getText());

            double result2;
            result2 = n*(pow((number9/number11),(1/(n*number10)))-1);
            lbE2.setText(String.format("%.2f",result2));
            }catch (Exception exception){
                lbE2.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //-----number of periods----
        key3.setOnAction(event -> {
            try {
            double n = 12;
            double number13 = Double.parseDouble(tf13.getText())/100;
            double number14= Double.parseDouble(tf14.getText());
            double number15= Double.parseDouble(tf15.getText());
            double number16= Double.parseDouble(tf16.getText());

            double result3;
            result3 =log((number14+(number16*12/number13))/(number15+(number16*12/number13)))/(log(1+(number13/12))*12);
            lbE3.setText(String.format("%.0f",result3)+ "years");
            }catch (Exception exception){
                lbE3.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //------start principal-------
        key4.setOnAction(event -> {
            try {
            double n = 12;
            double number17 = Double.parseDouble(tf17.getText())/100;
            double number18= Double.parseDouble(tf18.getText());
            double number19= Double.parseDouble(tf19.getText());
            double number20= Double.parseDouble(tf20.getText());

            double result4;
            result4 = (number18-(number20*((pow((1+(number17/n)),(n*number19))-1)/(number17/n))))/(pow((1+(number17/n)),(n*number19)));
            lbE4.setText(String.format("%.2f",result4 )+ "$");
            }catch (Exception exception){
                lbE4.setText("< < <----- Type error! please enter integer value -----> > >");
            }
        });

        //set on action for clear buttons (finance,PMT,interest,number of periods, saving principals )
        clear.setOnAction(event -> {
            tf1.clear();
            tf2.clear();
            tf3.clear();
            tf4.clear();
        });

        clear1.setOnAction(event -> {
            tf5.clear();
            tf6.clear();
            tf7.clear();
            tf8.clear();
        });

        clear2.setOnAction(event -> {
            tf9.clear();
            tf10.clear();
            tf11.clear();
            tf12.clear();
        });

        clear3.setOnAction(event -> {
            tf13.clear();
            tf14.clear();
            tf15.clear();
            tf16.clear();
        });

        clear4.setOnAction(event -> {
            tf17.clear();
            tf18.clear();
            tf19.clear();
            tf20.clear();
        });

        Back1.setOnAction(event -> {
            window.close();
            Main.show();
        });

        Back2.setOnAction(event -> {
            window.close();
            Main.show();
        });

        Back3.setOnAction(event -> {
            window.close();
            Main.show();
        });

        Back4.setOnAction(event -> {
            window.close();
            Main.show();
        });

        Back5.setOnAction(event -> {
            window.close();
            Main.show();
        });

        //------------------------ON SCREEN KEYBOARD(FINANCE)-------------------------------
        //Creating buttons for keypad
        Button key11 = new Button("1");
        key11.setPrefWidth(90);
        key11.setLayoutX(450);
        key11.setLayoutY(50);
        key11.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key22 = new Button("2");
        key22.setPrefWidth(90);
        key22.setLayoutX(550);
        key22.setLayoutY(50);
        key22.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key33 = new Button("3");
        key33.setPrefWidth(90);
        key33.setLayoutX(650);
        key33.setLayoutY(50);
        key33.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key44 = new Button("4");
        key44.setPrefWidth(90);
        key44.setLayoutX(450);
        key44.setLayoutY(90);
        key44.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key5 = new Button("5");
        key5.setPrefWidth(90);
        key5.setLayoutX(550);
        key5.setLayoutY(90);
        key5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key6 = new Button("6");
        key6.setPrefWidth(90);
        key6.setLayoutX(650);
        key6.setLayoutY(90);
        key6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key7 = new Button("7");
        key7.setPrefWidth(90);
        key7.setLayoutX(450);
        key7.setLayoutY(130);
        key7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key8 = new Button("8");
        key8.setPrefWidth(90);
        key8.setLayoutX(550);
        key8.setLayoutY(130);
        key8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button key9 = new Button("9");
        key9.setPrefWidth(90);
        key9.setLayoutX(650);
        key9.setLayoutY(130);
        key9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

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
            button0.setOnAction(event1240 -> tf1.setText(tf1.getText() + "0"));
            key11.setOnAction(event1239 -> tf1.setText(tf1.getText() + "1"));
            key22.setOnAction(event1238 -> tf1.setText(tf1.getText() + "2"));
            key33.setOnAction(event1237 -> tf1.setText(tf1.getText() + "3"));
            key44.setOnAction(event1236 -> tf1.setText(tf1.getText() + "4"));
            key5.setOnAction(event1235 -> tf1.setText(tf1.getText() + "5"));
            key6.setOnAction(event1234 -> tf1.setText(tf1.getText() + "6"));
            key7.setOnAction(event1233 -> tf1.setText(tf1.getText() + "7"));
            key8.setOnAction(event1232 -> tf1.setText(tf1.getText() + "8"));
            key9.setOnAction(event1231 -> tf1.setText(tf1.getText() + "9"));
            buttonMin.setOnAction(event1230 -> tf1.setText(tf1.getText() + "-"));
            buttonDec.setOnAction(event1229 -> tf1.setText(tf1.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf1.setText(tf1.getText().substring(0,tf1.getText().length()-1)));   //Setting back space for text field
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf2.setOnMouseClicked(event -> {
            button0.setOnAction(event1228 -> tf2.setText(tf2.getText() + "0"));
            key11.setOnAction(event1227 -> tf2.setText(tf2.getText() + "1"));
            key22.setOnAction(event1226 -> tf2.setText(tf2.getText() + "2"));
            key33.setOnAction(event1225 -> tf2.setText(tf2.getText() + "3"));
            key44.setOnAction(event1224 -> tf2.setText(tf2.getText() + "4"));
            key5.setOnAction(event1223 -> tf2.setText(tf2.getText() + "5"));
            key6.setOnAction(event1222 -> tf2.setText(tf2.getText() + "6"));
            key7.setOnAction(event1221 -> tf2.setText(tf2.getText() + "7"));
            key8.setOnAction(event1220 -> tf2.setText(tf2.getText() + "8"));
            key9.setOnAction(event1219 -> tf2.setText(tf2.getText() + "9"));
            buttonMin.setOnAction(event1218 -> tf2.setText(tf2.getText() + "-"));
            buttonDec.setOnAction(event1217 -> tf2.setText(tf2.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf2.setText(tf2.getText().substring(0,tf2.getText().length()-1)));   //Setting back space for text field
        });

        //setting set on actions for buttons in keyboard(text field3)
        tf3.setOnMouseClicked(event -> {
            button0.setOnAction(event1216 -> tf3.setText(tf3.getText() + "0"));
            key11.setOnAction(event1215 -> tf3.setText(tf3.getText() + "1"));
            key22.setOnAction(event1214 -> tf3.setText(tf3.getText() + "2"));
            key33.setOnAction(event1213 -> tf3.setText(tf3.getText() + "3"));
            key44.setOnAction(event1212 -> tf3.setText(tf3.getText() + "4"));
            key5.setOnAction(event1211 -> tf3.setText(tf3.getText() + "5"));
            key6.setOnAction(event1210 -> tf3.setText(tf3.getText() + "6"));
            key7.setOnAction(event1209 -> tf3.setText(tf3.getText() + "7"));
            key8.setOnAction(event1208 -> tf3.setText(tf3.getText() + "8"));
            key9.setOnAction(event1207 -> tf3.setText(tf3.getText() + "9"));
            buttonMin.setOnAction(event1206 -> tf3.setText(tf3.getText() + "-"));
            buttonDec.setOnAction(event1205 -> tf3.setText(tf3.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf3.setText(tf3.getText().substring(0,tf3.getText().length()-1)));   //Setting back space for text field
        });

        tf4.setOnMouseClicked(event -> {
            button0.setOnAction(event1204 -> tf4.setText(tf4.getText() + "0"));
            key11.setOnAction(event1203 -> tf4.setText(tf4.getText() + "1"));
            key22.setOnAction(event1202 -> tf4.setText(tf4.getText() + "2"));
            key33.setOnAction(event1201 -> tf4.setText(tf4.getText() + "3"));
            key44.setOnAction(event1200 -> tf4.setText(tf4.getText() + "4"));
            key5.setOnAction(event1199 -> tf4.setText(tf4.getText() + "5"));
            key6.setOnAction(event1198 -> tf4.setText(tf4.getText() + "6"));
            key7.setOnAction(event1197 -> tf4.setText(tf4.getText() + "7"));
            key8.setOnAction(event1196 -> tf4.setText(tf4.getText() + "8"));
            key9.setOnAction(event1195 -> tf4.setText(tf4.getText() + "9"));
            buttonMin.setOnAction(event1194 -> tf4.setText(tf4.getText() + "-"));
            buttonDec.setOnAction(event1193 -> tf4.setText(tf4.getText() + "."));
            buttonDelete.setOnAction(event1 -> tf4.setText(tf4.getText().substring(0,tf4.getText().length()-1)));   //Setting back space for text field
        });

        Pane layout1 = new Pane(); //creating a new pane

        //Adding background colour and setting root
        layout1.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));
        layout1.getChildren().addAll(img,lb1,lb2,lb3,lb4,lb5,lbE,tf1,tf2,tf3,tf4,button,clear,Back1,button0,buttonDec,buttonDelete,buttonMin,key11,key22,key33,key44,key5,key6,key7,key8,key9);
        tab1.setContent(layout1);

        image = new Image("file:BG.jpeg");
        img = new ImageView(image);
        rt = new Group();               //adding image (background)
        rt.getChildren().addAll(img);

        //------------------------ON SCREEN KEYBOARD(FINANCE)(PMT)-------------------------------
        //Creating buttons for keypad
        Button btn1 = new Button("1");
        btn1.setPrefWidth(90);
        btn1.setLayoutX(450);
        btn1.setLayoutY(50);
        btn1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn2 = new Button("2");
        btn2.setPrefWidth(90);
        btn2.setLayoutX(550);
        btn2.setLayoutY(50);
        btn2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn3 = new Button("3");
        btn3.setPrefWidth(90);
        btn3.setLayoutX(650);
        btn3.setLayoutY(50);
        btn3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn4 = new Button("4");
        btn4.setPrefWidth(90);
        btn4.setLayoutX(450);
        btn4.setLayoutY(90);
        btn4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn5 = new Button("5");
        btn5.setPrefWidth(90);
        btn5.setLayoutX(550);
        btn5.setLayoutY(90);
        btn5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn6 = new Button("6");
        btn6.setPrefWidth(90);
        btn6.setLayoutX(650);
        btn6.setLayoutY(90);
        btn6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn7 = new Button("7");
        btn7.setPrefWidth(90);
        btn7.setLayoutX(450);
        btn7.setLayoutY(130);
        btn7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn8 = new Button("8");
        btn8.setPrefWidth(90);
        btn8.setLayoutX(550);
        btn8.setLayoutY(130);
        btn8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btn9 = new Button("9");
        btn9.setPrefWidth(90);
        btn9.setLayoutX(650);
        btn9.setLayoutY(130);
        btn9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btnMin = new Button("-");
        btnMin.setPrefWidth(90);
        btnMin.setLayoutX(450);
        btnMin.setLayoutY(170);
        btnMin.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #d1d1e0; -fx-font-weight: bold;");

        Button btn0 = new Button("0");
        btn0.setPrefWidth(90);
        btn0.setLayoutX(550);
        btn0.setLayoutY(170);
        btn0.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btnDec = new Button(".");
        btnDec.setPrefWidth(90);
        btnDec.setLayoutX(650);
        btnDec.setLayoutY(170);
        btnDec.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btnDelete = new Button("Back Space");
        btnDelete.setPrefWidth(288);
        btnDelete.setLayoutX(450);
        btnDelete.setLayoutY(210);
        btnDelete.setStyle("-fx-font: 16 Bahnschrift; -fx-base:#ff8080; -fx-font-weight: bold;");

        //setting set on actions for buttons in keyboard(text field1)
        tf5.setOnMouseClicked(event -> {
            btn0.setOnAction(event1192 -> tf5.setText(tf5.getText() + "0"));
            btn1.setOnAction(event1191 -> tf5.setText(tf5.getText() + "1"));
            btn2.setOnAction(event1190 -> tf5.setText(tf5.getText() + "2"));
            btn3.setOnAction(event1189 -> tf5.setText(tf5.getText() + "3"));
            btn4.setOnAction(event1188 -> tf5.setText(tf5.getText() + "4"));
            btn5.setOnAction(event1187 -> tf5.setText(tf5.getText() + "5"));
            btn6.setOnAction(event1186 -> tf5.setText(tf5.getText() + "6"));
            btn7.setOnAction(event1185 -> tf5.setText(tf5.getText() + "7"));
            btn8.setOnAction(event1184 -> tf5.setText(tf5.getText() + "8"));
            btn9.setOnAction(event1183 -> tf5.setText(tf5.getText() + "9"));
            btnMin.setOnAction(event1182 -> tf5.setText(tf5.getText() + "-"));
            btnDec.setOnAction(event1181 -> tf5.setText(tf5.getText() + "."));
            //Setting back space for text field
            btnDelete.setOnAction(event1 -> tf5.setText(tf5.getText().substring(0,tf5.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf6.setOnMouseClicked(event -> {
            btn0.setOnAction(event1180 -> tf6.setText(tf6.getText() + "0"));
            btn1.setOnAction(event1179 -> tf6.setText(tf6.getText() + "1"));
            btn2.setOnAction(event1178 -> tf6.setText(tf6.getText() + "2"));
            btn3.setOnAction(event1177 -> tf6.setText(tf6.getText() + "3"));
            btn4.setOnAction(event1176 -> tf6.setText(tf6.getText() + "4"));
            btn5.setOnAction(event1175 -> tf6.setText(tf6.getText() + "5"));
            btn6.setOnAction(event1174 -> tf6.setText(tf6.getText() + "6"));
            btn7.setOnAction(event1173 -> tf6.setText(tf6.getText() + "7"));
            btn8.setOnAction(event1172 -> tf6.setText(tf6.getText() + "8"));
            btn9.setOnAction(event1171 -> tf6.setText(tf6.getText() + "9"));
            btnMin.setOnAction(event1170 -> tf6.setText(tf6.getText() + "-"));
            btnDec.setOnAction(event1169 -> tf6.setText(tf6.getText() + "."));
            //Setting back space for text field
            btnDelete.setOnAction(event1 -> tf6.setText(tf6.getText().substring(0,tf6.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field3)
        tf7.setOnMouseClicked(event -> {
            btn0.setOnAction(event1168 -> tf7.setText(tf7.getText() + "0"));
            btn1.setOnAction(event1167 -> tf7.setText(tf7.getText() + "1"));
            btn2.setOnAction(event1166 -> tf7.setText(tf7.getText() + "2"));
            btn3.setOnAction(event1165 -> tf7.setText(tf7.getText() + "3"));
            btn4.setOnAction(event1164 -> tf7.setText(tf7.getText() + "4"));
            btn5.setOnAction(event1163 -> tf7.setText(tf7.getText() + "5"));
            btn6.setOnAction(event1162 -> tf7.setText(tf7.getText() + "6"));
            btn7.setOnAction(event1161 -> tf7.setText(tf7.getText() + "7"));
            btn8.setOnAction(event1160 -> tf7.setText(tf7.getText() + "8"));
            btn9.setOnAction(event1159 -> tf7.setText(tf7.getText() + "9"));
            btnMin.setOnAction(event1158 -> tf7.setText(tf7.getText() + "-"));
            btnDec.setOnAction(event1157 -> tf7.setText(tf7.getText() + "."));
            //Setting back space for text field
            btnDelete.setOnAction(event1 -> tf7.setText(tf7.getText().substring(0,tf7.getText().length()-1)));
        });

        tf8.setOnMouseClicked(event -> {
            btn0.setOnAction(event1156 -> tf8.setText(tf8.getText() + "0"));
            btn1.setOnAction(event1155 -> tf8.setText(tf8.getText() + "1"));
            btn2.setOnAction(event1154 -> tf8.setText(tf8.getText() + "2"));
            btn3.setOnAction(event1153 -> tf8.setText(tf8.getText() + "3"));
            btn4.setOnAction(event1152 -> tf8.setText(tf8.getText() + "4"));
            btn5.setOnAction(event1151 -> tf8.setText(tf8.getText() + "5"));
            btn6.setOnAction(event1150 -> tf8.setText(tf8.getText() + "6"));
            btn7.setOnAction(event1149 -> tf8.setText(tf8.getText() + "7"));
            btn8.setOnAction(event1148 -> tf8.setText(tf8.getText() + "8"));
            btn9.setOnAction(event1147 -> tf8.setText(tf8.getText() + "9"));
            btnMin.setOnAction(event1146 -> tf8.setText(tf8.getText() + "-"));
            btnDec.setOnAction(event1145 -> tf8.setText(tf8.getText() + "."));
            //Setting back space for text field
            btnDelete.setOnAction(event1 -> tf8.setText(tf8.getText().substring(0,tf8.getText().length()-1)));
        });

        Pane layout2 = new Pane();  //creating a new pane
        layout2.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));
        layout2.getChildren().addAll(img,lb6,lb7,lb8,lb9,lbO1,lbE1,tf5,tf6,tf7,tf8,Key1,clear1,Back2,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDec,btnDelete,btnMin);
        tab2.setContent(layout2);

        image = new Image("file:BG.jpeg");
        img = new ImageView(image);
        rt = new Group();              //adding image (background)
        rt.getChildren().addAll(img);

        //------------------------ON SCREEN KEYBOARD(FINANCE)( I/Y )-------------------------------
        //Creating buttons for keypad
        Button bt1 = new Button("1");
        bt1.setPrefWidth(90);
        bt1.setLayoutX(450);
        bt1.setLayoutY(50);
        bt1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt2 = new Button("2");
        bt2.setPrefWidth(90);
        bt2.setLayoutX(550);
        bt2.setLayoutY(50);
        bt2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt3 = new Button("3");
        bt3.setPrefWidth(90);
        bt3.setLayoutX(650);
        bt3.setLayoutY(50);
        bt3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt4 = new Button("4");
        bt4.setPrefWidth(90);
        bt4.setLayoutX(450);
        bt4.setLayoutY(90);
        bt4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt5 = new Button("5");
        bt5.setPrefWidth(90);
        bt5.setLayoutX(550);
        bt5.setLayoutY(90);
        bt5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt6 = new Button("6");
        bt6.setPrefWidth(90);
        bt6.setLayoutX(650);
        bt6.setLayoutY(90);
        bt6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt7 = new Button("7");
        bt7.setPrefWidth(90);
        bt7.setLayoutX(450);
        bt7.setLayoutY(130);
        bt7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt8 = new Button("8");
        bt8.setPrefWidth(90);
        bt8.setLayoutX(550);
        bt8.setLayoutY(130);
        bt8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bt9 = new Button("9");
        bt9.setPrefWidth(90);
        bt9.setLayoutX(650);
        bt9.setLayoutY(130);
        bt9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btMin = new Button("-");
        btMin.setPrefWidth(90);
        btMin.setLayoutX(450);
        btMin.setLayoutY(170);
        btMin.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #d1d1e0; -fx-font-weight: bold;");

        Button bt0 = new Button("0");
        bt0.setPrefWidth(90);
        bt0.setLayoutX(550);
        bt0.setLayoutY(170);
        bt0.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btDec = new Button(".");
        btDec.setPrefWidth(90);
        btDec.setLayoutX(650);
        btDec.setLayoutY(170);
        btDec.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button btDelete = new Button("Back Space");
        btDelete.setPrefWidth(288);
        btDelete.setLayoutX(450);
        btDelete.setLayoutY(210);
        btDelete.setStyle("-fx-font: 16 Bahnschrift; -fx-base:#ff8080; -fx-font-weight: bold;");

        //setting set on actions for buttons in keyboard(text field1)
        tf9.setOnMouseClicked(event -> {
            bt0.setOnAction(event1144 -> tf9.setText(tf9.getText() + "0"));
            bt1.setOnAction(event1143 -> tf9.setText(tf9.getText() + "1"));
            bt2.setOnAction(event1142 -> tf9.setText(tf9.getText() + "2"));
            bt3.setOnAction(event1141 -> tf9.setText(tf9.getText() + "3"));
            bt4.setOnAction(event1140 -> tf9.setText(tf9.getText() + "4"));
            bt5.setOnAction(event1139 -> tf9.setText(tf9.getText() + "5"));
            bt6.setOnAction(event1138 -> tf9.setText(tf9.getText() + "6"));
            bt7.setOnAction(event1137 -> tf9.setText(tf9.getText() + "7"));
            bt8.setOnAction(event1136 -> tf9.setText(tf9.getText() + "8"));
            bt9.setOnAction(event1135 -> tf9.setText(tf9.getText() + "9"));
            btMin.setOnAction(event1134 -> tf9.setText(tf9.getText() + "-"));
            btDec.setOnAction(event1133 -> tf9.setText(tf9.getText() + "."));
            //Setting back space for text field
            btDelete.setOnAction(event1 -> tf9.setText(tf9.getText().substring(0,tf9.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf10.setOnMouseClicked(event -> {
            bt0.setOnAction(event1132 -> tf10.setText(tf10.getText() + "0"));
            bt1.setOnAction(event1131 -> tf10.setText(tf10.getText() + "1"));
            bt2.setOnAction(event1130 -> tf10.setText(tf10.getText() + "2"));
            bt3.setOnAction(event1129 -> tf10.setText(tf10.getText() + "3"));
            bt4.setOnAction(event1128 -> tf10.setText(tf10.getText() + "4"));
            bt5.setOnAction(event1127 -> tf10.setText(tf10.getText() + "5"));
            bt6.setOnAction(event1126 -> tf10.setText(tf10.getText() + "6"));
            bt7.setOnAction(event1125 -> tf10.setText(tf10.getText() + "7"));
            bt8.setOnAction(event1124 -> tf10.setText(tf10.getText() + "8"));
            bt9.setOnAction(event1123 -> tf10.setText(tf10.getText() + "9"));
            btMin.setOnAction(event1122 -> tf10.setText(tf10.getText() + "-"));
            btDec.setOnAction(event1121 -> tf10.setText(tf10.getText() + "."));
            //Setting back space for text field
            btDelete.setOnAction(event1 -> tf10.setText(tf10.getText().substring(0,tf10.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field3)
        tf11.setOnMouseClicked(event -> {
            bt0.setOnAction(event1120 -> tf11.setText(tf11.getText() + "0"));
            bt1.setOnAction(event1119 -> tf11.setText(tf11.getText() + "1"));
            bt2.setOnAction(event1118 -> tf11.setText(tf11.getText() + "2"));
            bt3.setOnAction(event1117 -> tf11.setText(tf11.getText() + "3"));
            bt4.setOnAction(event1116 -> tf11.setText(tf11.getText() + "4"));
            bt5.setOnAction(event1115 -> tf11.setText(tf11.getText() + "5"));
            bt6.setOnAction(event1114 -> tf11.setText(tf11.getText() + "6"));
            bt7.setOnAction(event1113 -> tf11.setText(tf11.getText() + "7"));
            bt8.setOnAction(event1112 -> tf11.setText(tf11.getText() + "8"));
            bt9.setOnAction(event1111 -> tf11.setText(tf11.getText() + "9"));
            btMin.setOnAction(event1110 -> tf11.setText(tf11.getText() + "-"));
            btDec.setOnAction(event1109 -> tf11.setText(tf11.getText() + "."));
            //Setting back space for text field
            btDelete.setOnAction(event1 -> tf11.setText(tf11.getText().substring(0,tf11.getText().length()-1)));
        });

        tf12.setOnMouseClicked(event -> {
            bt0.setOnAction(event1108 -> tf12.setText(tf12.getText() + "0"));
            bt1.setOnAction(event1107 -> tf12.setText(tf12.getText() + "1"));
            bt2.setOnAction(event1106 -> tf12.setText(tf12.getText() + "2"));
            bt3.setOnAction(event1105 -> tf12.setText(tf12.getText() + "3"));
            bt4.setOnAction(event1104 -> tf12.setText(tf12.getText() + "4"));
            bt5.setOnAction(event1103 -> tf12.setText(tf12.getText() + "5"));
            bt6.setOnAction(event1102 -> tf12.setText(tf12.getText() + "6"));
            bt7.setOnAction(event1101 -> tf12.setText(tf12.getText() + "7"));
            bt8.setOnAction(event1100 -> tf12.setText(tf12.getText() + "8"));
            bt9.setOnAction(event199 -> tf12.setText(tf12.getText() + "9"));
            btMin.setOnAction(event198 -> tf12.setText(tf12.getText() + "-"));
            btDec.setOnAction(event197 -> tf12.setText(tf12.getText() + "."));
            //Setting back space for text field
            btDelete.setOnAction(event1 -> tf12.setText(tf12.getText().substring(0,tf12.getText().length()-1)));
        });

        Pane layout3 = new Pane();  //creating a new pane
        layout3.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));
        layout3.getChildren().addAll(img,lb10,lb11,lb12,lb13,lbO2,lbE2,tf9,tf10,tf11,tf12,key2,clear2,Back3,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btDec,btDelete,btMin);
        tab3.setContent(layout3);

        image = new Image("file:BG.jpeg");
        img = new ImageView(image);
        rt = new Group();               //adding image (background)
        rt.getChildren().addAll(img);

        //------------------------ON SCREEN KEYBOARD(FINANCE)( NUMBER OF PERIODS )-------------------------------
        //Creating buttons for keypad
        Button b1 = new Button("1");
        b1.setPrefWidth(90);
        b1.setLayoutX(450);
        b1.setLayoutY(50);
        b1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b2 = new Button("2");
        b2.setPrefWidth(90);
        b2.setLayoutX(550);
        b2.setLayoutY(50);
        b2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b3 = new Button("3");
        b3.setPrefWidth(90);
        b3.setLayoutX(650);
        b3.setLayoutY(50);
        b3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b4 = new Button("4");
        b4.setPrefWidth(90);
        b4.setLayoutX(450);
        b4.setLayoutY(90);
        b4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b5 = new Button("5");
        b5.setPrefWidth(90);
        b5.setLayoutX(550);
        b5.setLayoutY(90);
        b5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b6 = new Button("6");
        b6.setPrefWidth(90);
        b6.setLayoutX(650);
        b6.setLayoutY(90);
        b6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b7 = new Button("7");
        b7.setPrefWidth(90);
        b7.setLayoutX(450);
        b7.setLayoutY(130);
        b7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b8 = new Button("8");
        b8.setPrefWidth(90);
        b8.setLayoutX(550);
        b8.setLayoutY(130);
        b8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button b9 = new Button("9");
        b9.setPrefWidth(90);
        b9.setLayoutX(650);
        b9.setLayoutY(130);
        b9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bMin = new Button("-");
        bMin.setPrefWidth(90);
        bMin.setLayoutX(450);
        bMin.setLayoutY(170);
        bMin.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #d1d1e0; -fx-font-weight: bold;");

        Button b0 = new Button("0");
        b0.setPrefWidth(90);
        b0.setLayoutX(550);
        b0.setLayoutY(170);
        b0.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bDec = new Button(".");
        bDec.setPrefWidth(90);
        bDec.setLayoutX(650);
        bDec.setLayoutY(170);
        bDec.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bDelete = new Button("Back Space");
        bDelete.setPrefWidth(288);
        bDelete.setLayoutX(450);
        bDelete.setLayoutY(210);
        bDelete.setStyle("-fx-font: 16 Bahnschrift; -fx-base:#ff8080; -fx-font-weight: bold;");

        //setting set on actions for buttons in keyboard(text field1)
        tf13.setOnMouseClicked(event -> {
            b0.setOnAction(event196 -> tf13.setText(tf13.getText() + "0"));
            b1.setOnAction(event195 -> tf13.setText(tf13.getText() + "1"));
            b2.setOnAction(event194 -> tf13.setText(tf13.getText() + "2"));
            b3.setOnAction(event193 -> tf13.setText(tf13.getText() + "3"));
            b4.setOnAction(event192 -> tf13.setText(tf13.getText() + "4"));
            b5.setOnAction(event191 -> tf13.setText(tf13.getText() + "5"));
            b6.setOnAction(event190 -> tf13.setText(tf13.getText() + "6"));
            b7.setOnAction(event189 -> tf13.setText(tf13.getText() + "7"));
            b8.setOnAction(event188 -> tf13.setText(tf13.getText() + "8"));
            b9.setOnAction(event187 -> tf13.setText(tf13.getText() + "9"));
            bMin.setOnAction(event186 -> tf13.setText(tf13.getText() + "-"));
            bDec.setOnAction(event185 -> tf13.setText(tf13.getText() + "."));
            //Setting back space for text field
            bDelete.setOnAction(event1 -> tf13.setText(tf13.getText().substring(0,tf13.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf14.setOnMouseClicked(event -> {
            b0.setOnAction(event184 -> tf14.setText(tf14.getText() + "0"));
            b1.setOnAction(event183 -> tf14.setText(tf14.getText() + "1"));
            b2.setOnAction(event182 -> tf14.setText(tf14.getText() + "2"));
            b3.setOnAction(event181 -> tf14.setText(tf14.getText() + "3"));
            b4.setOnAction(event180 -> tf14.setText(tf14.getText() + "4"));
            b5.setOnAction(event179 -> tf14.setText(tf14.getText() + "5"));
            b6.setOnAction(event178 -> tf14.setText(tf14.getText() + "6"));
            b7.setOnAction(event177 -> tf14.setText(tf14.getText() + "7"));
            b8.setOnAction(event176 -> tf14.setText(tf14.getText() + "8"));
            b9.setOnAction(event175 -> tf14.setText(tf14.getText() + "9"));
            bMin.setOnAction(event174 -> tf14.setText(tf14.getText() + "-"));
            bDec.setOnAction(event173 -> tf14.setText(tf14.getText() + "."));
            //Setting back space for text field
            bDelete.setOnAction(event1 -> tf14.setText(tf14.getText().substring(0,tf14.getText().length()-1)));
        });


        //setting set on actions for buttons in keyboard(text field3)
        tf15.setOnMouseClicked(event -> {
            b0.setOnAction(event172 -> tf15.setText(tf15.getText() + "0"));
            b1.setOnAction(event171 -> tf15.setText(tf15.getText() + "1"));
            b2.setOnAction(event170 -> tf15.setText(tf15.getText() + "2"));
            b3.setOnAction(event169 -> tf15.setText(tf15.getText() + "3"));
            b4.setOnAction(event168 -> tf15.setText(tf15.getText() + "4"));
            b5.setOnAction(event167 -> tf15.setText(tf15.getText() + "5"));
            b6.setOnAction(event166 -> tf15.setText(tf15.getText() + "6"));
            b7.setOnAction(event165 -> tf15.setText(tf15.getText() + "7"));
            b8.setOnAction(event164 -> tf15.setText(tf15.getText() + "8"));
            b9.setOnAction(event163 -> tf15.setText(tf15.getText() + "9"));
            bMin.setOnAction(event162 -> tf15.setText(tf15.getText() + "-"));
            bDec.setOnAction(event161 -> tf15.setText(tf15.getText() + "."));
            //Setting back space for text field
            bDelete.setOnAction(event1 -> tf15.setText(tf15.getText().substring(0,tf15.getText().length()-1)));
        });

        tf16.setOnMouseClicked(event -> {
            b0.setOnAction(event160 -> tf16.setText(tf16.getText() + "0"));
            b1.setOnAction(event159 -> tf16.setText(tf16.getText() + "1"));
            b2.setOnAction(event158 -> tf16.setText(tf16.getText() + "2"));
            b3.setOnAction(event157 -> tf16.setText(tf16.getText() + "3"));
            b4.setOnAction(event156 -> tf16.setText(tf16.getText() + "4"));
            b5.setOnAction(event155 -> tf16.setText(tf16.getText() + "5"));
            b6.setOnAction(event154 -> tf16.setText(tf16.getText() + "6"));
            b7.setOnAction(event153 -> tf16.setText(tf16.getText() + "7"));
            b8.setOnAction(event152 -> tf16.setText(tf16.getText() + "8"));
            b9.setOnAction(event151 -> tf16.setText(tf16.getText() + "9"));
            bMin.setOnAction(event150 -> tf16.setText(tf16.getText() + "-"));
            bDec.setOnAction(event149 -> tf16.setText(tf16.getText() + "."));
            //Setting back space for text field
            bDelete.setOnAction(event1 -> tf16.setText(tf16.getText().substring(0,tf16.getText().length()-1)));

        });

        Pane layout4 = new Pane();  //creating a new pane
        layout4.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));
        layout4.getChildren().addAll(img,lb14,lb15,lb16,lb17,lbO3,lbE3,tf13,tf14,tf15,tf16,key3,clear3,Back4,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDec,bMin,bDelete);
        tab4.setContent(layout4);

        image = new Image("file:BG.jpeg");
        img = new ImageView(image);
        rt = new Group();                   //adding image (background)
        rt.getChildren().addAll(img);

        //------------------------ON SCREEN KEYBOARD(FINANCE)( STARTING PRINCIPALS )-------------------------------
        //Creating buttons for keypad
        Button bu1 = new Button("1");
        bu1.setPrefWidth(90);
        bu1.setLayoutX(450);
        bu1.setLayoutY(50);
        bu1.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu2 = new Button("2");
        bu2.setPrefWidth(90);
        bu2.setLayoutX(550);
        bu2.setLayoutY(50);
        bu2.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu3 = new Button("3");
        bu3.setPrefWidth(90);
        bu3.setLayoutX(650);
        bu3.setLayoutY(50);
        bu3.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu4 = new Button("4");
        bu4.setPrefWidth(90);
        bu4.setLayoutX(450);
        bu4.setLayoutY(90);
        bu4.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu5 = new Button("5");
        bu5.setPrefWidth(90);
        bu5.setLayoutX(550);
        bu5.setLayoutY(90);
        bu5.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu6 = new Button("6");
        bu6.setPrefWidth(90);
        bu6.setLayoutX(650);
        bu6.setLayoutY(90);
        bu6.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu7 = new Button("7");
        bu7.setPrefWidth(90);
        bu7.setLayoutX(450);
        bu7.setLayoutY(130);
        bu7.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu8 = new Button("8");
        bu8.setPrefWidth(90);
        bu8.setLayoutX(550);
        bu8.setLayoutY(130);
        bu8.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button bu9 = new Button("9");
        bu9.setPrefWidth(90);
        bu9.setLayoutX(650);
        bu9.setLayoutY(130);
        bu9.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buMin = new Button("-");
        buMin.setPrefWidth(90);
        buMin.setLayoutX(450);
        buMin.setLayoutY(170);
        buMin.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #d1d1e0; -fx-font-weight: bold;");

        Button bu0 = new Button("0");
        bu0.setPrefWidth(90);
        bu0.setLayoutX(550);
        bu0.setLayoutY(170);
        bu0.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buDec = new Button(".");
        buDec.setPrefWidth(90);
        buDec.setLayoutX(650);
        buDec.setLayoutY(170);
        buDec.setStyle("-fx-font: 16 Bahnschrift; -fx-base: #b3b3ff; -fx-font-weight: bold;");

        Button buDelete = new Button("Back Space");
        buDelete.setPrefWidth(288);
        buDelete.setLayoutX(450);
        buDelete.setLayoutY(210);
        buDelete.setStyle("-fx-font: 16 Bahnschrift; -fx-base:#ff8080; -fx-font-weight: bold;");

        //setting set on actions for buttons in keyboard(text field1)
        tf17.setOnMouseClicked(event -> {
            bu0.setOnAction(event148 -> tf17.setText(tf1.getText() + "0"));
            bu1.setOnAction(event147 -> tf17.setText(tf17.getText() + "1"));
            bu2.setOnAction(event146 -> tf17.setText(tf17.getText() + "2"));
            bu3.setOnAction(event145 -> tf17.setText(tf17.getText() + "3"));
            bu4.setOnAction(event144 -> tf17.setText(tf17.getText() + "4"));
            bu5.setOnAction(event143 -> tf17.setText(tf17.getText() + "5"));
            bu6.setOnAction(event142 -> tf17.setText(tf17.getText() + "6"));
            bu7.setOnAction(event141 -> tf17.setText(tf17.getText() + "7"));
            bu8.setOnAction(event140 -> tf17.setText(tf17.getText() + "8"));
            bu9.setOnAction(event139 -> tf17.setText(tf17.getText() + "9"));
            buMin.setOnAction(event138 -> tf17.setText(tf17.getText() + "-"));
            buDec.setOnAction(event137 -> tf17.setText(tf17.getText() + "."));
            //Setting back space for text field
            buDelete.setOnAction(event1 -> tf17.setText(tf17.getText().substring(0,tf17.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field2)
        tf18.setOnMouseClicked(event -> {
            bu0.setOnAction(event136 -> tf18.setText(tf18.getText() + "0"));
            bu1.setOnAction(event135 -> tf18.setText(tf18.getText() + "1"));
            bu2.setOnAction(event134 -> tf18.setText(tf18.getText() + "2"));
            bu3.setOnAction(event133 -> tf18.setText(tf18.getText() + "3"));
            bu4.setOnAction(event132 -> tf18.setText(tf18.getText() + "4"));
            bu5.setOnAction(event131 -> tf18.setText(tf18.getText() + "5"));
            bu6.setOnAction(event130 -> tf18.setText(tf18.getText() + "6"));
            bu7.setOnAction(event129 -> tf18.setText(tf18.getText() + "7"));
            bu8.setOnAction(event128 -> tf18.setText(tf18.getText() + "8"));
            bu9.setOnAction(event127 -> tf18.setText(tf18.getText() + "9"));
            buMin.setOnAction(event126 -> tf18.setText(tf18.getText() + "-"));
            buDec.setOnAction(event125 -> tf18.setText(tf18.getText() + "."));
            //Setting back space for text field
            buDelete.setOnAction(event1 -> tf18.setText(tf18.getText().substring(0,tf18.getText().length()-1)));
        });

        //setting set on actions for buttons in keyboard(text field3)
        tf19.setOnMouseClicked(event -> {
            bu0.setOnAction(event124 -> tf19.setText(tf19.getText() + "0"));
            bu1.setOnAction(event123 -> tf19.setText(tf19.getText() + "1"));
            bu2.setOnAction(event122 -> tf19.setText(tf19.getText() + "2"));
            bu3.setOnAction(event121 -> tf19.setText(tf19.getText() + "3"));
            bu4.setOnAction(event120 -> tf19.setText(tf19.getText() + "4"));
            bu5.setOnAction(event119 -> tf19.setText(tf19.getText() + "5"));
            bu6.setOnAction(event118 -> tf19.setText(tf19.getText() + "6"));
            bu7.setOnAction(event117 -> tf19.setText(tf19.getText() + "7"));
            bu8.setOnAction(event116 -> tf19.setText(tf19.getText() + "8"));
            bu9.setOnAction(event115 -> tf19.setText(tf19.getText() + "9"));
            buMin.setOnAction(event114 -> tf19.setText(tf19.getText() + "-"));
            buDec.setOnAction(event113 -> tf19.setText(tf19.getText() + "."));
            //Setting back space for text field
            buDelete.setOnAction(event1 -> tf19.setText(tf19.getText().substring(0,tf19.getText().length()-1)));
        });

        tf20.setOnMouseClicked(event -> {
            bu0.setOnAction(event112 -> tf20.setText(tf20.getText() + "0"));
            bu1.setOnAction(event111 -> tf20.setText(tf20.getText() + "1"));
            bu2.setOnAction(event110 -> tf20.setText(tf20.getText() + "2"));
            bu3.setOnAction(event19 -> tf20.setText(tf20.getText() + "3"));
            bu4.setOnAction(event18 -> tf20.setText(tf20.getText() + "4"));
            bu5.setOnAction(event17 -> tf20.setText(tf20.getText() + "5"));
            bu6.setOnAction(event16 -> tf20.setText(tf20.getText() + "6"));
            bu7.setOnAction(event15 -> tf20.setText(tf20.getText() + "7"));
            bu8.setOnAction(event14 -> tf20.setText(tf20.getText() + "8"));
            bu9.setOnAction(event13 -> tf20.setText(tf20.getText() + "9"));
            buMin.setOnAction(event12 -> tf20.setText(tf20.getText() + "-"));
            buDec.setOnAction(event1 -> tf20.setText(tf20.getText() + "."));
            //Setting back space for text field
            buDelete.setOnAction(event1 -> tf20.setText(tf20.getText().substring(0,tf20.getText().length()-1)));
        });

        Pane layout5 = new Pane();  //creating a new pane
        layout5.setBackground(new Background(new BackgroundFill(Color.rgb(204,204,204), CornerRadii.EMPTY, Insets.EMPTY)));
        layout5.getChildren().addAll(img,lb18,lb19,lb20,lb21,lbO4,lbE4,tf17,tf18,tf19,tf20,key4,clear4,Back5,bu0,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,buDec,buDelete,buMin);
        tab5.setContent(layout5);

        Pane fPane = new Pane();    //creating a new pane
        fPane.getChildren().addAll(tabPane,help);

        Scene scene = new Scene(fPane,700,500);    //creating a new scene

        window.setScene(scene);     //set scene
        window.show();
        window.setHeight(600);
        window.setWidth(800);

        return fPane;
    }
}