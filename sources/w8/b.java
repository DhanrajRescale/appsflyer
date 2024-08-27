package w8;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38850a;

    /* renamed from: b, reason: collision with root package name */
    public double f38851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38852c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38853d;

    public b(Context context) {
        this.f38850a = context;
        Bitmap.Config[] configArr = d9.e.f14221a;
        double d10 = 0.2d;
        try {
            Object systemService = r3.k.getSystemService(context, ActivityManager.class);
            Intrinsics.c(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d10 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f38851b = d10;
        this.f38852c = true;
        this.f38853d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [w8.m] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final f a() {
        ?? r02;
        l aVar;
        int i10;
        int i11;
        if (this.f38853d) {
            r02 = new k();
        } else {
            r02 = new Object();
        }
        if (this.f38852c) {
            double d10 = this.f38851b;
            if (d10 > 0.0d) {
                Context context = this.f38850a;
                Bitmap.Config[] configArr = d9.e.f14221a;
                try {
                    Object systemService = r3.k.getSystemService(context, ActivityManager.class);
                    Intrinsics.c(systemService);
                    ActivityManager activityManager = (ActivityManager) systemService;
                    if ((context.getApplicationInfo().flags & 1048576) != 0) {
                        i11 = activityManager.getLargeMemoryClass();
                    } else {
                        i11 = activityManager.getMemoryClass();
                    }
                } catch (Exception unused) {
                    i11 = 256;
                }
                double d11 = d10 * i11;
                double d12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i10 = (int) (d11 * d12 * d12);
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                aVar = new i(i10, r02);
            } else {
                aVar = new a(r02);
            }
        } else {
            aVar = new a(r02);
        }
        return new f(aVar, r02);
    }

    public final void b(double d10) {
        if (0.0d <= d10 && d10 <= 1.0d) {
            this.f38851b = d10;
            return;
        }
        throw new IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
    }
}
