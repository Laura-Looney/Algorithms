public class Excercise2
    {

            public static double basse(double x, int y )
                {

                    double result = myPow(x,y);

                    System.out.println( x + "^" + y + " = " + result);

                    return result;
                }

            public static double myPow(double x, int y)
                {
                    if (y != 0)
                        {
                            return (x * myPow(x, y - 1));
                        }

                    else
                        {
                            return 1;
                        }
                }


    }

