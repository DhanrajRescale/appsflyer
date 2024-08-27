package x1;

import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f39909a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39910b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39911c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39912d;

    /* renamed from: e, reason: collision with root package name */
    public final float f39913e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39914f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39915g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f39916h;

    /* renamed from: i, reason: collision with root package name */
    public final int f39917i;

    /* renamed from: j, reason: collision with root package name */
    public final long f39918j;

    /* renamed from: k, reason: collision with root package name */
    public final List f39919k;

    /* renamed from: l, reason: collision with root package name */
    public final long f39920l;

    /* renamed from: m, reason: collision with root package name */
    public c f39921m;

    /* JADX WARN: Type inference failed for: r2v11, types: [x1.c, java.lang.Object] */
    public t(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f39909a = j10;
        this.f39910b = j11;
        this.f39911c = j12;
        this.f39912d = z10;
        this.f39913e = f10;
        this.f39914f = j13;
        this.f39915g = j14;
        this.f39916h = z11;
        this.f39917i = i10;
        this.f39918j = j15;
        this.f39920l = m1.c.f27233b;
        ?? obj = new Object();
        obj.f39830a = z12;
        obj.f39831b = z12;
        this.f39921m = obj;
    }

    public final void a() {
        c cVar = this.f39921m;
        cVar.f39831b = true;
        cVar.f39830a = true;
    }

    public final boolean b() {
        c cVar = this.f39921m;
        if (!cVar.f39831b && !cVar.f39830a) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) s.b(this.f39909a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f39910b);
        sb2.append(", position=");
        sb2.append((Object) m1.c.j(this.f39911c));
        sb2.append(", pressed=");
        sb2.append(this.f39912d);
        sb2.append(", pressure=");
        sb2.append(this.f39913e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f39914f);
        sb2.append(", previousPosition=");
        sb2.append((Object) m1.c.j(this.f39915g));
        sb2.append(", previousPressed=");
        sb2.append(this.f39916h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i10 = this.f39917i;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb2.append((Object) str);
        sb2.append(", historical=");
        Object obj = this.f39919k;
        if (obj == null) {
            obj = vt.i0.f38321a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) m1.c.j(this.f39918j));
        sb2.append(')');
        return sb2.toString();
    }

    public t(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, j15);
        this.f39919k = list;
        this.f39920l = j16;
    }
}
