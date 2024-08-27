package vc;

import androidx.lifecycle.o;
import ba.qg;
import ba.wr;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;
import iu.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f37936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f37935a = i10;
        this.f37936b = dVar;
    }

    public final void a(Boolean bool) {
        int i10;
        int i11 = this.f37935a;
        d dVar = this.f37936b;
        switch (i11) {
            case 3:
                wr wrVar = dVar.f37938g;
                if (wrVar != null) {
                    if (Intrinsics.a(bool, Boolean.TRUE)) {
                        i10 = 0;
                    } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                        i10 = 8;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrVar.B.setVisibility(i10);
                    return;
                }
                Intrinsics.k("layoutLeaguePortfolioSnapshot");
                throw null;
            default:
                qg qgVar = (qg) dVar.q();
                Intrinsics.c(bool);
                qgVar.f5861v.setRefreshing(bool.booleanValue());
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f37935a;
        d dVar = this.f37936b;
        switch (i10) {
            case 0:
                ((qg) dVar.q()).f5859t.setText(str);
                return;
            case 1:
                wr wrVar = dVar.f37938g;
                if (wrVar != null) {
                    wrVar.F.setText(str);
                    return;
                } else {
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
            case 2:
                String assetClass = ((CompletedLeaguePortfolioViewModel) dVar.r()).h().getAssetClass();
                if (Intrinsics.a(assetClass, "OPTIONS")) {
                    wr wrVar2 = dVar.f37938g;
                    if (wrVar2 != null) {
                        wrVar2.I.setText(dVar.getString(R.string.transaction_charges_10_order));
                        return;
                    } else {
                        Intrinsics.k("layoutLeaguePortfolioSnapshot");
                        throw null;
                    }
                }
                if (Intrinsics.a(assetClass, "EQUITY")) {
                    wr wrVar3 = dVar.f37938g;
                    if (wrVar3 != null) {
                        String string = dVar.getString(R.string.transaction_charges_dynamic);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        wrVar3.I.setText(a3.a.m(new Object[]{str}, 1, string, "format(...)"));
                        return;
                    }
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                wr wrVar4 = dVar.f37938g;
                if (wrVar4 != null) {
                    wrVar4.f6577w.setText(str.toString());
                    return;
                } else {
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
            case 7:
                wr wrVar5 = dVar.f37938g;
                if (wrVar5 != null) {
                    wrVar5.A.setVisibility(0);
                    wr wrVar6 = dVar.f37938g;
                    if (wrVar6 != null) {
                        wrVar6.C.setText(str);
                        return;
                    } else {
                        Intrinsics.k("layoutLeaguePortfolioSnapshot");
                        throw null;
                    }
                }
                Intrinsics.k("layoutLeaguePortfolioSnapshot");
                throw null;
            case 8:
                wr wrVar7 = dVar.f37938g;
                if (wrVar7 != null) {
                    wrVar7.f6573s.setText(str);
                    return;
                } else {
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
            case 9:
                wr wrVar8 = dVar.f37938g;
                if (wrVar8 != null) {
                    wrVar8.f6580z.setText(dVar.getString(R.string.total_turnover));
                    wr wrVar9 = dVar.f37938g;
                    if (wrVar9 != null) {
                        wrVar9.f6579y.setText(str);
                        return;
                    } else {
                        Intrinsics.k("layoutLeaguePortfolioSnapshot");
                        throw null;
                    }
                }
                Intrinsics.k("layoutLeaguePortfolioSnapshot");
                throw null;
            case 10:
                wr wrVar10 = dVar.f37938g;
                if (wrVar10 != null) {
                    wrVar10.D.setText(str);
                    return;
                } else {
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
            case 11:
                Intrinsics.c(str);
                if (w.s(str, "-", false)) {
                    wr wrVar11 = dVar.f37938g;
                    if (wrVar11 != null) {
                        wrVar11.E.setText(dVar.getString(R.string.text_loss));
                    } else {
                        Intrinsics.k("layoutLeaguePortfolioSnapshot");
                        throw null;
                    }
                } else {
                    wr wrVar12 = dVar.f37938g;
                    if (wrVar12 != null) {
                        wrVar12.E.setText(dVar.getString(R.string.text_profit));
                    } else {
                        Intrinsics.k("layoutLeaguePortfolioSnapshot");
                        throw null;
                    }
                }
                wr wrVar13 = dVar.f37938g;
                if (wrVar13 != null) {
                    wrVar13.D.setText(str);
                    return;
                } else {
                    Intrinsics.k("layoutLeaguePortfolioSnapshot");
                    throw null;
                }
        }
    }

    public final void e(List list) {
        int i10 = this.f37935a;
        d dVar = this.f37936b;
        switch (i10) {
            case 5:
                if (list != null && !list.isEmpty()) {
                    ((qg) dVar.q()).f5861v.setEnabled(false);
                    o lifecycle = dVar.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    dVar.f37939h = new kg.a(lifecycle);
                    qg qgVar = (qg) dVar.q();
                    kg.a aVar = dVar.f37939h;
                    if (aVar != null) {
                        qgVar.f5860u.setAdapter(aVar);
                        kg.a aVar2 = dVar.f37939h;
                        if (aVar2 != null) {
                            aVar2.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioStocksAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("frozenPortfolioStocksAdapter");
                    throw null;
                }
                return;
            default:
                if (list != null && !list.isEmpty()) {
                    ((qg) dVar.q()).f5861v.setEnabled(false);
                    o lifecycle2 = dVar.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                    dVar.f37940i = new rg.e(lifecycle2);
                    qg qgVar2 = (qg) dVar.q();
                    rg.e eVar = dVar.f37940i;
                    if (eVar != null) {
                        qgVar2.f5860u.setAdapter(eVar);
                        rg.e eVar2 = dVar.f37940i;
                        if (eVar2 != null) {
                            eVar2.u(list);
                            return;
                        } else {
                            Intrinsics.k("frozenPortfolioOptionAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("frozenPortfolioOptionAdapter");
                    throw null;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f37935a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                e((List) obj);
                return Unit.f23355a;
            case 6:
                e((List) obj);
                return Unit.f23355a;
            case 7:
                d((String) obj);
                return Unit.f23355a;
            case 8:
                d((String) obj);
                return Unit.f23355a;
            case 9:
                d((String) obj);
                return Unit.f23355a;
            case 10:
                d((String) obj);
                return Unit.f23355a;
            case 11:
                d((String) obj);
                return Unit.f23355a;
            case 12:
                d((String) obj);
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                wr wrVar = this.f37936b.f37938g;
                if (wrVar != null) {
                    if (num != null && num.intValue() == 1) {
                        i10 = R.drawable.ic_stock_up_arrow;
                    } else {
                        i10 = R.drawable.ic_stock_down_arrow;
                    }
                    wrVar.f6578x.setImageResource(i10);
                    return Unit.f23355a;
                }
                Intrinsics.k("layoutLeaguePortfolioSnapshot");
                throw null;
        }
    }
}
