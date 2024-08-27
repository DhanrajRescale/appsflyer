package com.assetgro.stockgro.ui.social.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import java.util.ArrayList;
import java.util.Iterator;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/ChatMetaData;", "Landroid/os/Parcelable;", "messages", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "Lkotlin/collections/ArrayList;", "draftMessage", HttpUrl.FRAGMENT_ENCODE_SET, "groupInfo", "Lcom/assetgro/stockgro/data/model/Group;", "(Ljava/util/ArrayList;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/Group;)V", "getDraftMessage", "()Ljava/lang/String;", "getGroupInfo", "()Lcom/assetgro/stockgro/data/model/Group;", "getMessages", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChatMetaData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ChatMetaData> CREATOR = new Creator();
    private final String draftMessage;
    private final Group groupInfo;
    private final ArrayList<ChatMessage> messages;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ChatMetaData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatMetaData createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(ChatMessage.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new ChatMetaData(arrayList, parcel.readString(), parcel.readInt() != 0 ? Group.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatMetaData[] newArray(int i10) {
            return new ChatMetaData[i10];
        }
    }

    public ChatMetaData(ArrayList<ChatMessage> arrayList, String str, Group group) {
        this.messages = arrayList;
        this.draftMessage = str;
        this.groupInfo = group;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatMetaData copy$default(ChatMetaData chatMetaData, ArrayList arrayList, String str, Group group, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = chatMetaData.messages;
        }
        if ((i10 & 2) != 0) {
            str = chatMetaData.draftMessage;
        }
        if ((i10 & 4) != 0) {
            group = chatMetaData.groupInfo;
        }
        return chatMetaData.copy(arrayList, str, group);
    }

    public final ArrayList<ChatMessage> component1() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDraftMessage() {
        return this.draftMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final Group getGroupInfo() {
        return this.groupInfo;
    }

    @NotNull
    public final ChatMetaData copy(ArrayList<ChatMessage> messages, String draftMessage, Group groupInfo) {
        return new ChatMetaData(messages, draftMessage, groupInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMetaData)) {
            return false;
        }
        ChatMetaData chatMetaData = (ChatMetaData) other;
        return Intrinsics.a(this.messages, chatMetaData.messages) && Intrinsics.a(this.draftMessage, chatMetaData.draftMessage) && Intrinsics.a(this.groupInfo, chatMetaData.groupInfo);
    }

    public final String getDraftMessage() {
        return this.draftMessage;
    }

    public final Group getGroupInfo() {
        return this.groupInfo;
    }

    public final ArrayList<ChatMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        ArrayList<ChatMessage> arrayList = this.messages;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.draftMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Group group = this.groupInfo;
        return hashCode2 + (group != null ? group.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatMetaData(messages=" + this.messages + ", draftMessage=" + this.draftMessage + ", groupInfo=" + this.groupInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<ChatMessage> arrayList = this.messages;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<ChatMessage> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.draftMessage);
        Group group = this.groupInfo;
        if (group == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            group.writeToParcel(parcel, flags);
        }
    }
}
