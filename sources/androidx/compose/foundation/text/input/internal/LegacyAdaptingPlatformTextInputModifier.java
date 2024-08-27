package androidx.compose.foundation.text.input.internal;

import c2.y0;
import g1.n;
import j0.c;
import j0.k;
import j0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lc2/y0;", "Lj0/k;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class LegacyAdaptingPlatformTextInputModifier extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final m f1321b;

    public LegacyAdaptingPlatformTextInputModifier(m mVar) {
        this.f1321b = mVar;
    }

    @Override // c2.y0
    public final n d() {
        return new k(this.f1321b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LegacyAdaptingPlatformTextInputModifier) && Intrinsics.a(this.f1321b, ((LegacyAdaptingPlatformTextInputModifier) obj).f1321b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1321b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        k kVar = (k) nVar;
        if (kVar.f16417m) {
            ((c) kVar.f20596n).e();
            kVar.f20596n.i(kVar);
        }
        m mVar = this.f1321b;
        kVar.f20596n = mVar;
        if (kVar.f16417m) {
            if (mVar.f20598a == null) {
                mVar.f20598a = kVar;
                return;
            }
            throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f1321b + ')';
    }
}
