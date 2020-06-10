
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SampleLayout extends Application{
    //main
    public static void main(String[] args){
        launch (SampleLayout.class, args);

    }


    //start
    @Override
    public void start(Stage stage){
        //border pan as the root of the scene
        BorderPane border= new BorderPane();
        HBox topBar=addHbox();
        VBox sidebar=addVbox();
        border.setTop(topBar);
        border.setLeft(sidebar);


        

        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Layout Sample");
        stage.show();
        

    }


    public HBox addHbox(){
        //create an HBOx
        HBox topbar=new HBox();
        topbar.setPadding(new Insets(15,12,15,12));
        topbar.setSpacing(10);
        topbar.setStyle("-fx-background-color: #336699;");

        //creating element for HBox
        Button buttonCurrent= new Button("Current");
        buttonCurrent.setPrefSize(100,20);

        Button buttonProjected= new Button("Projected");
        buttonProjected.setPrefSize(100,20);

        //adding the button to the hbox
        topbar.getChildren().addAll(buttonCurrent, buttonProjected);

        return topbar;
    }


    public VBox addVbox(){
        VBox sideBar= new VBox();
        sideBar.setPadding(new Insets(10));
        sideBar.setSpacing(8);


        //creating vbox elements
        Text title= new Text("Data");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        sideBar.getChildren().add(title);

        Hyperlink options[]= new Hyperlink[] {
            new Hyperlink("Sales"),
            new Hyperlink("Marketing"),
            new Hyperlink("Distribution"),
            new Hyperlink("Costs")};

        for (int i=0; i<4; i++){
            sideBar.setMargin(options[i], new Insets(0,0,0,8));
            sideBar.getChildren().add(options[i]);
        }

        return sideBar;
    }



    public GridPane addGridPane(){
        GridPane content= new GridPane();
        content.setHgap(10);
        content.setVgap(10);
        content.setPadding(new Insets(0,10,0,10));


        Text category = new Text("Sales: ");
        category.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        content.add(category, 1,0);

        Text chartTitle= new Text("Current year");
        chartTitle.setFont(Font.font("Arial", FontWeight.BOLD,20));
        content.add(chartTitle, 2, 0);


        Text charSubtitle = new Text("Goods and Services");
        content.add(charSubtitle, 1,1,2,1);

        ImageView imageHouse= new ImageView(
                new Image(LayoutSample.class.getResourceAsStream("graphics/house.png")));
        grid.add(imageHouse, 0,0,1,2);
        

        Text goodsPercent= new Text ("Goods\n80%");
        GridPane.setValignment(goodsPercent, VPos.BOTTOM);
        content.add(goodsPercent, 0,2);


        ImageView imageChart= new ImageView(
                new Image(LayoutSample.class.getResourceAsStream("graphics/piechart.png")));
        content.add(imageChart, 1,2,2,1);


        Text servicesPercent= new Text("Services \n20%");
        GridPane.setValignment(servicesPercent, VPos.TOP);
        content.add(servicesPercent, 3,2);

        return content;


    }

    
}
