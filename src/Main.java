public class Main {
    public static void main(String[] args){
    byte a= 1;
    short b= 4;
    int c= 7;
    long d= 18967786;
    float i= 1.6f;
    double  g= 1.67;

        System.out.println("значение переменной: "+ a + " с типом: "+ a +" ровно: "
            + a);
        System.out.println("значение переменной: "+ b + " с типом: "+ b +" ровно: "
            + b);
        System.out.println("значение переменной: "+ c + " с типом: "+ c +" ровно: "
            + c);
        System.out.println("значение переменной: "+ d + " с типом: "+ d +" ровно: "
            + d);
        System.out.println("значение переменной: "+ i + " с типом: "+ i +" ровно: "
            + i);
        System.out.println("значение переменной: "+ g + " с типом: "+ g +" ровно: "
            + g);

    byte e= 67;
    short f= -159;
    int h= 569;
    long j= 987_678_965_549L;
    float y= 27.12f;
    double  u= 2.786;

    System.out.println(e);
    System.out.println(f);
    System.out.println(h);
    System.out.println(j);
    System.out.println(y);
    System.out.println(u);

    int clas1=23;
    int clas2=27;
    int clas3=30;
    int totalLeaf= 480;
    int totalPeple= clas1+clas2+clas3;
    int totalPerLeaf=totalLeaf/totalPeple;

    System.out.println("На каждого учника расчитано: "+ totalPerLeaf +" листов бумаги" );


    int oneMinute=16;
    int twentyMinute=oneMinute * 20;
    int oneDay=oneMinute * 24*60 ;
    int threeDay=oneDay* 3;
    int oneMonth=oneDay * 30;

    System.out.println("За 20 минут  " + " машина произвела " + twentyMinute +" бутылок" );
    System.out.println("За сутки "+ " машина произвела " + oneDay +" бутылок" );
    System.out.println("За 3 дня "+ " машина произвела " + threeDay +" бутылок" );
    System.out.println("За месяц "+ " машина произвела " + oneMonth +" бутылок" );

    int whiteCans= 2;
    int brownCans= 4;
    int totalCans= 120;
    int totalClass= totalCans / (whiteCans + brownCans);
    int totalWhiteCans=totalClass  * whiteCans;
    int totalBrownCans=totalClass  * brownCans;

    System.out.println("В школе где  "+totalClass+ " классов нужно "+ totalWhiteCans +" банок белой краски " + totalBrownCans+ " банок коричневой краски"  );

    int bananaCount=5;
    int bananaWeight=80;
    int milkWeight=210;
    int iceCreamWeight=200;
    int eegsCount=4;
    int eegsWeight=70;
    int bananasWeight=bananaCount *bananaWeight;
    int eegsTotslWeight=eegsCount*eegsWeight;
    int totslWeight=eegsTotslWeight+bananasWeight+milkWeight+iceCreamWeight;
    double totalWeightkg= totslWeight/1000.0;

    System.out.println("Общий вес завтрака:" + totslWeight+ " вес в килограммах: "+ totalWeightkg);

    int weihht= 7;
    double weightLose1= 0.25;
    double weightLose2= 0.50;
    int dayPerLose=(int)Math.ceil (weihht/weightLose1);
    int dayPerLose2=(int)Math.ceil (weihht/weightLose2);
    int averegeDays= (dayPerLose+dayPerLose2)/ 2;

    System.out.println("теряем в день " +weightLose1+ " нужно дней "+ dayPerLose);
    System.out.println("теряем в день " +weightLose2+ " нужно дней "+ dayPerLose2);
    System.out.println("среднее количество дней "+ averegeDays);

    int mashaSaLari=67760;
    int denisSaLari=83690;
    int kristinaSaLari=76230;

    int mashaNewSaLari= (int)(mashaSaLari* 1.1);
    int denisNewSaLari=(int) (denisSaLari* 1.1);
    int kristinaNewSaLari=(int) (kristinaSaLari* 1.1);

    int mashaSaLariBeforeIndexsation=mashaSaLari* 12;
    int denisSaLariBeforeIndexsationa=denisSaLari* 12;
    int kristinaSaLariBeforeIndexsation=kristinaSaLari* 12;

    int mashaSaLariAfterIndexsation=mashaNewSaLari* 12;
    int denisSaLariAfterIndexsation=denisNewSaLari* 12;
    int kristinaSaLariAfterIndexsation=kristinaNewSaLari* 12;

    int mashadifferenceSalari= mashaSaLariAfterIndexsation- mashaSaLariBeforeIndexsation;
    int denisdifferenceSalari= denisSaLariAfterIndexsation-denisSaLariBeforeIndexsationa;
    int kristinadifferenceSalari= kristinaSaLariAfterIndexsation-kristinaSaLariBeforeIndexsation;



    System.out.println(" Теперь маша получает "+ mashaNewSaLari +" разница составила " + mashadifferenceSalari);
    System.out.println(" Теперь денис получает "+ denisNewSaLari +" разница составила " + denisdifferenceSalari);
    System.out.println(" Теперь кристина получает "+ kristinaNewSaLari +" разница составила " + kristinadifferenceSalari);




}
}
