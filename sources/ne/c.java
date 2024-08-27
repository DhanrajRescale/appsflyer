package ne;

import com.assetgro.stockgro.data.model.PrivacyLayerUserGroup;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioHistoryFnoDataItem;
import g1.l;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.m;
import t0.n;
import t0.r;
import yk.j;
import zq.f;

/* loaded from: classes.dex */
public final class c extends k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        super(4);
        this.f28629a = i10;
        this.f28630b = obj;
        this.f28631c = obj2;
    }

    public final void a(c0.c items, int i10, n nVar, int i11) {
        int i12;
        int i13;
        int i14 = this.f28629a;
        Object obj = this.f28631c;
        Object obj2 = this.f28630b;
        int i15 = 32;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 112) == 0) {
                    if (!((r) nVar).f(i10)) {
                        i15 = 16;
                    }
                    i11 |= i15;
                }
                if ((i11 & 721) == 144) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                PrivacyLayerUserGroup privacyLayerUserGroup = (PrivacyLayerUserGroup) ((h7.b) obj2).a(i10);
                if (privacyLayerUserGroup != null) {
                    boolean a10 = Intrinsics.a(privacyLayerUserGroup.getType(), "1on1");
                    Object obj3 = m.f35080a;
                    if (a10) {
                        r rVar2 = (r) nVar;
                        rVar2.b0(-1320568084);
                        a aVar = a.f28624a;
                        rVar2.b0(511598077);
                        hu.c cVar = (hu.c) obj;
                        boolean h10 = rVar2.h(cVar);
                        Object Q = rVar2.Q();
                        if (h10 || Q == obj3) {
                            Q = new b(cVar, 0);
                            rVar2.k0(Q);
                        }
                        rVar2.s(false);
                        j.R(privacyLayerUserGroup, aVar, (Function1) Q, rVar2, 56, 0);
                        rVar2.s(false);
                        return;
                    }
                    r rVar3 = (r) nVar;
                    rVar3.b0(-1319915565);
                    a aVar2 = a.f28625b;
                    rVar3.b0(511619062);
                    hu.c cVar2 = (hu.c) obj;
                    boolean h11 = rVar3.h(cVar2);
                    Object Q2 = rVar3.Q();
                    if (h11 || Q2 == obj3) {
                        Q2 = new b(cVar2, 1);
                        rVar3.k0(Q2);
                    }
                    rVar3.s(false);
                    j.R(privacyLayerUserGroup, aVar2, (Function1) Q2, rVar3, 56, 0);
                    rVar3.s(false);
                    return;
                }
                return;
            default:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 = i13 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((r) nVar).f(i10)) {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
                if ((i12 & 147) == 146) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                PortfolioHistoryFnoDataItem portfolioHistoryFnoDataItem = (PortfolioHistoryFnoDataItem) ((List) obj2).get(i10);
                r rVar5 = (r) nVar;
                rVar5.b0(-1330926488);
                f.f((PortfolioFnoHistoryViewModel) obj, portfolioHistoryFnoDataItem, rVar5, 8);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(l.f16404b, 16), rVar5);
                rVar5.s(false);
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f28629a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
