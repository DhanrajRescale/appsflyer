package q0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends z implements t {

    /* renamed from: u, reason: collision with root package name */
    public s f31466u;

    /* renamed from: v, reason: collision with root package name */
    public v f31467v;

    /* renamed from: w, reason: collision with root package name */
    public long f31468w;

    @Override // q0.t
    public final void G() {
        this.f31467v = null;
        c2.g.s(this);
    }

    @Override // g1.n
    public final void J0() {
        s sVar = this.f31466u;
        if (sVar != null) {
            G();
            u uVar = sVar.f31539d;
            v vVar = (v) uVar.f31541a.get(this);
            if (vVar != null) {
                vVar.c();
                HashMap hashMap = uVar.f31541a;
                v vVar2 = (v) hashMap.get(this);
                if (vVar2 != null) {
                }
                hashMap.remove(this);
                sVar.f31538c.add(vVar);
            }
        }
    }

    @Override // q0.z
    public final void Q0(a0.n nVar) {
        s sVar = this.f31466u;
        if (sVar == null) {
            sVar = d0.a(d0.b((View) c2.g.p(this, AndroidCompositionLocals_androidKt.f1433g)));
            this.f31466u = sVar;
            Intrinsics.c(sVar);
        }
        v a10 = sVar.a(this);
        a10.b(nVar, this.f31557o, this.f31468w, ku.c.b(this.f31562t), this.f31559q.a(), ((i) this.f31560r.mo2invoke()).f31503d, new x.a(this, 18));
        this.f31467v = a10;
        c2.g.s(this);
    }

    @Override // q0.z
    public final void R0(p1.h hVar) {
        this.f31468w = hVar.d();
        n1.r a10 = hVar.f0().a();
        v vVar = this.f31467v;
        if (vVar != null) {
            vVar.e(hVar.d(), this.f31559q.a(), ((i) this.f31560r.mo2invoke()).f31503d, ku.c.b(this.f31562t));
            vVar.draw(n1.d.a(a10));
        }
    }

    @Override // q0.z
    public final void S0(a0.n nVar) {
        v vVar = this.f31467v;
        if (vVar != null) {
            vVar.d();
        }
    }
}
