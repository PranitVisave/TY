#include<stdio.h>
#include<stdlib.h>
int main()
{
	int q[100],j,n,i,seek=0,max,head,move;
	printf("\n Enter total disk size: ");
	scanf("%d",&max);
	printf("\n Enter the number of request: ");
	scanf("%d",&n);
	printf("\n Enter the request sequence: ");
	for(i=0;i<n;i++)
		scanf("%d",&q[i]);
	printf("\n Enter initial head position: ");
	scanf("%d",&head);
	printf("\n Enter the head movement direction for high 1 and for low 0: ");
	scanf("%d",&move);
	for(i=0;i<n;i++){
		for(j=0;j<n-i-1;j++){
			if(q[j]>q[j+1]){
				int temp;
				temp=q[j];
				q[j]=q[j+1];
				q[j+1]=temp;
			}
		}
	}
	int index;
	for(i=0;i<n;i++){
		if(head<q[i]){
			index=i;
			break;
		}
	}
	if(move==1){
		for(i=index;i<n;i++){
			seek+=abs(q[i]-head);
			head=q[i];
		}
		seek+=abs(max-q[i-1]-1);
		head=max-1;
		for(i=index-1;i>=0;i--){
			seek+=abs(q[i]-head);
			head=q[i];

		}
	}
	else{
		for(i=index-1;i>=0;i--){
			seek+=abs(q[i]-head);
			head=q[i];
		}
		seek+=abs(q[i+1]-0);
		head=0;
		for(i=index;i<n;i++){
			seek+=abs(q[i]-head);
			head=q[i];
		}
	}
	printf("\n\n Total head movement are %d",seek);
	return 0;
}