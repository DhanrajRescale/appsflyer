package vu;

import ut.l;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38355a = 0;

    static {
        Object a10;
        Object a11;
        Exception exc = new Exception();
        String simpleName = qu.i0.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            l.Companion companion = ut.l.INSTANCE;
            a10 = au.a.class.getCanonicalName();
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        if (ut.l.a(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a11 = a0.class.getCanonicalName();
        } catch (Throwable th3) {
            l.Companion companion3 = ut.l.INSTANCE;
            a11 = ut.n.a(th3);
        }
        if (ut.l.a(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
