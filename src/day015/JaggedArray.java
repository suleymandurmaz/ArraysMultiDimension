package day015;

public class JaggedArray {
    public static void main(String[] args) {
        //Jagged Diziler
        //1. Günler
        //2. Aylar
        //3. Mevsimler
/*        String[][] time=new String[3][];
        time[0]=new String[7];
        time[1]=new String[12];
        time[2]=new String[4];

        time[0][0]="Pazartesi";
        time[0][1]="Salı";
        time[0][2]="Çarşamba";
        time[0][3]="Pazartesi";
        time[0][4]="Pazartesi";
        time[0][5]="Pazartesi";
        time[0][6]="Pazartesi";   */


        String[][] time={
                {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"},
                {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"},
                {"İlkbahar","Yaz","Sonbahar","Kış"}

        };
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[i].length; j++) {
//                System.out.print(time[i][j]+" ");
                System.out.print("("+i+";"+j+")\t");
            }
            System.out.println();
        }

    }
}
