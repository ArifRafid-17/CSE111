public class Artifact{
    private String charName;
    private String artifact;
    private static Artifact [] arr = new Artifact[4];
    private static int count=0;
    private int power;
    private static int strongestPower;


    public Artifact(String a, String b){
        artifact= a;
        charName= b;
    }
    public Artifact(String a){
        artifact =a;
        charName = "Okabe";
    }

    public static void AddtoVault(Artifact p){
        
        if(count<4){
            arr[count]=p;
            count++;
            System.out.println(p.charName+" added "+p.artifact+" successfully to the vault.");
        }
        else{
            System.out.println("!!"+p.charName+" unsuccessful in adding artifact to the vault!!");

        }

    }

    public static void calculate() {
        for (int i = 0; i < count; i++) {
            int len = arr[i].artifact.length();
            int sum = 0;
            int start;


            if (len % 2 == 0) {
                start = 0;
            } 
            else {
                start = 1;
            }


            for (int k = start; k < len; k += 2) {
                sum += (int) arr[i].artifact.charAt(k);
            }
            arr[i].power = sum;
        }
    }

    public static void labReport(){
        calculate();
        System.out.println("=== Future Gadget Lab ===");
        for(int i=0; i<count; i++){
            System.out.println(arr[i].artifact+ " added by "+arr[i].charName+" has power of "+arr[i].power);
        }


    }

    public String GetName(){
        return charName;
    }

    public int CalcPower(){
        return power;
    }

    public static String strongest(){
        int kk =-1;
        for(int i=0; i<count; i++){
            if(strongestPower<arr[i].power){
                strongestPower = arr[i].power;
                kk=i;
            }
        }
        return arr[kk].artifact;
    }

    public void revealArtifact(){
        System.out.println(artifact+" added by "+charName+ " has power of "+ power);
    }

    public void changeName(String a){
        artifact = a;
        calculate();

        System.out.println("Name changed and power recalculated.");

    }
}