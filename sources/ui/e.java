package ui;

import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f37217a = i10;
        this.f37218b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37217a;
        f fVar = this.f37218b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                ni.a aVar = fVar.f37220g;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("stockAdapter");
                throw null;
            default:
                String str = (String) obj;
                if (str != null && str.length() > 2) {
                    MarketAssetSearchViewModel marketAssetSearchViewModel = (MarketAssetSearchViewModel) fVar.r();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    marketAssetSearchViewModel.f10390r = str;
                    ((MarketAssetSearchViewModel) fVar.r()).j();
                    ((MarketAssetSearchViewModel) fVar.r()).h();
                }
                return Unit.f23355a;
        }
    }
}
