package in.blogspot.randomcompiler.check.strings.interleaving;

public class CheckStringsInterleaving {
    public static boolean checkStringsInterleaving(String input, String a, String b) {
        if(input == null && a == null && b == null) {
            return true;
        }
        if(input == null && (a != null || b != null)) {
            return false;
        }
        if(input != null && a != null && b == null) {
            return input.equals(a);
        }
        if(input != null && a == null && b != null) {
            return input.equals(b);
        }

        int aIndex = 0;
        int bIndex = 0;
        
        for(int inputIndex = 0; inputIndex < input.length(); inputIndex++) {
            if(aIndex < a.length() && input.charAt(inputIndex) == a.charAt(aIndex)) {
                aIndex++;
            } else if(bIndex < b.length() && input.charAt(inputIndex) == b.charAt(bIndex)) {
                bIndex++;
            } else {
                return false;
            }
        }
        return true;
    }
}
