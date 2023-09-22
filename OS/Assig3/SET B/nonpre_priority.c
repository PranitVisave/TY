#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define MAX 10

typedef struct Process{
	int pid,cpu_bt,pri,tat,wt,at;
}Process;

void swap(Process *a,Process *b){
	Process temp=*a;
	*a=*b;
	*b=temp;
}

void sort(Process pro[],int n){
	for (int i=0;i<n-1;i++)
		for (int j=0;j<n-i-1;j++){
			if (pro[j].pri > pro[j+1].pri)
				swap(&pro[j],&pro[j+1]);
		}
}

void calculate_wt(Process pro[],int n){
	pro[0].wt=0;
	for (int i=1;i<n;i++){
		pro[i].wt=pro[i-1].wt+pro[i-1].cpu_bt;
	}
}

void calculate_tat(Process pro[],int n){
	int  total_wt=0;
	int total_tat=0;
	for (int i=0;i<n;i++){
		pro[i].tat=pro[i].wt+pro[i].cpu_bt;
		total_wt+=pro[i].wt;
		total_tat+=pro[i].tat;
	}
	double avwt = (double)total_wt/n;
	printf("\nAverage Waiting Time : %2f\n",avwt);
	printf("\nAerage TurnAround Time : %f\n",total_tat/n);
}



void main(){
	int n;
	
	printf("\nEnter Number of Processes :\n");
	scanf("%d",&n);
	
	Process pro[MAX];
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
	sort(pro,n);
	calculate_wt(pro,n);
	calculate_tat(pro,n);
	
	printf("\n------GANTT CHART------\n");
	for (int i=0;i<n;i++)
		printf("P%d\t",pro[i].pid);
	printf("\n");
	
	printf("\nProcess AT\tBT\tPriority TAT\tWT\n");
	for (int i=0;i<n;i++)
		printf("\nP%d\t %d\t%d\t%d\t%d\t%d\n",i+1,pro[i].at,pro[i].cpu_bt,pro[i].pri,pro[i].tat,pro[i].wt);
	//calculate_tat(pro,n);
}	
		
		
/**

OUTPUT::
ty56@pc36:~/semV56/OS/Assig3/SET B$ ./a.out

Enter Number of Processes :
4

Enter Arrival Time Of Process P1 : 0

Enter Arrival Time Of Process P2 : 1

Enter Arrival Time Of Process P3 : 2

Enter Arrival Time Of Process P4 : 3

Enter CPU Burst Time Of Process P1 : 7

Enter CPU Burst Time Of Process P2 : 1

Enter CPU Burst Time Of Process P3 : 3

Enter CPU Burst Time Of Process P4 : 6

Enter Priority Of Process P1 : 1

Enter Priority Of Process P2 : 2

Enter Priority Of Process P3 : 3

Enter Priority Of Process P4 : 4

Average Waiting Time : 6.500000

Aerage TurnAround Time : 6.500000

------GANTT CHART------
P1	P2	P3	P4	

Process AT	BT	Priority TAT	WT

P1	 0	7	1	7	0

P2	 1	1	2	8	7

P3	 2	3	3	11	8

P4	 3	6	4	17	11
ty56@pc36:~/semV56/OS/Assig3/SET B$ 


*/
		
		
