package androidx.compose.foundation.layout;

import b0.c2;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lc2/y0;", "Lb0/c2;", "b0/g0", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1277b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1278c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f1279d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1280e;

    public WrapContentElement(int i10, boolean z10, Function2 function2, Object obj) {
        this.f1277b = i10;
        this.f1278c = z10;
        this.f1279d = function2;
        this.f1280e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.c2, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2843n = this.f1277b;
        nVar.f2844o = this.f1278c;
        nVar.f2845p = this.f1279d;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.f1277b == wrapContentElement.f1277b && this.f1278c == wrapContentElement.f1278c && Intrinsics.a(this.f1280e, wrapContentElement.f1280e)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1280e.hashCode() + v.e.d(this.f1278c, k.e(this.f1277b) * 31, 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        c2 c2Var = (c2) nVar;
        c2Var.f2843n = this.f1277b;
        c2Var.f2844o = this.f1278c;
        c2Var.f2845p = this.f1279d;
    }
}
