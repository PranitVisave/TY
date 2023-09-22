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

void listfiles(const char *dirname){
	DIR *dir = opendir(dirname);
	if (dir == NULL){
		perror("Error Opening Directory\n");
		return;
	}
	struct dirent *entry;
	while ((entry=readdir(dir))!=NULL)
		printf("%s\n",entry->d_name);
	closedir(dir);
}

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
					execvp(tokens[0],tokens);
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
