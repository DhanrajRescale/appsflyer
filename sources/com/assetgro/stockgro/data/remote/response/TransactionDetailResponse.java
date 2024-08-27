package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jy\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001a¨\u00064"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/TransactionDetailResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "txnID", HttpUrl.FRAGMENT_ENCODE_SET, "type", "status", "title", "remark", "date", HttpUrl.FRAGMENT_ENCODE_SET, "support_title", "support_enabled", HttpUrl.FRAGMENT_ENCODE_SET, "total", PaymentConstants.AMOUNT, "Lcom/assetgro/stockgro/data/remote/response/TransactionDetailAmountDto;", "beneficiary", "Lcom/assetgro/stockgro/data/remote/response/TransactionBeneficiary;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Lcom/assetgro/stockgro/data/remote/response/TransactionDetailAmountDto;Lcom/assetgro/stockgro/data/remote/response/TransactionBeneficiary;)V", "getAmount", "()Lcom/assetgro/stockgro/data/remote/response/TransactionDetailAmountDto;", "getBeneficiary", "()Lcom/assetgro/stockgro/data/remote/response/TransactionBeneficiary;", "getDate", "()J", "getRemark", "()Ljava/lang/String;", "getStatus", "getSupport_enabled", "()Z", "getSupport_title", "getTitle", "getTotal", "getTxnID", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransactionDetailResponse {
    public static final int $stable = 0;

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final TransactionDetailAmountDto amount;

    @SerializedName("beneficiary")
    private final TransactionBeneficiary beneficiary;

    @SerializedName("date")
    private final long date;

    @SerializedName("remark")
    @NotNull
    private final String remark;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("support_enabled")
    private final boolean support_enabled;

    @SerializedName("support_title")
    @NotNull
    private final String support_title;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("total")
    @NotNull
    private final String total;

    @SerializedName("txnID")
    @NotNull
    private final String txnID;

    @SerializedName("type")
    @NotNull
    private final String type;

    public TransactionDetailResponse(@NotNull String txnID, @NotNull String type, @NotNull String status, @NotNull String title, @NotNull String remark, long j10, @NotNull String support_title, boolean z10, @NotNull String total, @NotNull TransactionDetailAmountDto amount, TransactionBeneficiary transactionBeneficiary) {
        Intrinsics.checkNotNullParameter(txnID, "txnID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(support_title, "support_title");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.txnID = txnID;
        this.type = type;
        this.status = status;
        this.title = title;
        this.remark = remark;
        this.date = j10;
        this.support_title = support_title;
        this.support_enabled = z10;
        this.total = total;
        this.amount = amount;
        this.beneficiary = transactionBeneficiary;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTxnID() {
        return this.txnID;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final TransactionDetailAmountDto getAmount() {
        return this.amount;
    }

    /* renamed from: component11, reason: from getter */
    public final TransactionBeneficiary getBeneficiary() {
        return this.beneficiary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSupport_title() {
        return this.support_title;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSupport_enabled() {
        return this.support_enabled;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    @NotNull
    public final TransactionDetailResponse copy(@NotNull String txnID, @NotNull String type, @NotNull String status, @NotNull String title, @NotNull String remark, long date, @NotNull String support_title, boolean support_enabled, @NotNull String total, @NotNull TransactionDetailAmountDto amount, TransactionBeneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(txnID, "txnID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(support_title, "support_title");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new TransactionDetailResponse(txnID, type, status, title, remark, date, support_title, support_enabled, total, amount, beneficiary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionDetailResponse)) {
            return false;
        }
        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) other;
        return Intrinsics.a(this.txnID, transactionDetailResponse.txnID) && Intrinsics.a(this.type, transactionDetailResponse.type) && Intrinsics.a(this.status, transactionDetailResponse.status) && Intrinsics.a(this.title, transactionDetailResponse.title) && Intrinsics.a(this.remark, transactionDetailResponse.remark) && this.date == transactionDetailResponse.date && Intrinsics.a(this.support_title, transactionDetailResponse.support_title) && this.support_enabled == transactionDetailResponse.support_enabled && Intrinsics.a(this.total, transactionDetailResponse.total) && Intrinsics.a(this.amount, transactionDetailResponse.amount) && Intrinsics.a(this.beneficiary, transactionDetailResponse.beneficiary);
    }

    @NotNull
    public final TransactionDetailAmountDto getAmount() {
        return this.amount;
    }

    public final TransactionBeneficiary getBeneficiary() {
        return this.beneficiary;
    }

    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final boolean getSupport_enabled() {
        return this.support_enabled;
    }

    @NotNull
    public final String getSupport_title() {
        return this.support_title;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTotal() {
        return this.total;
    }

    @NotNull
    public final String getTxnID() {
        return this.txnID;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.amount.hashCode() + h.g(this.total, e.d(this.support_enabled, h.g(this.support_title, e.c(this.date, h.g(this.remark, h.g(this.title, h.g(this.status, h.g(this.type, this.txnID.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31;
        TransactionBeneficiary transactionBeneficiary = this.beneficiary;
        if (transactionBeneficiary == null) {
            hashCode = 0;
        } else {
            hashCode = transactionBeneficiary.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.txnID;
        String str2 = this.type;
        String str3 = this.status;
        String str4 = this.title;
        String str5 = this.remark;
        long j10 = this.date;
        String str6 = this.support_title;
        boolean z10 = this.support_enabled;
        String str7 = this.total;
        TransactionDetailAmountDto transactionDetailAmountDto = this.amount;
        TransactionBeneficiary transactionBeneficiary = this.beneficiary;
        StringBuilder l10 = e.l("TransactionDetailResponse(txnID=", str, ", type=", str2, ", status=");
        e.v(l10, str3, ", title=", str4, ", remark=");
        l10.append(str5);
        l10.append(", date=");
        l10.append(j10);
        l10.append(", support_title=");
        l10.append(str6);
        l10.append(", support_enabled=");
        l10.append(z10);
        l10.append(", total=");
        l10.append(str7);
        l10.append(", amount=");
        l10.append(transactionDetailAmountDto);
        l10.append(", beneficiary=");
        l10.append(transactionBeneficiary);
        l10.append(")");
        return l10.toString();
    }
}
