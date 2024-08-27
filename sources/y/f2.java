package y;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f2 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f40697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f40698b;

    public f2(j2 j2Var, x.z zVar) {
        this.f40697a = j2Var;
        this.f40698b = zVar;
    }

    @Override // y.q1
    public final float a(float f10) {
        j2 j2Var = this.f40697a;
        long j10 = ((m1.c) this.f40698b.invoke(new m1.c(j2Var.d(f10)))).f27237a;
        if (j2Var.f40797b == g1.f40724b) {
            return m1.c.d(j10);
        }
        return m1.c.e(j10);
    }
}
