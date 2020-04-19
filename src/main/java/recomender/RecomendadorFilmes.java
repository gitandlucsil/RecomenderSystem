package recomender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import java.io.IOException;
import java.util.List;

public class RecomendadorFilmes {

	public static void main(String[] args) throws IOException, TasteException{
		DataModel filmes = new Recomendador().getModeloFilmes();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(filmes);
		List<RecommendedItem> recomendations = recommender.recommend(4, 3);
		for(RecommendedItem recomendation : recomendations){
			System.out.println("Voce pode gostar deste filme!");
			System.out.println(recomendation);
		}
	}
}
