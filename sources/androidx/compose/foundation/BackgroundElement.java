package androidx.compose.foundation;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.p;
import n1.t;
import n1.x0;
import ut.t;
import x.w;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lc2/y0;", "Lx/w;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackgroundElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f1171b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1172c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1173d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f1174e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f1175f;

    public BackgroundElement(long j10, p pVar, float f10, x0 x0Var, int i10) {
        j10 = (i10 & 1) != 0 ? t.f28177i : j10;
        pVar = (i10 & 2) != 0 ? null : pVar;
        this.f1171b = j10;
        this.f1172c = pVar;
        this.f1173d = f10;
        this.f1174e = x0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.w, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f39753n = this.f1171b;
        nVar.f39754o = this.f1172c;
        nVar.f39755p = this.f1173d;
        nVar.f39756q = this.f1174e;
        return nVar;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !t.d(this.f1171b, backgroundElement.f1171b) || !Intrinsics.a(this.f1172c, backgroundElement.f1172c) || this.f1173d != backgroundElement.f1173d || !Intrinsics.a(this.f1174e, backgroundElement.f1174e)) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        int hashCode = Long.hashCode(this.f1171b) * 31;
        p pVar = this.f1172c;
        if (pVar != null) {
            i10 = pVar.hashCode();
        } else {
            i10 = 0;
        }
        return this.f1174e.hashCode() + v.e.a(this.f1173d, (hashCode + i10) * 31, 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        w wVar = (w) nVar;
        wVar.f39753n = this.f1171b;
        wVar.f39754o = this.f1172c;
        wVar.f39755p = this.f1173d;
        wVar.f39756q = this.f1174e;
    }
}
