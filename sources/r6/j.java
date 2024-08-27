package r6;

import e5.p;
import z5.b0;
import z5.r;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public b0 f33384b;

    /* renamed from: c, reason: collision with root package name */
    public r f33385c;

    /* renamed from: d, reason: collision with root package name */
    public h f33386d;

    /* renamed from: e, reason: collision with root package name */
    public long f33387e;

    /* renamed from: f, reason: collision with root package name */
    public long f33388f;

    /* renamed from: g, reason: collision with root package name */
    public long f33389g;

    /* renamed from: h, reason: collision with root package name */
    public int f33390h;

    /* renamed from: i, reason: collision with root package name */
    public int f33391i;

    /* renamed from: k, reason: collision with root package name */
    public long f33393k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33394l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33395m;

    /* renamed from: a, reason: collision with root package name */
    public final f f33383a = new f();

    /* renamed from: j, reason: collision with root package name */
    public tr.e f33392j = new tr.e(18, (Object) null);

    public void a(long j10) {
        this.f33389g = j10;
    }

    public abstract long b(p pVar);

    public abstract boolean c(p pVar, long j10, tr.e eVar);

    public void d(boolean z10) {
        if (z10) {
            this.f33392j = new tr.e(18, (Object) null);
            this.f33388f = 0L;
            this.f33390h = 0;
        } else {
            this.f33390h = 1;
        }
        this.f33387e = -1L;
        this.f33389g = 0L;
    }
}
