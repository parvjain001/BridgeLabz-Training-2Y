public class BinarySearch {
    public static boolean exists(String[] users, String target) {
        int low = 0, high = users.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int res = users[mid].compareTo(target);
            if(res == 0) return true;
            else if(res < 0) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}