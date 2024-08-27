package androidx.compose.ui.layout;

import a2.v;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lc2/y0;", "La2/v;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class LayoutIdElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1397b;

    public LayoutIdElement(String str) {
        this.f1397b = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, a2.v] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f125n = this.f1397b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.a(this.f1397b, ((LayoutIdElement) obj).f1397b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1397b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((v) nVar).f125n = this.f1397b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f1397b + ')';
    }
}
