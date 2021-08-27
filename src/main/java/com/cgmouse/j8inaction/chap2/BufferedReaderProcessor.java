package com.cgmouse.j8inaction.chap2;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferedReaderProcessor {
    String process(BufferedReader bufferedReader) throws IOException;
}
