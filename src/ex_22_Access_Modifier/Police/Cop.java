package ex_22_Access_Modifier.Police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

    // Method and / Behav
    protected void canIShoot() {
        System.out.println("Yes you can !!");
    }

    void thisDefaultF1() {
        System.out.println("Hi, Cop!");
    }
}
