package e0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f14655b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f14656c = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f14657a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14657a) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new e(intValue, ((Float) obj3).floatValue(), new c(0, list));
            default:
                return Unit.f23355a;
        }
    }
}
