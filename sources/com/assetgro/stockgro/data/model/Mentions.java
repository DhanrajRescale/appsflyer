package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/Mentions;", "Landroid/os/Parcelable;", "portfolioIds", "Ljava/util/ArrayList;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/ArrayList;", "userIds", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getPortfolioIds", "()Ljava/util/ArrayList;", "setPortfolioIds", "(Ljava/util/ArrayList;)V", "getUserIds", "setUserIds", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Mentions implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Mentions> CREATOR = new Creator();

    @SerializedName("portfolio_ids")
    @NotNull
    private ArrayList<String> portfolioIds;

    @SerializedName("user_ids")
    @NotNull
    private ArrayList<String> userIds;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Mentions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Mentions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Mentions(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Mentions[] newArray(int i10) {
            return new Mentions[i10];
        }
    }

    public Mentions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final ArrayList<String> getPortfolioIds() {
        return this.portfolioIds;
    }

    @NotNull
    public final ArrayList<String> getUserIds() {
        return this.userIds;
    }

    public final void setPortfolioIds(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.portfolioIds = arrayList;
    }

    public final void setUserIds(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.userIds = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.portfolioIds);
        parcel.writeStringList(this.userIds);
    }

    public Mentions(@NotNull ArrayList<String> portfolioIds, @NotNull ArrayList<String> userIds) {
        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.portfolioIds = portfolioIds;
        this.userIds = userIds;
    }

    public /* synthetic */ Mentions(ArrayList arrayList, ArrayList arrayList2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : arrayList, (i10 & 2) != 0 ? new ArrayList() : arrayList2);
    }
}
