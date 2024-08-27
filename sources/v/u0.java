package v;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f37621a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f37622b;

    /* renamed from: c, reason: collision with root package name */
    public final t f37623c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37624d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f37625e;

    public u0(j0 j0Var, r0 r0Var, t tVar, boolean z10, Map map) {
        this.f37621a = j0Var;
        this.f37622b = r0Var;
        this.f37623c = tVar;
        this.f37624d = z10;
        this.f37625e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.a(this.f37621a, u0Var.f37621a) && Intrinsics.a(this.f37622b, u0Var.f37622b) && Intrinsics.a(this.f37623c, u0Var.f37623c) && Intrinsics.a(null, null) && this.f37624d == u0Var.f37624d && Intrinsics.a(this.f37625e, u0Var.f37625e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        j0 j0Var = this.f37621a;
        if (j0Var == null) {
            hashCode = 0;
        } else {
            hashCode = j0Var.hashCode();
        }
        int i11 = hashCode * 31;
        r0 r0Var = this.f37622b;
        if (r0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        t tVar = this.f37623c;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return this.f37625e.hashCode() + e.d(this.f37624d, (i12 + i10) * 961, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f37621a + ", slide=" + this.f37622b + ", changeSize=" + this.f37623c + ", scale=null, hold=" + this.f37624d + ", effectsMap=" + this.f37625e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    public /* synthetic */ u0(j0 j0Var, r0 r0Var, t tVar, boolean z10, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : j0Var, (i10 & 2) != 0 ? null : r0Var, (i10 & 4) == 0 ? tVar : null, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? vt.p0.d() : linkedHashMap);
    }
}
