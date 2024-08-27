package ri;

import androidx.navigation.l0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f33768b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f33769c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f33770d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f33771e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f33772f = new h(4);

    /* renamed from: g, reason: collision with root package name */
    public static final h f33773g = new h(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f33774a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33774a) {
            case 0:
                return Unit.f23355a;
            case 1:
                l0 navOptions = (l0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                return Unit.f23355a;
            case 2:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StockModifyInfoDto) response.getData();
            case 3:
                BaseResponseDto response2 = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                return (StockDetailDto) response2.getData();
            case 4:
                BaseResponseDto response3 = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                return (StockSellSelectOrderResponseDto) response3.getData();
            default:
                return Double.valueOf(Double.parseDouble(((StockModifyInfoDto) obj).getEntryPrice()));
        }
    }
}
