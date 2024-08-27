package i0;

import d2.d3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f19054a;

    /* renamed from: b, reason: collision with root package name */
    public o1 f19055b;

    /* renamed from: c, reason: collision with root package name */
    public l1.f f19056c;

    public m1(d3 d3Var) {
        this.f19054a = d3Var;
    }

    public final o1 a() {
        o1 o1Var = this.f19055b;
        if (o1Var != null) {
            return o1Var;
        }
        Intrinsics.k("keyboardActions");
        throw null;
    }
}
