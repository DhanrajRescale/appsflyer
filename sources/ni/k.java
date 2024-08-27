package ni;

import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k f28739b = new k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f28740c = new k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k f28741d = new k(2);

    /* renamed from: e, reason: collision with root package name */
    public static final k f28742e = new k(3);

    /* renamed from: f, reason: collision with root package name */
    public static final k f28743f = new k(4);

    /* renamed from: g, reason: collision with root package name */
    public static final k f28744g = new k(5);

    /* renamed from: h, reason: collision with root package name */
    public static final k f28745h = new k(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(1);
        this.f28746a = i10;
    }

    public final String a(StockDto stockDto) {
        switch (this.f28746a) {
            case 0:
                return stockDto.getImageUrl();
            case 1:
                return stockDto.getName();
            case 2:
                return ij.h.m(ij.h.f20067a, stockDto.getLtp());
            default:
                return stockDto.getSector();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28746a) {
            case 0:
                return a((StockDto) obj);
            case 1:
                return a((StockDto) obj);
            case 2:
                return a((StockDto) obj);
            case 3:
                return a((StockDto) obj);
            case 4:
                return ((StockDto) obj).getChange();
            case 5:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StocksListResponse) response.getData();
            default:
                return Unit.f23355a;
        }
    }
}
