package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
       BorderPane root = new BorderPane();

       HBox topligne = new HBox();
       Menu menu1 = new Menu("File");
       Menu menu2 = new Menu("Edit");
       Menu menu3 = new Menu("Help");
       MenuItem menuItem1 = new MenuItem("New");
       MenuItem menuItem2 = new MenuItem("Open");
       MenuItem menuItem3 = new MenuItem("Save");
       MenuItem menuItem4 = new MenuItem("Close");
       MenuItem menuItem5 = new MenuItem("Cut");
       MenuItem menuItem6 = new MenuItem("Copy");
       MenuItem menuItem7 = new MenuItem("Paste");
       menu1.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4);
       menu2.getItems().addAll(menuItem5, menuItem6, menuItem7);
       MenuBar menuBar = new MenuBar(menu1,menu2,menu3);
       topligne.getChildren().addAll(menuBar);



       VBox bout = new VBox();
       Label label = new Label("Boutons :");
       Button b1 = new Button("Bouton 1");
       Button b2 = new Button("Bouton 2");
       Button b3 = new Button("Bouton 3");
       Separator sep1 = new Separator(Orientation.HORIZONTAL);
       Separator sep2 = new Separator(Orientation.VERTICAL);
       bout.getChildren().addAll(label,b1,b2,b3);
       HBox leftpart = new HBox();
       leftpart.getChildren().addAll(bout,sep2);
       bout.setSpacing(10);


       HBox bottomligne = new HBox();
       Label label1 = new Label("Ceci est un label de bas de page");
       bottomligne.getChildren().add(label1);
       Separator sep3 = new Separator(Orientation.HORIZONTAL);
       VBox bottompart0 = new VBox();
       bottompart0.getChildren().addAll(sep3, label1);
       bottompart0.setAlignment(Pos.CENTER);




       GridPane gP = new GridPane();
       HBox hbBoutons = new HBox();
       VBox vbCenter = new VBox();
       // creation boutons
       Button btnSubmit = new Button("Submit");
       Button btnCancel = new Button("Cancel");
       hbBoutons.getChildren().addAll(btnSubmit, btnCancel);
       vbCenter.getChildren().addAll(gP, hbBoutons);
       // creation champs
       Label lbName = new Label("Name :");
       Label lbEmail = new Label("Email :");
       Label lbPass = new Label("Password :");
       var nameField = new TextField();
       var emailField = new TextField();
       var passField = new TextField();
       GridPane.setConstraints(lbName, 0, 0);
       GridPane.setConstraints(nameField, 1, 0);
       GridPane.setConstraints(lbEmail, 0, 1);
       GridPane.setConstraints(emailField, 1, 1);
       GridPane.setConstraints(lbPass, 0, 2);
       GridPane.setConstraints(passField, 1, 2);
       // separations champs
       gP.getChildren().addAll(lbName, nameField, lbEmail, emailField, lbPass, passField);
       hbBoutons.setSpacing(8);
       GridPane.setMargin(lbName, new Insets(10.0d));
       GridPane.setMargin(lbEmail, new Insets(10.0d));
       GridPane.setMargin(lbPass, new Insets(10.0d));
       // placement
       vbCenter.setAlignment(Pos.CENTER);
       gP.setAlignment(Pos.CENTER);
       hbBoutons.setAlignment(Pos.CENTER);





       root.setCenter(vbCenter);
       root.setLeft(leftpart);
       root.setBottom(bottompart0);
       root.setTop(menuBar);
       Scene sc = new Scene(root);
       primaryStage.setScene(sc);
       primaryStage.setWidth( 800 );
       primaryStage.setHeight( 600 );
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

