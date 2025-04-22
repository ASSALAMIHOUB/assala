#include <stdio.h>

int main() {
    char caractere;
    int longueur = 0, mots = 1, voyelles = 0;

    printf("Entrez une phrase qui se termine par un point :\n");

    do {
        caractere = getchar();
        longueur++;

        if (caractere == ' ') {
            mots++;
        }

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' ||
            caractere == 'u' || caractere == 'y' ||
            caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' ||
            caractere == 'U' || caractere == 'Y') {
            voyelles++;
        }

    } while (caractere != '.');

    printf("\nLongueur de la phrase : %d\n", longueur);
    printf("Nombre de mots : %d\n", mots);
    printf("Nombre de voyelles : %d\n", voyelles);

    return 0;
}
