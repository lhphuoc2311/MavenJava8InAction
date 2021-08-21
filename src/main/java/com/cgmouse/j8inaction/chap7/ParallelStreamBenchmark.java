package com.cgmouse.j8inaction.chap7;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(value = 2, jvmArgs = { "-Xms4G", "-Xmx4G" })
@Measurement(iterations = 2)
@Warmup(iterations = 3)
public class ParallelStreamBenchmark {

    private static final long N = 10_000_000L;

    // using internal iterative stream
    @Benchmark
    public long sequentialSum() {
        return Stream.iterate(1L, num -> num + 1).limit(N).reduce(0L, Long::sum);
    }

    @Benchmark
    public long iterativeSum() {
        long result = 0;
        for (long i = 1L; i <= N; i++) {
            result += i;
        }
        return result;
    }

    @TearDown(Level.Invocation)
    public void tearDown() {
        System.gc();
    }

}
