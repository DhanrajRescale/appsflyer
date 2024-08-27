package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/data/model/LinkedInProfileModel;", "Landroid/os/Parcelable;", "firstName", "Lcom/assetgro/stockgro/data/model/StName;", "lastName", "id", HttpUrl.FRAGMENT_ENCODE_SET, "profilePicture", "Lcom/assetgro/stockgro/data/model/ProfilePicture;", "(Lcom/assetgro/stockgro/data/model/StName;Lcom/assetgro/stockgro/data/model/StName;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ProfilePicture;)V", "getFirstName", "()Lcom/assetgro/stockgro/data/model/StName;", "getId", "()Ljava/lang/String;", "getLastName", "getProfilePicture", "()Lcom/assetgro/stockgro/data/model/ProfilePicture;", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LinkedInProfileModel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<LinkedInProfileModel> CREATOR = new Creator();

    @SerializedName("firstName")
    @NotNull
    private final StName firstName;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("lastName")
    @NotNull
    private final StName lastName;

    @SerializedName("profilePicture")
    @NotNull
    private final ProfilePicture profilePicture;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<LinkedInProfileModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkedInProfileModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<StName> creator = StName.CREATOR;
            return new LinkedInProfileModel(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), ProfilePicture.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkedInProfileModel[] newArray(int i10) {
            return new LinkedInProfileModel[i10];
        }
    }

    public LinkedInProfileModel(@NotNull StName firstName, @NotNull StName lastName, @NotNull String id2, @NotNull ProfilePicture profilePicture) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(profilePicture, "profilePicture");
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id2;
        this.profilePicture = profilePicture;
    }

    public static /* synthetic */ LinkedInProfileModel copy$default(LinkedInProfileModel linkedInProfileModel, StName stName, StName stName2, String str, ProfilePicture profilePicture, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stName = linkedInProfileModel.firstName;
        }
        if ((i10 & 2) != 0) {
            stName2 = linkedInProfileModel.lastName;
        }
        if ((i10 & 4) != 0) {
            str = linkedInProfileModel.id;
        }
        if ((i10 & 8) != 0) {
            profilePicture = linkedInProfileModel.profilePicture;
        }
        return linkedInProfileModel.copy(stName, stName2, str, profilePicture);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StName getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StName getLastName() {
        return this.lastName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProfilePicture getProfilePicture() {
        return this.profilePicture;
    }

    @NotNull
    public final LinkedInProfileModel copy(@NotNull StName firstName, @NotNull StName lastName, @NotNull String id2, @NotNull ProfilePicture profilePicture) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(profilePicture, "profilePicture");
        return new LinkedInProfileModel(firstName, lastName, id2, profilePicture);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkedInProfileModel)) {
            return false;
        }
        LinkedInProfileModel linkedInProfileModel = (LinkedInProfileModel) other;
        return Intrinsics.a(this.firstName, linkedInProfileModel.firstName) && Intrinsics.a(this.lastName, linkedInProfileModel.lastName) && Intrinsics.a(this.id, linkedInProfileModel.id) && Intrinsics.a(this.profilePicture, linkedInProfileModel.profilePicture);
    }

    @NotNull
    public final StName getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final StName getLastName() {
        return this.lastName;
    }

    @NotNull
    public final ProfilePicture getProfilePicture() {
        return this.profilePicture;
    }

    public int hashCode() {
        return this.profilePicture.hashCode() + h.g(this.id, (this.lastName.hashCode() + (this.firstName.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "LinkedInProfileModel(firstName=" + this.firstName + ", lastName=" + this.lastName + ", id=" + this.id + ", profilePicture=" + this.profilePicture + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.firstName.writeToParcel(parcel, flags);
        this.lastName.writeToParcel(parcel, flags);
        parcel.writeString(this.id);
        this.profilePicture.writeToParcel(parcel, flags);
    }
}
