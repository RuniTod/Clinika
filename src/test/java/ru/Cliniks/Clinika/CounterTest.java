package ru.Cliniks.Clinika;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class CounterTest {

    @Test
    public void increase() throws InterruptedException {
        final Counter counter = new Counter();
        final List<Reader> readerList = Arrays.asList(
                new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),
                new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter),new Reader(counter)
        );
        for (final Reader reader:readerList){
            reader.start();
        }
        Thread.sleep(10001);
        assertEquals(1201,counter.increase());
    }

    private static final class Reader extends Thread{
        private final Counter counter;

        private Reader(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i =0 ;i != 100;++i){
                System.out.println(String.format("%s : %s",Thread.currentThread().getId(),this.counter.increase()));
            }
        }
    }
}
