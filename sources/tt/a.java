package tt;

import at.g;
import e.j;
import et.e;
import rt.d;

/* loaded from: classes2.dex */
public final class a implements ct.b, e {

    /* renamed from: a, reason: collision with root package name */
    public final g f36383a;

    /* renamed from: b, reason: collision with root package name */
    public final b f36384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36385c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36386d;

    /* renamed from: e, reason: collision with root package name */
    public j f36387e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36388f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f36389g;

    /* renamed from: h, reason: collision with root package name */
    public long f36390h;

    public a(g gVar, b bVar) {
        this.f36383a = gVar;
        this.f36384b = bVar;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f36389g) {
            this.f36389g = true;
            this.f36384b.i(this);
        }
    }

    public final void b(long j10, Object obj) {
        if (this.f36389g) {
            return;
        }
        if (!this.f36388f) {
            synchronized (this) {
                try {
                    if (this.f36389g) {
                        return;
                    }
                    if (this.f36390h == j10) {
                        return;
                    }
                    if (this.f36386d) {
                        j jVar = this.f36387e;
                        if (jVar == null) {
                            jVar = new j(4, 12);
                            this.f36387e = jVar;
                        }
                        int i10 = jVar.f14632a;
                        int i11 = jVar.f14633b;
                        if (i11 == i10) {
                            Object[] objArr = new Object[i10 + 1];
                            ((Object[]) jVar.f14635d)[i10] = objArr;
                            jVar.f14635d = objArr;
                            i11 = 0;
                        }
                        ((Object[]) jVar.f14635d)[i11] = obj;
                        jVar.f14633b = i11 + 1;
                        return;
                    }
                    this.f36385c = true;
                    this.f36388f = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(obj);
    }

    @Override // et.e
    public final boolean d(Object obj) {
        if (!this.f36389g) {
            g gVar = this.f36383a;
            if (obj == d.f33995a) {
                gVar.onComplete();
            } else if (obj instanceof rt.c) {
                gVar.onError(((rt.c) obj).f33994a);
            } else {
                gVar.b(obj);
                return false;
            }
        }
        return true;
    }
}
