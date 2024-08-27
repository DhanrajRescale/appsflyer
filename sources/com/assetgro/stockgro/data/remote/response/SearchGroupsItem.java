package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.Tags;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SearchGroupsItem;", "Landroid/os/Parcelable;", "coverImage", HttpUrl.FRAGMENT_ENCODE_SET, "description", "displayImage", "groupId", "hasJoinedGroup", HttpUrl.FRAGMENT_ENCODE_SET, "groupName", "totalMembersCount", HttpUrl.FRAGMENT_ENCODE_SET, "tags", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/Tags;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/util/List;)V", "getCoverImage", "()Ljava/lang/String;", "getDescription", "getDisplayImage", "getGroupId", "getGroupName", "getHasJoinedGroup", "()Z", "setHasJoinedGroup", "(Z)V", "getTags", "()Ljava/util/List;", "getTotalMembersCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchGroupsItem implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SearchGroupsItem> CREATOR = new Creator();

    @SerializedName("cover_image")
    @NotNull
    private final String coverImage;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("display_image")
    @NotNull
    private final String displayImage;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String groupName;

    @SerializedName("has_joined_group")
    private boolean hasJoinedGroup;

    @SerializedName("tags")
    private final List<Tags> tags;

    @SerializedName("total_members_count")
    private final int totalMembersCount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SearchGroupsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchGroupsItem createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int i10 = 0;
            boolean z10 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (i10 != readInt2) {
                    i10 = h.e(Tags.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new SearchGroupsItem(readString, readString2, readString3, readString4, z10, readString5, readInt, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchGroupsItem[] newArray(int i10) {
            return new SearchGroupsItem[i10];
        }
    }

    public SearchGroupsItem(@NotNull String coverImage, @NotNull String description, @NotNull String displayImage, @NotNull String groupId, boolean z10, @NotNull String groupName, int i10, List<Tags> list) {
        Intrinsics.checkNotNullParameter(coverImage, "coverImage");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.coverImage = coverImage;
        this.description = description;
        this.displayImage = displayImage;
        this.groupId = groupId;
        this.hasJoinedGroup = z10;
        this.groupName = groupName;
        this.totalMembersCount = i10;
        this.tags = list;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCoverImage() {
        return this.coverImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasJoinedGroup() {
        return this.hasJoinedGroup;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotalMembersCount() {
        return this.totalMembersCount;
    }

    public final List<Tags> component8() {
        return this.tags;
    }

    @NotNull
    public final SearchGroupsItem copy(@NotNull String coverImage, @NotNull String description, @NotNull String displayImage, @NotNull String groupId, boolean hasJoinedGroup, @NotNull String groupName, int totalMembersCount, List<Tags> tags) {
        Intrinsics.checkNotNullParameter(coverImage, "coverImage");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        return new SearchGroupsItem(coverImage, description, displayImage, groupId, hasJoinedGroup, groupName, totalMembersCount, tags);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchGroupsItem)) {
            return false;
        }
        SearchGroupsItem searchGroupsItem = (SearchGroupsItem) other;
        return Intrinsics.a(this.coverImage, searchGroupsItem.coverImage) && Intrinsics.a(this.description, searchGroupsItem.description) && Intrinsics.a(this.displayImage, searchGroupsItem.displayImage) && Intrinsics.a(this.groupId, searchGroupsItem.groupId) && this.hasJoinedGroup == searchGroupsItem.hasJoinedGroup && Intrinsics.a(this.groupName, searchGroupsItem.groupName) && this.totalMembersCount == searchGroupsItem.totalMembersCount && Intrinsics.a(this.tags, searchGroupsItem.tags);
    }

    @NotNull
    public final String getCoverImage() {
        return this.coverImage;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    public final boolean getHasJoinedGroup() {
        return this.hasJoinedGroup;
    }

    public final List<Tags> getTags() {
        return this.tags;
    }

    public final int getTotalMembersCount() {
        return this.totalMembersCount;
    }

    public int hashCode() {
        int hashCode;
        int f10 = e.f(this.totalMembersCount, h.g(this.groupName, v.e.d(this.hasJoinedGroup, h.g(this.groupId, h.g(this.displayImage, h.g(this.description, this.coverImage.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        List<Tags> list = this.tags;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return f10 + hashCode;
    }

    public final void setHasJoinedGroup(boolean z10) {
        this.hasJoinedGroup = z10;
    }

    @NotNull
    public String toString() {
        String str = this.coverImage;
        String str2 = this.description;
        String str3 = this.displayImage;
        String str4 = this.groupId;
        boolean z10 = this.hasJoinedGroup;
        String str5 = this.groupName;
        int i10 = this.totalMembersCount;
        List<Tags> list = this.tags;
        StringBuilder l10 = v.e.l("SearchGroupsItem(coverImage=", str, ", description=", str2, ", displayImage=");
        v.e.v(l10, str3, ", groupId=", str4, ", hasJoinedGroup=");
        l10.append(z10);
        l10.append(", groupName=");
        l10.append(str5);
        l10.append(", totalMembersCount=");
        l10.append(i10);
        l10.append(", tags=");
        l10.append(list);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.coverImage);
        parcel.writeString(this.description);
        parcel.writeString(this.displayImage);
        parcel.writeString(this.groupId);
        parcel.writeInt(this.hasJoinedGroup ? 1 : 0);
        parcel.writeString(this.groupName);
        parcel.writeInt(this.totalMembersCount);
        List<Tags> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((Tags) o10.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SearchGroupsItem(String str, String str2, String str3, String str4, boolean z10, String str5, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z10, str5, i10, (i11 & 128) != 0 ? null : list);
    }
}
