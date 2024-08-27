package x1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f39938a;

    /* renamed from: b, reason: collision with root package name */
    public final e f39939b;

    /* renamed from: c, reason: collision with root package name */
    public final e.l f39940c = new e.l(8);

    /* renamed from: d, reason: collision with root package name */
    public final c2.v f39941d = new c2.v();

    /* renamed from: e, reason: collision with root package name */
    public boolean f39942e;

    public x(androidx.compose.ui.node.a aVar) {
        this.f39938a = aVar;
        this.f39939b = new e(aVar.f1422w.f7655b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(v vVar, f0 f0Var, boolean z10) {
        byte b10;
        e eVar;
        int i10;
        c2.v vVar2 = this.f39941d;
        if (this.f39942e) {
            return 0;
        }
        try {
            this.f39942e = true;
            f O = this.f39940c.O(vVar, f0Var);
            t.o oVar = O.f39844a;
            int i11 = oVar.i();
            for (int i12 = 0; i12 < i11; i12++) {
                t tVar = (t) oVar.j(i12);
                if (!tVar.f39912d && !tVar.f39916h) {
                }
                b10 = false;
                break;
            }
            b10 = true;
            int i13 = oVar.i();
            int i14 = 0;
            while (true) {
                eVar = this.f39939b;
                if (i14 >= i13) {
                    break;
                }
                t tVar2 = (t) oVar.j(i14);
                if (b10 != false || t0.t.y(tVar2)) {
                    this.f39938a.v(tVar2.f39911c, this.f39941d, r.b(tVar2.f39917i, 1), true);
                    if (!vVar2.isEmpty()) {
                        eVar.a(tVar2.f39909a, vVar2);
                        vVar2.clear();
                    }
                }
                i14++;
            }
            eVar.f39842b.c();
            boolean b11 = eVar.b(O, z10);
            if (!O.f39846c) {
                int i15 = oVar.i();
                for (int i16 = 0; i16 < i15; i16++) {
                    t tVar3 = (t) oVar.j(i16);
                    if ((!m1.c.b(t0.t.p0(tVar3, true), m1.c.f27233b)) && tVar3.b()) {
                        i10 = 2;
                        break;
                    }
                }
            }
            i10 = 0;
            int i17 = (b11 ? 1 : 0) | i10;
            this.f39942e = false;
            return i17;
        } catch (Throwable th2) {
            this.f39942e = false;
            throw th2;
        }
    }

    public final void b() {
        if (!this.f39942e) {
            ((t.o) this.f39940c.f14641b).a();
            j jVar = this.f39939b.f39842b;
            v0.h hVar = jVar.f39865a;
            int i10 = hVar.f37655c;
            if (i10 > 0) {
                Object[] objArr = hVar.f37653a;
                int i11 = 0;
                do {
                    ((i) objArr[i11]).d();
                    i11++;
                } while (i11 < i10);
            }
            jVar.f39865a.g();
        }
    }
}
