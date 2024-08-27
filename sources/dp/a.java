package dp;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14428c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14429d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f14430e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f14431f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f14432g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f14433h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14434i = false;

    public a(int i10, int i11, long j10, long j11, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f14426a = i10;
        this.f14427b = i11;
        this.f14428c = j10;
        this.f14429d = j11;
        this.f14430e = pendingIntent;
        this.f14431f = pendingIntent2;
        this.f14432g = pendingIntent3;
        this.f14433h = pendingIntent4;
    }

    public final PendingIntent a(m mVar) {
        long j10 = this.f14429d;
        long j11 = this.f14428c;
        boolean z10 = mVar.f14464b;
        int i10 = mVar.f14463a;
        if (i10 == 0) {
            PendingIntent pendingIntent = this.f14431f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!z10 || j11 > j10) {
                return null;
            }
            return this.f14433h;
        }
        if (i10 == 1) {
            PendingIntent pendingIntent2 = this.f14430e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z10 && j11 <= j10) {
                return this.f14432g;
            }
        }
        return null;
    }
}
