package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/model/ChatChannel;", "Landroid/os/Parcelable;", "group", "Lcom/assetgro/stockgro/data/model/UserChatGroup;", "check", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/data/model/UserChatGroup;Z)V", "getCheck", "()Z", "setCheck", "(Z)V", "getGroup", "()Lcom/assetgro/stockgro/data/model/UserChatGroup;", "setGroup", "(Lcom/assetgro/stockgro/data/model/UserChatGroup;)V", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatChannel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ChatChannel> CREATOR = new Creator();
    private boolean check;

    @NotNull
    private UserChatGroup group;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ChatChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatChannel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatChannel(UserChatGroup.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatChannel[] newArray(int i10) {
            return new ChatChannel[i10];
        }
    }

    public ChatChannel(@NotNull UserChatGroup group, boolean z10) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.group = group;
        this.check = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getCheck() {
        return this.check;
    }

    @NotNull
    public final UserChatGroup getGroup() {
        return this.group;
    }

    public final void setCheck(boolean z10) {
        this.check = z10;
    }

    public final void setGroup(@NotNull UserChatGroup userChatGroup) {
        Intrinsics.checkNotNullParameter(userChatGroup, "<set-?>");
        this.group = userChatGroup;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.group.writeToParcel(parcel, flags);
        parcel.writeInt(this.check ? 1 : 0);
    }

    public /* synthetic */ ChatChannel(UserChatGroup userChatGroup, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(userChatGroup, (i10 & 2) != 0 ? false : z10);
    }
}
