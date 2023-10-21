import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
//• Spelplanen ska märkas i y-led med A-J och i x-led med 0-9, det vill säga att övre vänstra hörnet
//benämns med A0 och nedre högra hörnet med J9.


    // Ska ha en HBox och en VBox med bostäver/Siffror i

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board battelBoard = new Board();


        primaryStage.setTitle("Sink a ship");
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);
        Label labelEmpty = new Label("       ");
        Label labelA = new Label("A");
        Label labelB = new Label("B");
        Label labelC = new Label("C");
        Label labelD = new Label("D");
        Label labelE = new Label("E");
        Label labelX = new Label("X");
        Label label0 = new Label("0");
        Label label1 = new Label("1");
        Label label2 = new Label("2");
        Label label3 = new Label("3");

        Button b=new Button();

        HBox hBox = new HBox();
        VBox vBox = new VBox();
        hBox.getChildren().addAll(labelX, label0, label1, label2, label3);
        vBox.getChildren().addAll(labelEmpty, labelA, labelB, labelC, labelD, labelE);


//        hBox.getChildren().addAll(labelEmpty, label0, label1, label2, label3);
//        vBox.getChildren().addAll( labelEmpty, labelA, labelB);

//vBox.setAlignment(Pos.BASELINE_LEFT);
        hBox.setSpacing(20);
        vBox.setSpacing(10);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vBox, hBox);

        GridPane gp=new GridPane();
        gp.getChildren().add(b);
stackPane.getChildren().add(b);

        Scene sinkAShip = new Scene(stackPane);


//        primaryStage.setScene(sinkAShip);
//        primaryStage.show();

        battelBoard.start(new Stage());


//        primaryStage.setTitle("Kevin");
//        Button button1 = new Button("Hej");
//        Button button2 = new Button("Hej då");
//
//        button1.setOnMouseEntered(e -> {
//            button1.setOpacity(0.5);
//        });
//        button1.setOnMouseExited(e -> {
//            button1.setOpacity(1);
//        });
//        button1.setOnAction(event ->
//                System.out.println("Test"));
//
//
//        Label label = new Label("Första rutan");
//
//        HBox layput1 = new HBox(20);
//        layput1.getChildren().addAll(label, button1);
//
//
//    VBox layout2 = new VBox(20);
//    layout2.getChildren().addAll(label, button1, button2);
//
//
//        Scene scene1 = new Scene(layput1, 300, 300, Color.BROWN);
//       Scene scene2 = new Scene(layout2, 300, 300);
//
//
//
//        primaryStage.setScene(scene2);
//        primaryStage.show();

    }

}
