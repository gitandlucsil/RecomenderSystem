package recomender;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendadorLivros {

	public static void main(String[] args) throws IOException, TasteException{
		DataModel livros = new Recomendador().getModeloLivros();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(livros);
		List<RecommendedItem> recomendations = recommender.recommend(2, 20);
		for(RecommendedItem recomendation : recomendations){
			System.out.println("Voce pode gostar deste livro!");
			System.out.println(recomendation);
		}
	}
}
