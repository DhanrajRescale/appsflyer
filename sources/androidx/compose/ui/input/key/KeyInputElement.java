package androidx.compose.ui.input.key;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v1.d;
import x.z;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lc2/y0;", "Lv1/d;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class KeyInputElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1386c;

    public KeyInputElement(Function1 function1, z zVar) {
        this.f1385b = function1;
        this.f1386c = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, v1.d] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f37672n = this.f1385b;
        nVar.f37673o = this.f1386c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return Intrinsics.a(this.f1385b, keyInputElement.f1385b) && Intrinsics.a(this.f1386c, keyInputElement.f1386c);
    }

    @Override // c2.y0
    public final int hashCode() {
        Function1 function1 = this.f1385b;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.f1386c;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        d dVar = (d) nVar;
        dVar.f37672n = this.f1385b;
        dVar.f37673o = this.f1386c;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f1385b + ", onPreKeyEvent=" + this.f1386c + ')';
    }
}
