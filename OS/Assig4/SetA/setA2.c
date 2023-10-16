#include<stdio.h>
struct frame{
    int pno;
    int counter;
}frames [5];
int ref_str[30];
int np, n, i, j, currtime;
int pagefound(int pno1){
    	int i;
    	for (i = 0; i < n; i++)
        	if (frames[i].pno == pno1)
            	return i;
    	return -1;
}
int get_lru() {
    	int min = 0;
    	for (i = 0; i < n; i++)
        	if (frames[i].counter < frames[min].counter)
        		min = i;
    		return min;
}
int main() {
    	int i, j, pno1, p, page_fault = 0, flag, cnt = 0;;
    	float hr, mr;
    	printf("\Demand Paging LRU\n");
    	printf("\n Enter No. of Frames: ");
    	scanf("%d", & n);
    	printf("\n Enter Length of Reference String: ");
    	scanf("%d", & np);
    	int len = np;
    	printf("\n Enter Reference String: ");
    	for (i = 0; i < np; i++)
        	scanf("%d", & ref_str[i]);

    	for (i = 0; i < n; i++) {
        	frames[i].pno = -1;
        	frames[i].counter = -1;
    	}
    	printf("\n Page No.\tFrames\t\tPage Fault");
    	printf("\n-------------------------------------------------");
    	currtime = 1;
    	for (p = 0; p < np; p++) {
    	    	flag = 0;
        	pno1 = ref_str[p];
        	j = pagefound(pno1);
        	if (j == -1) {
            		page_fault++;
            		j = get_lru();
            		frames[j].pno = pno1;
            		flag = 1;
        	}
        	frames[j].counter = currtime;
        	currtime++;
        	printf("\n%5d\t", pno1);
        	for (i = 0; i < n; i++)
            		printf("  %d ", frames[i]);
        	if (flag == 1)
            		printf("\t YES");
        	else {
            		printf("\t NO");
            		cnt++;
        	}

    	}
    	printf("\n--------------------------------------------------");
    	printf("\nNo. of page fault: %d ", page_fault);
    	printf("\nNo. of page Hits: %d ", cnt);

}
//OUTPUT:::
/*

ty56@pc36:~/semV56/OS/Assig4/SetA$ ./a.out

 Enter how many frames: 3

 Enter  length of referencestring: 16

 Enter referencestring: 12
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

 Page No.	Frames		Page Fault
-------------------------------------------------
   12	  12   -1   -1 	 YES
   15	  12   15   -1 	 YES
   12	  12   15   -1 	 NO
   18	  12   15   18 	 YES
    6	  12   6   18 	 YES
    8	  8   6   18 	 YES
   11	  8   6   11 	 YES
   12	  8   12   11 	 YES
   19	  19   12   11 	 YES
   12	  19   12   11 	 NO
    6	  19   12   6 	 YES
    8	  8   12   6 	 YES
   12	  8   12   6 	 NO
   15	  8   12   15 	 YES
   19	  19   12   15 	 YES
    8	  19   8   15 	 YES
--------------------------------------------------
No. of page fault: 13 
No. of page Hits: 3
*/
