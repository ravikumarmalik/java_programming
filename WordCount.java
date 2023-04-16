
public class WordCount {
    public static void main(String[] args) {
        String name="To understand a programming language you must practice the programs.";
        int countWords = name.split("\\s").length;
        System.out.println("Total number of words:"+countWords);
    }
}
