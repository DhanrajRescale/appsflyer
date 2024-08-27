package d2;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import ut.l;

/* loaded from: classes.dex */
public final class b4 implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f13372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.p1 f13373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.f2 f13374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu.z f13375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f13376e;

    public b4(vu.f fVar, t0.p1 p1Var, t0.f2 f2Var, iu.z zVar, View view) {
        this.f13372a = fVar;
        this.f13373b = p1Var;
        this.f13374c = f2Var;
        this.f13375d = zVar;
        this.f13376e = view;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        boolean z10;
        int i10 = x3.f13683a[mVar.ordinal()];
        qu.h hVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        this.f13374c.u();
                        return;
                    }
                    return;
                } else {
                    t0.f2 f2Var = this.f13374c;
                    synchronized (f2Var.f34999b) {
                        f2Var.f35014q = true;
                        Unit unit = Unit.f23355a;
                    }
                    return;
                }
            }
            t0.p1 p1Var = this.f13373b;
            if (p1Var != null) {
                t0.x0 x0Var = p1Var.f35126b;
                synchronized (x0Var.f35238a) {
                    try {
                        synchronized (x0Var.f35238a) {
                            z10 = x0Var.f35241d;
                        }
                        if (!z10) {
                            List list = x0Var.f35239b;
                            x0Var.f35239b = x0Var.f35240c;
                            x0Var.f35240c = list;
                            x0Var.f35241d = true;
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                yt.a aVar = (yt.a) list.get(i11);
                                l.Companion companion = ut.l.INSTANCE;
                                aVar.resumeWith(Unit.f23355a);
                            }
                            list.clear();
                            Unit unit2 = Unit.f23355a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            t0.f2 f2Var2 = this.f13374c;
            synchronized (f2Var2.f34999b) {
                if (f2Var2.f35014q) {
                    f2Var2.f35014q = false;
                    hVar = f2Var2.v();
                }
            }
            if (hVar != null) {
                l.Companion companion2 = ut.l.INSTANCE;
                hVar.resumeWith(Unit.f23355a);
                return;
            }
            return;
        }
        yk.g.H(this.f13372a, null, qu.g0.f32208d, new a4(this.f13375d, this.f13374c, tVar, this, this.f13376e, null), 1);
    }
}
