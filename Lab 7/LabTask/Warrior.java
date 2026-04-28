public class Warrior extends GameCharacter {
    int strength;
    int armor;

    public Warrior(String a,int b, int c, int d, String e ){
        super(a,b,e);
        strength=c;
        armor=d;
        if(characterCount<5)
        allCharacters[characterCount++]=a;
        System.out.println("A new warrior has arrived");
    }

    public void calculateDamage(){
        totalDamage= (getLevel() * strength) + (armor * 50);
    }

    public String toString(){
        return getCharacterInfo()+"\nCharacter Type: Warrior"+"\nWeapon: "+weaponType+
        "\nStrength: "+strength+", Armor: "+armor+"\nTotal Damage: "+totalDamage;
    }
}
