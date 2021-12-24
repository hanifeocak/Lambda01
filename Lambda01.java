package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    /*
	 	1) Lambda "Functional Programming"
	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	 	ve hatasiz code yazma acilarindan cok faydalidir.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
        Lambda kullanmak hatasız code kullanmaktır.
	 */
    public static void main(String[] args) {
    	
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        printElStructured(list);//method call
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional1(list);//lambda expression
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional1(list);//method reference

    System.out.println();
    System.out.println("   ***   ");
    printCiftElStuructured(list);
    System.out.println();
    System.out.println("   ***   ");
    printCiftElFunctional1(list);
    System.out.println();
    System.out.println("   ***   ");
    printCiftElFunctional2(list);
}  //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz

    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElStructured(List<Integer> list) { //12 13 65 3 7 34 22 60 42 55
        for (Integer w : list) {
            System.out.print(w + " ");

        }
    }

    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//Lambda Expression :Lambda ifadesi
        //stream() : datalari yukaridan asagiya akis sekline getirir.
        //forEach() :datanin parametresine gore her bir elemanı isler
        //t-> : Lambda operatoru
        // Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

    }
    //Method Reference --> kendi create ettigimiz veya java'dan aldigimiz method ile
    // ClassName::MethodName--> ez- ber- leeeeee

    public static void printEl(int t) {//refere eddilecek method create edildi
        System.out.print(t + " ");
    }

    public static void printElfunctional1(List<Integer> list) {
        list.stream().forEach(Lambda01::printEl);//iste lambda budur...
    }

    //structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElStuructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElFunctional1(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(Lambda01::printEl);
        //filter()--> ais icersindeki elemanlari istenen sarta göre filtreleme yapar
    }
    public static boolean ciftBul(int i){//refere edilecek tohum method creATE EDİLDİ

        return i%2==0;

    }
    public static void printCiftElFunctional2(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);//İKİ TANE METHOD REFERE
        //filter()--> ais icersindeki elemanlari istenen sarta göre filtreleme yapar
    }

    //Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz






	}

