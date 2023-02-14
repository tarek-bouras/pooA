public class cercle {
    private point centre;
    private double rayon;

    public cercle(double x , double y , double rayon){
        this.rayon = rayon;
        this.centre = new point(x, y);
    }

    public void deplaceCentre(double dx, double dy) {
        centre.deplace(dx, dy);
    }

    public void changeRayon(double rayon) {
        this.rayon=rayon;
    }

    public point getCentre(){
        return centre;
    }

    public void affiche() {
        System.out.println("le centre est "+centre.getX()+" "+centre.getY()+" et le rayon est "+rayon);
    }    

    
}
