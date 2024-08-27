package b0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* loaded from: classes.dex */
public final class q1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f2981a = new Object();

    @Override // b0.p1
    public final g1.o a(g1.o oVar, g1.f fVar) {
        return oVar.g(new VerticalAlignElement(fVar));
    }

    @Override // b0.p1
    public final g1.o b(g1.o oVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return oVar.g(new LayoutWeightElement(kotlin.ranges.d.c(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(jr.h.m("invalid weight ", f10, "; must be greater than zero").toString());
    }
}
