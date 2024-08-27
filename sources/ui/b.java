package ui;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f37212b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f37213c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f37214a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37214a) {
            case 0:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StocksListResponse) response.getData();
            default:
                return Unit.f23355a;
        }
    }
}
