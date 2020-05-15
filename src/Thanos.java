import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        // 2 : Add those heroes to the list

        // References et instances
        Hero hero0 = new Hero("Black Widow",34);        // name: Black Widow, age: 34
        Hero hero1 = new Hero("Captain America",100);   // name: Captain America, age: 100
        Hero hero2 = new Hero("Vision",3);              // name: Vision, age: 3
        Hero hero3 = new Hero("Iron Man",48);           // name: Iron Man, age: 48
        Hero hero4 = new Hero("Scarlet Witch",29);      // name: Scarlet Witch, age: 29
        Hero hero5 = new Hero("Thor",1500);             // name: Thor, age: 1500
        Hero hero6 = new Hero("Hulk",49);               // name: Hulk, age: 49
        Hero hero7 = new Hero("Doctor Strange",42);     // name: Doctor Strange, age: 42

        // Filling heroes's list : add 8 Hero(s)
        heroes.add(hero0);
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        heroes.add(hero5);
        heroes.add(hero6);
        heroes.add(hero7);

        // 3 : It's Thor birthday, now he's 1501
        //System.out.println(heroes.get(5).getName()+"'s age before: "+heroes.get(5).getAge());
        heroes.get(5).setAge(1501);
        //System.out.println(heroes.get(5).getName()+"'s age after : "+heroes.get(5).getAge());

        // 4 : Shuffle the heroes list
        //System.out.println("List before shuffle: "+heroes);
        Collections.shuffle(heroes);
        //System.out.println("list after shuffle: "+heroes);

        // 5 : Keep only the half of the list
        int oldSize = heroes.size();
        int newSize = oldSize/2;
        for(int i=oldSize-1 ; i>=newSize; i--){
            heroes.remove(i);
        }
        //System.out.println("First alf list part: "+heroes);

        // 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero myHero : heroes){
            System.out.println(myHero.getName());
        }
    }
}
