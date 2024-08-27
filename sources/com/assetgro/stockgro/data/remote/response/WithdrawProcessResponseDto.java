package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/WithdrawProcessResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "txnTd", HttpUrl.FRAGMENT_ENCODE_SET, "status", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTxnTd", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawProcessResponseDto {
    public static final int $stable = 0;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("txn_id")
    @NotNull
    private final String txnTd;

    public WithdrawProcessResponseDto(@NotNull String txnTd, @NotNull String status) {
        Intrinsics.checkNotNullParameter(txnTd, "txnTd");
        Intrinsics.checkNotNullParameter(status, "status");
        this.txnTd = txnTd;
        this.status = status;
    }

    public static /* synthetic */ WithdrawProcessResponseDto copy$default(WithdrawProcessResponseDto withdrawProcessResponseDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = withdrawProcessResponseDto.txnTd;
        }
        if ((i10 & 2) != 0) {
            str2 = withdrawProcessResponseDto.status;
        }
        return withdrawProcessResponseDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTxnTd() {
        return this.txnTd;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final WithdrawProcessResponseDto copy(@NotNull String txnTd, @NotNull String status) {
        Intrinsics.checkNotNullParameter(txnTd, "txnTd");
        Intrinsics.checkNotNullParameter(status, "status");
        return new WithdrawProcessResponseDto(txnTd, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawProcessResponseDto)) {
            return false;
        }
        WithdrawProcessResponseDto withdrawProcessResponseDto = (WithdrawProcessResponseDto) other;
        return Intrinsics.a(this.txnTd, withdrawProcessResponseDto.txnTd) && Intrinsics.a(this.status, withdrawProcessResponseDto.status);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTxnTd() {
        return this.txnTd;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.txnTd.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("WithdrawProcessResponseDto(txnTd=", this.txnTd, ", status=", this.status, ")");
    }
}
