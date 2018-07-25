#include <stdio.h>

int main(void)
{
	int i = 0, j = 0, n = 11;
	for (i = 0; n > i; i++)
	{
		for (j = 0; n > j; j++)
		{
			if (i >= n / 2 - j
			&& i <= n / 2 * 3 - j
			&& i >= j - n / 2
			&& i <= j + n / 2)
			{
				fprintf(stdout, "*");
			}
			else
			{
				fprintf(stdout, " ");
			}
		}
		fprintf(stdout, "\n");
	}
	for (i = 0; n > i; i++)
	{
		for (j = 0; n > j; j++)
		{
#if 0
#else
			if (i < n / 2 - j
			|| i > n / 2 * 3 - j
			|| i < j - n / 2
			|| i > j + n / 2)
			{
				fprintf(stdout, " ");
			}
			else
			{
				fprintf(stdout, "*");
			}
#endif
		}
		fprintf(stdout, "\n");
	}
	return 0;
}
