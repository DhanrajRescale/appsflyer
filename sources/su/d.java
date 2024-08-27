package su;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d extends iu.h implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f34794i = new d();

    public d() {
        super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        k kVar = (k) obj2;
        k kVar2 = e.f34795a;
        c cVar = kVar.f34818e;
        Intrinsics.c(cVar);
        return new k(longValue, kVar, cVar, 0);
    }
}
