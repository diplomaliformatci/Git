//
//  main.c
//  tek top çift top
//
//  Created by Can KINCAL on 9.11.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int sayi,sayactek=0,sayaccift=0;
    int tektop=0,cifttop=0;
    scanf("%d",&sayi);
    while (sayi!=0){
        scanf("%d",&sayi);
        if (sayi%2==0){
            cifttop+=sayi;
            sayaccift++;
        }
        else
        {
            tektop+=sayi;
            sayactek++;
        }
    
        
    }
printf("tek toplam = %d \ncift toplam  = %d \ntek sayi sayisi = %d \ncift sayi sayisi = %d",tektop,cifttop,sayactek,sayaccift);
    printf("Hello, World!\n");
    return 0;
}
