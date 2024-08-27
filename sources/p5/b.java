package p5;

import al.d;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b3.t;
import b5.m0;
import b5.n0;
import b5.p0;
import b5.q0;
import b5.v;
import e5.x;
import i5.d0;
import i5.f;
import i5.g0;
import java.util.ArrayList;
import kq.e;
import yk.j;

/* loaded from: classes.dex */
public final class b extends f implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final a f30673o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f30674p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f30675q;

    /* renamed from: r, reason: collision with root package name */
    public final f6.a f30676r;

    /* renamed from: s, reason: collision with root package name */
    public d f30677s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30678t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30679u;

    /* renamed from: v, reason: collision with root package name */
    public long f30680v;

    /* renamed from: w, reason: collision with root package name */
    public q0 f30681w;

    /* renamed from: x, reason: collision with root package name */
    public long f30682x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [h5.f, f6.a] */
    public b(d0 d0Var, Looper looper) {
        super(5);
        Handler handler;
        e eVar = a.T;
        this.f30674p = d0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = x.f15050a;
            handler = new Handler(looper, this);
        }
        this.f30675q = handler;
        this.f30673o = eVar;
        this.f30676r = new h5.f(1);
        this.f30682x = -9223372036854775807L;
    }

    @Override // i5.f
    public final int B(v vVar) {
        int i10;
        if (((e) this.f30673o).O(vVar)) {
            if (vVar.G == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return f.e(i10, 0, 0);
        }
        return f.e(0, 0, 0);
    }

    public final void D(q0 q0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.f3577a;
            if (i10 < p0VarArr.length) {
                v g10 = p0VarArr[i10].g();
                if (g10 != null) {
                    e eVar = (e) this.f30673o;
                    if (eVar.O(g10)) {
                        d F = eVar.F(g10);
                        byte[] I = p0VarArr[i10].I();
                        I.getClass();
                        f6.a aVar = this.f30676r;
                        aVar.i();
                        aVar.k(I.length);
                        aVar.f18002d.put(I);
                        aVar.l();
                        q0 c02 = F.c0(aVar);
                        if (c02 != null) {
                            D(c02, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(p0VarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long E(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.H0(z10);
        if (this.f30682x != -9223372036854775807L) {
            z11 = true;
        }
        j.H0(z11);
        return j10 - this.f30682x;
    }

    public final void F(q0 q0Var) {
        d0 d0Var = this.f30674p;
        g0 g0Var = d0Var.f19384a;
        m0 a10 = g0Var.f19457f0.a();
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = q0Var.f3577a;
            if (i10 >= p0VarArr.length) {
                break;
            }
            p0VarArr[i10].H(a10);
            i10++;
        }
        g0Var.f19457f0 = new n0(a10);
        n0 l10 = g0Var.l();
        boolean equals = l10.equals(g0Var.N);
        k3.f fVar = g0Var.f19466l;
        if (!equals) {
            g0Var.N = l10;
            fVar.j(14, new t(d0Var, 6));
        }
        fVar.j(28, new t(q0Var, 7));
        fVar.g();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            F((q0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // i5.f
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // i5.f
    public final boolean m() {
        return this.f30679u;
    }

    @Override // i5.f
    public final boolean n() {
        return true;
    }

    @Override // i5.f
    public final void o() {
        this.f30681w = null;
        this.f30677s = null;
        this.f30682x = -9223372036854775807L;
    }

    @Override // i5.f
    public final void q(long j10, boolean z10) {
        this.f30681w = null;
        this.f30678t = false;
        this.f30679u = false;
    }

    @Override // i5.f
    public final void v(v[] vVarArr, long j10, long j11) {
        this.f30677s = ((e) this.f30673o).F(vVarArr[0]);
        q0 q0Var = this.f30681w;
        if (q0Var != null) {
            long j12 = this.f30682x;
            long j13 = q0Var.f3578b;
            long j14 = (j12 + j13) - j11;
            if (j13 != j14) {
                q0Var = new q0(j14, q0Var.f3577a);
            }
            this.f30681w = q0Var;
        }
        this.f30682x = j11;
    }

    @Override // i5.f
    public final void x(long j10, long j11) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f30678t && this.f30681w == null) {
                f6.a aVar = this.f30676r;
                aVar.i();
                tr.e eVar = this.f19410c;
                eVar.m();
                int w10 = w(eVar, aVar, 0);
                if (w10 == -4) {
                    if (aVar.g(4)) {
                        this.f30678t = true;
                    } else {
                        aVar.f15958j = this.f30680v;
                        aVar.l();
                        d dVar = this.f30677s;
                        int i10 = x.f15050a;
                        q0 c02 = dVar.c0(aVar);
                        if (c02 != null) {
                            ArrayList arrayList = new ArrayList(c02.f3577a.length);
                            D(c02, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f30681w = new q0(E(aVar.f18004f), (p0[]) arrayList.toArray(new p0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    v vVar = (v) eVar.f36362c;
                    vVar.getClass();
                    this.f30680v = vVar.f3656p;
                }
            }
            q0 q0Var = this.f30681w;
            if (q0Var != null && q0Var.f3578b <= E(j10)) {
                q0 q0Var2 = this.f30681w;
                Handler handler = this.f30675q;
                if (handler != null) {
                    handler.obtainMessage(0, q0Var2).sendToTarget();
                } else {
                    F(q0Var2);
                }
                this.f30681w = null;
                z10 = true;
            }
            if (this.f30678t && this.f30681w == null) {
                this.f30679u = true;
            }
        } while (z10);
    }
}
