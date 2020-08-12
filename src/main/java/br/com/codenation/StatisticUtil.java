package br.com.codenation;

import java.util.*;

public class StatisticUtil {

    public static int average( int[] elements ) {
        int sum = 0;
        for ( int element : elements ) {
            sum += element;
        }
        return sum / elements.length;
    }

    public static int mode( int[] elements ) {
        Map< Integer, Integer > map = new HashMap();

        for ( int element : elements ) {
            if ( map.keySet().contains( element ) ) {
                map.replace( element, map.get( element ) + 1 );
            } else {
                map.put( element, 1 );
            }
        }
        return Collections.max( map.entrySet(), Comparator.comparingInt( Map.Entry::getValue ) ).getKey();
    }

    public static int median( int[] elements ) {
        Arrays.sort( elements );
        int median;
        if ( elements.length % 2 == 0 ) {
            median = ( elements[ elements.length / 2 ] + elements[ ( elements.length / 2) -1] ) / 2;
        } else {
            median = elements[ ( elements.length - 1 ) / 2 ];
        }
        for ( int element:elements ) {
            System.out.println( element );
        }
        return median;
    }
}