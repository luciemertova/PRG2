package Strings;

public class Regexes_ {
    public static void main(String[] args) {
        String num = "5karel";
        if (num.matches("[0-9][abc]")){
            System.out.println("Jsou stejne");
        }
    }
}
