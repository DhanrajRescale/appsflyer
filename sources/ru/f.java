package ru;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;
import ut.l;
import ut.m;
import ut.n;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34007a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object a10;
        try {
            l.Companion companion = l.INSTANCE;
            a10 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            l.Companion companion2 = l.INSTANCE;
            a10 = n.a(th2);
        }
        if (a10 instanceof m) {
            a10 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
