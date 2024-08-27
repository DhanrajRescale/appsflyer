package z9;

import bv.b0;
import com.assetgro.stockgro.StockGroApplication;
import iu.k;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGroApplication f42202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StockGroApplication stockGroApplication, int i10) {
        super(0);
        this.f42201a = i10;
        this.f42202b = stockGroApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f42201a;
        StockGroApplication stockGroApplication = this.f42202b;
        switch (i10) {
            case 0:
                w8.b bVar = new w8.b(stockGroApplication);
                bVar.b(0.2d);
                return bVar.a();
            default:
                q8.a aVar = new q8.a();
                File cacheDir = stockGroApplication.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                File e10 = fu.k.e(cacheDir);
                String str = b0.f7323b;
                aVar.f31823a = gt.d.g(e10);
                aVar.f31825c = 0.0d;
                aVar.f31828f = 5242880L;
                return aVar.a();
        }
    }
}
