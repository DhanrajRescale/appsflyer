package cv;

import bv.b0;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13089a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g entry = (g) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        b0 b0Var = f.f13090e;
        return Boolean.valueOf(gt.d.a(entry.f13094a));
    }
}
