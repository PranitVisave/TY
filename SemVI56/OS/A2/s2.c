#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct file {
    char name[20];
    int start,length;
    struct file* next;
};
int main() {
    int n, num, i, start, length;
    char fname[20];
    printf("Enter the number of blocks in the disk: ");
    scanf("%d",&n);
    struct file* files = NULL;
    while (1) {
        printf("\n1. Create a new file\n");
        printf("2. Delete a file\n");
        printf("3. Display disk status\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &i);
        switch (i) {
            case 1:
                printf("\nEnter the name of the file: ");
                scanf("%s",fname);
                printf("Enter the starting block number: ");
                scanf("%d",&start);
                printf("Enter the length of the file: ");
                scanf("%d",&length);
                if (start + length > n) {
                    printf("File allocation failed: not enough space\n");
                } else {
                    struct file* newFile = (struct file*) malloc(sizeof(struct file));
                    newFile->next = NULL;
                    strcpy(newFile->name, fname);
                    newFile->start = start;
                    newFile->length = length;
                    if (files == NULL) {
                        files = newFile;
                    } else {
                        struct file* ptr = files;
                        while (ptr->next != NULL) {
                            ptr = ptr->next;
                        }
                        ptr->next = newFile;
                    }
                    printf("File %s created successfully\n", fname);
                }
                break;
            case 2:
                printf("\nEnter the name of the file: ");
                scanf("%s", fname);
                struct file* ptr = files;
                struct file* pre = NULL;
                while (ptr != NULL && strcmp(ptr->name, fname) != 0) {
                    pre = ptr;
                    ptr = ptr->next;
                }
                if (ptr == NULL) {
                    printf("File deletion failed: file not found\n");
                } else {
                    if (pre == NULL) {
                        files = ptr->next;
                    } else {
                        pre->next = ptr->next;
                    }
                    free(ptr);
                    printf("File %s deleted successfully\n", fname);
                }
                break;
            case 3:
                printf("\nDisk status:\n");
                int* blocks = (int*) calloc(n, sizeof(int));
                ptr = files;
                while (ptr != NULL){
                    for (i = ptr->start; i < ptr->start + ptr->length; i++){
                        blocks[i] = 1;
                    }
                    ptr = ptr->next;
                }
                for (i = 0; i < n; i++)
                    if (blocks[i] == 0)
                        printf("Block %d: Free\n", i);
                    else
                        printf("Block %d: Allocated\n", i);
                free(blocks);
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
