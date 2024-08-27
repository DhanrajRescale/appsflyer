package zb;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11, List list) {
        super(2);
        this.f42261a = i11;
        this.f42262b = list;
        this.f42263c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f42263c;
        List list = this.f42262b;
        int i11 = this.f42261a;
        switch (i11) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.j.k0(list, nVar, t0.t.H0(i10 | 1));
                        break;
                    default:
                        dp.b.d(list, nVar, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        yk.j.k0(list, nVar2, t0.t.H0(i10 | 1));
                        break;
                    default:
                        dp.b.d(list, nVar2, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}
