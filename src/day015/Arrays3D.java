package day015;

public class Arrays3D {
    public static void main(String[] args) {
        //3D Arrays
        int[][][] notlar={
                {
                    //   V   F
                        {70,80}, //Mat
                        {50,65}, //Fiz
                        {80,85} //Kim
                },//Birinci Öğrenci
                {
                    //    V  F
                        {50,70},//Mat
                        {30,60},//Fiz
                        {75,85}//Kim
                },//İkinci Öğrenci
                {
                    //    V  F
                        {80,80},//Mat
                        {70,70},//Fiz
                        {60,60}//Kim
                }//Üçüncü Öğrenci
        };
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                for (int k = 0; k < notlar[i][j].length; k++) {
                    System.out.print(notlar[i][j][k]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
