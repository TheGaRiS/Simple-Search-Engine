// Posted from EduTools plugin
class Problem {

    public static void main(String args[]) {
        int length = args.length;
        for (int i = 0; i < length; i+=2){
            System.out.println(args[i] + '=' + args[i+1]);
        }
    }
}