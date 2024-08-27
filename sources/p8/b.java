package p8;

import bv.s;
import java.io.IOException;
import nv.a0;

/* loaded from: classes.dex */
public final class b extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30725a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f30726b;

    public b(bv.l lVar) {
        super(lVar);
    }

    @Override // bv.s, bv.k0
    public final long read(bv.j jVar, long j10) {
        switch (this.f30725a) {
            case 0:
                try {
                    return super.read(jVar, j10);
                } catch (Exception e10) {
                    this.f30726b = e10;
                    throw e10;
                }
            default:
                try {
                    return super.read(jVar, j10);
                } catch (IOException e11) {
                    ((a0) this.f30726b).f29178c = e11;
                    throw e11;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a0 a0Var, bv.l lVar) {
        super(lVar);
        this.f30726b = a0Var;
    }
}
