package sky.pro.java.course2.homework1;

public abstract class Hogwards {
    private String studName;
    private int transgressionDistance;
    private int powerMagic;
public Hogwards(int transgressionDistance,int powerMagic,String studName){
    this.powerMagic = powerMagic;
    this.transgressionDistance = transgressionDistance;
    this.studName = studName;
}
public abstract int score();
    public static int sumScholl(Hogwards hogwards){
        int sum = hogwards.getPowerMagic()+ hogwards.getTransgressionDistance();
        return sum;
    }
    public static void comparisonSchool ( Hogwards a,Hogwards b){
        if (sumScholl(a)>sumScholl(b))
            System.out.println(a.getStudName() + " обладает бОльшей мощностью магии, чем "+b.getStudName());

        else
            System.out.println(b.getStudName() + " обладает большей мощностью магии, чем "+a.getStudName());

    }


    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int getPowerMagic() {
        return powerMagic;
    }
    public static void printStud(Hogwards a){
        System.out.println( "Имя='" + a.studName + '\'' +
                ", Дистанция трансгрессии=" + a.transgressionDistance +
                ", Сила магии=" + a.powerMagic +
                ' ' + a.toString());

    }

    @Override
    public String toString() {
        return
                "Имя='" + studName + '\'' +
                ", Дистанция трансгрессии=" + transgressionDistance +
                ", Сила магии=" + powerMagic +
                ' ';
    }
}

