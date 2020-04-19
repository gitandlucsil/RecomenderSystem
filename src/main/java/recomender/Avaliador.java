package recomender;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

public class Avaliador {

	public static void main(String[] args) throws IOException, TasteException{
		RandomUtils.useTestSeed();
		DataModel modelo = new Recomendador().getModeloLivros();
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		RecomendadorBuilder builder = new RecomendadorBuilder();
		double erro = evaluator.evaluate(builder, null, modelo, 0.9, 0.1);
		System.out.println("A taxa de erro do sistema de recomendação atual é: "+erro);
	}
}
