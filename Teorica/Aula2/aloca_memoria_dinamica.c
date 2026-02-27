#include <stdio.h> 
#include <stdlib.h>

int main(){
    int *v;
    // o * serve para duzer que o V virou um ponteiro
   while ((v = (int *)malloc(1000 * sizeof(int))) != NULL){
       
    printf("passou v = %p", v);
   }; // equivalente a v = new int[5]; em Java
    return 0;
}
