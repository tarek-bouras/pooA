# Exo 01 
On dispose de la classe suivante : <br/>
` public class Point {`
`public Point (double x, double y) { this.x=x ; this.y=y ; }`<br/>
`public void deplace (double dx, double dy) { x+=dx ; y+=dy ; }`<br/>
`public void affiche () {`<br/>
`System.out.println ("Point de coordonnees " + x + " " + y) ;`<br/>
`}`<br/>
`public double getX() { return x ; }`<br/>
`public double getY() { return y ; }`<br/>
`private double x, y ;`<br/>
`} `
<br/>
On souhaite réaliser une classe Cercle disposant des méthodes suivantes : <br/>
• constructeur recevant en argument les coordonnées du centre du cercle et son rayon,
<br/>
• deplaceCentre pour modifier les coordonnées du centre du cercle,
<br/>
• changeRayon pour modifier le rayon du cercle,<br/>
• getCentre qui fournit en résultat un objet de type Point correspondant au centre du cercle,<br/>
• affiche qui affiche les coordonnées du centre du cercle et son rayon.<br/>
- Définir la classe Cercle comme possédant un membre de type Point.
- Définir la classe Cercle2 comme classe dérivée de Point.<br/>
Dans les deux cas, on écrira un petit programme mettant en jeu les différentes fonctionnalités de la
classe Cercle.