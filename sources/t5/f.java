package t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b3.t;
import b5.r0;
import b5.v;
import e5.x;
import i5.c0;
import i5.d0;
import i5.g0;
import lp.j1;
import lp.o0;
import ni.j;

/* loaded from: classes.dex */
public final class f extends i5.f implements Handler.Callback {
    public s6.e A;
    public int B;
    public long C;
    public long D;
    public long E;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f35350o;

    /* renamed from: p, reason: collision with root package name */
    public final e f35351p;

    /* renamed from: q, reason: collision with root package name */
    public final d f35352q;

    /* renamed from: r, reason: collision with root package name */
    public final tr.e f35353r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35354s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35355t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35356u;

    /* renamed from: v, reason: collision with root package name */
    public int f35357v;

    /* renamed from: w, reason: collision with root package name */
    public v f35358w;

    /* renamed from: x, reason: collision with root package name */
    public s6.c f35359x;

    /* renamed from: y, reason: collision with root package name */
    public s6.d f35360y;

    /* renamed from: z, reason: collision with root package name */
    public s6.e f35361z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, Looper looper) {
        super(3);
        Handler handler;
        j jVar = d.f35349c0;
        this.f35351p = d0Var;
        Object obj = null;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = x.f15050a;
            handler = new Handler(looper, this);
        }
        this.f35350o = handler;
        this.f35352q = jVar;
        this.f35353r = new tr.e(10, obj);
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
    }

    @Override // i5.f
    public final int B(v vVar) {
        int i10;
        if (((j) this.f35352q).s(vVar)) {
            if (vVar.G == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return i5.f.e(i10, 0, 0);
        }
        if (r0.k(vVar.f3652l)) {
            return i5.f.e(1, 0, 0);
        }
        return i5.f.e(0, 0, 0);
    }

    public final long D() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        this.f35361z.getClass();
        if (this.B >= this.f35361z.d()) {
            return Long.MAX_VALUE;
        }
        return this.f35361z.b(this.B);
    }

    public final long E(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        if (this.D != -9223372036854775807L) {
            z11 = true;
        }
        yk.j.H0(z11);
        return j10 - this.D;
    }

    public final void F(d5.c cVar) {
        o0 o0Var = cVar.f13921a;
        e eVar = this.f35351p;
        ((d0) eVar).f19384a.f19466l.l(27, new c0(o0Var));
        g0 g0Var = ((d0) eVar).f19384a;
        g0Var.f19449b0 = cVar;
        g0Var.f19466l.l(27, new t(cVar, 8));
    }

    public final void G() {
        this.f35360y = null;
        this.B = -1;
        s6.e eVar = this.f35361z;
        if (eVar != null) {
            eVar.i();
            this.f35361z = null;
        }
        s6.e eVar2 = this.A;
        if (eVar2 != null) {
            eVar2.i();
            this.A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            F((d5.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // i5.f
    public final String k() {
        return "TextRenderer";
    }

    @Override // i5.f
    public final boolean m() {
        return this.f35355t;
    }

    @Override // i5.f
    public final boolean n() {
        return true;
    }

    @Override // i5.f
    public final void o() {
        this.f35358w = null;
        this.C = -9223372036854775807L;
        d5.c cVar = new d5.c(E(this.E), j1.f24998e);
        Handler handler = this.f35350o;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
        G();
        s6.c cVar2 = this.f35359x;
        cVar2.getClass();
        cVar2.release();
        this.f35359x = null;
        this.f35357v = 0;
    }

    @Override // i5.f
    public final void q(long j10, boolean z10) {
        this.E = j10;
        d5.c cVar = new d5.c(E(this.E), j1.f24998e);
        Handler handler = this.f35350o;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f35354s = false;
        this.f35355t = false;
        this.C = -9223372036854775807L;
        if (this.f35357v != 0) {
            G();
            s6.c cVar2 = this.f35359x;
            cVar2.getClass();
            cVar2.release();
            this.f35359x = null;
            this.f35357v = 0;
            this.f35356u = true;
            v vVar = this.f35358w;
            vVar.getClass();
            this.f35359x = ((j) this.f35352q).d(vVar);
            return;
        }
        G();
        s6.c cVar3 = this.f35359x;
        cVar3.getClass();
        cVar3.flush();
    }

    @Override // i5.f
    public final void v(v[] vVarArr, long j10, long j11) {
        this.D = j11;
        v vVar = vVarArr[0];
        this.f35358w = vVar;
        if (this.f35359x != null) {
            this.f35357v = 1;
            return;
        }
        this.f35356u = true;
        vVar.getClass();
        this.f35359x = ((j) this.f35352q).d(vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0110, code lost:
    
        if (r4 != false) goto L52;
     */
    @Override // i5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.x(long, long):void");
    }
}
