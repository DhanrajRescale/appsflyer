package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/LeagueEligibiltyResponseDto;", "Landroid/os/Parcelable;", "userEligible", HttpUrl.FRAGMENT_ENCODE_SET, "filterReason", HttpUrl.FRAGMENT_ENCODE_SET, "redirectPage", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFilterReason", "()Ljava/lang/String;", "getRedirectPage", "getUserEligible", "()Z", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LeagueEligibiltyResponseDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<LeagueEligibiltyResponseDto> CREATOR = new Creator();

    @SerializedName("filter_reason")
    @NotNull
    private final String filterReason;

    @SerializedName("redirect_page")
    @NotNull
    private final String redirectPage;

    @SerializedName("user_eligible")
    private final boolean userEligible;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<LeagueEligibiltyResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LeagueEligibiltyResponseDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeagueEligibiltyResponseDto(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LeagueEligibiltyResponseDto[] newArray(int i10) {
            return new LeagueEligibiltyResponseDto[i10];
        }
    }

    public LeagueEligibiltyResponseDto(boolean z10, @NotNull String filterReason, @NotNull String redirectPage) {
        Intrinsics.checkNotNullParameter(filterReason, "filterReason");
        Intrinsics.checkNotNullParameter(redirectPage, "redirectPage");
        this.userEligible = z10;
        this.filterReason = filterReason;
        this.redirectPage = redirectPage;
    }

    public static /* synthetic */ LeagueEligibiltyResponseDto copy$default(LeagueEligibiltyResponseDto leagueEligibiltyResponseDto, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = leagueEligibiltyResponseDto.userEligible;
        }
        if ((i10 & 2) != 0) {
            str = leagueEligibiltyResponseDto.filterReason;
        }
        if ((i10 & 4) != 0) {
            str2 = leagueEligibiltyResponseDto.redirectPage;
        }
        return leagueEligibiltyResponseDto.copy(z10, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUserEligible() {
        return this.userEligible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFilterReason() {
        return this.filterReason;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRedirectPage() {
        return this.redirectPage;
    }

    @NotNull
    public final LeagueEligibiltyResponseDto copy(boolean userEligible, @NotNull String filterReason, @NotNull String redirectPage) {
        Intrinsics.checkNotNullParameter(filterReason, "filterReason");
        Intrinsics.checkNotNullParameter(redirectPage, "redirectPage");
        return new LeagueEligibiltyResponseDto(userEligible, filterReason, redirectPage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueEligibiltyResponseDto)) {
            return false;
        }
        LeagueEligibiltyResponseDto leagueEligibiltyResponseDto = (LeagueEligibiltyResponseDto) other;
        return this.userEligible == leagueEligibiltyResponseDto.userEligible && Intrinsics.a(this.filterReason, leagueEligibiltyResponseDto.filterReason) && Intrinsics.a(this.redirectPage, leagueEligibiltyResponseDto.redirectPage);
    }

    @NotNull
    public final String getFilterReason() {
        return this.filterReason;
    }

    @NotNull
    public final String getRedirectPage() {
        return this.redirectPage;
    }

    public final boolean getUserEligible() {
        return this.userEligible;
    }

    public int hashCode() {
        return this.redirectPage.hashCode() + h.g(this.filterReason, Boolean.hashCode(this.userEligible) * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.userEligible;
        String str = this.filterReason;
        String str2 = this.redirectPage;
        StringBuilder sb2 = new StringBuilder("LeagueEligibiltyResponseDto(userEligible=");
        sb2.append(z10);
        sb2.append(", filterReason=");
        sb2.append(str);
        sb2.append(", redirectPage=");
        return d.o(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.userEligible ? 1 : 0);
        parcel.writeString(this.filterReason);
        parcel.writeString(this.redirectPage);
    }
}
