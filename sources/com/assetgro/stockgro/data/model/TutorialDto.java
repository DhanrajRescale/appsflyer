package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/TutorialDto;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "videoId", "ytKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getVideoId", "getYtKey", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TutorialDto {
    public static final int $stable = 0;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("video_id")
    @NotNull
    private final String videoId;

    @SerializedName("yt_key")
    @NotNull
    private final String ytKey;

    public TutorialDto(@NotNull String title, @NotNull String videoId, @NotNull String ytKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        Intrinsics.checkNotNullParameter(ytKey, "ytKey");
        this.title = title;
        this.videoId = videoId;
        this.ytKey = ytKey;
    }

    public static /* synthetic */ TutorialDto copy$default(TutorialDto tutorialDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tutorialDto.title;
        }
        if ((i10 & 2) != 0) {
            str2 = tutorialDto.videoId;
        }
        if ((i10 & 4) != 0) {
            str3 = tutorialDto.ytKey;
        }
        return tutorialDto.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getYtKey() {
        return this.ytKey;
    }

    @NotNull
    public final TutorialDto copy(@NotNull String title, @NotNull String videoId, @NotNull String ytKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        Intrinsics.checkNotNullParameter(ytKey, "ytKey");
        return new TutorialDto(title, videoId, ytKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TutorialDto)) {
            return false;
        }
        TutorialDto tutorialDto = (TutorialDto) other;
        return Intrinsics.a(this.title, tutorialDto.title) && Intrinsics.a(this.videoId, tutorialDto.videoId) && Intrinsics.a(this.ytKey, tutorialDto.ytKey);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getVideoId() {
        return this.videoId;
    }

    @NotNull
    public final String getYtKey() {
        return this.ytKey;
    }

    public int hashCode() {
        return this.ytKey.hashCode() + h.g(this.videoId, this.title.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.videoId;
        return d.o(e.l("TutorialDto(title=", str, ", videoId=", str2, ", ytKey="), this.ytKey, ")");
    }
}
