package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/TransactionBeneficiary;", HttpUrl.FRAGMENT_ENCODE_SET, "sectionTitle", HttpUrl.FRAGMENT_ENCODE_SET, "type", "beneficiaryTitle", "beneficiaryIcon", "detail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryIcon", "()Ljava/lang/String;", "getBeneficiaryTitle", "getDetail", "getSectionTitle", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransactionBeneficiary {
    public static final int $stable = 0;

    @SerializedName("beneficiary_icon")
    @NotNull
    private final String beneficiaryIcon;

    @SerializedName("beneficiary_title")
    @NotNull
    private final String beneficiaryTitle;

    @SerializedName("detail")
    @NotNull
    private final String detail;

    @SerializedName("section_title")
    @NotNull
    private final String sectionTitle;

    @SerializedName("type")
    @NotNull
    private final String type;

    public TransactionBeneficiary(@NotNull String sectionTitle, @NotNull String type, @NotNull String beneficiaryTitle, @NotNull String beneficiaryIcon, @NotNull String detail) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beneficiaryTitle, "beneficiaryTitle");
        Intrinsics.checkNotNullParameter(beneficiaryIcon, "beneficiaryIcon");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.sectionTitle = sectionTitle;
        this.type = type;
        this.beneficiaryTitle = beneficiaryTitle;
        this.beneficiaryIcon = beneficiaryIcon;
        this.detail = detail;
    }

    public static /* synthetic */ TransactionBeneficiary copy$default(TransactionBeneficiary transactionBeneficiary, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionBeneficiary.sectionTitle;
        }
        if ((i10 & 2) != 0) {
            str2 = transactionBeneficiary.type;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = transactionBeneficiary.beneficiaryTitle;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = transactionBeneficiary.beneficiaryIcon;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = transactionBeneficiary.detail;
        }
        return transactionBeneficiary.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBeneficiaryTitle() {
        return this.beneficiaryTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBeneficiaryIcon() {
        return this.beneficiaryIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final TransactionBeneficiary copy(@NotNull String sectionTitle, @NotNull String type, @NotNull String beneficiaryTitle, @NotNull String beneficiaryIcon, @NotNull String detail) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beneficiaryTitle, "beneficiaryTitle");
        Intrinsics.checkNotNullParameter(beneficiaryIcon, "beneficiaryIcon");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new TransactionBeneficiary(sectionTitle, type, beneficiaryTitle, beneficiaryIcon, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionBeneficiary)) {
            return false;
        }
        TransactionBeneficiary transactionBeneficiary = (TransactionBeneficiary) other;
        return Intrinsics.a(this.sectionTitle, transactionBeneficiary.sectionTitle) && Intrinsics.a(this.type, transactionBeneficiary.type) && Intrinsics.a(this.beneficiaryTitle, transactionBeneficiary.beneficiaryTitle) && Intrinsics.a(this.beneficiaryIcon, transactionBeneficiary.beneficiaryIcon) && Intrinsics.a(this.detail, transactionBeneficiary.detail);
    }

    @NotNull
    public final String getBeneficiaryIcon() {
        return this.beneficiaryIcon;
    }

    @NotNull
    public final String getBeneficiaryTitle() {
        return this.beneficiaryTitle;
    }

    @NotNull
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.detail.hashCode() + h.g(this.beneficiaryIcon, h.g(this.beneficiaryTitle, h.g(this.type, this.sectionTitle.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.sectionTitle;
        String str2 = this.type;
        String str3 = this.beneficiaryTitle;
        String str4 = this.beneficiaryIcon;
        String str5 = this.detail;
        StringBuilder l10 = e.l("TransactionBeneficiary(sectionTitle=", str, ", type=", str2, ", beneficiaryTitle=");
        e.v(l10, str3, ", beneficiaryIcon=", str4, ", detail=");
        return d.o(l10, str5, ")");
    }
}
