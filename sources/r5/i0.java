package r5;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 implements v5.m {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f33181a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.t f33182b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f33183c;

    /* renamed from: d, reason: collision with root package name */
    public final z5.r f33184d;

    /* renamed from: e, reason: collision with root package name */
    public final h.r0 f33185e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f33187g;

    /* renamed from: i, reason: collision with root package name */
    public long f33189i;

    /* renamed from: j, reason: collision with root package name */
    public g5.i f33190j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f33191k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f33193m;

    /* renamed from: f, reason: collision with root package name */
    public final mj.b f33186f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f33188h = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [mj.b, java.lang.Object] */
    public i0(m0 m0Var, Uri uri, g5.f fVar, h.c cVar, z5.r rVar, h.r0 r0Var) {
        this.f33193m = m0Var;
        this.f33181a = uri;
        this.f33182b = new g5.t(fVar);
        this.f33183c = cVar;
        this.f33184d = rVar;
        this.f33185e = r0Var;
        n.f33243a.getAndIncrement();
        this.f33190j = a(0L);
    }

    public final g5.i a(long j10) {
        Collections.emptyMap();
        String str = this.f33193m.f33225i;
        Map map = m0.Z;
        Uri uri = this.f33181a;
        yk.j.J0(uri, "The uri must be set.");
        return new g5.i(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
    }

    @Override // v5.m
    public final void e() {
        g5.f fVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.f33187g) {
            try {
                long j10 = this.f33186f.f27810a;
                g5.i a10 = a(j10);
                this.f33190j = a10;
                long o10 = this.f33182b.o(a10);
                if (o10 != -1) {
                    o10 += j10;
                    m0 m0Var = this.f33193m;
                    m0Var.f33232p.post(new h0(m0Var, 2));
                }
                long j11 = o10;
                this.f33193m.f33234r = j6.b.a(this.f33182b.f16625a.h());
                g5.t tVar = this.f33182b;
                j6.b bVar = this.f33193m.f33234r;
                if (bVar != null && (i10 = bVar.f21044f) != -1) {
                    fVar = new m(tVar, i10, this);
                    m0 m0Var2 = this.f33193m;
                    m0Var2.getClass();
                    u0 x10 = m0Var2.x(new k0(0, true));
                    this.f33191k = x10;
                    x10.e(m0.f33216e0);
                } else {
                    fVar = tVar;
                }
                long j12 = j10;
                this.f33183c.I(fVar, this.f33181a, this.f33182b.f16625a.h(), j10, j11, this.f33184d);
                if (this.f33193m.f33234r != null) {
                    Object obj = this.f33183c.f17584c;
                    if (((z5.p) obj) instanceof p6.d) {
                        ((p6.d) ((z5.p) obj)).f30707q = true;
                    }
                }
                if (this.f33188h) {
                    h.c cVar = this.f33183c;
                    long j13 = this.f33189i;
                    z5.p pVar = (z5.p) cVar.f17584c;
                    pVar.getClass();
                    pVar.f(j12, j13);
                    this.f33188h = false;
                }
                while (true) {
                    long j14 = j12;
                    while (i11 == 0 && !this.f33187g) {
                        try {
                            h.r0 r0Var = this.f33185e;
                            synchronized (r0Var) {
                                while (!r0Var.f17735a) {
                                    r0Var.wait();
                                }
                            }
                            h.c cVar2 = this.f33183c;
                            mj.b bVar2 = this.f33186f;
                            z5.p pVar2 = (z5.p) cVar2.f17584c;
                            pVar2.getClass();
                            z5.q qVar = (z5.q) cVar2.f17585d;
                            qVar.getClass();
                            i11 = pVar2.e(qVar, bVar2);
                            j12 = this.f33183c.s();
                            if (j12 > this.f33193m.f33226j + j14) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f33185e.d();
                    m0 m0Var3 = this.f33193m;
                    m0Var3.f33232p.post(m0Var3.f33231o);
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.f33183c.s() != -1) {
                    this.f33186f.f27810a = this.f33183c.s();
                }
                vl.b.h(this.f33182b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.f33183c.s() != -1) {
                    this.f33186f.f27810a = this.f33183c.s();
                }
                vl.b.h(this.f33182b);
                throw th2;
            }
        }
    }

    @Override // v5.m
    public final void f() {
        this.f33187g = true;
    }
}
