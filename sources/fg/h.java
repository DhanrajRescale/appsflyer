package fg;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f16075a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer obs = (Integer) obj;
        Intrinsics.checkNotNullParameter(obs, "obs");
        Intrinsics.checkNotNullParameter((Long) obj2, "<anonymous parameter 1>");
        return obs;
    }
}
