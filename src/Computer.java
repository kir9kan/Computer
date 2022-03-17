import java.util.Random;
import java.util.Scanner;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    int fullLifeCircle=3;

    public Computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram +
                ", HDD=" + hdd +
                ", fullLifeCicle=" + fullLifeCircle +
                '}';
    }
    public void tenOnn(){
        if(isEqualNumber()&&fullLifeCircle>0){
            System.out.println("компютер включился");
        }
        else {
            System.out.println("компьютер сгорел");
        }
    }
    public void tenOff(){

        if(isEqualNumber()&&fullLifeCircle>0){
            System.out.println("компютер включился");
            fullLifeCircle--;
        }
        else {
            System.out.println("компьютер сгорел");
        }
    }
    public boolean isEqualNumber(){
        Random  random=new Random();
        int randomValue=random.nextInt(2);
        Scanner scanner=new Scanner(System.in);
        int userEnteredValue=scanner.nextInt();
        return randomValue == userEnteredValue;
    }

}
