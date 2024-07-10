public class stringss {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tarun");
        System.out.println(sb);

        //charAt 0
        System.out.println(sb.charAt(2));    

        //insert
        sb.insert(3, "u");
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        //in strings: Str=str+"n";
        sb.append("n");
        sb.append("s");
        System.out.println(sb);
        System.out.println(sb.length());

}
}
