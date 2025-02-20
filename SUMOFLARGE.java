import java.util.*;
import java.lang.*;
class sum
	{
		public static void main (String args[])
		{
			Scanner S1 = new Scanner(System.in);
			int num[] = new int [50];
			int sum = 0;
			System.out.println("enter the array limit");
			int l = S1.nextInt();
			for( int i=0;i<l;i++)
			{
				num[i] = S1.nextInt();
				sum = sum + num[i];
			}
			System.out.println("the sum of array is "+sum);
		}
	}
				
#include <stdio.h>

int main() {
    int n, tq, at[10], bt[10], temp[10], ct[10], tat[10], wt[10];
    int time = 0, count = 0, i, executed;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    printf("Enter Time Quantum: ");
    scanf("%d", &tq);

    printf("Enter Arrival Time and Burst Time for each process:\n");
    for (i = 0; i < n; i++) {
        scanf("%d %d", &at[i], &bt[i]);
        temp[i] = bt[i];  // Store original burst times
    }

    while (count != n) {  // Continue until all processes are completed
        executed = 0;  // Flag to check if any process was executed in this cycle

        for (i = 0; i < n; i++) {
            if (temp[i] > 0 && at[i] <= time) { // Process should have remaining BT and must have arrived
                executed = 1;  // A process was executed
                
                if (temp[i] > tq) {
                    time += tq;  // Process executes for time quantum
                    temp[i] -= tq;
                } else {
                    time += temp[i];  // Process completes execution
                    ct[i] = time;  // Completion time
                    tat[i] = ct[i] - at[i];  // Turnaround Time
                    wt[i] = tat[i] - bt[i];  // Waiting Time
                    temp[i] = 0;  // Mark process as completed
                    count++;  // Increase process completion count
                }
            }
        }

        if (!executed) {
            time++;  // If no process executed, increase time to wait for arrival
        }
    }

    // Printing the results
    printf("\nP\tAT\tBT\tCT\tTAT\tWT\n");
    for (i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", i + 1, at[i], bt[i], ct[i], tat[i], wt[i]);
    }

    return 0;
	    }
