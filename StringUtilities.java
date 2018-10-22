public class StringUtilities {
    public Character getMiddleCharacter(String word){
        char newValue;
        if (word.length() % 2 == 0){
            newValue = word.charAt(word.length()/2);}
        else { newValue = word.charAt(word.length()/2);}
        return newValue;
    }

    public String removeCharacter(String value, char charToRemove){
        String value1 = Character.toString(charToRemove);
        String newValue = value.replace(value1, "");
        return newValue; 
    }

    public String getLastWord(String value) {
        int i = value.lastIndexOf(' ');
        String word = value.substring(i + 1, value.length());
        return word;
    }
}
