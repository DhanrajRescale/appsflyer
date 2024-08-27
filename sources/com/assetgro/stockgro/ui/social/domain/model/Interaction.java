package com.assetgro.stockgro.ui.social.domain.model;

import da.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/Interaction;", HttpUrl.FRAGMENT_ENCODE_SET, "reactions", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/social/domain/model/CommentReaction;", "userReaction", HttpUrl.FRAGMENT_ENCODE_SET, "isReported", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;Z)V", "()Z", "setReported", "(Z)V", "getReactions", "()Ljava/util/List;", "getUserReaction", "()Ljava/lang/String;", "setUserReaction", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Interaction {
    public static final int $stable = 8;
    private boolean isReported;
    private final List<CommentReaction> reactions;
    private String userReaction;

    public Interaction(List<CommentReaction> list, String str, boolean z10) {
        this.reactions = list;
        this.userReaction = str;
        this.isReported = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Interaction copy$default(Interaction interaction, List list, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = interaction.reactions;
        }
        if ((i10 & 2) != 0) {
            str = interaction.userReaction;
        }
        if ((i10 & 4) != 0) {
            z10 = interaction.isReported;
        }
        return interaction.copy(list, str, z10);
    }

    public final List<CommentReaction> component1() {
        return this.reactions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserReaction() {
        return this.userReaction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReported() {
        return this.isReported;
    }

    @NotNull
    public final Interaction copy(List<CommentReaction> reactions, String userReaction, boolean isReported) {
        return new Interaction(reactions, userReaction, isReported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Interaction)) {
            return false;
        }
        Interaction interaction = (Interaction) other;
        return Intrinsics.a(this.reactions, interaction.reactions) && Intrinsics.a(this.userReaction, interaction.userReaction) && this.isReported == interaction.isReported;
    }

    public final List<CommentReaction> getReactions() {
        return this.reactions;
    }

    public final String getUserReaction() {
        return this.userReaction;
    }

    public int hashCode() {
        List<CommentReaction> list = this.reactions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.userReaction;
        return Boolean.hashCode(this.isReported) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public final void setReported(boolean z10) {
        this.isReported = z10;
    }

    public final void setUserReaction(String str) {
        this.userReaction = str;
    }

    @NotNull
    public String toString() {
        List<CommentReaction> list = this.reactions;
        String str = this.userReaction;
        boolean z10 = this.isReported;
        StringBuilder sb2 = new StringBuilder("Interaction(reactions=");
        sb2.append(list);
        sb2.append(", userReaction=");
        sb2.append(str);
        sb2.append(", isReported=");
        return e.o(sb2, z10, ")");
    }

    public /* synthetic */ Interaction(List list, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i10 & 4) != 0 ? false : z10);
    }
}
