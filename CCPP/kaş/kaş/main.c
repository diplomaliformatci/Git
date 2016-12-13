//
//  main.c
//  kaş
//
//  Created by Can KINCAL on 17.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <ctype.h>
int esitlikolc(char dizi[],char dizi2[],int a){
    for (int i=0;i<=a;i++)
    {  dizi[i]=tolower(dizi[i]);
        dizi2[i]=tolower(dizi2[i]);
    }
    
    for (int i=0;i<=a;i++)
        if (dizi[i]!=dizi2[i])
            return 0;
    return 1;

}
    
    
    
int main(int argc, const char * argv[]) {
    int i=0;
    char dizi[10];
    char dizi2[10];
    scanf("%s",dizi);
    scanf("%s",dizi2);
    while (dizi[i]!='\0' && dizi2[i]!= '\0'){
           i++;
           }
    esitlikolc(dizi,dizi2,i);
    if (esitlikolc(dizi,dizi2,i))
        printf("kelimeler ayni");
    else
        printf("kelimeler ayni degil");
    
    return 0;
}
