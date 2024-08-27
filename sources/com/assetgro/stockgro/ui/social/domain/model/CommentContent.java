package com.assetgro.stockgro.ui.social.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;", "Landroid/os/Parcelable;", "template", HttpUrl.FRAGMENT_ENCODE_SET, "sanitisedTemplate", "mentions", "Lcom/assetgro/stockgro/ui/social/domain/model/PostMentions;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/social/domain/model/PostMentions;)V", "getMentions", "()Lcom/assetgro/stockgro/ui/social/domain/model/PostMentions;", "getSanitisedTemplate", "()Ljava/lang/String;", "getTemplate", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommentContent implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CommentContent> CREATOR = new Creator();
    private final PostMentions mentions;
    private final String sanitisedTemplate;
    private final String template;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CommentContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CommentContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommentContent(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PostMentions.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CommentContent[] newArray(int i10) {
            return new CommentContent[i10];
        }
    }

    public CommentContent(String str, String str2, PostMentions postMentions) {
        this.template = str;
        this.sanitisedTemplate = str2;
        this.mentions = postMentions;
    }

    public static /* synthetic */ CommentContent copy$default(CommentContent commentContent, String str, String str2, PostMentions postMentions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = commentContent.template;
        }
        if ((i10 & 2) != 0) {
            str2 = commentContent.sanitisedTemplate;
        }
        if ((i10 & 4) != 0) {
            postMentions = commentContent.mentions;
        }
        return commentContent.copy(str, str2, postMentions);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSanitisedTemplate() {
        return this.sanitisedTemplate;
    }

    /* renamed from: component3, reason: from getter */
    public final PostMentions getMentions() {
        return this.mentions;
    }

    @NotNull
    public final CommentContent copy(String template, String sanitisedTemplate, PostMentions mentions) {
        return new CommentContent(template, sanitisedTemplate, mentions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentContent)) {
            return false;
        }
        CommentContent commentContent = (CommentContent) other;
        return Intrinsics.a(this.template, commentContent.template) && Intrinsics.a(this.sanitisedTemplate, commentContent.sanitisedTemplate) && Intrinsics.a(this.mentions, commentContent.mentions);
    }

    public final PostMentions getMentions() {
        return this.mentions;
    }

    public final String getSanitisedTemplate() {
        return this.sanitisedTemplate;
    }

    public final String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sanitisedTemplate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PostMentions postMentions = this.mentions;
        return hashCode2 + (postMentions != null ? postMentions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.template;
        String str2 = this.sanitisedTemplate;
        PostMentions postMentions = this.mentions;
        StringBuilder l10 = e.l("CommentContent(template=", str, ", sanitisedTemplate=", str2, ", mentions=");
        l10.append(postMentions);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.template);
        parcel.writeString(this.sanitisedTemplate);
        PostMentions postMentions = this.mentions;
        if (postMentions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postMentions.writeToParcel(parcel, flags);
        }
    }
}
