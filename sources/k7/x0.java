package k7;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x0 implements d4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f22614a;

    public /* synthetic */ x0(RecyclerView recyclerView) {
        this.f22614a = recyclerView;
    }

    public final void a(a aVar) {
        int i10 = aVar.f22265a;
        RecyclerView recyclerView = this.f22614a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        recyclerView.f2402n.b0(aVar.f22266b, aVar.f22268d);
                        return;
                    }
                    return;
                }
                recyclerView.f2402n.d0(aVar.f22266b, aVar.f22268d);
                return;
            }
            recyclerView.f2402n.c0(aVar.f22266b, aVar.f22268d);
            return;
        }
        recyclerView.f2402n.Z(aVar.f22266b, aVar.f22268d);
    }

    public final y1 b(int i10) {
        RecyclerView recyclerView = this.f22614a;
        int h10 = recyclerView.f2386f.h();
        int i11 = 0;
        y1 y1Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            y1 N = RecyclerView.N(recyclerView.f2386f.g(i11));
            if (N != null && !N.l() && N.f22631c == i10) {
                if (recyclerView.f2386f.k(N.f22629a)) {
                    y1Var = N;
                } else {
                    y1Var = N;
                    break;
                }
            }
            i11++;
        }
        if (y1Var == null) {
            return null;
        }
        if (recyclerView.f2386f.k(y1Var.f22629a)) {
            if (RecyclerView.V0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
        return y1Var;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f22614a;
        int h10 = recyclerView.f2386f.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f2386f.g(i15);
            y1 N = RecyclerView.N(g10);
            if (N != null && !N.s() && (i13 = N.f22631c) >= i10 && i13 < i14) {
                N.b(2);
                N.a(obj);
                ((j1) g10.getLayoutParams()).f22432c = true;
            }
        }
        u6.g gVar = recyclerView.f2382c;
        ArrayList arrayList = (ArrayList) gVar.f36880e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y1 y1Var = (y1) arrayList.get(size);
            if (y1Var != null && (i12 = y1Var.f22631c) >= i10 && i12 < i14) {
                y1Var.b(2);
                gVar.i(size);
            }
        }
        recyclerView.C0 = true;
    }

    @Override // d4.j
    public final boolean d(float f10) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f22614a;
        if (recyclerView.f2402n.e()) {
            i11 = (int) f10;
            i10 = 0;
        } else if (recyclerView.f2402n.d()) {
            i10 = (int) f10;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        recyclerView.q0();
        return recyclerView.J(i10, i11, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final void e(int i10, int i11) {
        RecyclerView recyclerView = this.f22614a;
        int h10 = recyclerView.f2386f.h();
        for (int i12 = 0; i12 < h10; i12++) {
            y1 N = RecyclerView.N(recyclerView.f2386f.g(i12));
            if (N != null && !N.s() && N.f22631c >= i10) {
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + N + " now at position " + (N.f22631c + i11));
                }
                N.p(i11, false);
                recyclerView.f2424y0.f22591f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2382c.f36880e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            y1 y1Var = (y1) arrayList.get(i13);
            if (y1Var != null && y1Var.f22631c >= i10) {
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + y1Var + " now at position " + (y1Var.f22631c + i11));
                }
                y1Var.p(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.B0 = true;
    }

    public final void f(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RecyclerView recyclerView = this.f22614a;
        int h10 = recyclerView.f2386f.h();
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        boolean z10 = false;
        for (int i20 = 0; i20 < h10; i20++) {
            y1 N = RecyclerView.N(recyclerView.f2386f.g(i20));
            if (N != null && (i19 = N.f22631c) >= i13 && i19 <= i12) {
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + N);
                }
                if (N.f22631c == i10) {
                    N.p(i11 - i10, false);
                } else {
                    N.p(i14, false);
                }
                recyclerView.f2424y0.f22591f = true;
            }
        }
        u6.g gVar = recyclerView.f2382c;
        gVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
            i17 = -1;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = 1;
        }
        ArrayList arrayList = (ArrayList) gVar.f36880e;
        int size = arrayList.size();
        int i21 = 0;
        while (i21 < size) {
            y1 y1Var = (y1) arrayList.get(i21);
            if (y1Var != null && (i18 = y1Var.f22631c) >= i16 && i18 <= i15) {
                if (i18 == i10) {
                    y1Var.p(i11 - i10, z10);
                } else {
                    y1Var.p(i17, z10);
                }
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + y1Var);
                }
            }
            i21++;
            z10 = false;
        }
        recyclerView.requestLayout();
        recyclerView.B0 = true;
    }

    @Override // d4.j
    public final float g() {
        float f10;
        RecyclerView recyclerView = this.f22614a;
        if (recyclerView.f2402n.e()) {
            f10 = recyclerView.f2414t0;
        } else if (recyclerView.f2402n.d()) {
            f10 = recyclerView.f2412s0;
        } else {
            return s0.g.f34069a;
        }
        return -f10;
    }

    @Override // d4.j
    public final void h() {
        this.f22614a.q0();
    }

    public final void i(y1 y1Var, v5.i iVar, v5.i iVar2) {
        RecyclerView recyclerView = this.f22614a;
        recyclerView.getClass();
        y1Var.r(false);
        q qVar = (q) recyclerView.f2389g0;
        if (iVar != null) {
            qVar.getClass();
            int i10 = iVar.f37737a;
            int i11 = iVar2.f37737a;
            if (i10 != i11 || iVar.f37738b != iVar2.f37738b) {
                if (!qVar.g(y1Var, i10, iVar.f37738b, i11, iVar2.f37738b)) {
                    return;
                }
                recyclerView.X();
            }
        }
        qVar.l(y1Var);
        y1Var.f22629a.setAlpha(s0.g.f34069a);
        qVar.f22544i.add(y1Var);
        recyclerView.X();
    }

    public final void j(y1 y1Var, v5.i iVar, v5.i iVar2) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f22614a;
        recyclerView.f2382c.n(y1Var);
        recyclerView.h(y1Var);
        y1Var.r(false);
        q qVar = (q) recyclerView.f2389g0;
        qVar.getClass();
        int i12 = iVar.f37737a;
        int i13 = iVar.f37738b;
        View view = y1Var.f22629a;
        if (iVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = iVar2.f37737a;
        }
        int i14 = i10;
        if (iVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = iVar2.f37738b;
        }
        int i15 = i11;
        if (!y1Var.l() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            if (!qVar.g(y1Var, i12, i13, i14, i15)) {
                return;
            }
        } else {
            qVar.l(y1Var);
            qVar.f22543h.add(y1Var);
        }
        recyclerView.X();
    }

    public final void k(int i10) {
        RecyclerView recyclerView = this.f22614a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
