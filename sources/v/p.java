package v;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f37585a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        z zVar = (z) obj2;
        if (((z) obj) == zVar && zVar == z.f37638c) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
