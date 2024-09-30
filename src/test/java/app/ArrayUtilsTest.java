package app;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testSumMethodAnnotation() throws NoSuchMethodException {
        Method sumMethod = ArrayUtils.class.getMethod("sum", int[].class);
        MethodInfo methodInfo = sumMethod.getAnnotation(MethodInfo.class);
        Author author = sumMethod.getAnnotation(Author.class);

        assertNotNull(methodInfo);
        assertEquals("sum", methodInfo.name());
        assertEquals("int", methodInfo.returnType());
        assertEquals("This method returns the sum of all elements in the array.", methodInfo.description());

        assertNotNull(author);
        assertEquals("John", author.firstName());
        assertEquals("Doe", author.lastName());
    }

    @Test
    public void testMaxMethodAnnotation() throws NoSuchMethodException {
        Method maxMethod = ArrayUtils.class.getMethod("max", int[].class);
        MethodInfo methodInfo = maxMethod.getAnnotation(MethodInfo.class);
        Author author = maxMethod.getAnnotation(Author.class);

        assertNotNull(methodInfo);
        assertEquals("max", methodInfo.name());
        assertEquals("int", methodInfo.returnType());
        assertEquals("This method returns the maximum element in the array.", methodInfo.description());

        assertNotNull(author);
        assertEquals("Jane", author.firstName());
        assertEquals("Doe", author.lastName());
    }
}
