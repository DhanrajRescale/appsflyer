package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu.z f38590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f38591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f38592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f38593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f38594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(iu.z zVar, float f10, j jVar, o oVar, Function1 function1) {
        super(1);
        this.f38590a = zVar;
        this.f38591b = f10;
        this.f38592c = jVar;
        this.f38593d = oVar;
        this.f38594e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f38590a.f20560a;
        Intrinsics.c(obj2);
        e.p((m) obj2, longValue, this.f38591b, this.f38592c, this.f38593d, this.f38594e);
        return Unit.f23355a;
    }
}
