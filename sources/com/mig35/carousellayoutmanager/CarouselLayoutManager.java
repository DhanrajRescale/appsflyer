package com.mig35.carousellayoutmanager;

import a8.o;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d4.b1;
import d4.n1;
import d4.w0;
import e.j;
import es.a;
import es.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jr.h;
import k7.i1;
import k7.j1;
import k7.t1;
import k7.u0;
import k7.u1;
import k7.y1;
import mt.p;
import s0.g;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends i1 implements t1 {
    public a A;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12100p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f12101q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f12102r;

    /* renamed from: w, reason: collision with root package name */
    public p f12107w;

    /* renamed from: z, reason: collision with root package name */
    public int f12110z;

    /* renamed from: v, reason: collision with root package name */
    public final j f12106v = new j(3, 11);

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f12108x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public int f12109y = -1;

    /* renamed from: s, reason: collision with root package name */
    public final int f12103s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f12104t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f12105u = -1;

    public static float N0(int i10, float f10) {
        while (g.f34069a > f10) {
            f10 += i10;
        }
        while (Math.round(f10) >= i10) {
            f10 -= i10;
        }
        return f10;
    }

    @Override // k7.i1
    public final void D0(RecyclerView recyclerView, int i10) {
        u0 u0Var = new u0(this, recyclerView.getContext(), 3);
        u0Var.f22522a = i10;
        E0(u0Var);
    }

    public final int G0(int i10, u1 u1Var) {
        Integer num;
        if (i10 == -1) {
            return 0;
        }
        if (i10 >= u1Var.b()) {
            i10 = u1Var.b() - 1;
        }
        if (1 == this.f12103s) {
            num = this.f12102r;
        } else {
            num = this.f12101q;
        }
        return num.intValue() * i10;
    }

    public final void H0(int i10, int i11, int i12, int i13, b bVar, u6.g gVar, int i14) {
        p0.a aVar;
        float f10;
        View e10 = gVar.e(bVar.f15862a);
        b(e10, -1, false);
        P(e10);
        WeakHashMap weakHashMap = n1.f13788a;
        b1.s(e10, i14);
        if (this.f12107w != null) {
            float f11 = bVar.f15863b;
            float abs = 1.0f - (Math.abs(f11) * 0.4f);
            int i15 = this.f12103s;
            float f12 = g.f34069a;
            if (1 == i15) {
                f10 = Math.signum(f11) * (((1.0f - abs) * e10.getMeasuredHeight()) / 2.0f);
            } else {
                f12 = Math.signum(f11) * (((1.0f - abs) * e10.getMeasuredWidth()) / 2.0f);
                f10 = 0.0f;
            }
            aVar = new p0.a(abs, abs, f12, f10);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            e10.layout(i10, i11, i12, i13);
            return;
        }
        float f13 = aVar.f30434c;
        int round = Math.round(i10 + f13);
        float f14 = aVar.f30435d;
        e10.layout(round, Math.round(i11 + f14), Math.round(i12 + f13), Math.round(i13 + f14));
        e10.setScaleX(aVar.f30432a);
        e10.setScaleY(aVar.f30433b);
    }

    public final void I0(u6.g gVar, u1 u1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float K0 = K0();
        int b10 = u1Var.b();
        this.f12110z = b10;
        float N0 = N0(b10, K0);
        int round = Math.round(N0);
        boolean z10 = this.f12104t;
        j jVar = this.f12106v;
        if (z10 && 1 < (i14 = this.f12110z)) {
            int min = Math.min((jVar.f14632a * 2) + 1, i14);
            jVar.f(min);
            int i15 = min / 2;
            for (int i16 = 1; i16 <= i15; i16++) {
                float f10 = i16;
                jVar.k(i15 - i16, (round - N0) - f10, Math.round((N0 - f10) + this.f12110z) % this.f12110z);
            }
            int i17 = min - 1;
            for (int i18 = i17; i18 >= i15 + 1; i18--) {
                float f11 = i18;
                float f12 = min;
                jVar.k(i18 - 1, ((round - N0) + f12) - f11, Math.round((N0 - f11) + f12) % this.f12110z);
            }
            jVar.k(i17, round - N0, round);
        } else {
            int max = Math.max(round - jVar.f14632a, 0);
            int min2 = Math.min(jVar.f14632a + round, this.f12110z - 1);
            int i19 = min2 - max;
            int i20 = i19 + 1;
            jVar.f(i20);
            for (int i21 = max; i21 <= min2; i21++) {
                if (i21 == round) {
                    jVar.k(i19, i21 - N0, i21);
                } else if (i21 < round) {
                    jVar.k(i21 - max, i21 - N0, i21);
                } else {
                    jVar.k((i20 - (i21 - round)) - 1, i21 - N0, i21);
                }
            }
        }
        p(gVar);
        Iterator it = new ArrayList((List) gVar.f36881f).iterator();
        while (it.hasNext()) {
            y1 y1Var = (y1) it.next();
            int d10 = y1Var.d();
            b[] bVarArr = (b[]) jVar.f14634c;
            int length = bVarArr.length;
            int i22 = 0;
            while (true) {
                if (i22 < length) {
                    if (bVarArr[i22].f15862a == d10) {
                        break;
                    } else {
                        i22++;
                    }
                } else {
                    gVar.j(y1Var.f22629a);
                    break;
                }
            }
        }
        int i23 = this.f22417n;
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            i10 = w0.f(recyclerView);
        } else {
            i10 = 0;
        }
        int i24 = i23 - i10;
        RecyclerView recyclerView2 = this.f22405b;
        if (recyclerView2 != null) {
            WeakHashMap weakHashMap2 = n1.f13788a;
            i11 = w0.e(recyclerView2);
        } else {
            i11 = 0;
        }
        int i25 = i24 - i11;
        int i26 = this.f22418o;
        RecyclerView recyclerView3 = this.f22405b;
        if (recyclerView3 != null) {
            WeakHashMap weakHashMap3 = n1.f13788a;
            i12 = w0.e(recyclerView3);
        } else {
            i12 = 0;
        }
        int i27 = i26 - i12;
        RecyclerView recyclerView4 = this.f22405b;
        if (recyclerView4 != null) {
            WeakHashMap weakHashMap4 = n1.f13788a;
            i13 = w0.f(recyclerView4);
        } else {
            i13 = 0;
        }
        int i28 = i27 - i13;
        if (1 == this.f12103s) {
            int intValue = (i25 - this.f12101q.intValue()) / 2;
            int intValue2 = this.f12101q.intValue() + intValue;
            int intValue3 = (i28 - this.f12102r.intValue()) / 2;
            int length2 = ((b[]) jVar.f14634c).length;
            for (int i29 = 0; i29 < length2; i29++) {
                b bVar = ((b[]) jVar.f14634c)[i29];
                int J0 = J0(bVar.f15863b) + intValue3;
                H0(intValue, J0, intValue2, this.f12102r.intValue() + J0, bVar, gVar, i29);
            }
        } else {
            int intValue4 = (i28 - this.f12102r.intValue()) / 2;
            int intValue5 = this.f12102r.intValue() + intValue4;
            int intValue6 = (i25 - this.f12101q.intValue()) / 2;
            int length3 = ((b[]) jVar.f14634c).length;
            for (int i30 = 0; i30 < length3; i30++) {
                b bVar2 = ((b[]) jVar.f14634c)[i30];
                int J02 = J0(bVar2.f15863b) + intValue6;
                H0(J02, intValue4, this.f12101q.intValue() + J02, intValue5, bVar2, gVar, i30);
            }
        }
        gVar.b();
        int round2 = Math.round(N0(u1Var.b(), K0));
        if (this.f12109y != round2) {
            this.f12109y = round2;
            new Handler(Looper.getMainLooper()).post(new o(round2, 5, this));
        }
    }

    public final int J0(float f10) {
        double pow;
        int i10;
        int intValue;
        int i11;
        double abs = Math.abs(f10);
        j jVar = this.f12106v;
        if (abs > StrictMath.pow(1.0f / jVar.f14632a, 0.3333333432674408d)) {
            pow = StrictMath.pow(r0 / jVar.f14632a, 0.5d);
        } else {
            pow = StrictMath.pow(abs, 2.0d);
        }
        int i12 = 0;
        if (1 == this.f12103s) {
            int i13 = this.f22418o;
            RecyclerView recyclerView = this.f22405b;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = n1.f13788a;
                i11 = w0.e(recyclerView);
            } else {
                i11 = 0;
            }
            int i14 = i13 - i11;
            RecyclerView recyclerView2 = this.f22405b;
            if (recyclerView2 != null) {
                WeakHashMap weakHashMap2 = n1.f13788a;
                i12 = w0.f(recyclerView2);
            }
            intValue = ((i14 - i12) - this.f12102r.intValue()) / 2;
        } else {
            int i15 = this.f22417n;
            RecyclerView recyclerView3 = this.f22405b;
            if (recyclerView3 != null) {
                WeakHashMap weakHashMap3 = n1.f13788a;
                i10 = w0.f(recyclerView3);
            } else {
                i10 = 0;
            }
            int i16 = i15 - i10;
            RecyclerView recyclerView4 = this.f22405b;
            if (recyclerView4 != null) {
                WeakHashMap weakHashMap4 = n1.f13788a;
                i12 = w0.e(recyclerView4);
            }
            intValue = ((i16 - i12) - this.f12101q.intValue()) / 2;
        }
        return (int) Math.round(Math.signum(f10) * intValue * pow);
    }

    public final float K0() {
        if ((this.f12110z - 1) * M0() == 0) {
            return g.f34069a;
        }
        return (this.f12106v.f14633b * 1.0f) / M0();
    }

    public final float L0(int i10) {
        float N0 = N0(this.f12110z, K0());
        if (this.f12104t) {
            float f10 = N0 - i10;
            float abs = Math.abs(f10) - this.f12110z;
            if (Math.abs(f10) > Math.abs(abs)) {
                return Math.signum(f10) * abs;
            }
            return f10;
        }
        return N0 - i10;
    }

    public final int M0() {
        if (1 == this.f12103s) {
            return this.f12102r.intValue();
        }
        return this.f12101q.intValue();
    }

    public final int O0(int i10, u6.g gVar, u1 u1Var) {
        int i11;
        if (this.f12101q == null || this.f12102r == null || v() == 0 || i10 == 0) {
            return 0;
        }
        boolean z10 = this.f12104t;
        j jVar = this.f12106v;
        if (z10) {
            jVar.f14633b += i10;
            int M0 = M0() * this.f12110z;
            while (true) {
                int i12 = jVar.f14633b;
                if (i12 >= 0) {
                    break;
                }
                jVar.f14633b = i12 + M0;
            }
            while (true) {
                i11 = jVar.f14633b;
                if (i11 <= M0) {
                    break;
                }
                jVar.f14633b = i11 - M0;
            }
            jVar.f14633b = i11 - i10;
        } else {
            int M02 = (this.f12110z - 1) * M0();
            int i13 = jVar.f14633b;
            int i14 = i13 + i10;
            if (i14 < 0) {
                i10 = -i13;
            } else if (i14 > M02) {
                i10 = M02 - i13;
            }
        }
        if (i10 != 0) {
            jVar.f14633b += i10;
            I0(gVar, u1Var);
        }
        return i10;
    }

    @Override // k7.i1
    public final void S() {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            this.f22404a.l(v10);
        }
    }

    @Override // k7.t1
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (int) (-Math.signum(L0(i10)));
        if (this.f12103s == 0) {
            return new PointF(i11, g.f34069a);
        }
        return new PointF(g.f34069a, i11);
    }

    @Override // k7.i1
    public final boolean d() {
        if (v() != 0 && this.f12103s == 0) {
            return true;
        }
        return false;
    }

    @Override // k7.i1
    public final boolean e() {
        if (v() != 0 && 1 == this.f12103s) {
            return true;
        }
        return false;
    }

    @Override // k7.i1
    public final void e0(u6.g gVar, u1 u1Var) {
        View view;
        boolean z10;
        int max;
        int i10;
        int max2;
        if (u1Var.b() == 0) {
            m0(gVar);
            Iterator it = this.f12108x.iterator();
            if (!it.hasNext()) {
                return;
            }
            a3.a.u(it.next());
            throw null;
        }
        p(gVar);
        if (this.f12101q == null || this.f12100p) {
            List list = (List) gVar.f36881f;
            if (list.isEmpty()) {
                int b10 = u1Var.b();
                int i11 = this.f12105u;
                if (i11 == -1) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(b10 - 1, i11));
                }
                view = gVar.e(max);
                b(view, -1, false);
                z10 = true;
            } else {
                view = ((y1) list.get(0)).f22629a;
                z10 = false;
            }
            P(view);
            int A = i1.A(view);
            int z11 = i1.z(view);
            if (z10) {
                r0(gVar, this.f22404a.j(view), view);
            }
            Integer num = this.f12101q;
            if (num != null && ((num.intValue() != A || this.f12102r.intValue() != z11) && -1 == this.f12105u && this.A == null)) {
                this.f12105u = this.f12109y;
            }
            this.f12101q = Integer.valueOf(A);
            this.f12102r = Integer.valueOf(z11);
            this.f12100p = false;
        }
        if (-1 != this.f12105u) {
            int b11 = u1Var.b();
            if (b11 == 0) {
                max2 = -1;
            } else {
                max2 = Math.max(0, Math.min(b11 - 1, this.f12105u));
            }
            this.f12105u = max2;
        }
        int i12 = this.f12105u;
        j jVar = this.f12106v;
        if (-1 != i12) {
            jVar.f14633b = G0(i12, u1Var);
            this.f12105u = -1;
            this.A = null;
        } else {
            a aVar = this.A;
            if (aVar != null) {
                jVar.f14633b = G0(aVar.f15861b, u1Var);
                this.A = null;
            } else if (u1Var.f22591f && -1 != (i10 = this.f12109y)) {
                jVar.f14633b = G0(i10, u1Var);
            }
        }
        I0(gVar, u1Var);
    }

    @Override // k7.i1
    public final void g0(u6.g gVar, u1 u1Var, int i10, int i11) {
        this.f12100p = true;
        super.g0(gVar, u1Var, i10, i11);
    }

    @Override // k7.i1
    public final void h0(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.A = aVar;
            Parcelable parcelable2 = aVar.f15860a;
        }
    }

    @Override // k7.i1
    public final Parcelable i0() {
        a aVar = this.A;
        if (aVar != null) {
            return new a(aVar);
        }
        a aVar2 = new a();
        aVar2.f15861b = this.f12109y;
        return aVar2;
    }

    @Override // k7.i1
    public final j1 r() {
        return new j1(-2, -2);
    }

    @Override // k7.i1
    public final int s0(int i10, u6.g gVar, u1 u1Var) {
        if (1 == this.f12103s) {
            return 0;
        }
        return O0(i10, gVar, u1Var);
    }

    @Override // k7.i1
    public final void t0(int i10) {
        if (i10 >= 0) {
            this.f12105u = i10;
            q0();
            return;
        }
        throw new IllegalArgumentException(h.n("position can't be less then 0. position is : ", i10));
    }

    @Override // k7.i1
    public final int u0(int i10, u6.g gVar, u1 u1Var) {
        if (this.f12103s == 0) {
            return 0;
        }
        return O0(i10, gVar, u1Var);
    }
}
