package in.juspay.hyper.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class ExecutorManager {
    private static String logsThreadId;
    private static String trackerThreadId;
    private static final ExecutorService logsPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService remoteAssetsPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService sharedPool = Executors.newFixedThreadPool(4);
    private static final ExecutorService sdkTrackerPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService logSessioniserPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService logPusherPool = Executors.newSingleThreadExecutor();

    public static void runOnBackgroundThread(Runnable runnable) {
        sharedPool.execute(runnable);
    }

    public static void runOnLogPusherThread(Runnable runnable) {
        logPusherPool.execute(runnable);
    }

    public static void runOnLogSessioniserThread(Runnable runnable) {
        logSessioniserPool.execute(runnable);
    }

    public static void runOnLogsPool(Runnable runnable) {
        if (Objects.equals(logsThreadId, String.valueOf(Thread.currentThread().getId()))) {
            runnable.run();
        } else {
            logsPool.execute(runnable);
        }
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnRemoteAssetsPool(Runnable runnable) {
        remoteAssetsPool.execute(runnable);
    }

    public static void runOnSdkTrackerPool(Runnable runnable) {
        if (Objects.equals(trackerThreadId, String.valueOf(Thread.currentThread().getId()))) {
            runnable.run();
        } else {
            sdkTrackerPool.execute(runnable);
        }
    }

    public static void setLogsThreadId(long j10) {
        logsThreadId = String.valueOf(j10);
    }

    public static void setTrackerThreadId(long j10) {
        trackerThreadId = String.valueOf(j10);
    }
}
