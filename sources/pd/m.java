package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.s f30934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(b3.s sVar, int i10) {
        super(1);
        this.f30933a = i10;
        this.f30934b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b3.s sVar = this.f30934b;
        int i10 = this.f30933a;
        switch (i10) {
            case 0:
                h2.v vVar = (h2.v) obj;
                switch (i10) {
                    case 0:
                        ou.g gVar = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar, sVar);
                        break;
                    case 1:
                        ou.g gVar2 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar, sVar);
                        break;
                    default:
                        ou.g gVar3 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar, sVar);
                        break;
                }
                return Unit.f23355a;
            case 1:
                h2.v vVar2 = (h2.v) obj;
                switch (i10) {
                    case 0:
                        ou.g gVar4 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar2, sVar);
                        break;
                    case 1:
                        ou.g gVar5 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar2, sVar);
                        break;
                    default:
                        ou.g gVar6 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar2, sVar);
                        break;
                }
                return Unit.f23355a;
            default:
                h2.v vVar3 = (h2.v) obj;
                switch (i10) {
                    case 0:
                        ou.g gVar7 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar3, sVar);
                        break;
                    case 1:
                        ou.g gVar8 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar3, sVar);
                        break;
                    default:
                        ou.g gVar9 = b3.v.f3155a[0];
                        b3.v.f3156b.a(vVar3, sVar);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
