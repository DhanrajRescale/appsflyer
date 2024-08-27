package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "data", "error", "Lcom/assetgro/stockgro/data/remote/response/ErrorResponse;", "success", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Lcom/assetgro/stockgro/data/remote/response/ErrorResponse;ZLjava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/assetgro/stockgro/data/remote/response/ErrorResponse;", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Lcom/assetgro/stockgro/data/remote/response/ErrorResponse;ZLjava/lang/String;)Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BaseResponseV2Dto<T> {
    public static final int $stable = 0;

    @SerializedName("data")
    private final T data;

    @SerializedName("error")
    @NotNull
    private final ErrorResponse error;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("success")
    private final boolean success;

    public BaseResponseV2Dto(T t10, @NotNull ErrorResponse error, boolean z10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        this.data = t10;
        this.error = error;
        this.success = z10;
        this.message = message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponseV2Dto copy$default(BaseResponseV2Dto baseResponseV2Dto, Object obj, ErrorResponse errorResponse, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = baseResponseV2Dto.data;
        }
        if ((i10 & 2) != 0) {
            errorResponse = baseResponseV2Dto.error;
        }
        if ((i10 & 4) != 0) {
            z10 = baseResponseV2Dto.success;
        }
        if ((i10 & 8) != 0) {
            str = baseResponseV2Dto.message;
        }
        return baseResponseV2Dto.copy(obj, errorResponse, z10, str);
    }

    public final T component1() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ErrorResponse getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final BaseResponseV2Dto<T> copy(T data, @NotNull ErrorResponse error, boolean success, @NotNull String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        return new BaseResponseV2Dto<>(data, error, success, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponseV2Dto)) {
            return false;
        }
        BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) other;
        return Intrinsics.a(this.data, baseResponseV2Dto.data) && Intrinsics.a(this.error, baseResponseV2Dto.error) && this.success == baseResponseV2Dto.success && Intrinsics.a(this.message, baseResponseV2Dto.message);
    }

    public final T getData() {
        return this.data;
    }

    @NotNull
    public final ErrorResponse getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        T t10 = this.data;
        if (t10 == null) {
            hashCode = 0;
        } else {
            hashCode = t10.hashCode();
        }
        return this.message.hashCode() + e.d(this.success, (this.error.hashCode() + (hashCode * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BaseResponseV2Dto(data=" + this.data + ", error=" + this.error + ", success=" + this.success + ", message=" + this.message + ")";
    }
}
