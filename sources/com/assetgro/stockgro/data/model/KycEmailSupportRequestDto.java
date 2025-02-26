package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/model/KycEmailSupportRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", HttpUrl.FRAGMENT_ENCODE_SET, "ticketData", "Lcom/assetgro/stockgro/data/model/TicketData;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/TicketData;)V", "getPhoneNumber", "()Ljava/lang/String;", "getTicketData", "()Lcom/assetgro/stockgro/data/model/TicketData;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class KycEmailSupportRequestDto {
    public static final int $stable = 8;

    @SerializedName("phone_number")
    private final String phoneNumber;

    @SerializedName("ticket_content")
    private final TicketData ticketData;

    public KycEmailSupportRequestDto(String str, TicketData ticketData) {
        this.phoneNumber = str;
        this.ticketData = ticketData;
    }

    public static /* synthetic */ KycEmailSupportRequestDto copy$default(KycEmailSupportRequestDto kycEmailSupportRequestDto, String str, TicketData ticketData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = kycEmailSupportRequestDto.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            ticketData = kycEmailSupportRequestDto.ticketData;
        }
        return kycEmailSupportRequestDto.copy(str, ticketData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final TicketData getTicketData() {
        return this.ticketData;
    }

    @NotNull
    public final KycEmailSupportRequestDto copy(String phoneNumber, TicketData ticketData) {
        return new KycEmailSupportRequestDto(phoneNumber, ticketData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycEmailSupportRequestDto)) {
            return false;
        }
        KycEmailSupportRequestDto kycEmailSupportRequestDto = (KycEmailSupportRequestDto) other;
        return Intrinsics.a(this.phoneNumber, kycEmailSupportRequestDto.phoneNumber) && Intrinsics.a(this.ticketData, kycEmailSupportRequestDto.ticketData);
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final TicketData getTicketData() {
        return this.ticketData;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TicketData ticketData = this.ticketData;
        return hashCode + (ticketData != null ? ticketData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycEmailSupportRequestDto(phoneNumber=" + this.phoneNumber + ", ticketData=" + this.ticketData + ")";
    }
}
