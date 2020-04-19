package recomender;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Recomendador {

	private DataModel getModelo(String path) throws IOException{
		File file = new File("src/main/java/resources/"+path);
		return new FileDataModel(file);
	}
	
	public DataModel getModeloLivros() throws IOException{
		return getModelo("livros.csv");
	}
	
	public DataModel getModeloFilmes() throws IOException{
		return getModelo("filmes.csv");
	}
}
