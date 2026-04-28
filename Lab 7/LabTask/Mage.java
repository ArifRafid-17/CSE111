public class Mage extends GameCharacter {
    int intelligence;
    int mana;

    public Mage(String a, int b, int c, int d, String e){
        super(a,b,e);
        intelligence=c;
        mana=d;
        if(characterCount<5)
        allCharacters[characterCount++]=a;
        System.out.println("A new Mage came to live");
    }

    public void calculateDamage(){
        totalDamage=(getLevel()* intelligence) + (mana * 10);
    }

    public String toString(){
          return getCharacterInfo()+"\nCharacter Type: Mage"+"\nWeapon: "+weaponType+
        "\nIntellingence: "+intelligence+", Mana: "+mana+"\nTotal Damage: "+totalDamage;
    }

}
