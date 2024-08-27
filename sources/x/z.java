package x;

import android.content.Context;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import d2.d3;
import i0.w2;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y.l3;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        super(1);
        this.f39788a = i10;
        this.f39790c = obj;
        this.f39789b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, t0.n0] */
    public final t0.n0 a(t0.o0 o0Var) {
        int i10 = this.f39788a;
        Object obj = this.f39789b;
        Object obj2 = this.f39790c;
        switch (i10) {
            case 7:
                b0.y1 y1Var = (b0.y1) obj2;
                View view = (View) obj;
                if (y1Var.f3062t == 0) {
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    b0.r0 r0Var = y1Var.f3063u;
                    d4.b1.u(view, r0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(r0Var);
                    d4.n1.p(view, r0Var);
                }
                y1Var.f3062t++;
                return new w.s0(4, y1Var, view);
            case 8:
                d0.o0 o0Var2 = (d0.o0) obj2;
                o0Var2.f13197c.remove(obj);
                return new w.s0(5, o0Var2, obj);
            case 15:
                return new w.s0(6, (t0.g1) obj2, (a0.l) obj);
            case 19:
                o0.k kVar = (o0.k) obj2;
                kVar.f29359m = (z2.t) obj;
                kVar.i();
                return new Object();
            default:
                Context context = (Context) obj2;
                d2.x0 x0Var = (d2.x0) obj;
                context.getApplicationContext().registerComponentCallbacks(x0Var);
                return new w.s0(8, context, x0Var);
        }
    }

    public final void d(a2.z0 z0Var) {
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        int i14 = this.f39788a;
        int i15 = 0;
        Object obj2 = this.f39789b;
        Object obj3 = this.f39790c;
        switch (i14) {
            case 9:
                List list = (List) obj3;
                int size = list.size();
                int i16 = 0;
                while (i16 < size) {
                    e0.k kVar = (e0.k) list.get(i16);
                    if (kVar.f14754n != Integer.MIN_VALUE) {
                        List list2 = kVar.f14743c;
                        int size2 = list2.size();
                        int i17 = i15;
                        while (i17 < size2) {
                            a2.a1 a1Var = (a2.a1) list2.get(i17);
                            int i18 = i17 * 2;
                            int[] iArr = kVar.f14752l;
                            long j12 = hl.f.j(iArr[i18], iArr[i18 + 1]);
                            boolean z10 = kVar.f14749i;
                            boolean z11 = kVar.f14750j;
                            if (z10) {
                                if (z11) {
                                    int i19 = w2.h.f38792c;
                                    obj = obj2;
                                    i11 = (int) (j12 >> 32);
                                } else {
                                    obj = obj2;
                                    int i20 = w2.h.f38792c;
                                    int i21 = kVar.f14754n - ((int) (j12 >> 32));
                                    if (z11) {
                                        i10 = a1Var.f30b;
                                    } else {
                                        i10 = a1Var.f29a;
                                    }
                                    i11 = i21 - i10;
                                }
                                if (z11) {
                                    int i22 = kVar.f14754n - ((int) (j12 & 4294967295L));
                                    if (z11) {
                                        i13 = a1Var.f30b;
                                    } else {
                                        i13 = a1Var.f29a;
                                    }
                                    i12 = i22 - i13;
                                } else {
                                    i12 = (int) (j12 & 4294967295L);
                                }
                                j12 = hl.f.j(i11, i12);
                            } else {
                                obj = obj2;
                            }
                            int i23 = size;
                            long j13 = kVar.f14744d;
                            List list3 = list;
                            long j14 = hl.f.j(((int) (j12 >> 32)) + ((int) (j13 >> 32)), ((int) (j12 & 4294967295L)) + ((int) (j13 & 4294967295L)));
                            if (z11) {
                                a2.z0.m(z0Var, a1Var, j14, null, 6);
                            } else {
                                a2.z0.i(z0Var, a1Var, j14, null, 6);
                            }
                            i17++;
                            obj2 = obj;
                            list = list3;
                            size = i23;
                        }
                        i16++;
                        i15 = 0;
                    } else {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                }
                ((t0.g1) obj2).getValue();
                return;
            case 13:
                ArrayList n10 = i0.l1.n((List) obj3, ((i0.r1) obj2).f19180a);
                if (n10 != null) {
                    int size3 = n10.size();
                    while (i15 < size3) {
                        Pair pair = (Pair) n10.get(i15);
                        a2.a1 a1Var2 = (a2.a1) pair.f23353a;
                        Function0 function0 = (Function0) pair.f23354b;
                        if (function0 != null) {
                            j10 = ((w2.h) function0.mo2invoke()).f38793a;
                        } else {
                            j10 = w2.h.f38791b;
                        }
                        z0Var.getClass();
                        a2.z0.e(a1Var2, j10, s0.g.f34069a);
                        i15++;
                    }
                    return;
                }
                return;
            case 17:
                List list4 = (List) obj3;
                if (list4 != null) {
                    int size4 = list4.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        Pair pair2 = (Pair) list4.get(i24);
                        a2.a1 a1Var3 = (a2.a1) pair2.f23353a;
                        long j15 = ((w2.h) pair2.f23354b).f38793a;
                        z0Var.getClass();
                        a2.z0.e(a1Var3, j15, s0.g.f34069a);
                    }
                }
                List list5 = (List) obj2;
                if (list5 != null) {
                    int size5 = list5.size();
                    while (i15 < size5) {
                        Pair pair3 = (Pair) list5.get(i15);
                        a2.a1 a1Var4 = (a2.a1) pair3.f23353a;
                        Function0 function02 = (Function0) pair3.f23354b;
                        if (function02 != null) {
                            j11 = ((w2.h) function02.mo2invoke()).f38793a;
                        } else {
                            j11 = w2.h.f38791b;
                        }
                        z0Var.getClass();
                        a2.z0.e(a1Var4, j11, s0.g.f34069a);
                        i15++;
                    }
                    return;
                }
                return;
            case 24:
                float f10 = ((g1.t) obj2).f16427n;
                z0Var.getClass();
                a2.z0.c((a2.a1) obj3, 0, 0, f10);
                return;
            case 25:
                a2.z0.k(z0Var, (a2.a1) obj3, 0, 0, ((n1.o) obj2).f28159n, 4);
                return;
            default:
                a2.z0.k(z0Var, (a2.a1) obj3, 0, 0, ((n1.y0) obj2).D, 4);
                return;
        }
    }

    public final void e(p1.e eVar) {
        int i10 = this.f39788a;
        Object obj = this.f39789b;
        Object obj2 = this.f39790c;
        switch (i10) {
            case 0:
                c2.j0 j0Var = (c2.j0) eVar;
                j0Var.a();
                p1.h.o0(j0Var, ((n1.l0) obj2).f28152a, (n1.p) obj, s0.g.f34069a, null, 60);
                return;
            default:
                c2.j0 j0Var2 = (c2.j0) eVar;
                j0Var2.a();
                p1.h.o0(j0Var2, (n1.p0) obj2, (n1.p) obj, s0.g.f34069a, null, 60);
                return;
        }
    }

    public final Boolean f(KeyEvent keyEvent) {
        int i10 = this.f39788a;
        boolean z10 = true;
        Object obj = this.f39789b;
        Object obj2 = this.f39790c;
        switch (i10) {
            case 12:
                if (((i0.q1) obj2).a() == i0.a1.f18783b && keyEvent.getKeyCode() == 4 && yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 1)) {
                    ((l0.v0) obj).g(null);
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 2)) {
                    if (i0.l1.m(19, keyEvent)) {
                        z10 = ((androidx.compose.ui.focus.b) ((l1.f) obj2)).c(5);
                    } else if (i0.l1.m(20, keyEvent)) {
                        z10 = ((androidx.compose.ui.focus.b) ((l1.f) obj2)).c(6);
                    } else if (i0.l1.m(21, keyEvent)) {
                        z10 = ((androidx.compose.ui.focus.b) ((l1.f) obj2)).c(3);
                    } else if (i0.l1.m(22, keyEvent)) {
                        z10 = ((androidx.compose.ui.focus.b) ((l1.f) obj2)).c(4);
                    } else if (i0.l1.m(23, keyEvent)) {
                        d3 d3Var = ((i0.q1) obj).f19136c;
                        if (d3Var != null) {
                            ((d2.u1) d3Var).b();
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = false;
                return Boolean.valueOf(z10);
        }
    }

    public final void invoke(Throwable th2) {
        Throwable th3 = null;
        switch (this.f39788a) {
            case 3:
                ((y.l) this.f39790c).f40834a.m((y.p) this.f39789b);
                return;
            case 20:
                t0.i iVar = (t0.i) this.f39790c;
                Object obj = iVar.f35043b;
                iu.z zVar = (iu.z) this.f39789b;
                synchronized (obj) {
                    List list = iVar.f35045d;
                    Object obj2 = zVar.f20560a;
                    if (obj2 != null) {
                        list.remove((t0.h) obj2);
                        Unit unit = Unit.f23355a;
                    } else {
                        Intrinsics.k("awaiter");
                        throw null;
                    }
                }
                return;
            case 21:
                t0.x0 x0Var = (t0.x0) this.f39790c;
                Object obj3 = x0Var.f35238a;
                qu.h hVar = (qu.h) this.f39789b;
                synchronized (obj3) {
                    x0Var.f35239b.remove(hVar);
                    Unit unit2 = Unit.f23355a;
                }
                return;
            default:
                t0.f2 f2Var = (t0.f2) this.f39790c;
                Object obj4 = f2Var.f34999b;
                Throwable th4 = (Throwable) this.f39789b;
                synchronized (obj4) {
                    if (th4 != null) {
                        if (th2 != null) {
                            try {
                                if (!(!(th2 instanceof CancellationException))) {
                                    th2 = null;
                                }
                                if (th2 != null) {
                                    ut.c.a(th4, th2);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        th3 = th4;
                    }
                    f2Var.f35001d = th3;
                    f2Var.f35015r.m(t0.z1.f35278a);
                    Unit unit3 = Unit.f23355a;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39788a;
        Object obj2 = this.f39789b;
        Object obj3 = this.f39790c;
        switch (i10) {
            case 0:
                e((p1.e) obj);
                return Unit.f23355a;
            case 1:
                e((p1.e) obj);
                return Unit.f23355a;
            case 2:
            default:
                return a((t0.o0) obj);
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                y.n0 n0Var = (y.n0) obj3;
                long j10 = ((y.a0) obj).f40608i;
                y.g1 g1Var = ((y.v0) obj2).C;
                y.o0 o0Var = y.t0.f40956a;
                n0Var.b(g1Var == y.g1.f40723a ? m1.c.e(j10) : m1.c.d(j10));
                return Unit.f23355a;
            case 5:
                long j11 = ((m1.c) obj).f27237a;
                y.j2 j2Var = (y.j2) obj3;
                y.q1 q1Var = (y.q1) obj2;
                if (j2Var.f40799d) {
                    j11 = m1.c.i(j11, -1.0f);
                }
                long a10 = j2Var.a(q1Var, j11, 2);
                if (j2Var.f40799d) {
                    a10 = m1.c.i(a10, -1.0f);
                }
                return new m1.c(a10);
            case 6:
                ((Number) obj).longValue();
                l3 l3Var = (l3) obj3;
                float f10 = l3Var.f40852e;
                l3Var.f40852e = s0.g.f34069a;
                ((Function1) obj2).invoke(Float.valueOf(f10));
                return Unit.f23355a;
            case 7:
                return a((t0.o0) obj);
            case 8:
                return a((t0.o0) obj);
            case 9:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 10:
                int b10 = ku.c.b(((Number) obj).floatValue() / r3.f14768b.l());
                e0.j0 j0Var = ((e0.o0) obj3).f14768b;
                j0Var.f14733s.j(j0Var.h(j0Var.f14718d.f14650b.i() + b10));
                return Unit.f23355a;
            case 11:
                j2.e0 e0Var = (j2.e0) obj;
                w2 w2Var = (w2) obj3;
                if (w2Var != null) {
                    w2Var.f19245b.setValue(e0Var);
                }
                Function1 function1 = (Function1) obj2;
                if (function1 != null) {
                    function1.invoke(e0Var);
                }
                return Unit.f23355a;
            case 12:
                return f(((v1.b) obj).f37671a);
            case 13:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 14:
                return f(((v1.b) obj).f37671a);
            case 15:
                return a((t0.o0) obj);
            case 16:
                ((w2) obj3).getClass();
                return Unit.f23355a;
            case 17:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 18:
                x1.t tVar = (x1.t) obj;
                if (((l0.m) obj3).a(tVar.f39911c, (l0.t) obj2)) {
                    tVar.a();
                }
                return Unit.f23355a;
            case 19:
                return a((t0.o0) obj);
            case 20:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 21:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 22:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 23:
                ((t0.y) ((t0.e0) obj3)).z(obj);
                v0.c cVar = (v0.c) obj2;
                if (cVar != null) {
                    cVar.add(obj);
                }
                return Unit.f23355a;
            case 24:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 25:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 26:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 27:
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    x1.b0 b0Var = (x1.b0) obj3;
                    Function1 function12 = ((x1.c0) obj2).f39832b;
                    if (function12 != null) {
                        b0Var.f39828b = ((Boolean) function12.invoke(motionEvent)).booleanValue() ? 2 : 3;
                    } else {
                        Intrinsics.k("onTouchEvent");
                        throw null;
                    }
                } else {
                    Function1 function13 = ((x1.c0) obj2).f39832b;
                    if (function13 != null) {
                        function13.invoke(motionEvent);
                    } else {
                        Intrinsics.k("onTouchEvent");
                        throw null;
                    }
                }
                return Unit.f23355a;
        }
    }
}
