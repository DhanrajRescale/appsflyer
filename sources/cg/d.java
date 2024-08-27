package cg;

import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f8137a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) obj;
        if (Intrinsics.a(transactionDetailResponse.getType(), "cr")) {
            return a3.a.f("+", transactionDetailResponse.getTotal());
        }
        return a3.a.f("-", transactionDetailResponse.getTotal());
    }
}
