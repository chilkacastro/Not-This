import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
<<<<<<< HEAD
public class Level1 extends MyWorld {
        /**
         * Constructor for objects of class Level1.
         * 
         */
        public Level1() {
            setPaintOrder(Car.class, Bench.class, TrafficCone.class, Car2.class, Toby.class);
            prepare();
            showLife();
            showScore();
            
        }

=======
public class Level1 extends MyWorld 
{
    protected Counter counter =  new  Counter();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        setPaintOrder(Bench.class,Toby.class,Car.class, TrafficCone.class, Car2.class);
        prepare();
        showScore();
        loseCondition();
        
    }
    /**
     * Returns the life counter
     */
    public Counter getCounter()
    {
        return counter;
    }
    
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter =  new  Counter();
        removeObject(counter);
        TrafficCone trafficCone = new TrafficCone();
        addObject(trafficCone,120,563);
        TrafficCone trafficCone2 = new TrafficCone();
        addObject(trafficCone2,151,562);
        trafficCone2.setLocation(148,568);
        TrafficCone trafficCone3 = new TrafficCone();
        addObject(trafficCone3,721,437);
        trafficCone3.setLocation(717,438);
        TrafficCone trafficCone4 = new TrafficCone();
        addObject(trafficCone4,739,434);
        trafficCone4.setLocation(739,434);
        Hole2 hole2 = new Hole2();
        addObject(hole2,1418,315);
        Hole2 hole22 = new Hole2();
        addObject(hole22,109,197);
        Hole2 hole23 = new Hole2();
        addObject(hole23,1397,81);
        Hole2 hole24 = new Hole2();
        addObject(hole24,181,438);
        TrafficCone trafficCone5 = new TrafficCone();
        addObject(trafficCone5,1344,559);
        TrafficCone trafficCone6 = new TrafficCone();
        addObject(trafficCone6,1373,560);
        TrafficCone trafficCone7 = new TrafficCone();
        addObject(trafficCone7,594,311);
        TrafficCone trafficCone8 = new TrafficCone();
        addObject(trafficCone8,563,314);
        trafficCone8.setLocation(565,313);
        TrafficCone trafficCone9 = new TrafficCone();
        addObject(trafficCone9,536,310);
        TrafficCone trafficCone10 = new TrafficCone();
        addObject(trafficCone10,172,563);
        TrafficCone trafficCone11 = new TrafficCone();
        addObject(trafficCone11,1312,561);
        trafficCone11.setLocation(1312,561);
        trafficCone11.setLocation(1313,559);
        Hole2 hole25 = new Hole2();
        addObject(hole25,904,506);
        Hole2 hole26 = new Hole2();
        addObject(hole26,1211,441);
        Hole2 hole27 = new Hole2();
        addObject(hole27,557,445);
        Hole2 hole28 = new Hole2();
        addObject(hole28,704,314);
        Hole2 hole29 = new Hole2();
        addObject(hole29,1038,202);
        Hole2 hole210 = new Hole2();
        addObject(hole210,338,76);
        Hole2 hole211 = new Hole2();
        addObject(hole211,65,510);
        Hole1 hole1 = new Hole1();
        addObject(hole1,560,572);
        Hole1 hole12 = new Hole1();
        addObject(hole12,570,194);
        Hole1 hole13 = new Hole1();
        addObject(hole13,901,78);
        Hole1 hole14 = new Hole1();
        addObject(hole14,7,318);
        TrafficCone trafficCone12 = new TrafficCone();
        addObject(trafficCone12,40,312);
        TrafficCone trafficCone13 = new TrafficCone();
        addObject(trafficCone13,69,313);
        TrafficCone trafficCone14 = new TrafficCone();
        addObject(trafficCone14,10,465);
        trafficCone14.setLocation(68,427);
        TrafficCone trafficCone15 = new TrafficCone();
        addObject(trafficCone15,92,429);
        TrafficCone trafficCone16 = new TrafficCone();
        addObject(trafficCone16,508,435);
        TrafficCone trafficCone17 = new TrafficCone();
        addObject(trafficCone17,601,433);
        TrafficCone trafficCone18 = new TrafficCone();
        addObject(trafficCone18,993,197);
        TrafficCone trafficCone19 = new TrafficCone();
        addObject(trafficCone19,1015,171);
        trafficCone19.setLocation(1123,199);
        trafficCone19.setLocation(1081,189);
        TrafficCone trafficCone20 = new TrafficCone();
        addObject(trafficCone20,1357,193);
        TrafficCone trafficCone21 = new TrafficCone();
        addObject(trafficCone21,1326,195);
        TrafficCone trafficCone22 = new TrafficCone();
        addObject(trafficCone22,1205,194);
        trafficCone22.setLocation(684,204);
        trafficCone22.setLocation(706,194);
        TrafficCone trafficCone23 = new TrafficCone();
        addObject(trafficCone23,730,193);
        TrafficCone trafficCone24 = new TrafficCone();
        addObject(trafficCone24,282,193);
        TrafficCone trafficCone25 = new TrafficCone();
        addObject(trafficCone25,297,74);
        TrafficCone trafficCone26 = new TrafficCone();
        addObject(trafficCone26,383,74);
        hole210.setLocation(338,76);
        TrafficCone trafficCone27 = new TrafficCone();
        addObject(trafficCone27,69,193);
        TrafficCone trafficCone28 = new TrafficCone();
        addObject(trafficCone28,142,194);
        TrafficCone trafficCone29 = new TrafficCone();
        addObject(trafficCone29,930,75);
        TrafficCone trafficCone30 = new TrafficCone();
        addObject(trafficCone30,873,77);
        trafficCone30.setLocation(877,70);
        trafficCone29.setLocation(931,77);
        TrafficCone trafficCone31 = new TrafficCone();
        addObject(trafficCone31,1366,74);
        TrafficCone trafficCone32 = new TrafficCone();
        addObject(trafficCone32,1427,74);
        TrafficCone trafficCone33 = new TrafficCone();
        addObject(trafficCone33,1450,73);
        TrafficCone trafficCone34 = new TrafficCone();
        addObject(trafficCone34,1448,308);
        TrafficCone trafficCone35 = new TrafficCone();
        addObject(trafficCone35,1381,311);
        TrafficCone trafficCone36 = new TrafficCone();
        addObject(trafficCone36,1472,308);
        TrafficCone trafficCone37 = new TrafficCone();
        addObject(trafficCone37,1175,434);
        TrafficCone trafficCone38 = new TrafficCone();
        addObject(trafficCone38,1246,434);
        TrafficCone trafficCone39 = new TrafficCone();
        addObject(trafficCone39,871,503);
        TrafficCone trafficCone40 = new TrafficCone();
        addObject(trafficCone40,933,504);
        TrafficCone trafficCone41 = new TrafficCone();
        addObject(trafficCone41,584,565);
        TrafficCone trafficCone42 = new TrafficCone();
        addObject(trafficCone42,529,563);
        trafficCone41.setLocation(588,566);
        TrafficCone trafficCone43 = new TrafficCone();
        addObject(trafficCone43,1566,434);
        TrafficCone trafficCone44 = new TrafficCone();
        addObject(trafficCone44,1539,435);
        Hole1 hole15 = new Hole1();
        addObject(hole15,1511,440);
        Hole1 hole16 = new Hole1();
        addObject(hole16,1522,567);
        Hole2 hole212 = new Hole2();
        addObject(hole212,1339,587);
        Hole2 hole213 = new Hole2();
        addObject(hole213,1193,563);
        Hole2 hole214 = new Hole2();
        addObject(hole214,392,531);
        hole214.setLocation(392,531);
        Hole2 hole215 = new Hole2();
        addObject(hole215,392,531);
        hole214.setLocation(267,499);
        hole215.setLocation(277,352);
        Hole2 hole216 = new Hole2();
        addObject(hole216,1170,348);
        Hole2 hole217 = new Hole2();
        addObject(hole217,873,230);
        Hole2 hole218 = new Hole2();
        addObject(hole218,1216,110);
        Hole2 hole219 = new Hole2();
        addObject(hole219,651,42);
        Hole2 hole220 = new Hole2();
        addObject(hole220,78,114);
        Hole2 hole221 = new Hole2();
        addObject(hole221,24,45);
        Hole2 hole222 = new Hole2();
        addObject(hole222,535,79);
        hole219.setLocation(693,115);
        hole219.setLocation(436,206);
        hole219.setLocation(126,267);
        hole219.setLocation(281,248);
        TrafficCone trafficCone45 = new TrafficCone();
        addObject(trafficCone45,236,303);
        TrafficCone trafficCone46 = new TrafficCone();
        addObject(trafficCone46,317,308);
        trafficCone45.setLocation(252,304);
        hole219.setLocation(293,276);
        TrafficCone trafficCone47 = new TrafficCone();
        addObject(trafficCone47,960,309);
        TrafficCone trafficCone48 = new TrafficCone();
        addObject(trafficCone48,996,309);
        TrafficCone trafficCone49 = new TrafficCone();
        addObject(trafficCone49,922,307);
        TrafficCone trafficCone50 = new TrafficCone();
        addObject(trafficCone50,1124,308);
        TrafficCone trafficCone51 = new TrafficCone();
        addObject(trafficCone51,1207,307);
        TrafficCone trafficCone52 = new TrafficCone();
        addObject(trafficCone52,949,429);
        Hole1 hole17 = new Hole1();
        addObject(hole17,996,442);
        Hole1 hole18 = new Hole1();
        addObject(hole18,819,441);
        Hole1 hole19 = new Hole1();
        addObject(hole19,138,593);
        TrafficCone trafficCone53 = new TrafficCone();
        addObject(trafficCone53,417,360);
        TrafficCone trafficCone54 = new TrafficCone();
        addObject(trafficCone54,520,357);
        TrafficCone trafficCone55 = new TrafficCone();
        addObject(trafficCone55,121,40);
        TrafficCone trafficCone56 = new TrafficCone();
        addObject(trafficCone56,146,39);
        trafficCone55.setLocation(118,39);
        TrafficCone trafficCone57 = new TrafficCone();
        addObject(trafficCone57,118,39);
        trafficCone56.setLocation(143,34);
        trafficCone55.setLocation(80,33);
        trafficCone55.setLocation(118,32);
        TrafficCone trafficCone58 = new TrafficCone();
        addObject(trafficCone58,1144,33);
        TrafficCone trafficCone59 = new TrafficCone();
        addObject(trafficCone59,1183,31);
        TrafficCone trafficCone60 = new TrafficCone();
        addObject(trafficCone60,1023,123);
        TrafficCone trafficCone61 = new TrafficCone();
        addObject(trafficCone61,630,122);
        TrafficCone trafficCone62 = new TrafficCone();
        addObject(trafficCone62,600,122);
        TrafficCone trafficCone63 = new TrafficCone();
        addObject(trafficCone63,440,120);
        TrafficCone trafficCone64 = new TrafficCone();
        addObject(trafficCone64,413,119);
        TrafficCone trafficCone65 = new TrafficCone();
        addObject(trafficCone65,905,603);
        TrafficCone trafficCone66 = new TrafficCone();
        addObject(trafficCone66,1561,618);
        trafficCone65.setLocation(-32,617);
        trafficCone65.setLocation(1152,568);
        trafficCone65.setLocation(1125,559);
        trafficCone66.setLocation(1588,638);
        trafficCone66.setLocation(827,603);
        trafficCone66.setLocation(961,563);
        trafficCone66.setLocation(1487,231);
        trafficCone66.setLocation(1585,195);
        trafficCone66.setLocation(1586,188);
        Bench bench = new Bench();
        addObject(bench,293,621);
        Bench bench2 = new Bench();
        addObject(bench2,1212,624);
        Bench bench3 = new Bench();
        addObject(bench3,1343,507);
        Bench bench4 = new Bench();
        addObject(bench4,459,497);
        Bench bench5 = new Bench();
        addObject(bench5,121,374);
        Bench bench6 = new Bench();
        addObject(bench6,809,372);
        bench6.setLocation(1494,391);
        bench6.setLocation(1462,371);
        bench6.setLocation(1526,369);
        bench6.setLocation(1317,372);
        Bench bench7 = new Bench();
        addObject(bench7,632,258);
        Bench bench8 = new Bench();
        addObject(bench8,86,254);
        Bench bench9 = new Bench();
        addObject(bench9,1321,251);
        Bench bench10 = new Bench();
        addObject(bench10,1487,133);
        Bench bench11 = new Bench();
        addObject(bench11,848,133);
        bench11.setLocation(831,131);
        bench11.setLocation(831,131);
        removeObject(bench11);
        removeObject(bench8);
        bench7.setLocation(214,117);
        bench7.setLocation(204,237);
        bench7.setLocation(134,245);
        bench5.setLocation(122,370);
        removeObject(bench5);
        bench9.setLocation(1082,256);
        bench9.setLocation(1102,249);
        bench10.setLocation(1392,131);
        bench6.setLocation(1315,369);
        bench6.setLocation(1283,373);
        bench6.setLocation(1293,366);
        bench3.setLocation(1414,496);
        bench2.setLocation(1083,627);
        bench2.setLocation(1060,621);
        bench2.setLocation(1029,621);
        bench2.setLocation(923,633);
        bench2.setLocation(1284,613);
        bench2.setLocation(1289,620);
        bench2.setLocation(1256,622);
        TrafficCone trafficCone67 = new TrafficCone();
        addObject(trafficCone67,779,559);
        TrafficCone trafficCone68 = new TrafficCone();
        addObject(trafficCone68,740,522);
        TrafficCone trafficCone69 = new TrafficCone();
        addObject(trafficCone69,712,523);
        TrafficCone trafficCone70 = new TrafficCone();
        addObject(trafficCone70,684,521);
        bench6.setLocation(1271,366);
        bench6.setLocation(886,388);
        bench6.setLocation(863,368);
        bench9.setLocation(1115,237);
        Toby toby = new Toby();
        addObject(toby,790,619);
        Car2 car2 = new Car2();
        addObject(car2,34,551);
        trafficCone2.setLocation(146,560);
        trafficCone10.setLocation(180,561);
        hole19.setLocation(147,581);
        trafficCone2.setLocation(147,560);
        trafficCone2.setLocation(151,553);
        trafficCone10.setLocation(175,562);
        Car car = new Car();
        addObject(car,1569,587);
        Car car3 = new Car();
        addObject(car3,983,585);
        Car car4 = new Car();
        addObject(car4,476,584);
        trafficCone29.setLocation(932,75);
        trafficCone29.setLocation(932,71);
        trafficCone55.setLocation(86,38);
        trafficCone56.setLocation(164,34);
        trafficCone54.setLocation(483,359);
        removeObject(trafficCone2);
        addObject(counter,1503,24);
        counter.setLocation(1506,23);
        counter.setLocation(1513,20);
        removeObject(counter);

        bench9.setLocation(1126,255);
        bench9.setLocation(1126,255);
        car214.setLocation(135,70);
        trafficCone57.setLocation(128,24);
        trafficCone56.setLocation(157,23);
        trafficCone55.setLocation(101,26);
        Car2 car216 = new Car2();
        addObject(car216,908,548);
        Car2 car217 = new Car2();
        addObject(car217,309,552);
        Car2 car218 = new Car2();
        addObject(car218,645,551);
        Car2 car219 = new Car2();
        addObject(car219,1469,550);
        Car2 car220 = new Car2();
        addObject(car220,1264,63);
        Car2 car221 = new Car2();
        addObject(car221,445,63);
    }
}