package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f35061b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f35062c = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10) {
        super(2);
        this.f35063a = i10;
    }

    public final void a(n nVar, int i10) {
        switch (this.f35063a) {
            case 0:
                if ((i10 & 3) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i10 & 3) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f35063a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
