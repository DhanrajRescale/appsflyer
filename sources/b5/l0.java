package b5;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f3404a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f3405b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3404a.add(str)) {
                f3405b += ", " + str;
            }
        }
    }
}
