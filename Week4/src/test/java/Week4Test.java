import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(3, Week4.max2Int(3, 1));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(2, Week4.max2Int(1,2));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(5, Week4.max2Int(5,5));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(23, Week4.max2Int(11,23));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(0, Week4.max2Int(0, -1));
    }

    @Test
    public void testMinArray1(){
        int[] a = new int[100];
        for (int i=0; i<a.length; i++){
            a[i] = i;
        }
        assertEquals(0, Week4.minArray(a));
    }

    @Test
    public void testMinArray2(){
        int [] a = new int [10];
        for (int i=0; i<a.length; i++) a[i] = 10-i;
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray3(){
        int[] a = new int [3];
        a[0] = 5;
        a[1] = 1;
        a[2] = 9;
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray4(){
        int [] a = new int [10];
        for (int i=0; i<a.length; i++) a[i] = 5;
        assertEquals(5, Week4.minArray(a));
    }

    @Test
    public void testMinArray5(){
        int [] a = new int [5];
        a[0] = -2;
        a[1] = -3;
        a[2] = 6;
        a[3] = 0;
        a[4] = -10;
        assertEquals(-10, Week4.minArray(a));
    }

    @Test
    public void testCalculateBMI1(){assertEquals("Bình thường", Week4.calculateBMI(65, 1.7));}

    @Test
    public void testCalculateBMI2(){
        assertEquals("Bình thường", Week4.calculateBMI(63,1.7));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Thiếu cân", Week4.calculateBMI(50,1.7));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Béo phì", Week4.calculateBMI(180,1.7));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Thừa cân", Week4.calculateBMI(70,1.7));
    }
}
