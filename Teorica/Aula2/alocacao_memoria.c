#include <stdio.h>

int main()
{
    int i;
    int v[5];
    printf("i = %d\n", i);
    printf("endereco de i: %p\n", &i);
    printf("Tamanho do int para esse compilador: %d\n", sizeof(i));

    printf("v = %p\n", v);
    printf("tamanho de v : %d bytes\n", sizeof(v));
    return 0;
}
