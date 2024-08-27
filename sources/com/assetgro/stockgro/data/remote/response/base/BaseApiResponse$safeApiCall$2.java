package com.assetgro.stockgro.data.remote.response.base;

import au.e;
import au.i;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.SGError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@e(c = "com.assetgro.stockgro.data.remote.response.base.BaseApiResponse$safeApiCall$2", f = "BaseApiResponse.kt", l = {14}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqu/f0;", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BaseApiResponse$safeApiCall$2<T> extends i implements Function2<f0, a<? super NetworkResult<T>>, Object> {
    final /* synthetic */ Function1<a<? super v0<T>>, Object> $apiToBeCalled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseApiResponse$safeApiCall$2(Function1<? super a<? super v0<T>>, ? extends Object> function1, a<? super BaseApiResponse$safeApiCall$2> aVar) {
        super(2, aVar);
        this.$apiToBeCalled = function1;
    }

    @Override // au.a
    @NotNull
    public final a<Unit> create(Object obj, @NotNull a<?> aVar) {
        return new BaseApiResponse$safeApiCall$2(this.$apiToBeCalled, aVar);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                Function1<a<? super v0<T>>, Object> function1 = this.$apiToBeCalled;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                return new NetworkResult.Success(v0Var.f29303b);
            }
            String message = v0Var.f29302a.message();
            if (message.length() == 0) {
                message = "Something went wrong";
            }
            Intrinsics.checkNotNullExpressionValue(message, "ifEmpty(...)");
            return new NetworkResult.Error(new SGError(message), null, 2, null);
        } catch (Exception unused) {
            return new NetworkResult.Error(new SGError("Something went wrong"), null, 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull f0 f0Var, a<? super NetworkResult<T>> aVar) {
        return ((BaseApiResponse$safeApiCall$2) create(f0Var, aVar)).invokeSuspend(Unit.f23355a);
    }
}
