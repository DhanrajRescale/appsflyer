package rt;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33993a = new Throwable("No further exceptions");

    public static String a(long j10, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j10 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException b(Throwable th2) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                return (RuntimeException) th2;
            }
            return new RuntimeException(th2);
        }
        throw ((Error) th2);
    }
}
