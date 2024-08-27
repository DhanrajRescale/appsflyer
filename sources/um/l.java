package um;

import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class l extends e {
    public Drawable A;
    public int B;
    public float C;
    public boolean D;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37278v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f37279w;

    /* renamed from: x, reason: collision with root package name */
    public float f37280x;

    /* renamed from: y, reason: collision with root package name */
    public DashPathEffect f37281y;

    /* renamed from: z, reason: collision with root package name */
    public int f37282z;

    public final void l(float f10) {
        this.f37280x = cn.h.c(f10);
    }

    public final void m(float f10) {
        if (f10 < s0.g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > 10.0f) {
            f10 = 10.0f;
        }
        this.C = cn.h.c(f10);
    }
}
