package tp2.exo01;

interface MatriceCarree {
    int taille () ;
    // retourne la taille N de la matrice carrée NxN
    double getValeur (int i, int j) ;
    // retourne la valeur d'indice (i, j)
    
    void setValeur (int i, int j, double v) ;
    // affecte v à la position (i, j)
    void add (MatriceCarree m) ;
    // effectue l’addition entre la matrice courante et la matrice m
}