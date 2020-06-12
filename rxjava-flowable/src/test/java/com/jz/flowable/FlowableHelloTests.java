package com.jz.flowable;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;

/**
 * @author xuwenbingfor
 * @version 2020/6/12 22:04
 * @description
 */
public class FlowableHelloTests {
    @Test
    public void test1() {
        String[] args = new String[]{"xiaoming"};
        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));
    }
}
