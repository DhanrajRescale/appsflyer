package k3;

/* loaded from: classes.dex */
public abstract class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f22029a;

    /* renamed from: b, reason: collision with root package name */
    public j3.d f22030b;

    /* renamed from: c, reason: collision with root package name */
    public m f22031c;

    /* renamed from: d, reason: collision with root package name */
    public int f22032d;

    /* renamed from: e, reason: collision with root package name */
    public final h f22033e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f22034f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22035g = false;

    /* renamed from: h, reason: collision with root package name */
    public final g f22036h = new g(this);

    /* renamed from: i, reason: collision with root package name */
    public final g f22037i = new g(this);

    /* renamed from: j, reason: collision with root package name */
    public int f22038j = 1;

    public q(j3.d dVar) {
        this.f22030b = dVar;
    }

    public static void b(g gVar, g gVar2, int i10) {
        gVar.f22010l.add(gVar2);
        gVar.f22004f = i10;
        gVar2.f22009k.add(gVar);
    }

    public static g h(j3.c cVar) {
        j3.c cVar2 = cVar.f20844f;
        if (cVar2 == null) {
            return null;
        }
        int e10 = w.k.e(cVar2.f20843e);
        j3.d dVar = cVar2.f20842d;
        if (e10 != 1) {
            if (e10 != 2) {
                if (e10 != 3) {
                    if (e10 != 4) {
                        if (e10 != 5) {
                            return null;
                        }
                        return dVar.f20856e.f22016k;
                    }
                    return dVar.f20856e.f22037i;
                }
                return dVar.f20854d.f22037i;
            }
            return dVar.f20856e.f22036h;
        }
        return dVar.f20854d.f22036h;
    }

    public static g i(j3.c cVar, int i10) {
        q qVar;
        j3.c cVar2 = cVar.f20844f;
        if (cVar2 == null) {
            return null;
        }
        j3.d dVar = cVar2.f20842d;
        if (i10 == 0) {
            qVar = dVar.f20854d;
        } else {
            qVar = dVar.f20856e;
        }
        int e10 = w.k.e(cVar2.f20843e);
        if (e10 != 1 && e10 != 2) {
            if (e10 != 3 && e10 != 4) {
                return null;
            }
            return qVar.f22037i;
        }
        return qVar.f22036h;
    }

    public final void c(g gVar, g gVar2, int i10, h hVar) {
        gVar.f22010l.add(gVar2);
        gVar.f22010l.add(this.f22033e);
        gVar.f22006h = i10;
        gVar.f22007i = hVar;
        gVar2.f22009k.add(gVar);
        hVar.f22009k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            j3.d dVar = this.f22030b;
            int i12 = dVar.f20888x;
            max = Math.max(dVar.f20887w, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            j3.d dVar2 = this.f22030b;
            int i13 = dVar2.A;
            max = Math.max(dVar2.f20890z, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        if (this.f22033e.f22008j) {
            return r0.f22005g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f22029a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(j3.c r12, j3.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.q.l(j3.c, j3.c, int):void");
    }
}
