1/-Si le coefficient 'a' est égal à zéro ('a'=0), alors l'équation n'est plus du second degré et la méthode ne peut pas être utilisée pour la résoudre. 
Dans ce cas, elle devrait plutôt lever une exception IllegalArgumentException pour signaler que le coefficient 
'a' ne peut pas être zéro.

2/-Si le discriminant (Δ) est négatif, alors l'équation n'a pas de racines réelles.
Dans ce cas, la méthode renvoie actuellement null, mais il serait préférable de renvoyer un tableau vide pour indiquer explicitement qu'il n'y a pas de racines réelles.

3/-Si le discriminant est positif, la méthode ne vérifie pas si la racine carrée de delta est réelle. 
Il est nécessaire de lever une exception si elle est négative pour éviter les résultats indéfinis.