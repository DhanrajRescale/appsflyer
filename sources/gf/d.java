package gf;

import com.assetgro.stockgro.ui.home.HomeViewModel;
import hf.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(2);
        this.f17359a = i10;
        this.f17360b = eVar;
    }

    public final void a(n nVar, int i10) {
        int i11 = this.f17359a;
        e eVar = this.f17360b;
        int i12 = 11;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                zq.f.l((HomeViewModel) eVar.r(), new b(eVar, i12), nVar, 8);
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                z.d((HomeViewModel) eVar.r(), nVar, 8);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f17359a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
