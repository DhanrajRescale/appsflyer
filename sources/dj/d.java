package dj;

import android.view.View;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import ba.dd;
import ba.fd;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewSectionItemViewModel;
import gd.o;
import kj.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.p0;
import vt.y;
import zi.k;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f14391x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f14392y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onCellClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "logEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.dd.E
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558640(0x7f0d00f0, float:1.8742602E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.dd r5 = (ba.dd) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f14391x = r6
            r4.f14392y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockOverviewSectionItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((StockOverviewSectionItemViewModel) v()).f10481i.observe(this, new bj.c(5, new c(this, 0)));
        ((StockOverviewSectionItemViewModel) v()).f10489q.observe(this, new bj.c(5, new c(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        fd fdVar = (fd) ((dd) this.f17291u);
        fdVar.D = (StockOverviewSectionItemViewModel) v();
        synchronized (fdVar) {
            fdVar.M |= 32;
        }
        fdVar.a(24);
        fdVar.m();
        ((dd) this.f17291u).p(this);
        final int i10 = 0;
        ((dd) this.f17291u).f4482w.setOnClickListener(new View.OnClickListener(this) { // from class: dj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f14388b;

            {
                this.f14388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i11 = i10;
                d this$0 = this.f14388b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockOverviewSectionItemViewModel stockOverviewSectionItemViewModel = (StockOverviewSectionItemViewModel) this$0.v();
                        e0 e0Var = stockOverviewSectionItemViewModel.f10488p;
                        Pair[] pairArr = new Pair[1];
                        zi.f fVar = (zi.f) stockOverviewSectionItemViewModel.f9075c.getValue();
                        if (fVar == null || (str = fVar.f42472a) == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        pairArr[0] = new Pair("section", str);
                        e0Var.postValue(new j(new AnalyticEvent("app_market_sentiment_tap", p0.f(pairArr))));
                        e0 e0Var2 = stockOverviewSectionItemViewModel.f10480h;
                        zi.i iVar = new zi.i("Bullish", "The outlook of the stock is bullish based on the parameters in this section");
                        iVar.f42489c = R.drawable.ic_thumb_up_new;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Neutral", "The outlook of the stock is neutral based on the parameters in this section");
                        iVar2.f42489c = R.drawable.ic_thumbs_neutral_new;
                        zi.i iVar3 = new zi.i("Bearish", "The outlook of the stock is bearish based on the parameters in this section");
                        iVar3.f42489c = R.drawable.ic_thumb_down_new;
                        e0Var2.postValue(new j(new k(HttpUrl.FRAGMENT_ENCODE_SET, y.g(iVar, iVar2, iVar3))));
                        return;
                }
            }
        });
        final int i11 = 1;
        ((dd) this.f17291u).f4483x.setOnClickListener(new View.OnClickListener(this) { // from class: dj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f14388b;

            {
                this.f14388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i112 = i11;
                d this$0 = this.f14388b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockOverviewSectionItemViewModel stockOverviewSectionItemViewModel = (StockOverviewSectionItemViewModel) this$0.v();
                        e0 e0Var = stockOverviewSectionItemViewModel.f10488p;
                        Pair[] pairArr = new Pair[1];
                        zi.f fVar = (zi.f) stockOverviewSectionItemViewModel.f9075c.getValue();
                        if (fVar == null || (str = fVar.f42472a) == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        pairArr[0] = new Pair("section", str);
                        e0Var.postValue(new j(new AnalyticEvent("app_market_sentiment_tap", p0.f(pairArr))));
                        e0 e0Var2 = stockOverviewSectionItemViewModel.f10480h;
                        zi.i iVar = new zi.i("Bullish", "The outlook of the stock is bullish based on the parameters in this section");
                        iVar.f42489c = R.drawable.ic_thumb_up_new;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Neutral", "The outlook of the stock is neutral based on the parameters in this section");
                        iVar2.f42489c = R.drawable.ic_thumbs_neutral_new;
                        zi.i iVar3 = new zi.i("Bearish", "The outlook of the stock is bearish based on the parameters in this section");
                        iVar3.f42489c = R.drawable.ic_thumb_down_new;
                        e0Var2.postValue(new j(new k(HttpUrl.FRAGMENT_ENCODE_SET, y.g(iVar, iVar2, iVar3))));
                        return;
                }
            }
        });
        final int i12 = 2;
        ((dd) this.f17291u).A.setOnClickListener(new View.OnClickListener(this) { // from class: dj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f14388b;

            {
                this.f14388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i112 = i12;
                d this$0 = this.f14388b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockOverviewSectionItemViewModel) this$0.v()).e();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockOverviewSectionItemViewModel stockOverviewSectionItemViewModel = (StockOverviewSectionItemViewModel) this$0.v();
                        e0 e0Var = stockOverviewSectionItemViewModel.f10488p;
                        Pair[] pairArr = new Pair[1];
                        zi.f fVar = (zi.f) stockOverviewSectionItemViewModel.f9075c.getValue();
                        if (fVar == null || (str = fVar.f42472a) == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        pairArr[0] = new Pair("section", str);
                        e0Var.postValue(new j(new AnalyticEvent("app_market_sentiment_tap", p0.f(pairArr))));
                        e0 e0Var2 = stockOverviewSectionItemViewModel.f10480h;
                        zi.i iVar = new zi.i("Bullish", "The outlook of the stock is bullish based on the parameters in this section");
                        iVar.f42489c = R.drawable.ic_thumb_up_new;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Neutral", "The outlook of the stock is neutral based on the parameters in this section");
                        iVar2.f42489c = R.drawable.ic_thumbs_neutral_new;
                        zi.i iVar3 = new zi.i("Bearish", "The outlook of the stock is bearish based on the parameters in this section");
                        iVar3.f42489c = R.drawable.ic_thumb_down_new;
                        e0Var2.postValue(new j(new k(HttpUrl.FRAGMENT_ENCODE_SET, y.g(iVar, iVar2, iVar3))));
                        return;
                }
            }
        });
    }
}
