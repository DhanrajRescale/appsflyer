package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupInfoActions;", "Landroid/os/Parcelable;", "messageUser", HttpUrl.FRAGMENT_ENCODE_SET, "dismiss", "remove", "activate", "deactivate", "block", "report", "flag", "ban", "unban", "makeSeeder", "makeAdmin", "makeModerator", "(ZZZZZZZZZZZZZ)V", "getActivate", "()Z", "getBan", "getBlock", "getDeactivate", "getDismiss", "getFlag", "getMakeAdmin", "getMakeModerator", "getMakeSeeder", "getMessageUser", "getRemove", "getReport", "getUnban", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupInfoActions implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<GroupInfoActions> CREATOR = new Creator();

    @SerializedName("activate")
    private final boolean activate;

    @SerializedName("ban")
    private final boolean ban;

    @SerializedName("block")
    private final boolean block;

    @SerializedName("deactivate")
    private final boolean deactivate;

    @SerializedName("dismiss")
    private final boolean dismiss;

    @SerializedName("flag")
    private final boolean flag;

    @SerializedName("make_admin")
    private final boolean makeAdmin;

    @SerializedName("make_moderator")
    private final boolean makeModerator;

    @SerializedName("make_seeder")
    private final boolean makeSeeder;

    @SerializedName("message_user")
    private final boolean messageUser;

    @SerializedName("remove")
    private final boolean remove;

    @SerializedName("report")
    private final boolean report;

    @SerializedName("unban")
    private final boolean unban;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<GroupInfoActions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupInfoActions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupInfoActions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupInfoActions[] newArray(int i10) {
            return new GroupInfoActions[i10];
        }
    }

    public GroupInfoActions() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, 8191, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getActivate() {
        return this.activate;
    }

    public final boolean getBan() {
        return this.ban;
    }

    public final boolean getBlock() {
        return this.block;
    }

    public final boolean getDeactivate() {
        return this.deactivate;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final boolean getFlag() {
        return this.flag;
    }

    public final boolean getMakeAdmin() {
        return this.makeAdmin;
    }

    public final boolean getMakeModerator() {
        return this.makeModerator;
    }

    public final boolean getMakeSeeder() {
        return this.makeSeeder;
    }

    public final boolean getMessageUser() {
        return this.messageUser;
    }

    public final boolean getRemove() {
        return this.remove;
    }

    public final boolean getReport() {
        return this.report;
    }

    public final boolean getUnban() {
        return this.unban;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.messageUser ? 1 : 0);
        parcel.writeInt(this.dismiss ? 1 : 0);
        parcel.writeInt(this.remove ? 1 : 0);
        parcel.writeInt(this.activate ? 1 : 0);
        parcel.writeInt(this.deactivate ? 1 : 0);
        parcel.writeInt(this.block ? 1 : 0);
        parcel.writeInt(this.report ? 1 : 0);
        parcel.writeInt(this.flag ? 1 : 0);
        parcel.writeInt(this.ban ? 1 : 0);
        parcel.writeInt(this.unban ? 1 : 0);
        parcel.writeInt(this.makeSeeder ? 1 : 0);
        parcel.writeInt(this.makeAdmin ? 1 : 0);
        parcel.writeInt(this.makeModerator ? 1 : 0);
    }

    public GroupInfoActions(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22) {
        this.messageUser = z10;
        this.dismiss = z11;
        this.remove = z12;
        this.activate = z13;
        this.deactivate = z14;
        this.block = z15;
        this.report = z16;
        this.flag = z17;
        this.ban = z18;
        this.unban = z19;
        this.makeSeeder = z20;
        this.makeAdmin = z21;
        this.makeModerator = z22;
    }

    public /* synthetic */ GroupInfoActions(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & 128) != 0 ? false : z17, (i10 & 256) != 0 ? false : z18, (i10 & 512) != 0 ? false : z19, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z20, (i10 & 2048) != 0 ? false : z21, (i10 & 4096) == 0 ? z22 : false);
    }
}
