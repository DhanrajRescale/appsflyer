package com.assetgro.stockgro.data.remote.response.base;

import com.assetgro.stockgro.data.remote.NetworkResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qu.r0;
import yk.g;
import yt.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/base/BaseApiResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlin/Function1;", "Lyt/a;", "Lnv/v0;", "apiToBeCalled", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "safeApiCall", "(Lkotlin/jvm/functions/Function1;Lyt/a;)Ljava/lang/Object;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseApiResponse {
    public static final int $stable = 0;

    public final <T> Object safeApiCall(@NotNull Function1<? super a<? super v0<T>>, ? extends Object> function1, @NotNull a<? super NetworkResult<T>> aVar) {
        return g.e0(r0.f32256b, new BaseApiResponse$safeApiCall$2(function1, null), aVar);
    }
}
