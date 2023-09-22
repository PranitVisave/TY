#include<stdio.h>
#include<stdlib.h>
void main(){
	int i,n;
	float avwt=0,avtat=0;
	printf("\nEnter Number of Processes :\n");
	scanf("%d",&n);
	int p[n],at[n],bt[n],wt[n],tat[n];
	printf("Enter Arrival Time :\n");
	for (i=0;i<n;i++){
		scanf("%d",&at[i]);
		p[i]=i;
	}
	printf("Enter Burst Time : \n");
	for (i=0;i<n;i++)
		scanf("%d",&bt[i]);
	int temp,j;
	for (i=1;i<n;i++)
		for (j=i+1;j<n;j++)
			if (bt[j] < bt[i]){
				temp=bt[i];
				bt[i]=bt[j];
				bt[j]=temp;
				
				temp=p[i];
				p[i]=p[j];
				p[j]=temp;
				
				temp=at[i];
				at[i]=at[j];
				at[j]=temp;
			}  
	int start[10];
	start[0]=0;
	for (i=1;i<n+1;i++){
		start[i]=start[i-1]+bt[i-1];
		printf("GANTT CHART\n");
		printf("%d\t",start[i]);
	}
	for (i=0;i<n;i++){
		wt[i]=start[i]-at[i];
		avwt+=wt[i];
	}
	avwt/=n;
	for (i=0;i<n;i++){
		tat[i]=wt[i]+bt[i];
		avtat+=tat[i];
	}
	avtat/=n;
	printf("\nProcess AT\tBT\tWT\tTAT\n");
	for (i=0;i<n;i++)
		printf("\nP%d\t%d\t%d\t%d\t%d\n",p[i],at[i],bt[i],wt[i],tat[i]);
	printf("Average Waiting Time : %f\nAverage TurnAround Time : %f\n",avwt,avtat);
}

/*
OUTPUT:-

ty56@pc36:~/semV56/OS/Assig3/SET A$ ./a.out

Enter Number of Processes :
4
Enter Arrival Time :
0 1 2 3
Enter Burst Time : 
4 1 2 1

Process AT	BT	WT	TAT

P0	0	4	0	4

P1	1	1	3	4

P3	3	1	2	3

P2	2	2	4	6
Average Waiting Time : 2.250000
Average TurnAround Time : 4.250000

=====================X===================

ty56@pc36:~/semV56/OS/Assig3/SET A$ ./a.out

Enter Number of Processes :
4     
Enter Arrival Time :
0 1 4 6
Enter Burst Time : 
0 2 4 7

Process AT	BT	WT	TAT

P1	0	7	0	7

P2	1	4	6	10

P3	4	2	7	9

P4	6	0	7	7
Average Waiting Time : 5.000000
Average TurnAround Time : 8.250000


*/
