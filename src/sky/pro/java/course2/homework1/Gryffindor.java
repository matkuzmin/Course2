package sky.pro.java.course2.homework1;

public class Gryffindor extends Hogwards {
    protected int nobility;
    protected int honor;
    protected int bravery;

    public Gryffindor(String studname, int nobility, int honor, int bravery, int transgressionDistance, int powerMagic) {
        super(transgressionDistance, powerMagic, studname);
        this.bravery = bravery;
        this.nobility = nobility;
        this.honor = honor;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public int score() {
        int a = getBravery() + getHonor() + getNobility();
        return a;
    }


    public static void calculatingBestFaculty(Gryffindor a, Gryffindor b) {
        System.out.println(a.getStudName() + "благородство = " + a.getBravery() + "баллов, честь = " + a.getHonor()
                + " баллов и храбрость = " + a.getBravery() + "баллов");
        System.out.println(b.getStudName() + "благородство = " + b.getBravery() + "баллов, честь = " + b.getHonor()
                + " баллов и храбрость = " + b.getBravery() + "баллов");
        if (a.score() > b.score())
            System.out.println(a.getStudName() + " лучший Гриффиндорец, чем " + a.getStudName());
        else
            System.out.println(b.getStudName() + " лучший Гриффиндорец, чем " + b.getStudName());
    }

    @Override
    public String toString() {
        return
                "Факултет грифиндор " +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
