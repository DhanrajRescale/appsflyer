package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SearchGroupsData;", "Landroid/os/Parcelable;", "groups", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/SearchGroupsItem;", "moreGroupsPresent", HttpUrl.FRAGMENT_ENCODE_SET, "totalGroupCount", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;ZI)V", "getGroups", "()Ljava/util/List;", "getMoreGroupsPresent", "()Z", "getTotalGroupCount", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchGroupsData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SearchGroupsData> CREATOR = new Creator();

    @SerializedName("groups")
    @NotNull
    private final List<SearchGroupsItem> groups;

    @SerializedName("more_groups_present")
    private final boolean moreGroupsPresent;

    @SerializedName("total_groups_count")
    private final int totalGroupCount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SearchGroupsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchGroupsData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(SearchGroupsItem.CREATOR, parcel, arrayList, i10, 1);
            }
            return new SearchGroupsData(arrayList, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchGroupsData[] newArray(int i10) {
            return new SearchGroupsData[i10];
        }
    }

    public SearchGroupsData(@NotNull List<SearchGroupsItem> groups, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
        this.moreGroupsPresent = z10;
        this.totalGroupCount = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchGroupsData copy$default(SearchGroupsData searchGroupsData, List list, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchGroupsData.groups;
        }
        if ((i11 & 2) != 0) {
            z10 = searchGroupsData.moreGroupsPresent;
        }
        if ((i11 & 4) != 0) {
            i10 = searchGroupsData.totalGroupCount;
        }
        return searchGroupsData.copy(list, z10, i10);
    }

    @NotNull
    public final List<SearchGroupsItem> component1() {
        return this.groups;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMoreGroupsPresent() {
        return this.moreGroupsPresent;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalGroupCount() {
        return this.totalGroupCount;
    }

    @NotNull
    public final SearchGroupsData copy(@NotNull List<SearchGroupsItem> groups, boolean moreGroupsPresent, int totalGroupCount) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new SearchGroupsData(groups, moreGroupsPresent, totalGroupCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchGroupsData)) {
            return false;
        }
        SearchGroupsData searchGroupsData = (SearchGroupsData) other;
        return Intrinsics.a(this.groups, searchGroupsData.groups) && this.moreGroupsPresent == searchGroupsData.moreGroupsPresent && this.totalGroupCount == searchGroupsData.totalGroupCount;
    }

    @NotNull
    public final List<SearchGroupsItem> getGroups() {
        return this.groups;
    }

    public final boolean getMoreGroupsPresent() {
        return this.moreGroupsPresent;
    }

    public final int getTotalGroupCount() {
        return this.totalGroupCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalGroupCount) + e.d(this.moreGroupsPresent, this.groups.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<SearchGroupsItem> list = this.groups;
        boolean z10 = this.moreGroupsPresent;
        int i10 = this.totalGroupCount;
        StringBuilder sb2 = new StringBuilder("SearchGroupsData(groups=");
        sb2.append(list);
        sb2.append(", moreGroupsPresent=");
        sb2.append(z10);
        sb2.append(", totalGroupCount=");
        return d.m(sb2, i10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.groups, parcel);
        while (p10.hasNext()) {
            ((SearchGroupsItem) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.moreGroupsPresent ? 1 : 0);
        parcel.writeInt(this.totalGroupCount);
    }

    public /* synthetic */ SearchGroupsData(List list, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z10, i10);
    }
}
