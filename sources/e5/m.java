package e5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15025a = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        synchronized (f15025a) {
            try {
                if (th2 == null) {
                    replace = null;
                } else {
                    Throwable th3 = th2;
                    while (true) {
                        if (th3 != null) {
                            if (th3 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder r10 = da.e.r(str, "\n  ");
            r10.append(replace.replace("\n", "\n  "));
            r10.append('\n');
            return r10.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f15025a) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f15025a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static void e(String str, String str2) {
        synchronized (f15025a) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2) {
        synchronized (f15025a) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }
}
