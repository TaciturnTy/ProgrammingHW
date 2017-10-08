using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Find the smallest and largest value in an array
namespace DivideAndConquer
{
    class Program
    {
        int MIN = 0;
        int MAX = 0;

        static void Main(string[] args)
        {
            int[] arr = { 23, 15, 1, 6, 9, 10, 67, 3 };

            SearchMinMax(arr, arr[0], arr[0], 0, arr.Length - 1);
            Console.ReadLine();
        }

        static void SearchMinMax(int[] array, int minimum, int maximum, int left, int right)
        {
            int min, max, min1 = 0, max1 = 0, middle = 0;
            int subtract = right - left;

            if (right == left)
            {
                min = array[left];
                max = array[left];
            }

            else if (subtract == 1)
            {
                if (array[left] <= array[right])
                {
                    min = array[left];
                    max = array[right];
                }
                else
                {
                    min = array[right];
                    max = array[left];
                }
            }
   
            else
            {
                middle = (left + right) / 2;

                min = minimum;
                max = maximum;

                SearchMinMax(array, min, max, left, middle);
                SearchMinMax(array, min1, max1, middle + left, right);

                if (min1 < min)
                {
                    min = min1;
                }
                if (max1 > max)
                {
                    max = max1;
                }
            }

            Console.Write("Minimum: " + min);
            Console.Write("Maximum: " + max + "\n\n");
        }
    }
}
