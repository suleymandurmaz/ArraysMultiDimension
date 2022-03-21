package day015;

public class Arrays {
    public static void main(String[] args) {
        //Tek boyutlu dizi - Vektör
        //İki boyutlu dizi - Matris

 /*       String[] gunler;
        gunler=new String[7];
        gunler[0]="Pazartesi";
        //..
        gunler[6]="Pazar";
    */

    String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        System.out.println("Eleman Adedi = "+gunler.length);
        System.out.println("İlk Eleman (Sıfırıncı index) : "+gunler[0]);
        System.out.println("Son Eleman (Altıncı index): "+gunler[6]);
/*        for (int i = 0; i < gunler.length; i++) {
            System.out.println(gunler[i]);
        }*/

        for(String gun:gunler){
            System.out.println(gun);
        }
    }
}
