package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/ThreadInfo;", "Landroid/os/Parcelable;", "latestMessage", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "noOfReplies", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/data/model/ChatMessage;I)V", "getLatestMessage", "()Lcom/assetgro/stockgro/data/model/ChatMessage;", "setLatestMessage", "(Lcom/assetgro/stockgro/data/model/ChatMessage;)V", "getNoOfReplies", "()I", "setNoOfReplies", "(I)V", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreadInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ThreadInfo> CREATOR = new Creator();

    @SerializedName("latest_msg")
    private ChatMessage latestMessage;

    @SerializedName("num_replies")
    private int noOfReplies;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ThreadInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ThreadInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThreadInfo(parcel.readInt() == 0 ? null : ChatMessage.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ThreadInfo[] newArray(int i10) {
            return new ThreadInfo[i10];
        }
    }

    public ThreadInfo(ChatMessage chatMessage, int i10) {
        this.latestMessage = chatMessage;
        this.noOfReplies = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ChatMessage getLatestMessage() {
        return this.latestMessage;
    }

    public final int getNoOfReplies() {
        return this.noOfReplies;
    }

    public final void setLatestMessage(ChatMessage chatMessage) {
        this.latestMessage = chatMessage;
    }

    public final void setNoOfReplies(int i10) {
        this.noOfReplies = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ChatMessage chatMessage = this.latestMessage;
        if (chatMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessage.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.noOfReplies);
    }

    public /* synthetic */ ThreadInfo(ChatMessage chatMessage, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatMessage, (i11 & 2) != 0 ? 0 : i10);
    }
}
