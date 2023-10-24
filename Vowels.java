public class Vowels{
    public int vowelCount(String word){
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
