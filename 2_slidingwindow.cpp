 #include<stdio.h>
int main(){
	int n,f,frames[30],i;
	printf("Enter window size : ");
	scanf("%d",&n);
	printf("Enter number of frames to transmit: ");
	scanf("%d",&f);
	printf("Enter %d frames: \n",f);
	for(i=1;i<=f;i++){
		scanf("%d",&frames[i]);
	}
	printf("\nWith sliding window protocol the frames will be sent in the following manner (assuming no corruption of frames)\n\n");
	printf("After sending %d frames at each stage sender waits for acknowledgement sent by the receiver\n\n",n);

	for(i=1;i<=f;i++){
		if(i%n==0){
			printf("%d ",frames[i]);
			printf("\nAcknowledgement of above frames sent is received by sender\n\n");

		}
		else{
			//printf("recieved by sender\n");
			printf("%d ",frames[i]);
		}
	}
	if(f%n!=0){
	printf("\nAcknowledgement of above frames sent is received by sender\n");

	}
}
Output:
Enter window size: 3
Enter number of frames to transmit: 5 Enter 5 frames: 12 5 89 4 6
With sliding window protocol the frames will be sent in the following manner (assuming no corruption of frames)
After sending 3 frames at each stage sender waits for acknowledgement sent by the receiver 12 5 89
Acknowledgement of above frames sent is received by sender 4 6
Acknowledgement of above frames sent is received by sender








#include<stdio.h> int main()
{
               int window=0;
	printf("enter Window size : ");
	scanf("%d",&window);
	int sent,ack,i=0;
	while(1){
		for(i=0;i<window;i++){
			printf("frame Transmitted %d \n",sent);
			sent++;
			if(sent==window){
				break;
			}
		}
		printf("enter last received acknowledgment : ");
		scanf("%d",&ack);
		if(ack==window){
			break;
		}
		else{
			sent = ack;
			}
              } 
Output:
enter window size 8
Frame 0 has been transmitted. 
Frame 1 has been transmitted. 
Frame 2 has been transmitted. 
Frame 3 has been transmitted. 
Frame 4 has been transmitted. 
Frame 5 has been transmitted. 
Frame 6 has been transmitted. 
Frame 7 has been transmitted.
Please enter the last Acknowledgement received. 2
Frame 2 has been transmitted.
 Frame 3 has been transmitted. 
Frame 4 has been transmitted. 
Frame 5 has been transmitted.
Frame 6 has been transmitted
Frame 7 has been transmitted  
Please enter the last Acknowledgement received. 8 

