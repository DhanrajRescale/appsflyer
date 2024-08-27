package l1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends g1.n implements c {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f23881n;

    /* renamed from: o, reason: collision with root package name */
    public r f23882o;

    @Override // l1.c
    public final void i(s sVar) {
        if (!Intrinsics.a(this.f23882o, sVar)) {
            this.f23882o = sVar;
            this.f23881n.invoke(sVar);
        }
    }
}
