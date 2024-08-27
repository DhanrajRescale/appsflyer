package ea;

import com.assetgro.stockgro.StockGroApplication;

/* loaded from: classes.dex */
public final class y implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15295a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15296b;

    public /* synthetic */ y(w wVar, int i10) {
        this.f15295a = i10;
        this.f15296b = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f15295a;
        w wVar = this.f15296b;
        switch (i10) {
            case 0:
                StockGroApplication stockGroApplication = wVar.f15291a;
                yk.g.j(stockGroApplication);
                return stockGroApplication;
            default:
                wVar.getClass();
                return new qf.a();
        }
    }
}
