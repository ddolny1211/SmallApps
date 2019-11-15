package RandomMethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Method counts words in each sentence. Given String need to be separated with . ? ! marks.
//Return the max number of words in single sentence

class WordsCounter {
    public int countWordInSingleSentence(String sentence) {
        String[] splittedSentences = sentence.split("[\\?\\!\\.]");
        return findMaxWordsCountInSentences(splittedSentences);
    }

    private int findMaxWordsCountInSentences(String[] splittedSentences) {
        int maxWordsInSentence = 0;
        for (String sentence : splittedSentences) {
            String[] words = sentence.split(" ");
            List<String> filteredWords = filterEmptyWords(words);
            if (filteredWords.size() > maxWordsInSentence) {
                maxWordsInSentence = filteredWords.size();
            }
        }
        return maxWordsInSentence;
    }

    private List<String> filterEmptyWords(String[] words) {
        return Stream.of(words)
                .filter(word -> word.length() > 0)
                .collect(Collectors.toList());
    }
}
