package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J0\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/CardInteraction;", "Landroid/os/Parcelable;", "totalLikes", HttpUrl.FRAGMENT_ENCODE_SET, "cardId", HttpUrl.FRAGMENT_ENCODE_SET, "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Integer;Ljava/lang/String;Z)V", "getCardId", "()Ljava/lang/String;", "setCardId", "(Ljava/lang/String;)V", "()Z", "setLiked", "(Z)V", "getTotalLikes", "()Ljava/lang/Integer;", "setTotalLikes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/assetgro/stockgro/data/model/CardInteraction;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CardInteraction implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CardInteraction> CREATOR = new Creator();

    @SerializedName("card_id")
    private String cardId;

    @SerializedName("is_liked")
    private boolean isLiked;

    @SerializedName("total_likes")
    private Integer totalLikes;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CardInteraction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardInteraction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardInteraction(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardInteraction[] newArray(int i10) {
            return new CardInteraction[i10];
        }
    }

    public CardInteraction(Integer num, String str, boolean z10) {
        this.totalLikes = num;
        this.cardId = str;
        this.isLiked = z10;
    }

    public static /* synthetic */ CardInteraction copy$default(CardInteraction cardInteraction, Integer num, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = cardInteraction.totalLikes;
        }
        if ((i10 & 2) != 0) {
            str = cardInteraction.cardId;
        }
        if ((i10 & 4) != 0) {
            z10 = cardInteraction.isLiked;
        }
        return cardInteraction.copy(num, str, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTotalLikes() {
        return this.totalLikes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    @NotNull
    public final CardInteraction copy(Integer totalLikes, String cardId, boolean isLiked) {
        return new CardInteraction(totalLikes, cardId, isLiked);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInteraction)) {
            return false;
        }
        CardInteraction cardInteraction = (CardInteraction) other;
        return Intrinsics.a(this.totalLikes, cardInteraction.totalLikes) && Intrinsics.a(this.cardId, cardInteraction.cardId) && this.isLiked == cardInteraction.isLiked;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final Integer getTotalLikes() {
        return this.totalLikes;
    }

    public int hashCode() {
        Integer num = this.totalLikes;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cardId;
        return Boolean.hashCode(this.isLiked) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final void setCardId(String str) {
        this.cardId = str;
    }

    public final void setLiked(boolean z10) {
        this.isLiked = z10;
    }

    public final void setTotalLikes(Integer num) {
        this.totalLikes = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.totalLikes;
        String str = this.cardId;
        boolean z10 = this.isLiked;
        StringBuilder sb2 = new StringBuilder("CardInteraction(totalLikes=");
        sb2.append(num);
        sb2.append(", cardId=");
        sb2.append(str);
        sb2.append(", isLiked=");
        return e.o(sb2, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.totalLikes;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.cardId);
        parcel.writeInt(this.isLiked ? 1 : 0);
    }

    public /* synthetic */ CardInteraction(Integer num, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i10 & 4) != 0 ? false : z10);
    }
}
