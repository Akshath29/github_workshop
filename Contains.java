package github_workshop;
public class Contains
{
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int toFind = 3;
        boolean found = true;

        for (int n:num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found) System.out.println(toFind + "is Found.");
        else System.out.println(toFind + "is not found.");
    }
}