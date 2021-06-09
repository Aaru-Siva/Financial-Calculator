package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Help {

    public static Pane help() {
        Stage window = new Stage();
        window.setTitle("Help");    //setting a title for help window

        TabPane help_Pane = new TabPane();  //creating a new pane
        help_Pane.setTabMinWidth(70);
        help_Pane.setTabMinHeight(40);
        help_Pane.setTabMaxWidth(400);
        help_Pane.setTabMaxHeight(69);

        //creating tabs
        Tab tab1 = new Tab("Savings Calculator");
        tab1.setClosable(false);
        Tab tab2 = new Tab("Loan calculator");
        tab2.setClosable(false);
        Tab tab3 = new Tab("Mortgage Calculator");
        tab3.setClosable(false);
        Tab tab4 = new Tab("Compound Calculator" );
        tab4.setClosable(false);

        help_Pane.getTabs().add(tab1);
        help_Pane.getTabs().add(tab2);
        help_Pane.getTabs().add(tab3);
        help_Pane.getTabs().add(tab4);

        //setting up help window for savings calculator
        Label text1 = new Label("Finance calculator can be used to calculate any number of the " +
                " future value (FV), number of compounding periods (N), interest rate (I/Y), annuity payment (PMT), " +
                "and start principal." +
                " In this calculator each of the following tabs represents the parameters to be calculated.");
        text1.setStyle("-fx-text-fill:black; -fx-font-family: Bahnschrift");

        Label pmt = new Label("PMT refers annuity payment.It is an inflow/outflow amount that happens at each compounding period of a financial stream.");
        pmt.setLayoutY(150);
        pmt.setLayoutX(20);
        pmt.setMaxWidth(550);
        pmt.setWrapText(true);
        pmt.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        text1.setMaxWidth(550);
        text1.setLayoutX(20);
        text1.setLayoutY(30);
        text1.setWrapText(true);
        text1.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        Image pic = new Image("file:Home.png");
        ImageView img = new ImageView(pic);
        img.setImage(pic);
        img.setFitHeight(350);
        img.setFitWidth(500);
        img.setX(20);
        img.setY(218);

        Label instruction = new Label("By choosing any of the calculator here you can get that calculator. \n" +
                "By clicking back to start button you can go to the start window. \n" +
                "In you want to clear the text fields in the calculator,by clicking the clear button you can access it. \n" +
                "After entering your inputs click calculate button in the window to get the result" +
                " \n using back space button you can erase the characters in text field one by one" );
        instruction.setLayoutY(600);
        instruction.setLayoutX(20);
        instruction.setMaxWidth(550);
        instruction.setWrapText(true);
        instruction.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white;-fx-font-weight: bold");

        Pane help = new Pane();
        help.setBackground(new Background(new BackgroundFill(Color.rgb(102,153,153), CornerRadii.EMPTY, Insets.EMPTY)));
        tab1.setContent(help);
        help.getChildren().addAll(text1,pmt,img,instruction);

        //setting up help window for Loan calculator
        Label text2 = new Label("Loan refers to a contract between a borrower and a lender in which the borrower receives an amount of money (principal) that they are agree to pay back in the future. " +
                "loans can be divied into three main categories: \n" +
                "Amortized Loan refers to Fixed payments paid periodically until loan maturity. \n" +
                "\n" +
                "Deferred Payment Loan refers to Single lump sum paid at loan maturity. \n" +
                "Bond refers to Predetermined lump sum paid at loan maturity.\n ");
        text2.setMaxWidth(550);
        text2.setLayoutX(20);
        text2.setLayoutY(30);
        text2.setWrapText(true);
        text2.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        Image pic1 = new Image("file:Home.png");
        ImageView img1 = new ImageView(pic1);
        img1.setImage(pic1);
        img1.setFitHeight(350);
        img1.setFitWidth(500);
        img1.setX(20);
        img1.setY(330);

        Label instruction1 = new Label("By choosing any of the calculator here you can get that calculator. \n" +
                "By clicking back to start button you can go to the start window. \n" +
                "In you want to clear the text fields in the calculator,by clicking the clear button you can access it. \n" +
                "After entering your inputs click calculate button in the window to get the result" +
                "\n using back space button you can erase the characters in text field one by one" );
        instruction1.setLayoutY(685);
        instruction1.setLayoutX(20);
        instruction1.setMaxWidth(550);
        instruction1.setWrapText(true);
        instruction1.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white;-fx-font-weight: bold");

        Pane help1 = new Pane();
        help1.setBackground(new Background(new BackgroundFill(Color.rgb(102,153,153), CornerRadii.EMPTY, Insets.EMPTY)));
        help1.getChildren().addAll(text2,img1,instruction1);
        tab2.setContent(help1);

        //setting up help window for mortgage calculator
        Label text3 = new Label("Mortgage refers to a loan from a bank/other financial institution that helps a borrower to purchase a home.");
        text3.setMaxWidth(550);
        text3.setLayoutX(20);
        text3.setLayoutY(30);
        text3.setWrapText(true);
        text3.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        Label pm1 = new Label("There two most common types of mortgages: \n" +
                " fixed-rate \n" +
                " adjustable-rate mortgages.");
        pm1.setLayoutY(100);
        pm1.setLayoutX(20);
        pm1.setMaxWidth(550);
        pm1.setWrapText(true);
        pm1.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        Image pic2 = new Image("file:Home.png");
        ImageView img2 = new ImageView(pic2);
        img2.setImage(pic2);
        img2.setFitHeight(350);
        img2.setFitWidth(500);
        img2.setX(20);
        img2.setY(218);

        Label instruction2 = new Label("By choosing any of the calculator here you can get that calculator. \n" +
                "By clicking back to start button you can go to the start window. \n" +
                "In you want to clear the text fields in the calculator,by clicking the clear button you can access it. \n" +
                "After entering your inputs click calculate button in the window to get the result " +
                "\n using back space button you can erase the characters in text field one by one" );
        instruction2.setLayoutY(600);
        instruction2.setLayoutX(20);
        instruction2.setMaxWidth(550);
        instruction2.setWrapText(true);
        instruction2.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white;-fx-font-weight: bold");

        Pane help2 = new Pane();
        help2.setBackground(new Background(new BackgroundFill(Color.rgb(102,153,153), CornerRadii.EMPTY, Insets.EMPTY)));
        help2.getChildren().addAll(text3,pm1,img2,instruction2);
        tab3.setContent(help2);

        //setting up help window for compound calculator
        Label text4 = new Label("Compound interest refers to the interest you earn each year is added to your principal," +
                " so that the balance doesn't merely grow, " +
                "it grows at an increasing rate. This is one of the most useful concepts in finance");
        text4.setMaxWidth(550);
        text4.setLayoutX(20);
        text4.setLayoutY(30);
        text4.setWrapText(true);
        text4.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white");

        Image pic3 = new Image("file:Home.png");
        ImageView img3 = new ImageView(pic2);
        img3.setImage(pic3);
        img3.setFitHeight(350);
        img3.setFitWidth(500);
        img3.setX(20);
        img3.setY(118);

        Label instruction3 = new Label("By choosing any of the calculator here you can get that calculator. \n" +
                "By clicking back to start button you can go to the start window. \n" +
                "In you want to clear the text fields in the calculator,by clicking the clear button you can access it. \n" +
                "After entering your inputs click calculate button in the window to get the result " +
                "\n using back space button you can erase the characters in text field one by one " );
        instruction3.setLayoutY(500);
        instruction3.setLayoutX(20);
        instruction3.setMaxWidth(550);
        instruction3.setWrapText(true);
        instruction3.setStyle("-fx-font: 18 Bahnschrift; -fx-text-fill:white;-fx-font-weight: bold");

        Pane help3 = new Pane();
        help3.setBackground(new Background(new BackgroundFill(Color.rgb(102,153,153), CornerRadii.EMPTY, Insets.EMPTY)));
        help3.getChildren().addAll(text4,img3,instruction3);
        tab4.setContent(help3);

        Scene scene = new Scene(help_Pane);    //creating a new scene

        window.setScene(scene);     //set scene
        window.show();
        window.setHeight(970);
        window.setWidth(630);

        return help;
    }
}
