package pd;

import a2.z0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.s f30917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f30918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(b3.s sVar, List list, int i10) {
        super(1);
        this.f30916a = i10;
        this.f30917b = sVar;
        this.f30918c = list;
    }

    public final void a(z0 z0Var) {
        int i10 = this.f30916a;
        List list = this.f30918c;
        b3.s sVar = this.f30917b;
        switch (i10) {
            case 0:
                sVar.e(z0Var, list);
                return;
            case 1:
                sVar.e(z0Var, list);
                return;
            default:
                sVar.e(z0Var, list);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30916a) {
            case 0:
                a((z0) obj);
                return Unit.f23355a;
            case 1:
                a((z0) obj);
                return Unit.f23355a;
            default:
                a((z0) obj);
                return Unit.f23355a;
        }
    }
}
