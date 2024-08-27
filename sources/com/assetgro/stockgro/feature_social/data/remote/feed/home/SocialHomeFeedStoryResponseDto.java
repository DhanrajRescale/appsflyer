package com.assetgro.stockgro.feature_social.data.remote.feed.home;

import a3.a;
import com.google.gson.annotations.SerializedName;
import gb.c;
import gb.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.y;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedStoryResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lgb/c;", "toSocialHomeFeedStoryResponse", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialStoryGroupDto;", "component1", "groups", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SocialHomeFeedStoryResponseDto {
    public static final int $stable = 8;

    @SerializedName("groups")
    @NotNull
    private final List<SocialStoryGroupDto> groups;

    public SocialHomeFeedStoryResponseDto(@NotNull List<SocialStoryGroupDto> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialHomeFeedStoryResponseDto copy$default(SocialHomeFeedStoryResponseDto socialHomeFeedStoryResponseDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = socialHomeFeedStoryResponseDto.groups;
        }
        return socialHomeFeedStoryResponseDto.copy(list);
    }

    @NotNull
    public final List<SocialStoryGroupDto> component1() {
        return this.groups;
    }

    @NotNull
    public final SocialHomeFeedStoryResponseDto copy(@NotNull List<SocialStoryGroupDto> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new SocialHomeFeedStoryResponseDto(groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocialHomeFeedStoryResponseDto) && Intrinsics.a(this.groups, ((SocialHomeFeedStoryResponseDto) other).groups);
    }

    @NotNull
    public final List<SocialStoryGroupDto> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    @NotNull
    public final c toSocialHomeFeedStoryResponse() {
        boolean z10;
        List<SocialStoryGroupDto> list = this.groups;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                e socialStoryGroup = ((SocialStoryGroupDto) obj).toSocialStoryGroup();
                boolean z11 = true;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != this.groups.size() - 1) {
                    z11 = false;
                }
                arrayList.add(e.a(socialStoryGroup, z10, z11));
                i10 = i11;
            } else {
                y.j();
                throw null;
            }
        }
        return new c(arrayList);
    }

    @NotNull
    public String toString() {
        return a.h("SocialHomeFeedStoryResponseDto(groups=", this.groups, ")");
    }
}
