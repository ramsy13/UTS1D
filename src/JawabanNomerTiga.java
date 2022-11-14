import java.util.Scanner;

public class JawabanNomerTiga {
    static int jumplat = 20;
    public static String[] infoplat = new String[]{
            "K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};
    public static String[] Kudus = new String[4];
    public static String[] Jakarta = new String[4];
    public static String[] Jogja = new String[4];
    public static String[] Karawang = new String[4];
    public static String[] Solo = new String[4];

    public static void mengambilinfoplat() {
        int sisaplat = 0;
        int platkudus = 0;
        for (int index = 0; index < Kudus.length; index++) {
            if (Kudus[index] != null) {
                platkudus++;
            }
        }
        int platjakarta = 0;
        for (int index = 0; index < Jakarta.length; index++) {
            if (Jakarta[index] != null) {
                platjakarta++;
            }
        }
        int platjogja = 0;
        for (int index = 0; index < Jogja.length; index++) {
            if (Jogja[index] != null) {
                platjogja++;
            }
        }
        int platkarawang = 0;
        for (int index = 0; index < Karawang.length; index++) {
            if (Karawang[index] != null) {
                platkarawang++;
            }
        }
        int platsolo = 0;
        for (int index = 0; index < Solo.length; index++) {
            if (Solo[index] != null) {
                platsolo++;
            }
        }
        sisaplat = jumplat - platkudus - platjakarta - platkarawang - platjogja - platsolo;
        System.out.println("Total plat kudus : " + platkudus + " | Total plat jakarta : " + platjakarta + " | Total plat jogja : " + platjogja + " | Total plat karawang : " + platkarawang + " | Total plat solo : " + platsolo);
        System.out.println("Jumlah Penerima : " + jumplat + " Sisa kuota : " + sisaplat);
    }

    public static void array(String[] ramarray, String plat) {
        int indexnow = 0;
        for (int index = 0; index < ramarray.length; index++) {
            if (ramarray[index] != null) {
                indexnow = index + 1;
            }
            if (indexnow < ramarray.length) {
                ramarray[indexnow] = plat;
            }
        }
    }
    public static void cekplat(String kodeplat){
        if (kodeplat.contains("K")){
            array(Kudus,kodeplat);
            mengambilinfoplat();
        } else if (kodeplat.contains("B")){
            array(Jakarta,kodeplat);
            mengambilinfoplat();
        } else if (kodeplat.contains("AB")){
            array(Jogja,kodeplat);
            mengambilinfoplat();
        } else if (kodeplat.contains("T")){
            array(Karawang,kodeplat);
            mengambilinfoplat();
        } else if (kodeplat.contains("AD")){
            array(Solo,kodeplat);
            mengambilinfoplat();
        }else {
            System.out.println("Kode tidak valid");
        }
    }
    public static void inputplat(){
        while (true){
            Scanner rama = new Scanner(System.in);
            System.out.println("Masukan nomor plat : ");
            String platnomor= rama.nextLine();
            cekplat(platnomor);
        }
    }
    public static void main(String[] args) {
        inputplat();
    }
}