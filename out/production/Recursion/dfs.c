#include <stdio.h>

#define MAX 100

int visited[MAX];

void DFS(int adj[][MAX], int n, int start) {
    int i;

    printf("%d ", start);
    visited[start] = 1;

    for (i = 0; i < n; i++) {
        if (adj[start][i] == 1 && visited[i] == 0) {
            DFS(adj, n, i);
        }
    }
}

int main() {
    int n, i, j, start;
    int adj[MAX][MAX];

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &adj[i][j]);
        }
    }

    printf("Enter starting node (0 to %d): ", n-1);
    scanf("%d", &start);

    for (i = 0; i < n; i++)
        visited[i] = 0;

    printf("DFS Traversal: ");
    DFS(adj, n, start);

    return 0;
}
