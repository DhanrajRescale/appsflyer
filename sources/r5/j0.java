package r5;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f33203b;

    public j0(m0 m0Var, int i10) {
        this.f33203b = m0Var;
        this.f33202a = i10;
    }

    @Override // r5.v0
    public final void c() {
        m0 m0Var = this.f33203b;
        u0 u0Var = m0Var.f33235s[this.f33202a];
        n5.i iVar = u0Var.f33308h;
        if (iVar != null && iVar.getState() == 1) {
            DrmSession$DrmSessionException f10 = u0Var.f33308h.f();
            f10.getClass();
            throw f10;
        }
        int H = m0Var.f33220d.H(m0Var.B);
        v5.o oVar = m0Var.f33227k;
        IOException iOException = oVar.f37757c;
        if (iOException == null) {
            v5.l lVar = oVar.f37756b;
            if (lVar != null) {
                if (H == Integer.MIN_VALUE) {
                    H = lVar.f37743a;
                }
                IOException iOException2 = lVar.f37747e;
                if (iOException2 != null && lVar.f37748f > H) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // r5.v0
    public final boolean d() {
        m0 m0Var = this.f33203b;
        if (!m0Var.z() && m0Var.f33235s[this.f33202a].q(m0Var.X)) {
            return true;
        }
        return false;
    }

    @Override // r5.v0
    public final int e(long j10) {
        m0 m0Var = this.f33203b;
        if (m0Var.z()) {
            return 0;
        }
        int i10 = this.f33202a;
        m0Var.t(i10);
        u0 u0Var = m0Var.f33235s[i10];
        int p10 = u0Var.p(j10, m0Var.X);
        u0Var.w(p10);
        if (p10 == 0) {
            m0Var.v(i10);
            return p10;
        }
        return p10;
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        m0 m0Var = this.f33203b;
        if (m0Var.z()) {
            return -3;
        }
        int i11 = this.f33202a;
        m0Var.t(i11);
        int t10 = m0Var.f33235s[i11].t(eVar, fVar, i10, m0Var.X);
        if (t10 == -3) {
            m0Var.v(i11);
        }
        return t10;
    }
}
