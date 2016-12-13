//
//  main.cpp
//  KaganProje
//
//  Created by Can KINCAL on 08/12/2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

#include <iostream>
#include <time.h>
#include <stdlib.h>
#include <stdio.h>

using namespace std;
struct karakter {
    char harf;
    char kod;
   struct karakter *next;
};

char makedecision(int);
char getRandom();
struct karakter* addlast(karakter* , char);
void yazdir(karakter*);
void kodyazdir(karakter*);
int main(int argc, const char * argv[]) {
    srand(time(NULL));
    karakter *head = new karakter();
    head -> next = NULL;
    string metin;
    getline(cin,metin);
    for (int i = 0 ; i < metin.size() ; i++){
     head = addlast(head,metin[i]);
    }
    printf("%c" , head -> harf);
    yazdir(head);
    printf("\n");
    kodyazdir(head);
    std::cout << "Hello, World!\n";
    return 0;
}



char makedecision(int chooser){
    switch (chooser) {
        case 0:
           return '@';
        case 1:
            return '#';
        case 2:
            return '$';
        case 3:
            return '%';
        default:
            return 0;
    }
}
void yazdir(karakter* head){
    char temp;
    while (head != NULL){
        temp = head -> harf;
        printf("%c" , temp);
        head = head -> next;
    }
}
char getRandom(){
    return makedecision(rand()%4);
}
void kodyazdir(karakter* head){
    char temp;
    while (head != NULL){
        temp = head -> kod;
        printf("%c" , temp);
        head = head -> next;
    }

    
}
struct karakter *addlast(struct karakter *head,char key) {
    struct karakter *temp = (struct karakter *)malloc(sizeof(struct karakter));
        temp -> harf = key;
    temp -> kod = getRandom();
    temp -> next = NULL;
    struct karakter *temp2 = head;
   while(temp2 -> next != NULL)
        temp2 = temp2 -> next;
    temp2 -> next = temp;
    return head;
}

