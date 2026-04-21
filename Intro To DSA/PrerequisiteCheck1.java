public class PrerequisiteCheck1 {
    public static boolean canEnroll(String[] completed, String[] required) {
        for(int i = 0; i < required.length; i++) {
            boolean found = false;
            for(int j = 0; j < completed.length; j++) {
                if(required[i].equals(completed[j])) {
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}