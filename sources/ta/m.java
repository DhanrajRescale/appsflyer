package ta;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f35668b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f35669c = new m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f35670d = new m(2);

    /* renamed from: e, reason: collision with root package name */
    public static final m f35671e = new m(3);

    /* renamed from: f, reason: collision with root package name */
    public static final m f35672f = new m(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(1);
        this.f35673a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f35673a;
        switch (i10) {
            case 0:
                BaseResponseDto response = (BaseResponseDto) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(response, "response");
                        return (StocksListResponse) response.getData();
                    default:
                        Intrinsics.checkNotNullParameter(response, "response");
                        return (StocksListResponse) response.getData();
                }
            case 1:
                BaseResponseDto response2 = (BaseResponseDto) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(response2, "response");
                        return (StocksListResponse) response2.getData();
                    default:
                        Intrinsics.checkNotNullParameter(response2, "response");
                        return (StocksListResponse) response2.getData();
                }
            case 2:
                BaseResponseDto response3 = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                return (HomePageTopDataResponse) response3.getData();
            case 3:
                return Unit.f23355a;
            default:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
