#include<stdio.h>
#include<stdlib.h>

void main(){
	int n,i;
	float avtat=0,avwt=0;
	printf("\nEnter Number of Processes : \n");
	scanf("%d",&n);
	int at[n],bt[n],rt[n],ct,small,remain=0,time,temp;
	for (i=0;i<n;i++){
		printf("\nEnter Arrival Time For Process P%d : ",i+1);
		scanf("%d",&at[i]);
	}
	for (i=0;i<n;i++){
		printf("\nEnter Burst Time For Process P%d : ",i+1);
		scanf("%d",&bt[i]);
		rt[i]=bt[i];
	}
	
		
	printf("\nProcess AT\tBT\tWT\tTAT\n");
	for (time=0;remain!=n;time++){
		for (i=0;i<n;i++){
			if (at[i]<=time && rt[i])
				small=i;
			}
		rt[small]--;
		if (rt[small]==0){
			remain++;
			ct=time+1;
			printf("\nP%d\t%d\t%d\t%d\t%d\n",small+1,at[small],ct-bt[small]-at[small],ct-at[small]);
			avtat = avtat+ct-at[small];
			avwt=avwt+ct-bt[small]-at[small];
		}
	}
	avwt/=n;
	avtat/=n;
	printf("\nAverage Waiting Time : %f \n",avwt);
	printf("\nAverage turnAround Time : %f\n",avtat);
}

