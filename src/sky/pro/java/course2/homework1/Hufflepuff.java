package sky.pro.java.course2.homework1;

public class Hufflepuff extends Hogwards {
    protected int industrious;
    protected int faith;
    protected int honest;
    public Hufflepuff (String studname,int industrious,int faith,int honest,int transgressionDistance,int powerMagic){
        super(transgressionDistance,powerMagic,studname);
        this.industrious=industrious;
        this.faith=faith;
        this.honest=honest;
    }


    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public int score(){
        int a = getFaith()+getHonest()+getIndustrious();
        return a;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industrious=" + industrious +
                ", faith=" + faith +
                ", honest=" + honest +
                '}';
    }
}
