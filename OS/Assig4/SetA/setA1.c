#include<stdio.h>
#include<stdlib.h>
struct fnode{
	int pno;
};
struct fnode frames[10];
int fr;
int pageFound(int pno1){
	for (int i=0;i<fr;i++)
		if (frames[i].pno==pno1)
			return 1;
		return 0;
}		
void main(){
	int ref_str[30];
	int pfct=0,i,pno1,p,flag=0;
	int len,cnt=0;
	printf("\nDemand Paging FIFO\n");
	printf("\nEnter No. of Frames : ");
	scanf("%d",&fr);
	printf("\nEnter Length of Reference String : ");
	scanf("%d",&len);
	printf("\nEnter Reference String : ");
	for (i=0;i<len;i++)
		scanf("%d",&ref_str[i]);
	for (i=0;i<fr;i++)
		frames[i].pno=-1;
	printf("\nPage No.\tPageFrames\t\tPageFault\n");
	printf("\n----------------X----------------\n");
	for (p=0;p<len;p++){
		pno1=ref_str[p];
		flag=0;
		if (pageFound(pno1)==0){
			frames[pfct%fr].pno=pno1;
			pfct++;
			flag=1;
		}
		printf("\n%d\t",pno1);
		for (i=0;i<fr;i++)
			printf("  %d  ",frames[i]);
		if (flag==1)
			printf("\t\tYES");
		else{
			printf("\t\tNO");
			cnt++;
		}
	}
	printf("\nTotal Number Of Page Faults : %d\n",pfct);
	printf("\nTotal Number Of Page Hits : %d\n",cnt);
}


/*
OUTPUT:

ty56@pc36:~/semV56/OS/Assig4/SetA$ ./a.out

Demand Paging FIFO

Enter No. of Frames : 3

Enter Length of Reference String : 16

Enter Reference String : 12
15
12
18
6
8
11
12
19
12
6
8
12
15
19
8

Page No.	PageFrames		PageFault

----------------X----------------

12	  12    -1    -1  		YES
15	  12    15    -1  		YES
12	  12    15    -1  		NO
18	  12    15    18  		YES
6	  6    15    18  		YES
8	  6    8    18  		YES
11	  6    8    11  		YES
12	  12    8    11  		YES
19	  12    19    11  		YES
12	  12    19    11  		NO
6	  12    19    6  		YES
8	  8    19    6  		YES
12	  8    12    6  		YES
15	  8    12    15  		YES
19	  19    12    15  		YES
8	  19    8    15  		YES
Total Number Of Page Faults : 14

Total Number Of Page Hits : 2


*/
