#include<stdio.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<string.h>
#include<stdlib.h>
#include<unistd.h>
#include<dirent.h>

#define MAX_ip 1024
#define MAX_tokens 100

void list_files(const char *dn,char op){
	DIR *dp;
	struct dirent *entry;
	int dc=0,fc=0;
	dp=opendir(dn);
	if (dp == NULL){
		perror("Error Opening Directory\n");
		return;
	}
	switch (op){
		case 'f':
			while ((entry = readdir(dp))){
				if (entry->d_type == DT_REG)
					printf("%s\n",entry->d_name);
			}
			break;
		case 'n':
			while (entry = readdir(dp)){
				if (entry->d_type == DT_DIR)
					dc++;
				if (entry->d_type == DT_REG)
					fc++;
			}
			printf("%d DIR(s)\t %d FILE(s)\n",dc,fc);
			break;
		case 'i':
			while (entry = readdir(dp)){
				if (entry->d_type == DT_REG)
				printf("%s\t%d\n",entry->d_name,entry->d_fileno);
			}	
			break;
	}
	closedir(dp);
}
void make_toks(char *s,char *tok[])
{
	int i=0;
	char *p;
	p=strtok(s," ");
	while (p!=NULL){
		tok[i++]=p;
		p=strtok(NULL," ");
	}
	tok[i]=NULL;
}
int main(){
	char buff[80],*args[10];
	int pid;
	while (1){
		//fgets(buff,80,stdin);
		printf("MyShell$ ");
		fflush(stdin);
		fgets(buff,80,stdin);
		buff[strlen(buff)-1]='\0';
		make_toks(buff,args);
		if (strcmp(args[0],"list")==0)
			list_files(args[2],args[1][0]);
		else{
			pid = fork();
			if (pid>0)
				wait(NULL);
			else{
				if (execv(args[0],args)==-1)
				   printf("Bad command.\n");
			}
		}
	}
	return 0;
}


/*
OUTPUT:
ty56@pc36:~/semV56/OS/Assig2/Shell_2$ ./a.out
MyShell$ list f test
setA1.c
Shell2.c
myshell.c
MyShell$ list i test
setA1.c	44174098
Shell2.c	44174094
myshell.c	44174095
MyShell$ list n test
2 DIR(s)	 3 FILE(s)

*/
/*
REDUNDUNT CODE::::::

void listnum_entries(const char *dirname){
	DIR *dir = opendir(dirname);
	if (dir == NULL){
		perror("Error Opening Directory\n");
		return;
	}
	int count = 0;
	while (readdir(dir)!=NULL)
		count++;
	printf("No. of entries in %s : %d\n",dirname,count);
	closedir(dir);
}

void list_inode(const char *dirname){
	DIR *dir = opendir(dirname);
	if (dir == NULL){
		perror("Error Opening Directory\n");
		return;
	}
	struct dirent *entry;
	while ((entry=readdir(dir))!=NULL){
		struct stat file_stat;
		char file_path[MAX_ip];
		snprintf(file_path,sizeof(file_path),"%s/%s",dirname,entry->d_name);
		if (stat(file_path,&file_stat)==0)
			printf("%s (inode : %Id\n",entry->d_name,(long)file_stat.st_ino);
		}
	closedir(dir);
}

int main(){
	char input[MAX_ip];
	char *tokens[MAX_tokens];
	const char *delimiters="\t\n";
	int num_tokens;
	while (1){
		printf("MyShell $ ");
		fgets(input,sizeof(input),stdin);
		
		num_tokens=0;
		tokens[num_tokens]=strtok(input,delimiters);
		while (tokens[num_tokens]!=NULL){
			num_tokens++;
			tokens[num_tokens]=strtok(NULL,delimiters);
		}
		if (num_tokens > 0){
			if (strcmp(tokens[0],"list")==0 && num_tokens >= 3){
				const char *cmd = tokens[1];
				const char *dirname = tokens[2];
				if (strcmp(cmd,"f")==0)
					listfiles(dirname);
				else if (strcmp(cmd,"n")==0)
					listnum_entries(dirname);
				else if (strcmp(cmd,"i")==0)
					list_inode(dirname);
				else
					printf("Invalid List Command\n");
			}
			else{
				pid_t pid = fork();
				if (pid < 0)
					perror("FORK FAILED\n");
				else if (pid == 0){
					execv(tokens[0],tokens);
					perror("EXEC FAILED\n");
					exit(1);
				}
				else 
					wait(NULL);
			}
		}
	}
	return 0;
}


*/
