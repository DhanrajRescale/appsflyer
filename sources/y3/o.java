package y3;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class o {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
