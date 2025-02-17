package search;

import java.util.List;

public class TFIDF {

    public static double calculateTermFrequency(List<String> words, String term) {
        long count = 0;
        for (String word : words) {
            if (term.equalsIgnoreCase(word)) {
                count++;
            }
        }

        double termFrequency = (double) count / words.size();
        return termFrequency;
    }
}
