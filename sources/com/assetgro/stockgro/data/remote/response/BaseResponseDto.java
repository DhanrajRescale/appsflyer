package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J>\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "data", "errorCode", HttpUrl.FRAGMENT_ENCODE_SET, "message", "success", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BaseResponseDto<T> {
    public static final int $stable = 0;

    @SerializedName("data")
    private final T data;

    @SerializedName("error_code")
    @NotNull
    private final String errorCode;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("success")
    private final boolean success;

    public BaseResponseDto(T t10, @NotNull String errorCode, @NotNull String message, boolean z10) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        this.data = t10;
        this.errorCode = errorCode;
        this.message = message;
        this.success = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponseDto copy$default(BaseResponseDto baseResponseDto, Object obj, String str, String str2, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = baseResponseDto.data;
        }
        if ((i10 & 2) != 0) {
            str = baseResponseDto.errorCode;
        }
        if ((i10 & 4) != 0) {
            str2 = baseResponseDto.message;
        }
        if ((i10 & 8) != 0) {
            z10 = baseResponseDto.success;
        }
        return baseResponseDto.copy(obj, str, str2, z10);
    }

    public final T component1() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final BaseResponseDto<T> copy(T data, @NotNull String errorCode, @NotNull String message, boolean success) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        return new BaseResponseDto<>(data, errorCode, message, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponseDto)) {
            return false;
        }
        BaseResponseDto baseResponseDto = (BaseResponseDto) other;
        return Intrinsics.a(this.data, baseResponseDto.data) && Intrinsics.a(this.errorCode, baseResponseDto.errorCode) && Intrinsics.a(this.message, baseResponseDto.message) && this.success == baseResponseDto.success;
    }

    public final T getData() {
        return this.data;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
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
        return Boolean.hashCode(this.success) + h.g(this.message, h.g(this.errorCode, hashCode * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BaseResponseDto(data=" + this.data + ", errorCode=" + this.errorCode + ", message=" + this.message + ", success=" + this.success + ")";
    }
}
