package com.assetgro.stockgro.data.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\f\rB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/data/remote/NetworkResult;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "data", "error", "Lcom/assetgro/stockgro/data/remote/SGError;", "(Ljava/lang/Object;Lcom/assetgro/stockgro/data/remote/SGError;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/assetgro/stockgro/data/remote/SGError;", "Error", "Success", "Lcom/assetgro/stockgro/data/remote/NetworkResult$Error;", "Lcom/assetgro/stockgro/data/remote/NetworkResult$Success;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NetworkResult<T> {
    public static final int $stable = 0;
    private final T data;
    private final SGError error;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/data/remote/NetworkResult$Error;", "T", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "message", "Lcom/assetgro/stockgro/data/remote/SGError;", "data", "(Lcom/assetgro/stockgro/data/remote/SGError;Ljava/lang/Object;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error<T> extends NetworkResult<T> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull SGError message, T t10) {
            super(t10, message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public /* synthetic */ Error(SGError sGError, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(sGError, (i10 & 2) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/data/remote/NetworkResult$Success;", "T", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "data", "(Ljava/lang/Object;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Success<T> extends NetworkResult<T> {
        public static final int $stable = 0;

        public Success(T t10) {
            super(t10, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ NetworkResult(Object obj, SGError sGError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, sGError);
    }

    public final T getData() {
        return this.data;
    }

    public final SGError getError() {
        return this.error;
    }

    private NetworkResult(T t10, SGError sGError) {
        this.data = t10;
        this.error = sGError;
    }

    public /* synthetic */ NetworkResult(Object obj, SGError sGError, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : sGError, null);
    }
}
