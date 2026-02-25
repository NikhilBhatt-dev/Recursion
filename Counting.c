#include <stdio.h>

int main()
{
    int A[] = {5, 3, 2, 5, 4, 3, 1};
    int n = 7;

    int count[6] = {0, 0, 0, 0, 0, 0};
    // because max element = 5 (0 to 5)

    // Step 1: Count frequency
    for (int i = 0; i < n; i++)
    {
        count[A[i]]++;
    }

    // Step 2: Print sorted array
    for (int i = 0; i <= 5; i++)
    {
        while (count[i] > 0)
        {
            printf("%d ", i);
            count[i]--;
        }
    }

    return 0;
}
