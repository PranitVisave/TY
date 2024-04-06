#include<stdio.h>
void main(){
	int i,n,r,j;
	int a[10][10],max[10][10],av[10],need[10][10];
	char res;
	printf("Enter Total Number of Processes : ");
	scanf("%d",&n);
	printf("Enter Total Number of Resources : ");
	scanf("%d",&r);
	printf("Enter Allocation Matrix : ");
	for (i=0;i<n;i++)
		for (j=0;j<r;j++)
			scanf("%d",&a[i][j]);
	printf("Enter Max Allocation : ");
	for (i=0;i<n;i++)
		for (j=0;j<r;j++)
			scanf("%d",&max[i][j]);
	printf("Enter Available resources : ");
	for (i=0;i<r;i++)
		scanf("%d",&av[i]);
	printf("\nAllocation Matrix :\n");
	for (i=0;i<n;i++){
		printf("\n");
		for (j=0;j<r;j++)
			printf("%d",a[i][j]);
	}
	printf("Maximum Matrix : \n");
	for (i=0;i<n;i++){
		printf("\n");
		for (j=0;j<r;j++)
			printf("%d\t",max[i][j]);
	}
	printf("\nNeed :\n");
	for (i=0;i<n;i++){
		printf("\n%d\t",i);
		for (j=0;j<r;j++){
			need[i][j]=max[i][j]-a[i][j];
			printf("%d\t",need[i][j]);
		}
	}
	printf("\nAvailable :\n");
	for (i=0;i<n;i++)
		if (i==0)
			for (j=0;j<r;j++){
				printf("\n");
				printf("%d\t",av[j]);
			}
}
