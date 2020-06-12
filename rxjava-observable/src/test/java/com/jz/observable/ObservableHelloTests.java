package com.jz.observable;

import io.reactivex.Observable;
import org.junit.jupiter.api.Test;

/**
 * @author xuwenbingfor
 * @version 2020/6/12 22:15
 * @description
 */
public class ObservableHelloTests {
    @Test
    public void test1() {
        Observable<String> o = Observable.fromArray("a", "b", "c");
        o.subscribe(System.out::println);
        o.subscribe(System.out::println);
        o.subscribe(System.out::println);
    }
}
