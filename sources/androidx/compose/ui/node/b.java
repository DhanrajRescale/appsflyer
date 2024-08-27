package androidx.compose.ui.node;

import c2.c1;
import g1.m;
import g1.n;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f1426a;

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, c2.c1] */
    static {
        ?? nVar = new n();
        nVar.f16408d = -1;
        f1426a = nVar;
    }

    public static final int a(m mVar, m mVar2) {
        if (Intrinsics.a(mVar, mVar2)) {
            return 2;
        }
        if (!t.w(mVar, mVar2) && (!(mVar instanceof ForceUpdateElement) || !t.w(((ForceUpdateElement) mVar).f1399b, mVar2))) {
            return 0;
        }
        return 1;
    }
}
