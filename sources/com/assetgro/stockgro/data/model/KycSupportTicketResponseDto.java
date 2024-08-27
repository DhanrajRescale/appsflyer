package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/KycSupportTicketResponseDto;", "Landroid/os/Parcelable;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "success", HttpUrl.FRAGMENT_ENCODE_SET, "isAllowed", "requestId", "userEmail", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "getRequestId", "getSuccess", "()Z", "getUserEmail", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KycSupportTicketResponseDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<KycSupportTicketResponseDto> CREATOR = new Creator();

    @SerializedName("is_allowed")
    private final Boolean isAllowed;

    @SerializedName("message")
    private final String message;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("success")
    private final boolean success;

    @SerializedName("user_email")
    @NotNull
    private final String userEmail;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<KycSupportTicketResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycSupportTicketResponseDto createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new KycSupportTicketResponseDto(readString, z10, valueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycSupportTicketResponseDto[] newArray(int i10) {
            return new KycSupportTicketResponseDto[i10];
        }
    }

    public KycSupportTicketResponseDto(String str, boolean z10, Boolean bool, String str2, @NotNull String userEmail) {
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        this.message = str;
        this.success = z10;
        this.isAllowed = bool;
        this.requestId = str2;
        this.userEmail = userEmail;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: isAllowed, reason: from getter */
    public final Boolean getIsAllowed() {
        return this.isAllowed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.message);
        parcel.writeInt(this.success ? 1 : 0);
        Boolean bool = this.isAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        parcel.writeString(this.requestId);
        parcel.writeString(this.userEmail);
    }
}
