package vh;

import iu.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38061a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        th.b card = (th.b) obj2;
        Intrinsics.checkNotNullParameter(card, "card");
        return card.f36080a;
    }
}
