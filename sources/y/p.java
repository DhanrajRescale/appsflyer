package y;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f40880a;

    /* renamed from: b, reason: collision with root package name */
    public final qu.h f40881b;

    public p(f0.i iVar, qu.i iVar2) {
        this.f40880a = iVar;
        this.f40881b = iVar2;
    }

    public final String toString() {
        qu.h hVar = this.f40881b;
        w.k.d(hVar.getContext().g(qu.e0.f32200b));
        StringBuilder sb2 = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        sb2.append("(currentBounds()=");
        sb2.append(this.f40880a.mo2invoke());
        sb2.append(", continuation=");
        sb2.append(hVar);
        sb2.append(')');
        return sb2.toString();
    }
}
