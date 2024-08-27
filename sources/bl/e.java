package bl;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f7089c;

    /* renamed from: d, reason: collision with root package name */
    public static l f7090d;

    /* renamed from: e, reason: collision with root package name */
    public static String f7091e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f7094h;

    /* renamed from: a, reason: collision with root package name */
    public static final e f7087a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final m f7088b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f7092f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f7093g = new AtomicBoolean(false);

    public static final String a() {
        if (sl.a.b(e.class)) {
            return null;
        }
        try {
            if (f7091e == null) {
                f7091e = UUID.randomUUID().toString();
            }
            String str = f7091e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            sl.a.a(e.class, th2);
            return null;
        }
    }
}
