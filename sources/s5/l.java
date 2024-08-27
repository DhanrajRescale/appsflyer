package s5;

import b5.v;
import g5.t;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: j, reason: collision with root package name */
    public final g f34292j;

    /* renamed from: k, reason: collision with root package name */
    public f f34293k;

    /* renamed from: l, reason: collision with root package name */
    public long f34294l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f34295m;

    public l(g5.f fVar, g5.i iVar, v vVar, int i10, Object obj, g gVar) {
        super(fVar, iVar, 2, vVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f34292j = gVar;
    }

    @Override // v5.m
    public final void e() {
        if (this.f34294l == 0) {
            ((d) this.f34292j).a(this.f34293k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g5.i b10 = this.f34250b.b(this.f34294l);
            t tVar = this.f34257i;
            z5.l lVar = new z5.l(tVar, b10.f16574f, tVar.o(b10));
            while (!this.f34295m) {
                try {
                    d dVar = (d) this.f34292j;
                    int e10 = dVar.f34240a.e(lVar, d.f34239j);
                    boolean z10 = true;
                    if (e10 == 1) {
                        z10 = false;
                    }
                    yk.j.H0(z10);
                    if (e10 != 0) {
                        break;
                    }
                } finally {
                    this.f34294l = lVar.f42106d - this.f34250b.f16574f;
                }
            }
        } finally {
            vl.b.h(this.f34257i);
        }
    }

    @Override // v5.m
    public final void f() {
        this.f34295m = true;
    }
}
