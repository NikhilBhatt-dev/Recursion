#include <stdio.h>
#include <limits.h>

#define INF 9999
#define MAX 50

int main() {
    int graph[MAX][MAX];
    int visited[MAX], distance[MAX];
    int n, source;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix (0 if no edge):\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0 && i != j)
                graph[i][j] = INF;  // No edge → INF
        }
    }

    printf("Enter source vertex (0 to %d): ", n-1);
    scanf("%d", &source);

    // Initialize distance and visited arrays
    for (int i = 0; i < n; i++) {
        distance[i] = graph[source][i];
        visited[i] = 0;
    }
    distance[source] = 0;  
    visited[source] = 1;

   
    for (int count = 1; count < n; count++) {
        int min = INF, nextNode = -1;

        
        for (int i = 0; i < n; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                nextNode = i;
            }
        }

        visited[nextNode] = 1;

        // Update distances
        for (int i = 0; i < n; i++) {
            if (!visited[i] && distance[nextNode] + graph[nextNode][i] < distance[i]) {
                distance[i] = distance[nextNode] + graph[nextNode][i];
            }
        }
    }

    printf("\nShortest distance from source %d:\n", source);
    for (int i = 0; i < n; i++) {
        printf("%d → %d = %d\n", source, i, distance[i]);
    }

    return 0;
}
