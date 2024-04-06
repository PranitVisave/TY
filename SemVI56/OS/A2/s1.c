#include<stdio.h>
void main(){
	int n,i,num,start,l,block[10],op;
	char fname[20];
	printf("Enter Number Of Blocks in Disk : ");
	scanf("%d",&n);
	for (i=0;i<n;i++)
		block[i]=0;
	while (1){
		printf("\nFile Operations :");
		printf("\n1 : Create New File : ");
		printf("\n2 : Delete File : ");
		printf("\n3 : Display Disk Status : ");
		printf("\n4 : Exit : ");
		printf("\n\nEnter Operation to Perform : ");
		scanf("%d",&op);
		switch (op){
			case 1 :printf("Enter name of file : ");
				scanf("%s",&fname);
				printf("Enter starting block number : ");
				scanf("%d",&start);
				printf("Enter length of file : ");
				scanf("%d",&l);
				if (start + l > n)
					printf("File cannot be allocated !\n");
				else{
					for (i=start;i<start+l;i++){
						if (block[i]!=0){
							printf("Allocation Failed! Block %d already allocated!\n",i);
							break;
						}
					}
					if (i == start + l){
						for (i=start;i<start+l;i++){
							block[i]=1;
						}
						printf("File %s Created successfully!\n");
					}
				}
				break;
			case 2 :printf("Enter name of file : ");
				scanf("%s",&fname);
				printf("Enter start block : ");
				scanf("%d",&start);
				printf("Enter length of file : ");
				scanf("%d",&l);
				for (i=start; i<start+l;i++){
					if (block[i]==0){
						printf("File cannot be deleted! Block %d not allocated!\n");
						break;
					}
					if (i==start+l)
						for (i=start;i<start+l;i++)
							block[i]=0;	
				}
				printf("File %s Deleted Successfully!\n",fname);
				for (i=start;i<start+l;i++)
							block[i]=0;
				break;
			case 3 :printf("Disk Status :\n");
				for (i=0;i<n;i++){
					if (block[i]==0){
						printf("Block %d Free!\n",i);
					}
					else{
						printf("Block %d Allocated!\n",i);
					}
				}
				break;
			case 4 :return;
			}
		}
}
