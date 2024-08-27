package y2;

import d2.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f41068b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f41069c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f41070d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f41071e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f41072a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41072a) {
            case 0:
                k kVar = (k) obj;
                kVar.getHandler().post(new y(kVar.f41105n, 2));
                return Unit.f23355a;
            case 1:
                return Unit.f23355a;
            case 2:
                return Unit.f23355a;
            default:
                return Unit.f23355a;
        }
    }
}
