package ar;

import gr.o;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final o f2772a;

    public b(o oVar) {
        this.f2772a = oVar;
    }

    @Override // ar.e
    public final boolean a() {
        o oVar = this.f2772a;
        if (oVar.E() && (oVar.A() > 0 || oVar.z() > 0 || (oVar.D() && oVar.C().z()))) {
            return true;
        }
        return false;
    }
}
