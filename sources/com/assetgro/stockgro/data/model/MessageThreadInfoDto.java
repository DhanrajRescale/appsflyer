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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/model/MessageThreadInfoDto;", "Landroid/os/Parcelable;", "parentMessage", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "replies", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/data/model/ChatMessage;Ljava/util/List;)V", "getParentMessage", "()Lcom/assetgro/stockgro/data/model/ChatMessage;", "getReplies", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MessageThreadInfoDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MessageThreadInfoDto> CREATOR = new Creator();

    @SerializedName("parent")
    private final ChatMessage parentMessage;

    @SerializedName("replies")
    private final List<ChatMessage> replies;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MessageThreadInfoDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageThreadInfoDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            ChatMessage createFromParcel = parcel.readInt() == 0 ? null : ChatMessage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(ChatMessage.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MessageThreadInfoDto(createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageThreadInfoDto[] newArray(int i10) {
            return new MessageThreadInfoDto[i10];
        }
    }

    public MessageThreadInfoDto(ChatMessage chatMessage, List<ChatMessage> list) {
        this.parentMessage = chatMessage;
        this.replies = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageThreadInfoDto copy$default(MessageThreadInfoDto messageThreadInfoDto, ChatMessage chatMessage, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            chatMessage = messageThreadInfoDto.parentMessage;
        }
        if ((i10 & 2) != 0) {
            list = messageThreadInfoDto.replies;
        }
        return messageThreadInfoDto.copy(chatMessage, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ChatMessage getParentMessage() {
        return this.parentMessage;
    }

    public final List<ChatMessage> component2() {
        return this.replies;
    }

    @NotNull
    public final MessageThreadInfoDto copy(ChatMessage parentMessage, List<ChatMessage> replies) {
        return new MessageThreadInfoDto(parentMessage, replies);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageThreadInfoDto)) {
            return false;
        }
        MessageThreadInfoDto messageThreadInfoDto = (MessageThreadInfoDto) other;
        return Intrinsics.a(this.parentMessage, messageThreadInfoDto.parentMessage) && Intrinsics.a(this.replies, messageThreadInfoDto.replies);
    }

    public final ChatMessage getParentMessage() {
        return this.parentMessage;
    }

    public final List<ChatMessage> getReplies() {
        return this.replies;
    }

    public int hashCode() {
        ChatMessage chatMessage = this.parentMessage;
        int hashCode = (chatMessage == null ? 0 : chatMessage.hashCode()) * 31;
        List<ChatMessage> list = this.replies;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageThreadInfoDto(parentMessage=" + this.parentMessage + ", replies=" + this.replies + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ChatMessage chatMessage = this.parentMessage;
        if (chatMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessage.writeToParcel(parcel, flags);
        }
        List<ChatMessage> list = this.replies;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((ChatMessage) o10.next()).writeToParcel(parcel, flags);
        }
    }
}
