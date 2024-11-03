#include <stdio.h>

//Leia o Readme para explicações de como funciona o algoritmos
int main(void)
{

    int termo1 = 0; // Define o primeiro termo
    int termo2 = 1; // Define o segundo termo
    int fib = 1; // Define o terceio termo, no qual acontecera a soma dos termos anteriores
    int escolha = 0;
    do //Loop para evitar erros
    {
        printf("Quantos numeros deseja ver? ");
        scanf("%d", &escolha);
        if (escolha < 3) printf("Escolha um numero maior que 3!\n");
    } while (escolha < 3);

    printf("Fibonacci: %d\n", termo1); //Apenas para vizualizar o primeiro digito '0'

    for (int i = 0; i <= escolha - 1; i++)
        {
            printf("Fibonacci: %d\n", fib);
            fib = termo1 + termo2; // Somando termo1 e termo2

            //Altera os valores dos termos, para que na proxima iteração, os valores estejam atualizados
            termo1 = termo2;
            termo2 = fib;
        }
}