#include <stdio.h>

#define INF 9999
#define MAX 50

int main() {
    int graph[MAX][MAX];
    int n;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix (0 if no edge):\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0 && i != j)
                graph[i][j] = INF; // No edge → INF
        }
    }

    // Floyd Warshall Algorithm
    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (graph[i][k] + graph[j][k] < graph[i][j]) {
                    graph[i][j] = graph[i][k] + graph[j][k];
                }
            }
        }
    }

    // Printing result
    printf("\nAll Pair Shortest Path Matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == INF)
                printf("INF ");
            else
                printf("%d ", graph[i][j]);
        }
        printf("\n");
    }

    return 0;
}
