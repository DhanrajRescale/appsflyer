package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "Landroid/os/Parcelable;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "inviteTemplate", "referralCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInviteTemplate", "()Ljava/lang/String;", "getReferralCode", "getUrl", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InviteTemplateResponse implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InviteTemplateResponse> CREATOR = new Creator();

    @SerializedName("template_body")
    private final String inviteTemplate;

    @SerializedName("referral_code")
    private final String referralCode;

    @SerializedName("redirect_url")
    private final String url;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<InviteTemplateResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InviteTemplateResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteTemplateResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InviteTemplateResponse[] newArray(int i10) {
            return new InviteTemplateResponse[i10];
        }
    }

    public InviteTemplateResponse(String str, String str2, String str3) {
        this.url = str;
        this.inviteTemplate = str2;
        this.referralCode = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getInviteTemplate() {
        return this.inviteTemplate;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.inviteTemplate);
        parcel.writeString(this.referralCode);
    }
}
