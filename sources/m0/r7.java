package m0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f26746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f26747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(hu.c cVar, List list, int i10) {
        super(2);
        this.f26745a = i10;
        this.f26746b = cVar;
        this.f26747c = list;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26745a;
        List list = this.f26747c;
        hu.c cVar = this.f26746b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                cVar.b(list, nVar, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                cVar.b(list, nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26745a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
