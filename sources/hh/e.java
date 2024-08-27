package hh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.x4;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f18465a = new iu.k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        x4 it = (x4) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it != x4.f27083c) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
