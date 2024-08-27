package sl;

import al.d;
import com.facebook.FacebookSdk;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import zq.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f34672a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public static boolean f34673b;

    public static final void a(Object o10, Throwable th2) {
        Intrinsics.checkNotNullParameter(o10, "o");
        if (!f34673b) {
            return;
        }
        f34672a.add(o10);
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            f.F(th2);
            d.R(th2, pl.a.f31154e).b();
        }
    }

    public static final boolean b(Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return f34672a.contains(o10);
    }
}
