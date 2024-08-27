package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/KycFAQ;", "Landroid/os/Parcelable;", "question", "Lcom/assetgro/stockgro/data/model/KycFAQMetaData;", "answer", "(Lcom/assetgro/stockgro/data/model/KycFAQMetaData;Lcom/assetgro/stockgro/data/model/KycFAQMetaData;)V", "getAnswer", "()Lcom/assetgro/stockgro/data/model/KycFAQMetaData;", "getQuestion", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class KycFAQ implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<KycFAQ> CREATOR = new Creator();

    @SerializedName("answer")
    @NotNull
    private final KycFAQMetaData answer;

    @SerializedName("question")
    @NotNull
    private final KycFAQMetaData question;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<KycFAQ> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycFAQ createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<KycFAQMetaData> creator = KycFAQMetaData.CREATOR;
            return new KycFAQ(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final KycFAQ[] newArray(int i10) {
            return new KycFAQ[i10];
        }
    }

    public KycFAQ(@NotNull KycFAQMetaData question, @NotNull KycFAQMetaData answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.question = question;
        this.answer = answer;
    }

    public static /* synthetic */ KycFAQ copy$default(KycFAQ kycFAQ, KycFAQMetaData kycFAQMetaData, KycFAQMetaData kycFAQMetaData2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kycFAQMetaData = kycFAQ.question;
        }
        if ((i10 & 2) != 0) {
            kycFAQMetaData2 = kycFAQ.answer;
        }
        return kycFAQ.copy(kycFAQMetaData, kycFAQMetaData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final KycFAQMetaData getQuestion() {
        return this.question;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final KycFAQMetaData getAnswer() {
        return this.answer;
    }

    @NotNull
    public final KycFAQ copy(@NotNull KycFAQMetaData question, @NotNull KycFAQMetaData answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new KycFAQ(question, answer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycFAQ)) {
            return false;
        }
        KycFAQ kycFAQ = (KycFAQ) other;
        return Intrinsics.a(this.question, kycFAQ.question) && Intrinsics.a(this.answer, kycFAQ.answer);
    }

    @NotNull
    public final KycFAQMetaData getAnswer() {
        return this.answer;
    }

    @NotNull
    public final KycFAQMetaData getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return this.answer.hashCode() + (this.question.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "KycFAQ(question=" + this.question + ", answer=" + this.answer + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.question.writeToParcel(parcel, flags);
        this.answer.writeToParcel(parcel, flags);
    }
}
