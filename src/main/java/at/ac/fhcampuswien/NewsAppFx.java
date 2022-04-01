package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;


public class NewsAppFx extends AppController {


   public Label Labelonee;


   public void BitcoinNews(ActionEvent actionEvent) {
      Labelonee.setText( getAllNewsBitcoin().toString() );

   }

   public void AllNews(ActionEvent actionEvent) {
      Labelonee.setText( getTopHeadlinesAustria().toString() );

   }

   public void ArticleCount(ActionEvent actionEvent) {
      Labelonee.setText( "At the time we count " + getArticleCount() + " articles" + "!" );

   }


}

