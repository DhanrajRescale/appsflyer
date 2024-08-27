package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/WalletTransaction;", HttpUrl.FRAGMENT_ENCODE_SET, "id", HttpUrl.FRAGMENT_ENCODE_SET, "txnDate", HttpUrl.FRAGMENT_ENCODE_SET, "txnAmount", "type", "txnStatus", "title", "subTitle", "reason", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getReason", "getSubTitle", "getTitle", "getTxnAmount", "getTxnDate", "()J", "getTxnStatus", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletTransaction {
    public static final int $stable = 0;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("reason")
    @NotNull
    private final String reason;

    @SerializedName("sub_title")
    @NotNull
    private final String subTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final String txnAmount;

    @SerializedName("date")
    private final long txnDate;

    @SerializedName("status")
    @NotNull
    private final String txnStatus;

    @SerializedName("type")
    @NotNull
    private final String type;

    public WalletTransaction(@NotNull String id2, long j10, @NotNull String txnAmount, @NotNull String type, @NotNull String txnStatus, @NotNull String title, @NotNull String subTitle, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(txnAmount, "txnAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(txnStatus, "txnStatus");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.id = id2;
        this.txnDate = j10;
        this.txnAmount = txnAmount;
        this.type = type;
        this.txnStatus = txnStatus;
        this.title = title;
        this.subTitle = subTitle;
        this.reason = reason;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTxnDate() {
        return this.txnDate;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTxnAmount() {
        return this.txnAmount;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTxnStatus() {
        return this.txnStatus;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final WalletTransaction copy(@NotNull String id2, long txnDate, @NotNull String txnAmount, @NotNull String type, @NotNull String txnStatus, @NotNull String title, @NotNull String subTitle, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(txnAmount, "txnAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(txnStatus, "txnStatus");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new WalletTransaction(id2, txnDate, txnAmount, type, txnStatus, title, subTitle, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTransaction)) {
            return false;
        }
        WalletTransaction walletTransaction = (WalletTransaction) other;
        return Intrinsics.a(this.id, walletTransaction.id) && this.txnDate == walletTransaction.txnDate && Intrinsics.a(this.txnAmount, walletTransaction.txnAmount) && Intrinsics.a(this.type, walletTransaction.type) && Intrinsics.a(this.txnStatus, walletTransaction.txnStatus) && Intrinsics.a(this.title, walletTransaction.title) && Intrinsics.a(this.subTitle, walletTransaction.subTitle) && Intrinsics.a(this.reason, walletTransaction.reason);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTxnAmount() {
        return this.txnAmount;
    }

    public final long getTxnDate() {
        return this.txnDate;
    }

    @NotNull
    public final String getTxnStatus() {
        return this.txnStatus;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.reason.hashCode() + h.g(this.subTitle, h.g(this.title, h.g(this.txnStatus, h.g(this.type, h.g(this.txnAmount, e.c(this.txnDate, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        long j10 = this.txnDate;
        String str2 = this.txnAmount;
        String str3 = this.type;
        String str4 = this.txnStatus;
        String str5 = this.title;
        String str6 = this.subTitle;
        String str7 = this.reason;
        StringBuilder sb2 = new StringBuilder("WalletTransaction(id=");
        sb2.append(str);
        sb2.append(", txnDate=");
        sb2.append(j10);
        e.v(sb2, ", txnAmount=", str2, ", type=", str3);
        e.v(sb2, ", txnStatus=", str4, ", title=", str5);
        e.v(sb2, ", subTitle=", str6, ", reason=", str7);
        sb2.append(")");
        return sb2.toString();
    }
}
