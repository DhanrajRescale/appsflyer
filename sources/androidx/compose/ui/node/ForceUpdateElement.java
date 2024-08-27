package androidx.compose.ui.node;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "Lc2/y0;", "Lg1/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class ForceUpdateElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final y0 f1399b;

    public ForceUpdateElement(y0 y0Var) {
        this.f1399b = y0Var;
    }

    @Override // c2.y0
    public final n d() {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && Intrinsics.a(this.f1399b, ((ForceUpdateElement) obj).f1399b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1399b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final String toString() {
        return "ForceUpdateElement(original=" + this.f1399b + ')';
    }
}
