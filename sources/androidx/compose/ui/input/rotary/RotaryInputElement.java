package androidx.compose.ui.input.rotary;

import c2.y0;
import d2.s;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z1.b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lc2/y0;", "Lz1/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1395b = s.f13606d;

    /* JADX WARN: Type inference failed for: r0v0, types: [z1.b, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f41899n = this.f1395b;
        nVar.f41900o = null;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return Intrinsics.a(this.f1395b, ((RotaryInputElement) obj).f1395b) && Intrinsics.a(null, null);
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        Function1 function1 = this.f1395b;
        return (function1 == null ? 0 : function1.hashCode()) * 31;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        b bVar = (b) nVar;
        bVar.f41899n = this.f1395b;
        bVar.f41900o = null;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f1395b + ", onPreRotaryScrollEvent=null)";
    }
}
