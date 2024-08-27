package j5;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.ExoPlaybackException;
import b5.a1;
import b5.g1;
import b5.h1;
import b5.i1;
import b5.k0;
import b5.m1;
import b5.n0;
import b5.o0;
import b5.o1;
import b5.p1;
import b5.q0;
import b5.s0;
import b5.u0;
import b5.w0;
import b5.x0;
import b5.z0;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i0.t2;
import i5.g0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class w implements a {

    /* renamed from: a, reason: collision with root package name */
    public final e5.b f21011a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f21012b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f21013c;

    /* renamed from: d, reason: collision with root package name */
    public final v f21014d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f21015e;

    /* renamed from: f, reason: collision with root package name */
    public k3.f f21016f;

    /* renamed from: g, reason: collision with root package name */
    public a1 f21017g;

    /* renamed from: h, reason: collision with root package name */
    public e5.t f21018h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21019i;

    public w(e5.b bVar) {
        bVar.getClass();
        this.f21011a = bVar;
        int i10 = e5.x.f15050a;
        Looper myLooper = Looper.myLooper();
        this.f21016f = new k3.f(myLooper == null ? Looper.getMainLooper() : myLooper, bVar, new s0(22));
        g1 g1Var = new g1();
        this.f21012b = g1Var;
        this.f21013c = new h1();
        this.f21014d = new v(g1Var);
        this.f21015e = new SparseArray();
    }

    @Override // b5.y0
    public final void A(boolean z10) {
        b U = U();
        V(U, 23, new p(3, U, z10));
    }

    @Override // b5.y0
    public final void B(List list) {
        b Q = Q();
        V(Q, 27, new androidx.fragment.app.g(7, Q, list));
    }

    @Override // b5.y0
    public final void C(q0 q0Var) {
        b Q = Q();
        V(Q, 28, new androidx.fragment.app.g(8, Q, q0Var));
    }

    @Override // b5.y0
    public final void D(int i10, boolean z10) {
        b Q = Q();
        V(Q, -1, new t(Q, z10, i10, 0));
    }

    @Override // b5.y0
    public final void E(b5.p pVar) {
        b Q = Q();
        V(Q, 29, new androidx.fragment.app.g(4, Q, pVar));
    }

    @Override // b5.y0
    public final void F() {
    }

    @Override // r5.b0
    public final void G(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        b T = T(i10, wVar);
        V(T, CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, new n(T, nVar, sVar, 1));
    }

    @Override // b5.y0
    public final void H(x0 x0Var) {
    }

    @Override // n5.m
    public final void I(int i10, r5.w wVar, Exception exc) {
        b T = T(i10, wVar);
        V(T, UserMetadata.MAX_ATTRIBUTE_SIZE, new q(T, exc, 0));
    }

    @Override // r5.b0
    public final void J(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        b T = T(i10, wVar);
        V(T, 1001, new n(T, nVar, sVar, 2));
    }

    @Override // b5.y0
    public final void K(int i10, int i11) {
        b U = U();
        V(U, 24, new t2(i10, i11, U));
    }

    @Override // r5.b0
    public final void L(int i10, r5.w wVar, r5.s sVar) {
        b T = T(i10, wVar);
        V(T, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new s(T, sVar, 0));
    }

    @Override // r5.b0
    public final void M(int i10, r5.w wVar, final r5.n nVar, final r5.s sVar, final IOException iOException, final boolean z10) {
        final b T = T(i10, wVar);
        V(T, 1003, new e5.j(T, nVar, sVar, iOException, z10) { // from class: j5.m

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r5.s f20994a;

            {
                this.f20994a = sVar;
            }

            @Override // e5.j
            public final void invoke(Object obj) {
                a0 a0Var = (a0) ((c) obj);
                a0Var.getClass();
                a0Var.f20958v = this.f20994a.f33292a;
            }
        });
    }

    @Override // b5.y0
    public final void N(n0 n0Var) {
        b Q = Q();
        V(Q, 14, new androidx.fragment.app.g(10, Q, n0Var));
    }

    @Override // b5.y0
    public final void O(m1 m1Var) {
        b Q = Q();
        V(Q, 19, new androidx.fragment.app.g(2, Q, m1Var));
    }

    @Override // b5.y0
    public final void P(boolean z10) {
        b Q = Q();
        V(Q, 7, new p(1, Q, z10));
    }

    public final b Q() {
        return S(this.f21014d.f21008d);
    }

    public final b R(i1 i1Var, int i10, r5.w wVar) {
        r5.w wVar2;
        boolean z10;
        if (i1Var.q()) {
            wVar2 = null;
        } else {
            wVar2 = wVar;
        }
        ((e5.r) this.f21011a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i1Var.equals(((g0) this.f21017g).w()) && i10 == ((g0) this.f21017g).s()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        if (wVar2 != null && wVar2.a()) {
            if (z10 && ((g0) this.f21017g).q() == wVar2.f3557b && ((g0) this.f21017g).r() == wVar2.f3558c) {
                j10 = ((g0) this.f21017g).u();
            }
        } else if (z10) {
            g0 g0Var = (g0) this.f21017g;
            g0Var.X();
            j10 = g0Var.p(g0Var.f19459g0);
        } else if (!i1Var.q()) {
            j10 = e5.x.P(i1Var.n(i10, this.f21013c, 0L).f3344m);
        }
        r5.w wVar3 = this.f21014d.f21008d;
        i1 w10 = ((g0) this.f21017g).w();
        int s7 = ((g0) this.f21017g).s();
        long u10 = ((g0) this.f21017g).u();
        g0 g0Var2 = (g0) this.f21017g;
        g0Var2.X();
        return new b(elapsedRealtime, i1Var, i10, wVar2, j10, w10, s7, wVar3, u10, e5.x.P(g0Var2.f19459g0.f19378q));
    }

    public final b S(r5.w wVar) {
        i1 i1Var;
        this.f21017g.getClass();
        if (wVar == null) {
            i1Var = null;
        } else {
            i1Var = (i1) this.f21014d.f21007c.get(wVar);
        }
        if (wVar != null && i1Var != null) {
            return R(i1Var, i1Var.h(wVar.f3556a, this.f21012b).f3318c, wVar);
        }
        int s7 = ((g0) this.f21017g).s();
        i1 w10 = ((g0) this.f21017g).w();
        if (s7 >= w10.p()) {
            w10 = i1.f3357a;
        }
        return R(w10, s7, null);
    }

    public final b T(int i10, r5.w wVar) {
        this.f21017g.getClass();
        if (wVar != null) {
            if (((i1) this.f21014d.f21007c.get(wVar)) != null) {
                return S(wVar);
            }
            return R(i1.f3357a, i10, wVar);
        }
        i1 w10 = ((g0) this.f21017g).w();
        if (i10 >= w10.p()) {
            w10 = i1.f3357a;
        }
        return R(w10, i10, null);
    }

    public final b U() {
        return S(this.f21014d.f21010f);
    }

    public final void V(b bVar, int i10, e5.j jVar) {
        this.f21015e.put(i10, bVar);
        this.f21016f.l(i10, jVar);
    }

    public final void W(a1 a1Var, Looper looper) {
        boolean z10;
        if (this.f21017g != null && !this.f21014d.f21006b.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.H0(z10);
        a1Var.getClass();
        this.f21017g = a1Var;
        this.f21018h = ((e5.r) this.f21011a).a(looper, null);
        k3.f fVar = this.f21016f;
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(6, this, a1Var);
        this.f21016f = new k3.f((CopyOnWriteArraySet) fVar.f21995f, looper, (e5.b) fVar.f21992c, gVar, fVar.f21991b);
    }

    @Override // b5.y0
    public final void a(int i10) {
        b Q = Q();
        V(Q, 6, new o(Q, i10, 0));
    }

    @Override // b5.y0
    public final void b(w0 w0Var) {
        b Q = Q();
        V(Q, 13, new androidx.fragment.app.g(3, Q, w0Var));
    }

    @Override // b5.y0
    public final void c(boolean z10) {
        b Q = Q();
        V(Q, 3, new p(0, Q, z10));
    }

    @Override // n5.m
    public final void d(int i10, r5.w wVar) {
        b T = T(i10, wVar);
        V(T, 1027, new e(T, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [b5.o0, r5.w] */
    @Override // b5.y0
    public final void e(ExoPlaybackException exoPlaybackException) {
        b Q;
        o0 o0Var;
        if ((exoPlaybackException instanceof ExoPlaybackException) && (o0Var = exoPlaybackException.f2071m) != null) {
            Q = S(new o0(o0Var));
        } else {
            Q = Q();
        }
        V(Q, 10, new i(Q, exoPlaybackException, 1));
    }

    @Override // b5.y0
    public final void f(k0 k0Var, int i10) {
        b Q = Q();
        V(Q, 1, new i5.u(Q, k0Var, i10));
    }

    @Override // n5.m
    public final void g(int i10, r5.w wVar) {
        b T = T(i10, wVar);
        V(T, 1023, new e(T, 3));
    }

    @Override // b5.y0
    public final void h(int i10, boolean z10) {
        b Q = Q();
        V(Q, 5, new t(Q, z10, i10, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e5.j, java.lang.Object] */
    @Override // b5.y0
    public final void i(float f10) {
        V(U(), 22, new Object());
    }

    @Override // n5.m
    public final void j(int i10, r5.w wVar, int i11) {
        b T = T(i10, wVar);
        V(T, 1022, new o(T, i11, 1));
    }

    @Override // n5.m
    public final void k(int i10, r5.w wVar) {
        b T = T(i10, wVar);
        V(T, 1026, new e(T, 5));
    }

    @Override // b5.y0
    public final void l(int i10) {
        b Q = Q();
        V(Q, 4, new o(Q, i10, 4));
    }

    @Override // b5.y0
    public final void m(boolean z10) {
        b Q = Q();
        V(Q, 9, new p(2, Q, z10));
    }

    @Override // b5.y0
    public final void n(u0 u0Var) {
        b Q = Q();
        V(Q, 12, new androidx.fragment.app.g(1, Q, u0Var));
    }

    @Override // r5.b0
    public final void o(int i10, r5.w wVar, r5.s sVar) {
        b T = T(i10, wVar);
        V(T, 1004, new s(T, sVar, 1));
    }

    @Override // b5.y0
    public final void p(final int i10, final z0 z0Var, final z0 z0Var2) {
        if (i10 == 1) {
            this.f21019i = false;
        }
        a1 a1Var = this.f21017g;
        a1Var.getClass();
        v vVar = this.f21014d;
        vVar.f21008d = v.b(a1Var, vVar.f21006b, vVar.f21009e, vVar.f21005a);
        final b Q = Q();
        V(Q, 11, new e5.j(i10, z0Var, z0Var2, Q) { // from class: j5.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f20978a;

            @Override // e5.j
            public final void invoke(Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                a0 a0Var = (a0) cVar;
                int i11 = this.f20978a;
                if (i11 == 1) {
                    a0Var.f20957u = true;
                }
                a0Var.f20947k = i11;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [b5.o0, r5.w] */
    @Override // b5.y0
    public final void q(ExoPlaybackException exoPlaybackException) {
        b Q;
        o0 o0Var;
        if ((exoPlaybackException instanceof ExoPlaybackException) && (o0Var = exoPlaybackException.f2071m) != null) {
            Q = S(new o0(o0Var));
        } else {
            Q = Q();
        }
        V(Q, 10, new i(Q, exoPlaybackException, 0));
    }

    @Override // b5.y0
    public final void r(o1 o1Var) {
        b Q = Q();
        V(Q, 2, new androidx.fragment.app.g(5, Q, o1Var));
    }

    @Override // n5.m
    public final void s(int i10, r5.w wVar) {
        b T = T(i10, wVar);
        V(T, 1025, new e(T, 2));
    }

    @Override // b5.y0
    public final void t(int i10) {
        a1 a1Var = this.f21017g;
        a1Var.getClass();
        v vVar = this.f21014d;
        vVar.f21008d = v.b(a1Var, vVar.f21006b, vVar.f21009e, vVar.f21005a);
        vVar.d(((g0) a1Var).w());
        b Q = Q();
        V(Q, 0, new o(Q, i10, 3));
    }

    @Override // b5.y0
    public final void u() {
    }

    @Override // r5.b0
    public final void v(int i10, r5.w wVar, r5.n nVar, r5.s sVar) {
        b T = T(i10, wVar);
        V(T, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, new n(T, nVar, sVar, 0));
    }

    @Override // b5.y0
    public final void w(int i10) {
        b Q = Q();
        V(Q, 8, new o(Q, i10, 2));
    }

    @Override // b5.y0
    public final void x(d5.c cVar) {
        b Q = Q();
        V(Q, 27, new androidx.fragment.app.g(9, Q, cVar));
    }

    @Override // b5.y0
    public final void y() {
    }

    @Override // b5.y0
    public final void z(p1 p1Var) {
        b U = U();
        V(U, 25, new androidx.fragment.app.g(11, U, p1Var));
    }
}
