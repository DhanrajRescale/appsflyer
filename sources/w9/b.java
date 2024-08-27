package w9;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38875a = new Object();

    public static void a() {
        f38875a.getClass();
    }

    public static void b(String str) {
        f38875a.getClass();
        HashSet hashSet = a.f38874a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th2) {
        f38875a.getClass();
        HashSet hashSet = a.f38874a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th2);
            hashSet.add(str);
        }
    }
}
