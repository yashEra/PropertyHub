package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class StringUtils {
    public static String truncateDescription(String desc, int wordLimit) {
        String[] words = desc.split("\\s+");
        if (words.length > wordLimit) {
            StringBuilder truncatedDesc = new StringBuilder();
            for (int i = 0; i < wordLimit; i++) {
                truncatedDesc.append(words[i]).append(" ");
            }
            return truncatedDesc.toString().trim() + "...";
        }
        return desc;
    }
}
