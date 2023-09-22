#include<stdio.h>
#include<stdlib.h>

typedef struct Process{
	int id,at,bt,pri;
}Process;

void swap(Process *a,Process *b){
	Process temp=*a;
	*a=*b;
	*b=temp;
}
void pps(Process pro[],int n){
	int ct=0,comp=0;
	int wt[n],tat[n],rt[n];
	printf("Hello");
	for (int i=0;i<n;i++)
		rt[i]=pro[i].bt;
	while (comp<n){
		int hp=-1;
		int sp=-1;
		for (int i=0;i<n;i++){
			if (pro[i].at<=ct && rt[i]>0)
				if (hp==-1 || pro[i].pri<pro[hp].pri)
					hp=i;
		}
		if (hp==1){
			ct++;
			continue;
		}
		if (rt[hp]==0){
			comp++;
			tat[hp]=ct-pro[hp].at+1;
			wt[hp]=tat[hp]-pro[hp].bt;
			printf("P%d (%d %d)",pro[hp].id,ct-tat[hp]+1,ct);
		}
		ct++;
	}
	printf("\nProcess TAT\tWt\n");
	for (int i=0;i<n;i++)
		printf("\nP%d\t%d\t%d\n",pro[i].id,tat[i],wt[i]);
	double avtat=0,avwt=0;
	for (int i=0;i<n;i++){
		avtat+=tat[i];
		avwt+=wt[i];
	}
	printf("\nAverage TAT : %2f\n",avtat/n);
	printf("\nAverage WT : %2f \n",avwt/n);
}

void main(){
	int n,i;
	printf("\nEnter Number Of Processes : ");
	scanf("%d",&n);
	Process pro[n];
	for (int i=0;i<n;i++){
		pro[i].pid=i+1;
		printf("\nEnter Arrival Time Of Process P%d : ",i+1);
		scanf("%d",&pro[i].at);
	}
	for (int i=0;i<n;i++){
		
		printf("\nEnter CPU Burst Time Of Process P%d : ",i+1);
		scanf("%d",&pro[i].cpu_bt);
	}
	for (int i=0;i<n;i++){
		printf("\nEnter Priority Of Process P%d : ",i+1);
		scanf("%d",&pro[i].pri);
	}
	
	for (i=0;i<n;i++){
		for (int j=0;j<n;j++)
			if (pro[j].at > pro[j+1].at)
				swap(&pro[j],&pro[j+1]);
	}
	printf("\n------Gantt Chart------\n");
	pps(pro,n);
}
