package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.ReportEntityRequestDto;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.CreatePostCommentRequestDto;
import com.assetgro.stockgro.data.remote.request.FeedPostReactionDto;
import com.assetgro.stockgro.data.remote.request.PostCommentReactionDto;
import com.assetgro.stockgro.data.remote.request.ReportCommentRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportData;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.remote.response.ReportEntityReasonsDto;
import com.assetgro.stockgro.data.remote.response.UpdatePostBookMarkStatusDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedStoryResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedStreamDto;
import com.assetgro.stockgro.ui.social.data.remote.PostCommentsDto;
import com.assetgro.stockgro.ui.social.data.remote.SubCategoryInteractionDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import jr.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import zq.f;

@Singleton
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001SB\u0019\b\u0007\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130\u00072\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b$\u0010%J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00130\u0007H\u0086@¢\u0006\u0004\b'\u0010(J0\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b,\u0010-J:\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010)\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b3\u00104J\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00130\u0007H\u0086@¢\u0006\u0004\b5\u0010(J$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00130\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b7\u00104J\u001c\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00130\u0007H\u0086@¢\u0006\u0004\b9\u0010(J\u001c\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00130\u0007H\u0086@¢\u0006\u0004\b;\u0010(J&\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b>\u0010\u001aJv\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00130\u00072\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010B2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/assetgro/stockgro/data/repository/FeedRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAccessToken", "getUserId", "Lcom/assetgro/stockgro/data/remote/request/FeedPostReactionDto;", "feedPostReactionDto", "Lnv/v0;", HttpUrl.FRAGMENT_ENCODE_SET, "handleFeedPostReaction", "(Lcom/assetgro/stockgro/data/remote/request/FeedPostReactionDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/CreatePostCommentRequestDto;", "createPostCommentRequestDto", "createPostComment", "(Lcom/assetgro/stockgro/data/remote/request/CreatePostCommentRequestDto;Lyt/a;)Ljava/lang/Object;", "postId", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "offset", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/ui/social/data/remote/PostCommentsDto;", "getPostComments", "(Ljava/lang/String;IILyt/a;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "isBookmarked", "changePostBookmarkStatus", "(Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "imageId", "Ljava/io/File;", "file", "type", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/AssetUploadResponse;", "uploadFeedPostAssets", "Lcom/assetgro/stockgro/data/remote/request/PostCommentReactionDto;", "postCommentReactionDto", "handlePostCommentReaction", "(Lcom/assetgro/stockgro/data/remote/request/PostCommentReactionDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/ReportEntityReasonsDto;", "getReasonsToReportComment", "(Lyt/a;)Ljava/lang/Object;", "commentId", "code", "reason", "reportPostComment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "reasonCode", "subReasonCode", "reasonText", "reportPost", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "deletePostComment", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "getReasonsToReportPost", "Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "getPostShareTemplate", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto;", "getSocialHome", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedStoryResponseDto;", "getSocialHomeStories", "subCategoryId", "isLike", "subCategoryInteraction", "Lcom/assetgro/stockgro/data/repository/FeedRepository$FeedTypeOf;", "typeOf", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "postIds", "isExpired", "filterBy", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;", "getSocialFeedItem", "(Lcom/assetgro/stockgro/data/repository/FeedRepository$FeedTypeOf;IILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "CONVERSATION_SECTION_COMMENT", "Ljava/lang/String;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "FeedTypeOf", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedRepository {
    public static final int $stable = 8;

    @NotNull
    private final String CONVERSATION_SECTION_COMMENT;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/assetgro/stockgro/data/repository/FeedRepository$FeedTypeOf;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUBCATEGORY", "GROUP", "BOOKMARK", "FAVOURITE", "POST_IDS", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class FeedTypeOf {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ FeedTypeOf[] $VALUES;

        @NotNull
        private final String value;
        public static final FeedTypeOf SUBCATEGORY = new FeedTypeOf("SUBCATEGORY", 0, "subcategory");
        public static final FeedTypeOf GROUP = new FeedTypeOf("GROUP", 1, "group");
        public static final FeedTypeOf BOOKMARK = new FeedTypeOf("BOOKMARK", 2, "bookmark");
        public static final FeedTypeOf FAVOURITE = new FeedTypeOf("FAVOURITE", 3, "favourite");
        public static final FeedTypeOf POST_IDS = new FeedTypeOf("POST_IDS", 4, "post_ids");

        private static final /* synthetic */ FeedTypeOf[] $values() {
            return new FeedTypeOf[]{SUBCATEGORY, GROUP, BOOKMARK, FAVOURITE, POST_IDS};
        }

        static {
            FeedTypeOf[] $values = $values();
            $VALUES = $values;
            $ENTRIES = f.E($values);
        }

        private FeedTypeOf(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static FeedTypeOf valueOf(String str) {
            return (FeedTypeOf) Enum.valueOf(FeedTypeOf.class, str);
        }

        public static FeedTypeOf[] values() {
            return (FeedTypeOf[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Inject
    public FeedRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
        this.CONVERSATION_SECTION_COMMENT = "comment";
    }

    public static /* synthetic */ Object getSocialFeedItem$default(FeedRepository feedRepository, FeedTypeOf feedTypeOf, int i10, int i11, String str, List list, String str2, Boolean bool, String str3, yt.a aVar, int i12, Object obj) {
        String str4;
        List list2;
        String str5;
        Boolean bool2;
        String str6;
        if ((i12 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i12 & 16) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i12 & 32) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i12 & 64) != 0) {
            bool2 = Boolean.FALSE;
        } else {
            bool2 = bool;
        }
        if ((i12 & 128) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        return feedRepository.getSocialFeedItem(feedTypeOf, i10, i11, str4, list2, str5, bool2, str6, aVar);
    }

    public static /* synthetic */ Object reportPost$default(FeedRepository feedRepository, String str, String str2, String str3, String str4, yt.a aVar, int i10, Object obj) {
        String str5;
        String str6;
        if ((i10 & 4) != 0) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str5 = str3;
        }
        if ((i10 & 8) != 0) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str6 = str4;
        }
        return feedRepository.reportPost(str, str2, str5, str6, aVar);
    }

    public final Object changePostBookmarkStatus(@NotNull String str, boolean z10, @NotNull yt.a<? super v0<Object>> aVar) {
        return this.networkService.changePostBookmarkStatus(str, new UpdatePostBookMarkStatusDto(z10), aVar);
    }

    public final Object createPostComment(@NotNull CreatePostCommentRequestDto createPostCommentRequestDto, @NotNull yt.a<? super v0<Object>> aVar) {
        return this.networkService.createPostComment(createPostCommentRequestDto, this.CONVERSATION_SECTION_COMMENT, aVar);
    }

    public final Object deletePostComment(@NotNull String str, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.deletePostComment(str, this.CONVERSATION_SECTION_COMMENT, aVar);
    }

    public final String getAccessToken() {
        return this.userPreferences.getAccessToken();
    }

    public final Object getPostComments(@NotNull String str, int i10, int i11, @NotNull yt.a<? super v0<BaseResponseDto<PostCommentsDto>>> aVar) {
        return this.networkService.getPostComments(str, i10, i11, this.CONVERSATION_SECTION_COMMENT, "small", aVar);
    }

    public final Object getPostShareTemplate(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar) {
        return this.networkService.getPostShareTemplate(str, aVar);
    }

    public final Object getReasonsToReportComment(@NotNull yt.a<? super v0<BaseResponseDto<ReportEntityReasonsDto>>> aVar) {
        return this.networkService.getReasonsToReportComment(aVar);
    }

    public final Object getReasonsToReportPost(@NotNull yt.a<? super v0<BaseResponseDto<ReportEntityReasonsDto>>> aVar) {
        return this.networkService.getReasonsToReportPost(aVar);
    }

    public final Object getSocialFeedItem(@NotNull FeedTypeOf feedTypeOf, int i10, int i11, String str, List<String> list, String str2, Boolean bool, String str3, @NotNull yt.a<? super v0<BaseResponseDto<FeedStreamDto>>> aVar) {
        String str4;
        NetworkService networkService = this.networkService;
        String value = feedTypeOf.getValue();
        if (str3 != null && str3.length() != 0) {
            str4 = h.r(str3, ":All");
        } else {
            str4 = null;
        }
        return networkService.getSocialFeedItems(value, i10, i11, str2, str, list, bool, str4, aVar);
    }

    public final Object getSocialHome(@NotNull yt.a<? super v0<BaseResponseDto<SocialHomeFeedResponseDto>>> aVar) {
        return this.networkService.getSocialHome(aVar);
    }

    public final Object getSocialHomeStories(@NotNull yt.a<? super v0<BaseResponseDto<SocialHomeFeedStoryResponseDto>>> aVar) {
        return this.networkService.getSocialHomeStories(aVar);
    }

    public final String getUserId() {
        return this.userPreferences.getUuid();
    }

    public final Object handleFeedPostReaction(@NotNull FeedPostReactionDto feedPostReactionDto, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.handleFeedPostReaction(feedPostReactionDto, aVar);
    }

    public final Object handlePostCommentReaction(@NotNull PostCommentReactionDto postCommentReactionDto, @NotNull yt.a<? super v0<BaseResponseDto<Unit>>> aVar) {
        return this.networkService.handlePostCommentReaction(postCommentReactionDto.getCommentId(), postCommentReactionDto, this.CONVERSATION_SECTION_COMMENT, aVar);
    }

    public final Object reportPost(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.reportPost(str, new ReportEntityRequestDto(str2, str3, str4), aVar);
    }

    public final Object reportPostComment(@NotNull String str, @NotNull String str2, String str3, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.reportPostComment(str, this.CONVERSATION_SECTION_COMMENT, new ReportCommentRequestDto(str, getUserId(), new ReportData(str2, str3)), aVar);
    }

    public final Object subCategoryInteraction(@NotNull String str, boolean z10, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.subCategoryInteraction(new SubCategoryInteractionDto(str, z10), aVar);
    }

    @NotNull
    public final m<AssetUploadResponse> uploadFeedPostAssets(String imageId, @NotNull File file, @NotNull String type) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.networkService.uploadFeedPostAssets(imageId, file.getName(), MultipartBody.Part.INSTANCE.createFormData("media", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(type))));
    }
}
