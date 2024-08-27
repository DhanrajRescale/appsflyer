package yu;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f41820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f41821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f41819a = i10;
        this.f41820b = dVar;
        this.f41821c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar = this.f41821c;
        d dVar = this.f41820b;
        int i10 = this.f41819a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        dVar.a(cVar.f41823b);
                        break;
                    default:
                        d.f41825h.set(dVar, cVar.f41823b);
                        dVar.a(cVar.f41823b);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        dVar.a(cVar.f41823b);
                        break;
                    default:
                        d.f41825h.set(dVar, cVar.f41823b);
                        dVar.a(cVar.f41823b);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
