package androidx.compose.animation;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v.q0;
import w.f0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lc2/y0;", "Lv/q0;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class SizeAnimationModifierElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1165b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f1166c;

    public SizeAnimationModifierElement(f0 f0Var, Function2 function2) {
        this.f1165b = f0Var;
        this.f1166c = function2;
    }

    @Override // c2.y0
    public final n d() {
        return new q0(this.f1165b, this.f1166c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.a(this.f1165b, sizeAnimationModifierElement.f1165b) && Intrinsics.a(this.f1166c, sizeAnimationModifierElement.f1166c);
    }

    @Override // c2.y0
    public final int hashCode() {
        int hashCode = this.f1165b.hashCode() * 31;
        Function2 function2 = this.f1166c;
        return hashCode + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // c2.y0
    public final void j(n nVar) {
        q0 q0Var = (q0) nVar;
        q0Var.f37598n = this.f1165b;
        q0Var.f37599o = this.f1166c;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f1165b + ", finishedListener=" + this.f1166c + ')';
    }
}
