package li;

import androidx.navigation.l0;
import androidx.navigation.x0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f24861b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f24862c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f24863d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f24864a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24864a) {
            case 0:
                x0 popUpTo = (x0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f2340a = true;
                return Unit.f23355a;
            case 1:
                l0 navOptions = (l0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.a(R.id.stock_detail_fragment, f24861b);
                return Unit.f23355a;
            default:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StockDetailDto) response.getData();
        }
    }
}
