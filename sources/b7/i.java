package b7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3875b;

    /* renamed from: c, reason: collision with root package name */
    public long f3876c;

    /* renamed from: d, reason: collision with root package name */
    public int f3877d;

    /* renamed from: e, reason: collision with root package name */
    public int f3878e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3879f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3880g;

    public i(List list) {
        this.f3874a = 0;
        this.f3879f = list;
        this.f3880g = new z5.b0[list.size()];
        this.f3876c = -9223372036854775807L;
    }

    @Override // b7.j
    public final void b(e5.p pVar) {
        switch (this.f3874a) {
            case 0:
                if (this.f3875b) {
                    if (this.f3877d == 2) {
                        if (pVar.a() != 0) {
                            if (pVar.u() != 32) {
                                this.f3875b = false;
                            }
                            this.f3877d--;
                            if (!this.f3875b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (this.f3877d == 1) {
                        if (pVar.a() != 0) {
                            if (pVar.u() != 0) {
                                this.f3875b = false;
                            }
                            this.f3877d--;
                            if (!this.f3875b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    int i10 = pVar.f15037b;
                    int a10 = pVar.a();
                    for (z5.b0 b0Var : (z5.b0[]) this.f3880g) {
                        pVar.F(i10);
                        b0Var.c(a10, pVar);
                    }
                    this.f3878e += a10;
                    return;
                }
                return;
            default:
                yk.j.I0((z5.b0) this.f3880g);
                if (this.f3875b) {
                    int a11 = pVar.a();
                    int i11 = this.f3878e;
                    if (i11 < 10) {
                        int min = Math.min(a11, 10 - i11);
                        System.arraycopy(pVar.f15036a, pVar.f15037b, ((e5.p) this.f3879f).f15036a, this.f3878e, min);
                        if (this.f3878e + min == 10) {
                            ((e5.p) this.f3879f).F(0);
                            if (73 == ((e5.p) this.f3879f).u() && 68 == ((e5.p) this.f3879f).u() && 51 == ((e5.p) this.f3879f).u()) {
                                ((e5.p) this.f3879f).G(3);
                                this.f3877d = ((e5.p) this.f3879f).t() + 10;
                            } else {
                                e5.m.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.f3875b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.f3877d - this.f3878e);
                    ((z5.b0) this.f3880g).c(min2, pVar);
                    this.f3878e += min2;
                    return;
                }
                return;
        }
    }

    @Override // b7.j
    public final void d() {
        switch (this.f3874a) {
            case 0:
                this.f3875b = false;
                this.f3876c = -9223372036854775807L;
                return;
            default:
                this.f3875b = false;
                this.f3876c = -9223372036854775807L;
                return;
        }
    }

    @Override // b7.j
    public final void e() {
        int i10;
        switch (this.f3874a) {
            case 0:
                if (this.f3875b) {
                    if (this.f3876c != -9223372036854775807L) {
                        for (z5.b0 b0Var : (z5.b0[]) this.f3880g) {
                            b0Var.b(this.f3876c, 1, this.f3878e, 0, null);
                        }
                    }
                    this.f3875b = false;
                    return;
                }
                return;
            default:
                yk.j.I0((z5.b0) this.f3880g);
                if (this.f3875b && (i10 = this.f3877d) != 0 && this.f3878e == i10) {
                    long j10 = this.f3876c;
                    if (j10 != -9223372036854775807L) {
                        ((z5.b0) this.f3880g).b(j10, 1, i10, 0, null);
                    }
                    this.f3875b = false;
                    return;
                }
                return;
        }
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        switch (this.f3874a) {
            case 0:
                if ((i10 & 4) == 0) {
                    return;
                }
                this.f3875b = true;
                if (j10 != -9223372036854775807L) {
                    this.f3876c = j10;
                }
                this.f3878e = 0;
                this.f3877d = 2;
                return;
            default:
                if ((i10 & 4) == 0) {
                    return;
                }
                this.f3875b = true;
                if (j10 != -9223372036854775807L) {
                    this.f3876c = j10;
                }
                this.f3877d = 0;
                this.f3878e = 0;
                return;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        switch (this.f3874a) {
            case 0:
                for (int i10 = 0; i10 < ((z5.b0[]) this.f3880g).length; i10++) {
                    g0 g0Var = (g0) ((List) this.f3879f).get(i10);
                    h0Var.a();
                    h0Var.b();
                    z5.b0 f10 = rVar.f(h0Var.f3872d, 3);
                    b5.u uVar = new b5.u();
                    h0Var.b();
                    uVar.f3590a = h0Var.f3873e;
                    uVar.f3600k = "application/dvbsubs";
                    uVar.f3602m = Collections.singletonList(g0Var.f3857b);
                    uVar.f3592c = g0Var.f3856a;
                    f10.e(new b5.v(uVar));
                    ((z5.b0[]) this.f3880g)[i10] = f10;
                }
                return;
            default:
                h0Var.a();
                h0Var.b();
                z5.b0 f11 = rVar.f(h0Var.f3872d, 5);
                this.f3880g = f11;
                b5.u uVar2 = new b5.u();
                h0Var.b();
                uVar2.f3590a = h0Var.f3873e;
                uVar2.f3600k = "application/id3";
                f11.e(new b5.v(uVar2));
                return;
        }
    }

    public i() {
        this.f3874a = 1;
        this.f3879f = new e5.p(10);
        this.f3876c = -9223372036854775807L;
    }
}
