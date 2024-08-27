package nv;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* loaded from: classes2.dex */
public final class t extends u {

    /* renamed from: d, reason: collision with root package name */
    public final j f29260d;

    public t(u0 u0Var, Call.Factory factory, o oVar, j jVar) {
        super(u0Var, factory, oVar);
        this.f29260d = jVar;
    }

    @Override // nv.u
    public final Object b(c0 c0Var, Object[] objArr) {
        h hVar = (h) this.f29260d.a(c0Var);
        yt.a frame = (yt.a) objArr[objArr.length - 1];
        try {
            qu.i iVar = new qu.i(1, zt.f.b(frame));
            iVar.u(new w(hVar, 2));
            hVar.v(new x(iVar, 2));
            Object p10 = iVar.p();
            if (p10 == zt.a.f42823a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return p10;
        } catch (Exception e10) {
            return hl.f.e1(e10, frame);
        }
    }
}
