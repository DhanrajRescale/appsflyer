package il;

import com.facebook.FacebookSdk;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import vt.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20096a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f20097b;

    /* JADX WARN: Type inference failed for: r0v0, types: [il.b, java.lang.Object] */
    static {
        String[] elements = {"fb_mobile_purchase", "StartTrial", "Subscribe"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f20097b = v.B(elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class<il.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public static final boolean a() {
        boolean z10;
        Object obj = b.class;
        if (sl.a.b(obj)) {
            return false;
        }
        try {
            if (FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext()) || n0.y() || sl.a.b(g.class)) {
                return false;
            }
            try {
                if (g.f20111b == null) {
                    if (g.f20110a.a(FacebookSdk.getApplicationContext()) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g.f20111b = Boolean.valueOf(z10);
                }
                Boolean bool = g.f20111b;
                if (bool == null) {
                    return false;
                }
                obj = bool.booleanValue();
                if (obj == 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                sl.a.a(g.class, th2);
                return false;
            }
        } catch (Throwable th3) {
            sl.a.a(obj, th3);
            return false;
        }
    }
}
