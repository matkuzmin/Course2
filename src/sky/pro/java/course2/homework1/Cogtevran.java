package sky.pro.java.course2.homework1;

public class Cogtevran extends Hogwards {
    private int smart;
    private int wise;
    private int witty;
    private int creation;
    public Cogtevran (String studname,int smart,int wise,int witty,int creation,int transgressionDistance,int powerMagic){
        super(transgressionDistance,powerMagic,studname);
        this.smart=smart;
        this.wise=wise;
        this.witty=witty;
        this.creation=creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public int score(){
        int a = getCreation()+getSmart()+getWise()+getWitty();
        return a;
    }
    public void calculatingBestFaculty(Cogtevran a, Cogtevran b) {
        System.out.println(a.toString());
        System.out.println(b.toString());
        if (a.score() > b.score())
            System.out.println(a.getStudName() + " лучший Гриффиндорец, чем " + a.getStudName());
        else
            System.out.println(b.getStudName() + " лучший Гриффиндорец, чем " + b.getStudName());
    }

    @Override
    public String toString() {
        return "Cogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creation=" + creation +
                '}';
    }
}
