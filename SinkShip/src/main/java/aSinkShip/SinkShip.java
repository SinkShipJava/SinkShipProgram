package aSinkShip;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class SinkShip extends Application {

    private double sceneWidth = 800;
    private double sceneHeight = 800;

    private int n = 10;
    private int m = 10;

    double gridWidth = sceneWidth / n;
    double gridHeight = sceneHeight / m;

    MyNode[][] playfield = new MyNode[n][m];
    int[][] gameBoard = new int[n][m];

    @Override
    public void start(Stage primaryStage) {


        Group root = new Group();

        // initialize playfield
        for( int i=0; i < n; i++) {
            for( int j=0; j < m; j++) {
                gameBoard[i][j] = 0;

                MyNode node = new MyNode( i * gridWidth, j * gridHeight, gridWidth, gridHeight);

                root.getChildren().add( node);

                playfield[i][j] = node;

            }
        }


        Scene scene = new Scene( root, sceneWidth, sceneHeight);

        primaryStage.setScene( scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static class MyNode extends StackPane {

        public MyNode(double x, double y, double width, double height) {

            // create rectangle
            Rectangle rectangle = new Rectangle( width, height);
            rectangle.setStroke(Color.BLACK);
            rectangle.setFill(Color.LIGHTBLUE);

            // create label

            // set position
            setTranslateX( x);
            setTranslateY( y);

            getChildren().addAll( rectangle);

        }

    }

}