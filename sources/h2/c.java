package h2;

import c2.z1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends g1.n implements z1 {

    /* renamed from: n, reason: collision with root package name */
    public boolean f17813n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17814o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f17815p;

    public c(boolean z10, boolean z11, Function1 function1) {
        this.f17813n = z10;
        this.f17814o = z11;
        this.f17815p = function1;
    }

    @Override // c2.z1
    public final boolean A0() {
        return this.f17813n;
    }

    @Override // c2.z1
    public final boolean E() {
        return this.f17814o;
    }

    @Override // c2.z1
    public final void n(j jVar) {
        this.f17815p.invoke(jVar);
    }
}
