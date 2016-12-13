//
//  main.c
//  kkkkkkkk
//
//  Created by Can KINCAL on 24.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
int topla(int[],int);
int main(int argc, const char * argv[]) {
    int dizi[10];
    int elemansayisi;
    scanf("%d",&elemansayisi);
    for (int i =0;i<elemansayisi;i++){
        scanf("%d",&dizi[i]);
    }
    printf("%d",topla(dizi,elemansayisi));
    printf("Hello, World!\n");
    return 0;
}
int topla(int dizi[],int elemansayisi){
    int toplam=0;
    for (int i = 0 ; i < elemansayisi; i++)
    toplam+=dizi[i];
    return toplam;
}