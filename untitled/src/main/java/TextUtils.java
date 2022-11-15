import java.util.Locale;

public class TextUtils {

    public static String getWordInCapitalLetters(String word) {

        if (word != null) {
            return word.toUpperCase();
        }
        return null;
    }

    public static Double convertToDouble(String number) {
        if (number != null) {
            return Double.valueOf(number);
        }
            return null;


    }

    public static boolean isNullOrBlank(String word) {
        return word == null || word.trim().length() == 0; // metoda trim scurteaza stringul de spatii goale

    }

    public static String getDefaultIfNull(String myWord, String defaultWord) {
//        if (myWord == null) {
//            return defaultWord;
//        } else {
//            return myWord;

            return myWord == null ? defaultWord : myWord;
        }


    // {"java", "is", "cool"} -> "Java is cool"

    public static String concat(String[] strings) {
        String returnedString = null;
        if (strings != null && strings.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                String myStringFromArray = strings[i];
                if (myStringFromArray != null) {
                    stringBuilder.append(myStringFromArray);
                }
            }
            returnedString = stringBuilder.toString();
        }
        return returnedString;
    }
}