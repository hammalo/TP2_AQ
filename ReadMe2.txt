 j'ai corrigé l'erreur suivante :

Dans la boucle for qui itère sur les caractères des chaînes s1 et s2, j'ai changé i <= s1.length() en i < s1.length() pour éviter un dépassement d'index.