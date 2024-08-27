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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserChatGroupsResponse;", "Landroid/os/Parcelable;", "memberGroups", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UserChatGroup;", "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "totalInvite", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getEndOfResponse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMemberGroups", "()Ljava/util/List;", "getTotalInvite", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserChatGroupsResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserChatGroupsResponse> CREATOR = new Creator();

    @SerializedName("end_of_response")
    private final Boolean endOfResponse;

    @SerializedName("members")
    private final List<UserChatGroup> memberGroups;

    @SerializedName("total_invite")
    private final Integer totalInvite;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserChatGroupsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserChatGroupsResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(UserChatGroup.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserChatGroupsResponse(arrayList, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserChatGroupsResponse[] newArray(int i10) {
            return new UserChatGroupsResponse[i10];
        }
    }

    public UserChatGroupsResponse(List<UserChatGroup> list, Boolean bool, Integer num) {
        this.memberGroups = list;
        this.endOfResponse = bool;
        this.totalInvite = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    public final List<UserChatGroup> getMemberGroups() {
        return this.memberGroups;
    }

    public final Integer getTotalInvite() {
        return this.totalInvite;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UserChatGroup> list = this.memberGroups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((UserChatGroup) o10.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.endOfResponse;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        Integer num = this.totalInvite;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
