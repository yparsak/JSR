//https://github.com/cmusphinx/sphinx4

package name.parsak;

import java.io.InputStream;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.result.WordResult;

public class JSR {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        config.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

		try {
			StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(config);
			
			InputStream stream = JSR.class.getResourceAsStream("/10001-90210-01803.wav");
			stream.skip(44);
			
			// Simple recognition with generic model
	        recognizer.startRecognition(stream);
	        SpeechResult result;
	        while ((result = recognizer.getResult()) != null) {

	            System.out.format("Hypothesis: %s\n", result.getHypothesis());

	            System.out.println("List of recognized words and their times:");
	            for (WordResult r : result.getWords()) {
	                System.out.println(r);
	            }

	            System.out.println("Best 3 hypothesis:");
	            for (String s : result.getNbest(3))
	                System.out.println(s);

	        }
	        recognizer.stopRecognition();
	        System.out.println("Bye");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
