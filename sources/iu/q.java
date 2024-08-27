package iu;

import t0.l3;

/* loaded from: classes2.dex */
public abstract class q extends u implements ou.e {
    @Override // iu.c
    public final ou.a a() {
        a0.f20536a.getClass();
        return this;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        c0.q qVar = (c0.q) this;
        int i10 = qVar.f7565h;
        Object obj = qVar.f20539b;
        switch (i10) {
            case 0:
                return ((l3) obj).getValue();
            case 1:
                return ((l3) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
