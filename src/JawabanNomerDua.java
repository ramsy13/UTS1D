public class JawabanNomerDua {
    public static void ubahhuruf(String[]_blok) {
        for (int idx = 0; idx < _blok.length; idx++) {
            System.out.println(_blok[idx].replace("e","*"));
        }
    }
    public static void main(String[] args) {
        String[] _block = new String[]{"Triangle","Cubes","Circle"};
        ubahhuruf(_block);
    }
}
