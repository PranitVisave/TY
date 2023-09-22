#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void ChildProcess();
void ParentProcess();
int main()
{
	pid_t pid;
	pid = fork();
	if (pid == 0)
		ChildProcess();
	else
		ParentProcess();
	return 0;
}
void ChildProcess(){
	printf("I am child process\n");
	printf("\nMy Id : %d\n",getpid());
}
void ParentProcess(){
	printf("I am parent process\n");
	printf("\nMy Id : %d\n",getppid());
}

/*
OUTPUT:-
ty56@pc36:~/semV56/OS$ ./a.out
I am parent process

My Id : 17797
I am child process

My Id : 20621

*/
