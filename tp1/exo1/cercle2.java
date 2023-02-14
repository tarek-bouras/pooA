public class cercle2 extends point{
    
    private double rayon;

    public cercle2(double x , double y ,double rayon){
        super(x, y);
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx , double dy){
        super.deplace(dx, dy);
    }

    public void changeRayon( double rayon) {
        this.rayon=rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void affiche(){
        System.out.println("le cordonnées sont "+getX() + " "+getY()+" le rayon est  "+rayon);
    }

    
}
