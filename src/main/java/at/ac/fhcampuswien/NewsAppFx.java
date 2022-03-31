package at.ac.fhcampuswien;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class NewsAppFx {

   private AppController controller = new AppController();
   private List<Article> articles = new ArrayList<Article>();

   @FXML
   private Button Headlines = new Button();

   @FXML
   private Button Bitcoin = new Button();

   @FXML
   private Button ArticleCount = new Button();

   @FXML
   private Button Quit = new Button();

   @FXML
   private ImageView BreakingPicture;

   @FXML
   private ImageView TitlePicture;

   @FXML
   private ImageView NewsPicture;

   @FXML
   private ImageView ArticlesPics;

   @FXML
   private ImageView BitcoinPicture;

   @FXML
   private TextArea Text;

      public void Welcome() {
      Text.setText("Welcome to our NewsApp. We hope you enjoy your news");
      }

      public void getArticleCount(MouseEvent event){
         if(event.getSource().equals(ArticleCount)){
         int Count;
         Count = controller.getArticleCount();
         Text.setText("We have " + Count + " number of articles in our App");
      }
      }

   }
