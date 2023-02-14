
/**
 * point
 */
public class point {

    public double x ,y;

    public point(double x , double y){
        this.x=x;
        this.y=y;
    }

    public void deplace(double dx , double dy){
        x= x+dx;
        y= y+dy;
    }

    public void affiche() {
        System.out.print("les cordonnées"+x+" "+y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static void main(String[] args) {
        System.out.println("main");
        point p = new point(0, 0);
        p.affiche();
        
        System.out.println("\n");

        cercle c = new cercle(0, 0, 0);
        c.affiche();

        System.out.println("\n");

        cercle2 c2 = new cercle2(0, 0, 0);
        c2.affiche();
    }

}