package rl;

import al.d;
import bl.j;
import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;
import ll.e;
import zq.f;

/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final e f33952b = new e(7, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f33953c = a.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    public static a f33954d;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f33955a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33955a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10 != null) {
            Throwable th2 = null;
            Throwable th3 = e10;
            loop0: while (true) {
                if (th3 == null || th3 == th2) {
                    break;
                }
                StackTraceElement[] stackTrace = th3.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
                int length = stackTrace.length;
                int i10 = 0;
                while (i10 < length) {
                    StackTraceElement element = stackTrace[i10];
                    i10++;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    if (j.H(element)) {
                        f.F(e10);
                        d.R(e10, pl.a.f31153d).b();
                        break loop0;
                    }
                }
                th2 = th3;
                th3 = th3.getCause();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33955a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
