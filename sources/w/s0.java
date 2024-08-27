package w;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s0 implements t0.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38676c;

    public /* synthetic */ s0(int i10, Object obj, Object obj2) {
        this.f38674a = i10;
        this.f38675b = obj;
        this.f38676c = obj2;
    }

    @Override // t0.n0
    public final void a() {
        q1 q1Var;
        int i10 = this.f38674a;
        Object obj = this.f38676c;
        Object obj2 = this.f38675b;
        switch (i10) {
            case 0:
                ((q0) obj2).f38643a.m((l0) obj);
                return;
            case 1:
                ((u1) obj2).f38695i.remove((u1) obj);
                return;
            case 2:
                u1 u1Var = (u1) obj2;
                u1Var.getClass();
                n1 n1Var = (n1) ((o1) obj).f38633b.getValue();
                if (n1Var != null && (q1Var = n1Var.f38617a) != null) {
                    u1Var.f38694h.remove(q1Var);
                    return;
                }
                return;
            case 3:
                ((u1) obj2).f38694h.remove((q1) obj);
                return;
            case 4:
                b0.y1 y1Var = (b0.y1) obj2;
                View view = (View) obj;
                int i11 = y1Var.f3062t - 1;
                y1Var.f3062t = i11;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    d4.b1.u(view, null);
                    d4.n1.p(view, null);
                    view.removeOnAttachStateChangeListener(y1Var.f3063u);
                    return;
                }
                return;
            case 5:
                ((d0.o0) obj2).f13197c.add(obj);
                return;
            case 6:
                t0.g1 g1Var = (t0.g1) obj2;
                a0.n nVar = (a0.n) g1Var.getValue();
                if (nVar != null) {
                    a0.m mVar = new a0.m(nVar);
                    a0.l lVar = (a0.l) obj;
                    if (lVar != null) {
                        lVar.b(mVar);
                    }
                    g1Var.setValue(null);
                    return;
                }
                return;
            case 7:
                ((LiveData) obj2).removeObserver((androidx.lifecycle.f0) obj);
                return;
            case 8:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((d2.x0) obj);
                return;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((d2.z0) obj);
                return;
        }
    }
}
