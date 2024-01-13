class Commerce {
    public static void main(String[] args) {
        Article a1 = saisirArticle("Pomme", 1.5);
        Article a2 = saisirArticle("Poire", 2.5);
        Article a3 = saisirArticle("Banane", 3.5);
        Article a4 = saisirArticle("Orange", 4.5);
        Article a5 = saisirArticle("Fraise", 5.5);
        Article a6 = saisirArticle("Framboise", 6.5);
        Article a7 = saisirArticle("Cerise", 7.5);
        Article a8 = saisirArticle("Abricot", 8.5);
        Article a9 = saisirArticle("Pêche", 9.5);
        Article a10 = saisirArticle("Mangue", 10.5);

        Panier p = initialiserPanier();
        ajouterArticle(p, a1);
        ajouterArticle(p, a2);
        ajouterArticle(p, a3);
        ajouterArticle(p, a4);
        ajouterArticle(p, a5);
        ajouterArticle(p, a6);
        ajouterArticle(p, a7);
        ajouterArticle(p, a8);
        ajouterArticle(p, a9);
        ajouterArticle(p, a10);

        afficherPanier(p);
        System.out.println("Prix total: " + prixTotal(p));
    }

    public static Article saisirArticle(String nom, double prix) {
        Article a = new Article();
        a.nom = nom;
        a.prix = prix;
        return a;
    }

    public static void afficherArticle(Article a) {
        System.out.println("Article: " + a.nom + ", prix: " + a.prix);
    }

    public static Panier initialiserPanier() {
        Panier p = new Panier();
        p.articles = new Article[100];
        p.nbArticles = 0;
        return p;
    }

    public static void afficherPanier(Panier p) {
        System.out.println("Panier: ");
        for (int i = 0; i < p.nbArticles; i++) {
            afficherArticle(p.articles[i]);
        }
    }

    public static double prixTotal(Panier p) {
        double res = 0;
        for (int i = 0; i < p.nbArticles; i++) {
            res += p.articles[i].prix;
        }
        return res;
    }

    public static boolean ajouterArticle(Panier p, Article a) {
        if (p.nbArticles < p.articles.length) {
            p.articles[p.nbArticles] = a;
            p.nbArticles++;
            return true;
        } else {
            return false;
        }
    }
}