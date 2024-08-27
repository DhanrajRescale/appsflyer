package m0;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0.n1 f26918a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f26919b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.n1 f26920c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f26921d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.n1 f26922e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.n1 f26923f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.n1 f26924g;

    /* renamed from: h, reason: collision with root package name */
    public final t0.n1 f26925h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.n1 f26926i;

    /* renamed from: j, reason: collision with root package name */
    public final t0.n1 f26927j;

    /* renamed from: k, reason: collision with root package name */
    public final t0.n1 f26928k;

    /* renamed from: l, reason: collision with root package name */
    public final t0.n1 f26929l;

    /* renamed from: m, reason: collision with root package name */
    public final t0.n1 f26930m;

    public v0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        n1.t tVar = new n1.t(j10);
        t0.o3 o3Var = t0.o3.f35116a;
        this.f26918a = t0.t.n0(tVar, o3Var);
        this.f26919b = t0.t.n0(new n1.t(j11), o3Var);
        this.f26920c = t0.t.n0(new n1.t(j12), o3Var);
        this.f26921d = t0.t.n0(new n1.t(j13), o3Var);
        this.f26922e = t0.t.n0(new n1.t(j14), o3Var);
        this.f26923f = t0.t.n0(new n1.t(j15), o3Var);
        this.f26924g = t0.t.n0(new n1.t(j16), o3Var);
        this.f26925h = t0.t.n0(new n1.t(j17), o3Var);
        this.f26926i = t0.t.n0(new n1.t(j18), o3Var);
        this.f26927j = t0.t.n0(new n1.t(j19), o3Var);
        this.f26928k = t0.t.n0(new n1.t(j20), o3Var);
        this.f26929l = t0.t.n0(new n1.t(j21), o3Var);
        this.f26930m = t0.t.n0(Boolean.TRUE, o3Var);
    }

    public final long a() {
        return ((n1.t) this.f26924g.getValue()).f28179a;
    }

    public final long b() {
        return ((n1.t) this.f26928k.getValue()).f28179a;
    }

    public final long c() {
        return ((n1.t) this.f26918a.getValue()).f28179a;
    }

    public final long d() {
        return ((n1.t) this.f26923f.getValue()).f28179a;
    }

    public final boolean e() {
        return ((Boolean) this.f26930m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        sb2.append((Object) n1.t.j(c()));
        sb2.append(", primaryVariant=");
        v.e.t(((n1.t) this.f26919b.getValue()).f28179a, sb2, ", secondary=");
        v.e.t(((n1.t) this.f26920c.getValue()).f28179a, sb2, ", secondaryVariant=");
        v.e.t(((n1.t) this.f26921d.getValue()).f28179a, sb2, ", background=");
        sb2.append((Object) n1.t.j(((n1.t) this.f26922e.getValue()).f28179a));
        sb2.append(", surface=");
        sb2.append((Object) n1.t.j(d()));
        sb2.append(", error=");
        sb2.append((Object) n1.t.j(a()));
        sb2.append(", onPrimary=");
        v.e.t(((n1.t) this.f26925h.getValue()).f28179a, sb2, ", onSecondary=");
        v.e.t(((n1.t) this.f26926i.getValue()).f28179a, sb2, ", onBackground=");
        sb2.append((Object) n1.t.j(((n1.t) this.f26927j.getValue()).f28179a));
        sb2.append(", onSurface=");
        sb2.append((Object) n1.t.j(b()));
        sb2.append(", onError=");
        sb2.append((Object) n1.t.j(((n1.t) this.f26929l.getValue()).f28179a));
        sb2.append(", isLight=");
        sb2.append(e());
        sb2.append(')');
        return sb2.toString();
    }
}
