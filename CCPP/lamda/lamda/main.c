//
//  main.c
//  lamda
//
//  Created by Can KINCAL on 21.10.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int sayi1,sayi2;
    printf("sayi08 giriniz :");
    scanf("%d",&sayi1);
    do{
        printf("2. bir sayi giriniz: ");
        scanf("%d",&sayi2);
        
    }while(sayi1%2==sayi2%2);
    printf("Hello, World!\n");
    return 0;
}
