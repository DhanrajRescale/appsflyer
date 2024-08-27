package na;

import ba.of;
import ba.pj;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketAssetHostViewModel;
import com.google.android.material.appbar.AppBarLayout;
import gd.m;
import kotlin.jvm.internal.Intrinsics;
import wn.g;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f28557b;

    public /* synthetic */ b(m mVar, int i10) {
        this.f28556a = i10;
        this.f28557b = mVar;
    }

    @Override // wn.d
    public final void a(AppBarLayout appBarLayout, int i10) {
        int i11 = this.f28556a;
        m mVar = this.f28557b;
        switch (i11) {
            case 0:
                d this$0 = (d) mVar;
                int i12 = d.f28560i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i10 == ((pj) this$0.q()).f5774v.getHeight() + (-((pj) this$0.q()).f5773u.getHeight())) {
                    if (!((MarketAssetHostViewModel) this$0.r()).f8653n.b(qf.b.f31938m)) {
                        this$0.H().f9592w.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                this$0.H().f9592w.postValue(Boolean.FALSE);
                return;
            default:
                nc.d this$02 = (nc.d) mVar;
                int i13 = nc.d.f28615i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (i10 == ((of) this$02.q()).f5664w.getHeight() + (-((of) this$02.q()).f5662u.getHeight())) {
                    this$02.I().f9592w.postValue(Boolean.TRUE);
                } else {
                    this$02.I().f9592w.postValue(Boolean.FALSE);
                }
                ((of) this$02.q()).f5662u.setAlpha((1.0f - (i10 / (-appBarLayout.getTotalScrollRange()))) * 255);
                return;
        }
    }
}
