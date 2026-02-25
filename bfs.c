#include <stdio.h>

#define MAX 100

int queue[MAX], front = -1, rear = -1;
int visited[MAX];

// Function to enqueue
void enqueue(int value)
{
    if (rear == MAX - 1)
    {
        printf("Queue full!\n");
    }
    else
    {
        if (front == -1)
            front = 0;
        rear++;
        queue[rear] = value;
    }
}

// Function to dequeue
int dequeue()
{
    if (front == -1 || front > rear)
    {
        return -1;
    }
    return queue[front++];
}

void BFS(int adj[][MAX], int n, int start)
{
    int i, node;

    enqueue(start);
    visited[start] = 1;

    while (front <= rear)
    {
        node = dequeue();
        printf("%d ", node);

        for (i = 0; i < n; i++)
        {
            if (adj[node][i] == 1 && visited[i] == 0)
            {
                enqueue(i);
                visited[i] = 1;
            }
        }
    }
}

int main()
{
    int n, i, j, start;
    int adj[MAX][MAX];

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            scanf("%d", &adj[i][j]);
        }
    }

    printf("Enter starting node (0 to %d): ", n - 1);
    scanf("%d", &start);

    for (i = 0; i < n; i++)
        visited[i] = 0;

    printf("BFS Traversal: ");
    BFS(adj, n, start);

    return 0;
}
