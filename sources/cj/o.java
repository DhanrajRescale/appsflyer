package cj;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o f8186a = new iu.k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BaseResponseDto response = (BaseResponseDto) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        return (StockDetailDto) response.getData();
    }
}
