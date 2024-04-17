package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {

    BorderPane root = new BorderPane();
    Pane page = new Pane();
    HBox zoneL = new HBox();
    Label label = new Label("couleur");
    zoneL.getChildren().add(label);
    HBox zoneB = new HBox();
    Button Vert = new Button("Vert");
    Button Rouge = new Button("Rouge");
    Button Bleu = new Button("Vert");

    zoneB.getChildren().addAll(Vert,Rouge,Bleu);
    zoneB.setSpacing(10);
    zoneB.setAlignment(Pos.CENTER);
    root.setBottom(zoneB);
    zoneL.setAlignment(Pos.CENTER);
    root.setTop(zoneL);
    Vert.addEventFilter(MouseEvent.MOUSE_CLICKED,actionEvent -> {page.setStyle("-fx-background-color:Green");label.setText("vert");});
    Rouge.addEventFilter(MouseEvent.MOUSE_CLICKED,actionEvent -> {page.setStyle("-fx-background-color:Red");label.setText("rouge");});
    Bleu.addEventFilter(MouseEvent.MOUSE_CLICKED,actionEvent -> {page.setStyle("-fx-background-color:Blue");label.setText("bleu");});
    root.setCenter(page);
    Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(200);
        primaryStage.setWidth(400);
        primaryStage.show();
    }
}

