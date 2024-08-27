package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JF\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/ContactResponseDto;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "data", "errorCode", HttpUrl.FRAGMENT_ENCODE_SET, "message", "totalRecords", "success", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getSuccess", "()Z", "getTotalRecords", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/assetgro/stockgro/data/remote/response/ContactResponseDto;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContactResponseDto<T> {
    public static final int $stable = 0;

    @SerializedName("data")
    @NotNull
    private final T data;

    @SerializedName("error_code")
    @NotNull
    private final String errorCode;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("success")
    private final boolean success;

    @SerializedName("total_records")
    @NotNull
    private final String totalRecords;

    public ContactResponseDto(@NotNull T data, @NotNull String errorCode, @NotNull String message, @NotNull String totalRecords, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(totalRecords, "totalRecords");
        this.data = data;
        this.errorCode = errorCode;
        this.message = message;
        this.totalRecords = totalRecords;
        this.success = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactResponseDto copy$default(ContactResponseDto contactResponseDto, Object obj, String str, String str2, String str3, boolean z10, int i10, Object obj2) {
        T t10 = obj;
        if ((i10 & 1) != 0) {
            t10 = contactResponseDto.data;
        }
        if ((i10 & 2) != 0) {
            str = contactResponseDto.errorCode;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = contactResponseDto.message;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = contactResponseDto.totalRecords;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            z10 = contactResponseDto.success;
        }
        return contactResponseDto.copy(t10, str4, str5, str6, z10);
    }

    @NotNull
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

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTotalRecords() {
        return this.totalRecords;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final ContactResponseDto<T> copy(@NotNull T data, @NotNull String errorCode, @NotNull String message, @NotNull String totalRecords, boolean success) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(totalRecords, "totalRecords");
        return new ContactResponseDto<>(data, errorCode, message, totalRecords, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactResponseDto)) {
            return false;
        }
        ContactResponseDto contactResponseDto = (ContactResponseDto) other;
        return Intrinsics.a(this.data, contactResponseDto.data) && Intrinsics.a(this.errorCode, contactResponseDto.errorCode) && Intrinsics.a(this.message, contactResponseDto.message) && Intrinsics.a(this.totalRecords, contactResponseDto.totalRecords) && this.success == contactResponseDto.success;
    }

    @NotNull
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

    @NotNull
    public final String getTotalRecords() {
        return this.totalRecords;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success) + h.g(this.totalRecords, h.g(this.message, h.g(this.errorCode, this.data.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        T t10 = this.data;
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.totalRecords;
        boolean z10 = this.success;
        StringBuilder sb2 = new StringBuilder("ContactResponseDto(data=");
        sb2.append(t10);
        sb2.append(", errorCode=");
        sb2.append(str);
        sb2.append(", message=");
        e.v(sb2, str2, ", totalRecords=", str3, ", success=");
        return da.e.o(sb2, z10, ")");
    }
}
