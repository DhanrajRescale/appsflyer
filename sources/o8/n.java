package o8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qu.i2;
import qu.r0;
import t0.h2;
import t0.n1;
import t0.o3;
import tu.k1;
import tu.l1;

/* loaded from: classes.dex */
public final class n extends q1.b implements h2 {

    /* renamed from: t, reason: collision with root package name */
    public static final c f29812t = new c(1);

    /* renamed from: e, reason: collision with root package name */
    public vu.f f29813e;

    /* renamed from: f, reason: collision with root package name */
    public final k1 f29814f = l1.a(new m1.f(m1.f.f27251b));

    /* renamed from: g, reason: collision with root package name */
    public final n1 f29815g;

    /* renamed from: h, reason: collision with root package name */
    public final t0.k1 f29816h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f29817i;

    /* renamed from: j, reason: collision with root package name */
    public i f29818j;

    /* renamed from: k, reason: collision with root package name */
    public q1.b f29819k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f29820l;

    /* renamed from: m, reason: collision with root package name */
    public Function1 f29821m;

    /* renamed from: n, reason: collision with root package name */
    public a2.l f29822n;

    /* renamed from: o, reason: collision with root package name */
    public int f29823o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29824p;

    /* renamed from: q, reason: collision with root package name */
    public final n1 f29825q;

    /* renamed from: r, reason: collision with root package name */
    public final n1 f29826r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f29827s;

    public n(y8.j jVar, n8.i iVar) {
        o3 o3Var = o3.f35116a;
        this.f29815g = t0.t.n0(null, o3Var);
        this.f29816h = dp.b.y1(1.0f);
        this.f29817i = t0.t.n0(null, o3Var);
        e eVar = e.f29797a;
        this.f29818j = eVar;
        this.f29820l = f29812t;
        this.f29822n = a2.k.f97b;
        p1.h.S.getClass();
        this.f29823o = p1.g.f30508c;
        this.f29825q = t0.t.n0(eVar, o3Var);
        this.f29826r = t0.t.n0(jVar, o3Var);
        this.f29827s = t0.t.n0(iVar, o3Var);
    }

    @Override // t0.h2
    public final void a() {
        vu.f fVar = this.f29813e;
        h2 h2Var = null;
        if (fVar != null) {
            hl.f.A(fVar, null);
        }
        this.f29813e = null;
        Object obj = this.f29819k;
        if (obj instanceof h2) {
            h2Var = (h2) obj;
        }
        if (h2Var != null) {
            h2Var.a();
        }
    }

    @Override // t0.h2
    public final void b() {
        vu.f fVar = this.f29813e;
        h2 h2Var = null;
        if (fVar != null) {
            hl.f.A(fVar, null);
        }
        this.f29813e = null;
        Object obj = this.f29819k;
        if (obj instanceof h2) {
            h2Var = (h2) obj;
        }
        if (h2Var != null) {
            h2Var.b();
        }
    }

    @Override // q1.b
    public final void c(float f10) {
        this.f29816h.j(f10);
    }

    @Override // t0.h2
    public final void d() {
        h2 h2Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f29813e == null) {
                i2 l10 = el.l.l();
                xu.e eVar = r0.f32255a;
                vu.f d10 = hl.f.d(l10.l(((ru.d) vu.u.f38408a).f34006f));
                this.f29813e = d10;
                Object obj = this.f29819k;
                q1.b bVar = null;
                if (obj instanceof h2) {
                    h2Var = (h2) obj;
                } else {
                    h2Var = null;
                }
                if (h2Var != null) {
                    h2Var.d();
                }
                if (this.f29824p) {
                    y8.h a10 = y8.j.a((y8.j) this.f29826r.getValue());
                    a10.f41337b = ((n8.o) ((n8.i) this.f29827s.getValue())).f28397b;
                    a10.O = null;
                    y8.j a11 = a10.a();
                    Drawable b10 = d9.d.b(a11, a11.G, a11.F, a11.M.f41310j);
                    if (b10 != null) {
                        bVar = j(b10);
                    }
                    k(new g(bVar));
                } else {
                    yk.g.H(d10, null, null, new k(this, null), 3);
                }
            }
            Unit unit = Unit.f23355a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // q1.b
    public final void e(n1.u uVar) {
        this.f29817i.setValue(uVar);
    }

    @Override // q1.b
    public final long h() {
        q1.b bVar = (q1.b) this.f29815g.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return m1.f.f27252c;
    }

    @Override // q1.b
    public final void i(p1.h hVar) {
        this.f29814f.m(new m1.f(hVar.d()));
        q1.b bVar = (q1.b) this.f29815g.getValue();
        if (bVar != null) {
            bVar.g(hVar, hVar.d(), this.f29816h.i(), (n1.u) this.f29817i.getValue());
        }
    }

    public final q1.b j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            n1.e eVar = new n1.e(bitmap);
            int i10 = this.f29823o;
            q1.a aVar = new q1.a(eVar, w2.h.f38791b, hl.f.k(bitmap.getWidth(), bitmap.getHeight()));
            aVar.f31566h = i10;
            return aVar;
        }
        return new dn.a(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(o8.i r14) {
        /*
            r13 = this;
            o8.i r0 = r13.f29818j
            kotlin.jvm.functions.Function1 r1 = r13.f29820l
            java.lang.Object r14 = r1.invoke(r14)
            o8.i r14 = (o8.i) r14
            r13.f29818j = r14
            t0.n1 r1 = r13.f29825q
            r1.setValue(r14)
            boolean r1 = r14 instanceof o8.h
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r14
            o8.h r1 = (o8.h) r1
            y8.p r1 = r1.f29802b
            goto L25
        L1c:
            boolean r1 = r14 instanceof o8.f
            if (r1 == 0) goto L63
            r1 = r14
            o8.f r1 = (o8.f) r1
            y8.e r1 = r1.f29799b
        L25:
            y8.j r3 = r1.b()
            c9.e r3 = r3.f41374m
            o8.o r4 = o8.p.f29828a
            c9.f r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof c9.b
            if (r4 == 0) goto L63
            q1.b r4 = r0.a()
            boolean r5 = r0 instanceof o8.g
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            q1.b r8 = r14.a()
            a2.l r9 = r13.f29822n
            c9.b r3 = (c9.b) r3
            int r10 = r3.f8066c
            boolean r4 = r1 instanceof y8.p
            if (r4 == 0) goto L58
            y8.p r1 = (y8.p) r1
            boolean r1 = r1.f41412g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            boolean r12 = r3.f8067d
            o8.v r1 = new o8.v
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L64
        L63:
            r1 = r2
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            q1.b r1 = r14.a()
        L6b:
            r13.f29819k = r1
            t0.n1 r3 = r13.f29815g
            r3.setValue(r1)
            vu.f r1 = r13.f29813e
            if (r1 == 0) goto La1
            q1.b r1 = r0.a()
            q1.b r3 = r14.a()
            if (r1 == r3) goto La1
            q1.b r0 = r0.a()
            boolean r1 = r0 instanceof t0.h2
            if (r1 == 0) goto L8b
            t0.h2 r0 = (t0.h2) r0
            goto L8c
        L8b:
            r0 = r2
        L8c:
            if (r0 == 0) goto L91
            r0.b()
        L91:
            q1.b r0 = r14.a()
            boolean r1 = r0 instanceof t0.h2
            if (r1 == 0) goto L9c
            r2 = r0
            t0.h2 r2 = (t0.h2) r2
        L9c:
            if (r2 == 0) goto La1
            r2.d()
        La1:
            kotlin.jvm.functions.Function1 r0 = r13.f29821m
            if (r0 == 0) goto La8
            r0.invoke(r14)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.n.k(o8.i):void");
    }
}
