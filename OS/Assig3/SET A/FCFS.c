#include<stdio.h>
#include<stdlib.h>
void main(){
	int i,n,temp[10];
	float avgwt=0, avgtat=0;
	printf("Enter Number Of Processes : \n");
	scanf("%d",&n);
	int at[n],bt[n],wt[n],tat[n];
	printf("Enter Arrival Time : \n");
	for (i=0;i<n;i++)
		scanf("%d",&at[i]);
	for (i=0;i<n;i++)
		bt[i]=rand()%10;
	temp[0]=0;
	for (i=1;i<n;i++)
		temp[i]=temp[i-1]+bt[i-1];
	for (i=0;i<n;i++){
		wt[i]=temp[i]-at[i];
		avgwt=avgwt+wt[i];
		tat[i]=at[i]+bt[i];
		avgtat+=tat[i];
	}
	avgwt/=n;
	avgtat/=n;
	printf("\nProcess  AT     BT     WT     TAT\n");
	for (i=0;i<n;i++)
		printf("\nP%d\t%d\t%d\t%d\t%d\n",i+1,at[i],bt[i],wt[i],tat[i]);
	printf("\nAverage Waiting Time : %f\n",avgwt);
	printf("\nAverage TurnAround time : %f\n",avgtat);
}

/*
OUTPUT:-

ty56@pc36:~/semV56/OS/Assig3$ cc FCFS.c
ty56@pc36:~/semV56/OS/Assig3$ ./a.out
Enter Number Of Processes : 
5
Enter Arrival Time : 
0 2 4 5 7

Process  AT     BT     WT     TAT

P1	0	3	0	3

P2	2	6	1	8

P3	4	7	5	11

P4	5	5	11	10

P5	7	3	14	10
Average Waiting Time : 6.200000
Average TurnAround time : 8.400000

=====================X==================

ty56@pc36:~/semV56/OS/Assig3/SET A$ ./a.out
Enter Number Of Processes : 
4
Enter Arrival Time : 
0 0 2 4

Process  AT     BT     WT     TAT

P1	0	3	0	3

P2	0	6	3	6

P3	2	7	7	9

P4	4	5	12	9

Average Waiting Time : 5.500000

Average TurnAround time : 6.750000


*/
