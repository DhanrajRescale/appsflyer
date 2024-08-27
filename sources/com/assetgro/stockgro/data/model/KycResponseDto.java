package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u008c\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\n\u0010\u0013R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\f\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u00065"}, d2 = {"Lcom/assetgro/stockgro/data/model/KycResponseDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "referenceId", "captureLink", "profileId", "status", "submittedOn", "kycUsageMessage", "isKycAllowed", HttpUrl.FRAGMENT_ENCODE_SET, "isKycInMaintenance", "messages", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/KycMessage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getCaptureLink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKycUsageMessage", "getMessages", "()Ljava/util/List;", "getProfileId", "getReferenceId", "getStatus", "getSubmittedOn", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/assetgro/stockgro/data/model/KycResponseDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class KycResponseDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<KycResponseDto> CREATOR = new Creator();

    @SerializedName("capture_link")
    private final String captureLink;

    @SerializedName("is_kyc_allowed")
    private final Boolean isKycAllowed;

    @SerializedName("is_kyc_in_maintenance")
    private final Boolean isKycInMaintenance;

    @SerializedName("kyc_usage_message")
    private final String kycUsageMessage;

    @SerializedName("messages")
    private final List<KycMessage> messages;

    @SerializedName("profile_id")
    private final String profileId;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName("status")
    private final String status;

    @SerializedName("submitted_on")
    private final String submittedOn;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<KycResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycResponseDto createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int i10 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i10 != readInt) {
                    i10 = h.e(KycMessage.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new KycResponseDto(readString, readString2, readString3, readString4, readString5, readString6, readString7, valueOf, valueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycResponseDto[] newArray(int i10) {
            return new KycResponseDto[i10];
        }
    }

    public KycResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, List<KycMessage> list) {
        this.userId = str;
        this.referenceId = str2;
        this.captureLink = str3;
        this.profileId = str4;
        this.status = str5;
        this.submittedOn = str6;
        this.kycUsageMessage = str7;
        this.isKycAllowed = bool;
        this.isKycInMaintenance = bool2;
        this.messages = list;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final List<KycMessage> component10() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaptureLink() {
        return this.captureLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubmittedOn() {
        return this.submittedOn;
    }

    /* renamed from: component7, reason: from getter */
    public final String getKycUsageMessage() {
        return this.kycUsageMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsKycAllowed() {
        return this.isKycAllowed;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsKycInMaintenance() {
        return this.isKycInMaintenance;
    }

    @NotNull
    public final KycResponseDto copy(String userId, String referenceId, String captureLink, String profileId, String status, String submittedOn, String kycUsageMessage, Boolean isKycAllowed, Boolean isKycInMaintenance, List<KycMessage> messages) {
        return new KycResponseDto(userId, referenceId, captureLink, profileId, status, submittedOn, kycUsageMessage, isKycAllowed, isKycInMaintenance, messages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycResponseDto)) {
            return false;
        }
        KycResponseDto kycResponseDto = (KycResponseDto) other;
        return Intrinsics.a(this.userId, kycResponseDto.userId) && Intrinsics.a(this.referenceId, kycResponseDto.referenceId) && Intrinsics.a(this.captureLink, kycResponseDto.captureLink) && Intrinsics.a(this.profileId, kycResponseDto.profileId) && Intrinsics.a(this.status, kycResponseDto.status) && Intrinsics.a(this.submittedOn, kycResponseDto.submittedOn) && Intrinsics.a(this.kycUsageMessage, kycResponseDto.kycUsageMessage) && Intrinsics.a(this.isKycAllowed, kycResponseDto.isKycAllowed) && Intrinsics.a(this.isKycInMaintenance, kycResponseDto.isKycInMaintenance) && Intrinsics.a(this.messages, kycResponseDto.messages);
    }

    public final String getCaptureLink() {
        return this.captureLink;
    }

    public final String getKycUsageMessage() {
        return this.kycUsageMessage;
    }

    public final List<KycMessage> getMessages() {
        return this.messages;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubmittedOn() {
        return this.submittedOn;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.referenceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.captureLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.submittedOn;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kycUsageMessage;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isKycAllowed;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isKycInMaintenance;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<KycMessage> list = this.messages;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isKycAllowed() {
        return this.isKycAllowed;
    }

    public final Boolean isKycInMaintenance() {
        return this.isKycInMaintenance;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.referenceId;
        String str3 = this.captureLink;
        String str4 = this.profileId;
        String str5 = this.status;
        String str6 = this.submittedOn;
        String str7 = this.kycUsageMessage;
        Boolean bool = this.isKycAllowed;
        Boolean bool2 = this.isKycInMaintenance;
        List<KycMessage> list = this.messages;
        StringBuilder l10 = e.l("KycResponseDto(userId=", str, ", referenceId=", str2, ", captureLink=");
        e.v(l10, str3, ", profileId=", str4, ", status=");
        e.v(l10, str5, ", submittedOn=", str6, ", kycUsageMessage=");
        l10.append(str7);
        l10.append(", isKycAllowed=");
        l10.append(bool);
        l10.append(", isKycInMaintenance=");
        l10.append(bool2);
        l10.append(", messages=");
        l10.append(list);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.referenceId);
        parcel.writeString(this.captureLink);
        parcel.writeString(this.profileId);
        parcel.writeString(this.status);
        parcel.writeString(this.submittedOn);
        parcel.writeString(this.kycUsageMessage);
        Boolean bool = this.isKycAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        Boolean bool2 = this.isKycInMaintenance;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool2);
        }
        List<KycMessage> list = this.messages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((KycMessage) o10.next()).writeToParcel(parcel, flags);
        }
    }
}
