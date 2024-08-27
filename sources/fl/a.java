package fl;

import hl.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16162a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16163b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f16164c;

    public final boolean a(String str) {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!sl.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i10 = 0; i10 < 30; i10++) {
                        fArr[i10] = 0.0f;
                    }
                    e eVar = e.f18611a;
                    String[] f10 = e.f(hl.c.f18600a, new float[][]{fArr}, new String[]{str});
                    if (f10 != null) {
                        String str3 = f10[0];
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    str2 = "none";
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
            return !Intrinsics.a("none", str2);
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return false;
        }
    }
}
