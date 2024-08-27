package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import jr.h;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", h.s("checkMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", h.s("checkNotMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(@NonNull Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(Object obj, @NonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
