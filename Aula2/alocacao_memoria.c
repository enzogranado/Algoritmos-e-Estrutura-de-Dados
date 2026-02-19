#include <stdio.h>

int main()
{
    int i;
    printf("i = %d\n", i);
    printf("endereco de i: %p\n", &i);
    printf("Tamanho do int para esse compilador: %d\n", sizeof(i));
    return 0;
}
