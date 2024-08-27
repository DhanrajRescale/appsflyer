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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/model/MessageListDto;", "Landroid/os/Parcelable;", "messages", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/ChatMessage;", "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Z)V", "getEndOfResponse", "()Z", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MessageListDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MessageListDto> CREATOR = new Creator();

    @SerializedName("end_of_response")
    private final boolean endOfResponse;

    @SerializedName("messages")
    private final List<ChatMessage> messages;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MessageListDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageListDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(ChatMessage.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MessageListDto(arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageListDto[] newArray(int i10) {
            return new MessageListDto[i10];
        }
    }

    public MessageListDto(List<ChatMessage> list, boolean z10) {
        this.messages = list;
        this.endOfResponse = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageListDto copy$default(MessageListDto messageListDto, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = messageListDto.messages;
        }
        if ((i10 & 2) != 0) {
            z10 = messageListDto.endOfResponse;
        }
        return messageListDto.copy(list, z10);
    }

    public final List<ChatMessage> component1() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    @NotNull
    public final MessageListDto copy(List<ChatMessage> messages, boolean endOfResponse) {
        return new MessageListDto(messages, endOfResponse);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListDto)) {
            return false;
        }
        MessageListDto messageListDto = (MessageListDto) other;
        return Intrinsics.a(this.messages, messageListDto.messages) && this.endOfResponse == messageListDto.endOfResponse;
    }

    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        List<ChatMessage> list = this.messages;
        return Boolean.hashCode(this.endOfResponse) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "MessageListDto(messages=" + this.messages + ", endOfResponse=" + this.endOfResponse + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<ChatMessage> list = this.messages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((ChatMessage) o10.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.endOfResponse ? 1 : 0);
    }

    public /* synthetic */ MessageListDto(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
