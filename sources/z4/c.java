package z4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x2.c f42009a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f42010b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f42011c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f42012d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
