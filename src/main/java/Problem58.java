import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

//Java Advanced Java Singleton Pattern


class Singleton
{
    private volatile static Singleton singleInstance = null;
    public static String str;
    private Singleton() {}
    public static Singleton getSingleInstance()
    {
        if(singleInstance == null)
            synchronized (Singleton.class) {
            if(singleInstance == null)
                singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
