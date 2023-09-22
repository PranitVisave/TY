#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/wait.h>
void child();
void parent();
void main()
{
	pid_t pid;
	pid = fork();
	if (pid==0){
		sleep(3);
		printf("Child ID : %d ",getpid());
		child(pid);
	}
	else
		parent(pid);
}
void child(){
	printf("I am child process\n");
	printf("\nChild Id : %d\n",getpid());
}
void parent(){
	printf("I am parent process\n");
	printf("\nParent Id : %d\n",getppid());
}
