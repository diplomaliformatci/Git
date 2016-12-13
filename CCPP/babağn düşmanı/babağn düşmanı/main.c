//
//  main.c
//  babağn düşmanı
//
//  Created by Can KINCAL on 20.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int carpim ;
    if (argc !=3){
        printf("parametre sayisi 2 olmalıdır ! \n");
        exit (1);
    }
    else {
        printf("program adı : %s \n", argv[0]);
        printf("parametre 1 : %s \n",argv[1]);
        printf("parametre 2 : %s \n",argv[2]);
    }
    carpim = atoi(argv[1]) * atoi (argv[2]);
    printf("carpim sonucu -> %s x % s = % d \n",argv[1],argv[2],carpim);
    printf("Hello, World!\n");
    return 0;
}
