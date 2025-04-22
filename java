function insertionSort(arr) {
    // Parcourir le tableau à partir du deuxième élément
    for (let i = 1; i < arr.length; i++) {
        let key = arr[i]; // Élément à insérer
        let j = i - 1;

        // Déplacer les éléments du tableau trié (à gauche)
        // qui sont plus grands que key vers la droite
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insérer l’élément à sa bonne place
        arr[j + 1] = key;

        // Affichage de l’état du tableau après chaque insertion
        console.log(`Étape ${i} :`, arr);
    }

    return arr;
}

// Exemple d'utilisation
let tableau = [8, 4, 2, 9, 5];
console.log("Tableau original :", tableau);

let tableauTrie = insertionSort(tableau);
console.log("Tableau trié :", tableauTrie);
