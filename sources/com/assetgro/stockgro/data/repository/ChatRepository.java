package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.AddGroupMembersDto;
import com.assetgro.stockgro.data.model.ChatNotificationDto;
import com.assetgro.stockgro.data.model.DeactivatedMemberDto;
import com.assetgro.stockgro.data.model.DiscoverDto;
import com.assetgro.stockgro.data.model.FriendMemberDto;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupInfoInvitesResponse;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.ManageMemberResponse;
import com.assetgro.stockgro.data.model.MessageListDto;
import com.assetgro.stockgro.data.model.MessageThreadInfoDto;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.model.OpenForAudienceDto;
import com.assetgro.stockgro.data.model.PinnedMessageDto;
import com.assetgro.stockgro.data.model.PrivateChatGroup;
import com.assetgro.stockgro.data.model.ReportUserReasonsDto;
import com.assetgro.stockgro.data.model.ReportedEntityConfirmationDto;
import com.assetgro.stockgro.data.model.RogueUserDto;
import com.assetgro.stockgro.data.model.SocialCategoryDto;
import com.assetgro.stockgro.data.model.SocialChatGroup;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.data.model.SocialGlobalRoleDto;
import com.assetgro.stockgro.data.model.StickersDto;
import com.assetgro.stockgro.data.model.SupportGroup;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.data.model.UserChatGroupsResponse;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.ActiveMemberDto;
import com.assetgro.stockgro.data.remote.request.BanMemberDto;
import com.assetgro.stockgro.data.remote.request.BlockPrivateChatUserRequestDto;
import com.assetgro.stockgro.data.remote.request.EditGroupCoverImageDto;
import com.assetgro.stockgro.data.remote.request.EditGroupDescriptionDto;
import com.assetgro.stockgro.data.remote.request.EditGroupDisplayImageDto;
import com.assetgro.stockgro.data.remote.request.EditGroupNameRequestDto;
import com.assetgro.stockgro.data.remote.request.ExitChatGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.remote.request.JoinSocialGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.ManageMemberRequest;
import com.assetgro.stockgro.data.remote.request.MarkReadMessagesDto;
import com.assetgro.stockgro.data.remote.request.MessageInteractionRequestDto;
import com.assetgro.stockgro.data.remote.request.MuteChatDto;
import com.assetgro.stockgro.data.remote.request.PinnedChatDto;
import com.assetgro.stockgro.data.remote.request.RemoveMemberDto;
import com.assetgro.stockgro.data.remote.request.ReportChatGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportMessageRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportUserRequestDto;
import com.assetgro.stockgro.data.remote.request.StarMessageRequestDto;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.remote.response.SocialRoleResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialSearchResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.data.remote.response.base.BaseApiResponse;
import com.assetgro.stockgro.ui.social.data.remote.BlockedUserListDto;
import com.assetgro.stockgro.ui.social.data.remote.GroupMemberRoleDto;
import com.assetgro.stockgro.ui.social.data.remote.SocialHomePermissionsDto;
import com.assetgro.stockgro.ui.social.data.remote.UserGroupLevelPermissionsDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import vt.x;

@Singleton
@Metadata(d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\b\u0010¸\u0001\u001a\u00030·\u0001\u0012\b\u0010»\u0001\u001a\u00030º\u0001¢\u0006\u0006\b½\u0001\u0010¾\u0001J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\"\u0010\u000b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00070\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006J0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0011J6\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00132\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b!\u0010\"J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010$\u001a\u00020#J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010$\u001a\u00020&J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010$\u001a\u00020(J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010$\u001a\u00020*J4\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00070\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u0002J$\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00062\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ.\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ.\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0002J.\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<J*\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00132\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b@\u0010AJ\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0006J.\u0010F\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010D\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bF\u0010GJ2\u0010I\u001a\b\u0012\u0004\u0012\u00020 0\u00132\b\u0010D\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010H\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bI\u0010GJ;\u0010M\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\u0010D\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bM\u0010NJ(\u0010P\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\u00106\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\u0010Q\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u00010\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bR\u0010SJ\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u0006J*\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010,\u001a\u00020\u00022\n\b\u0002\u0010W\u001a\u0004\u0018\u00010VH\u0086@¢\u0006\u0004\bX\u0010YJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u00062\b\u00106\u001a\u0004\u0018\u00010\u0002J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010\\\u001a\u00020KJ\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0002J\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\u00062\u0006\u0010,\u001a\u00020\u0002J.\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u00062\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u0002J1\u0010d\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u00010\u00022\b\u0010c\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bd\u0010eJ\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020]0\u00062\u0006\u0010,\u001a\u00020\u0002J0\u0010g\u001a\b\u0012\u0004\u0012\u0002020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ(\u0010h\u001a\b\u0012\u0004\u0012\u0002000\u00062\u0006\u0010D\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0002J(\u0010i\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010D\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\bi\u0010AJ2\u0010k\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0-0\u00070\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ(\u0010l\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010D\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\bl\u0010AJ\"\u0010n\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020m0\bj\b\u0012\u0004\u0012\u00020m`\n0\u00070\u0006J*\u0010o\u001a\b\u0012\u0004\u0012\u0002020\u00132\b\u0010D\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\bo\u0010AJ&\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u00070\u00132\b\u0010q\u001a\u0004\u0018\u00010pH\u0086@¢\u0006\u0004\bs\u0010tJ\u001c\u0010x\u001a\b\u0012\u0004\u0012\u0002000\u00062\u0006\u0010v\u001a\u00020u2\u0006\u0010w\u001a\u00020\u0002J\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u0013H\u0086@¢\u0006\u0004\bz\u0010{J\u001e\u0010~\u001a\b\u0012\u0004\u0012\u00020}0\u00062\b\u0010|\u001a\u0004\u0018\u00010\u00022\u0006\u00106\u001a\u00020\u0002J2\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020}0\u00062\u0006\u00106\u001a\u00020\u00022\u0006\u0010|\u001a\u00020\u00022\b\b\u0002\u0010\u007f\u001a\u00020\u00022\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0002J!\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0007\u0010\u0082\u0001\u001a\u00020\u00112\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0002J-\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0007\u0010\u0082\u0001\u001a\u00020\u00112\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0018\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u00062\b\u0010D\u001a\u0004\u0018\u00010\u0002J>\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020}0\u00062\u0007\u0010\u0089\u0001\u001a\u00020\u00112\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00022\u0006\u0010|\u001a\u00020\u00022\b\b\u0002\u0010\u007f\u001a\u00020\u00022\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0002J\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u0006J\u000e\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u0006JA\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u00132\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u0013H\u0086@¢\u0006\u0005\b\u0094\u0001\u0010{J\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u0002000\u0006J=\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00132\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00022\u000f\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-H\u0086@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J \u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u0002J+\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00132\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0007\u0010\u009c\u0001\u001a\u00020\u0002H\u0086@¢\u0006\u0005\b\u009d\u0001\u0010AJ+\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00132\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0007\u0010\u009c\u0001\u001a\u00020\u0002H\u0086@¢\u0006\u0005\b\u009e\u0001\u0010AJ+\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00132\u0007\u0010\u0089\u0001\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0002H\u0086@¢\u0006\u0006\b \u0001\u0010\u0086\u0001J \u0010£\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¢\u00010\u00070¡\u0001H\u0086@¢\u0006\u0005\b£\u0001\u0010{J1\u0010§\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00010¥\u00010\u00132\u0007\u0010¤\u0001\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0086@¢\u0006\u0005\b§\u0001\u0010AJ5\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010D\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0006\b¨\u0001\u0010©\u0001J=\u0010«\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030ª\u00010¥\u00010\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0002H\u0086@¢\u0006\u0006\b«\u0001\u0010¬\u0001J0\u0010®\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u00010\u00070\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001f\u0010±\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030°\u00010\u00070\u0013H\u0086@¢\u0006\u0005\b±\u0001\u0010{J(\u0010³\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030²\u00010\u00070\u00132\u0006\u0010,\u001a\u00020\u0002H\u0086@¢\u0006\u0006\b³\u0001\u0010´\u0001J!\u0010¶\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010-0\u0013H\u0086@¢\u0006\u0005\b¶\u0001\u0010{R\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001¨\u0006¿\u0001"}, d2 = {"Lcom/assetgro/stockgro/data/repository/ChatRepository;", "Lcom/assetgro/stockgro/data/remote/response/base/BaseApiResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "getAccessToken", "getUserId", "getUserName", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/remote/response/StockgroContact;", "Lkotlin/collections/ArrayList;", "getListOfAdmin", "Lcom/assetgro/stockgro/data/model/DiscoverDto;", "getDiscoverHomeData", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "offset", HttpUrl.FRAGMENT_ENCODE_SET, "withWriteRoleOnly", "Lnv/v0;", "Lcom/assetgro/stockgro/data/model/UserChatGroupsResponse;", "getChatGroups", "(IIZLyt/a;)Ljava/lang/Object;", "id", "nonSearch", "withWriteAccess", "Lcom/assetgro/stockgro/data/model/Group;", "getChatGroupById", "getChatGroupByIdV2", "(Ljava/lang/String;ZZLyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/OpenForAudienceDto;", "openForAudienceDto", HttpUrl.FRAGMENT_ENCODE_SET, "editIsOpenForAudience", "(Lcom/assetgro/stockgro/data/model/OpenForAudienceDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/PrivateChatGroup;", "group", "createPrivateChatGroup", "Lcom/assetgro/stockgro/data/model/SocialChatGroup;", "createSocialChatGroup", "Lcom/assetgro/stockgro/data/model/OneToOneChatGroup;", "createOneToOneChatGroup", "Lcom/assetgro/stockgro/data/model/SupportGroup;", "contactStockgroAdmin", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "userIds", "role", HttpUrl.FRAGMENT_ENCODE_SET, "addMembersToGroup", "Lcom/assetgro/stockgro/data/model/GroupMembersDto;", "getGroupMembers", "searchString", "searchGroupMembers", "messageId", "Ljava/io/File;", "file", "type", "Lcom/assetgro/stockgro/data/remote/response/AssetUploadResponse;", "uploadChatAssets", "Lcom/assetgro/stockgro/data/enums/GroupImageType;", "imageType", "uploadChatGroupAssets", "Lcom/assetgro/stockgro/data/model/UserGroupInfo;", "joinSocialGroup", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/SocialCategoryDto;", "getSocialCategories", "userId", "isPinned", "changeChatPinnedStatus", "(Ljava/lang/String;Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "isMuted", "changeChatMuteStatus", "lastReadMessageId", HttpUrl.FRAGMENT_ENCODE_SET, "lastReadMessageServerTimeStamp", "markMessagesAsRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lat/m;", "isLiked", "messageInteraction", "senderId", "pinMessageToGroup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lat/m;", "Lcom/assetgro/stockgro/data/model/ChatNotificationDto;", "getChatTotalUnreadCount", "Lcom/assetgro/stockgro/data/remote/request/ExitData;", "exitData", "exitChatGroup", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/ExitData;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/MessageThreadInfoDto;", "getMessageThreadInfo", "updatedAtLte", "Lcom/assetgro/stockgro/data/model/MessageListDto;", "loadMessages", "fetchRecentMessages", "getGroupPinnedMessages", "Lcom/assetgro/stockgro/data/model/FriendMemberDto;", "getFriendsNotInGroup", "isStarred", "starMessageForUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lat/m;", "getStarredMessagesForUser", "getBannedGroupMembers", "banUnbanGroupMember", "removeGroupMember", "Lcom/assetgro/stockgro/data/model/RogueUserDto;", "getDeactivatedMembers", "changeMemberActiveStatus", "Lcom/assetgro/stockgro/data/remote/response/SocialRoleResponseDto;", "getSocialGlobalRole", "getUserGlobalRole", "Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", "inviteTemplateDto", "Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "getInviteTemplate", "(Lcom/assetgro/stockgro/data/model/InviteTemplateDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/SocialDataDto;", "socialDataDto", "platform", "saveUserSocialData", "Lcom/assetgro/stockgro/data/model/UserSocialAuthStatusDto;", "getUserSocialAuthStatus", "(Lyt/a;)Ljava/lang/Object;", "code", "Lcom/assetgro/stockgro/data/model/ReportedEntityConfirmationDto;", "reportUserChatMessage", "subReasonCode", "reasonText", "reportUserChatMessageV2", "isBlocked", "toBlock", "blockUserOnPrivateChat", "blockUserOnPrivateChatV2", "(ZLjava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/UserReportStatusDto;", "getUserReportedStatus", "isReported", "userToBeReported", "reportUser", "Lcom/assetgro/stockgro/data/model/ReportUserReasonsDto;", "getReasonsToReportUser", "getReasonsToReportMessage", "searchIn", "Lcom/assetgro/stockgro/data/remote/response/SocialSearchResponseDto;", "getSocialSearchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/SocialSearchHistoryResponseDto;", "getSocialSearchHistoryData", "deleteSocialSearchHistoryData", AppMeasurementSdk.ConditionalUserProperty.NAME, "tags", "editGroupNameAndTags", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lyt/a;)Ljava/lang/Object;", "description", "editGroupDescription", "url", "editGroupCoverImage", "editGroupDisplayImage", "Lcom/assetgro/stockgro/data/remote/request/ReportChatGroupRequestDto;", "reportChatGroup", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "Lcom/assetgro/stockgro/data/model/StickersDto;", "getStickerData", LogCategory.ACTION, "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "Lcom/assetgro/stockgro/data/model/ManageMemberResponse;", "manageMember", "changeMemberGroupRole", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/GroupInfoInvitesResponse;", "getGroupInfoInviteMembers", "(IILjava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/social/data/remote/BlockedUserListDto;", "getUsersBlockedList", "(IILyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/social/data/remote/SocialHomePermissionsDto;", "getSocialsHomeLevelPermissions", "Lcom/assetgro/stockgro/ui/social/data/remote/UserGroupLevelPermissionsDto;", "getGroupMessageLevelPermissions", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/Tags;", "getGroupTagList", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatRepository extends BaseApiResponse {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public ChatRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public static /* synthetic */ Object exitChatGroup$default(ChatRepository chatRepository, String str, ExitData exitData, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            exitData = null;
        }
        return chatRepository.exitChatGroup(str, exitData, aVar);
    }

    public static /* synthetic */ m getChatGroupById$default(ChatRepository chatRepository, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return chatRepository.getChatGroupById(str, z10, z11);
    }

    public static /* synthetic */ Object getChatGroupByIdV2$default(ChatRepository chatRepository, String str, boolean z10, boolean z11, yt.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return chatRepository.getChatGroupByIdV2(str, z10, z11, aVar);
    }

    public static /* synthetic */ Object getChatGroups$default(ChatRepository chatRepository, int i10, int i11, boolean z10, yt.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return chatRepository.getChatGroups(i10, i11, z10, aVar);
    }

    public static /* synthetic */ Object getGroupInfoInviteMembers$default(ChatRepository chatRepository, int i10, int i11, String str, yt.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        return chatRepository.getGroupInfoInviteMembers(i10, i11, str, aVar);
    }

    public static /* synthetic */ Object getSocialSearchData$default(ChatRepository chatRepository, String str, String str2, Integer num, Integer num2, yt.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "all";
        }
        return chatRepository.getSocialSearchData(str, str2, num, num2, aVar);
    }

    public static /* synthetic */ m reportUser$default(ChatRepository chatRepository, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        String str5;
        String str6;
        if ((i10 & 8) != 0) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str5 = str3;
        }
        if ((i10 & 16) != 0) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str6 = str4;
        }
        return chatRepository.reportUser(z10, str, str2, str5, str6);
    }

    public static /* synthetic */ m reportUserChatMessageV2$default(ChatRepository chatRepository, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i10 & 8) != 0) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return chatRepository.reportUserChatMessageV2(str, str2, str3, str4);
    }

    @NotNull
    public final m<BaseResponseDto<Object>> addMembersToGroup(String groupId, @NotNull List<String> userIds, String role) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        return this.networkService.addMembersToGroup(new AddGroupMembersDto(groupId, userIds, role));
    }

    @NotNull
    public final m<Object> banUnbanGroupMember(@NotNull String userId, String groupId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return this.networkService.banUnbanGroupMember(new BanMemberDto(userId, groupId, role));
    }

    @NotNull
    public final m<Unit> blockUserOnPrivateChat(boolean isBlocked, String toBlock) {
        return this.networkService.blockUserOnPrivateChat(new BlockPrivateChatUserRequestDto(isBlocked, toBlock));
    }

    public final Object blockUserOnPrivateChatV2(boolean z10, String str, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.blockUserOnPrivateChatV2(new BlockPrivateChatUserRequestDto(z10, str), aVar);
    }

    public final Object changeChatMuteStatus(String str, String str2, boolean z10, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.changeChatMuteStatus(new MuteChatDto(str, str2, z10), aVar);
    }

    public final Object changeChatPinnedStatus(@NotNull String str, @NotNull String str2, boolean z10, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.changeChatPinnedStatus(new PinnedChatDto(str, str2, z10), aVar);
    }

    public final Object changeMemberActiveStatus(@NotNull String str, String str2, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.changeMemberActiveStatus(new ActiveMemberDto(str, str2), aVar);
    }

    public final Object changeMemberGroupRole(@NotNull String str, String str2, String str3, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.changeMemberGroupRole(new GroupMemberRoleDto(str, str2, str3), aVar);
    }

    @NotNull
    public final m<Group> contactStockgroAdmin(@NotNull SupportGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return this.networkService.contactStockgroAdmin(group);
    }

    @NotNull
    public final m<Group> createOneToOneChatGroup(@NotNull OneToOneChatGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return this.networkService.createOneToOneChatGroup(group);
    }

    @NotNull
    public final m<Group> createPrivateChatGroup(@NotNull PrivateChatGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return this.networkService.createPrivateChatGroup(group);
    }

    @NotNull
    public final m<Group> createSocialChatGroup(@NotNull SocialChatGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return this.networkService.createSocialChatGroup(group);
    }

    @NotNull
    public final m<Object> deleteSocialSearchHistoryData() {
        return this.networkService.deleteSocialSearchHistoryData();
    }

    public final Object editGroupCoverImage(String str, @NotNull String str2, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.editGroupCoverImage(new EditGroupCoverImageDto(str, str2), aVar);
    }

    @NotNull
    public final m<Object> editGroupDescription(String groupId, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return this.networkService.editGroupDescription(new EditGroupDescriptionDto(groupId, description));
    }

    public final Object editGroupDisplayImage(String str, @NotNull String str2, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.editGroupDisplayImage(new EditGroupDisplayImageDto(str, str2), aVar);
    }

    public final Object editGroupNameAndTags(String str, @NotNull String str2, List<String> list, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.editGroupNameAndTags(new EditGroupNameRequestDto(str, str2, list), aVar);
    }

    public final Object editIsOpenForAudience(@NotNull OpenForAudienceDto openForAudienceDto, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.editIsOpenForAudience(openForAudienceDto, aVar);
    }

    public final Object exitChatGroup(@NotNull String str, ExitData exitData, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.exitGroup(new ExitChatGroupRequestDto(this.userPreferences.getUuid(), str, "Exited", exitData), aVar);
    }

    @NotNull
    public final m<MessageListDto> fetchRecentMessages(String groupId) {
        NetworkService networkService = this.networkService;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        return networkService.fetchRecentMessages(groupId, "updated_at_micros", 20, bool, bool2, bool2, bool2, 0);
    }

    public final String getAccessToken() {
        return this.userPreferences.getAccessToken();
    }

    @NotNull
    public final m<GroupMembersDto> getBannedGroupMembers(String groupId, String role, int limit, int offset) {
        return this.networkService.getBannedGroupMembers(groupId, role, Integer.valueOf(limit), Integer.valueOf(offset));
    }

    @NotNull
    public final m<BaseResponseDto<Group>> getChatGroupById(@NotNull String id2, boolean nonSearch, boolean withWriteAccess) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.networkService.getChatGroupById(id2, true, true, nonSearch, withWriteAccess, "small");
    }

    public final Object getChatGroupByIdV2(@NotNull String str, boolean z10, boolean z11, @NotNull yt.a<? super v0<BaseResponseDto<Group>>> aVar) {
        return this.networkService.getChatGroupInfoV2(str, true, true, z10, z11, "small", aVar);
    }

    public final Object getChatGroups(int i10, int i11, boolean z10, @NotNull yt.a<? super v0<UserChatGroupsResponse>> aVar) {
        return this.networkService.getChatGroups(this.userPreferences.getUuid(), true, true, true, "Joined", "Rogue", "is_support_group,is_pinned,last_group_msg_time", i10, i11, z10, aVar);
    }

    @NotNull
    public final m<ChatNotificationDto> getChatTotalUnreadCount() {
        return this.networkService.getChatTotalUnreadCount(this.userPreferences.getUuid(), true, "Joined");
    }

    @NotNull
    public final m<BaseResponseDto<List<RogueUserDto>>> getDeactivatedMembers(String role, int limit, int offset) {
        return this.networkService.getDeactivatedMembers(new DeactivatedMemberDto(role, Integer.valueOf(limit), Integer.valueOf(offset)));
    }

    @NotNull
    public final m<DiscoverDto> getDiscoverHomeData() {
        return this.networkService.getDiscoverHomeData();
    }

    @NotNull
    public final m<FriendMemberDto> getFriendsNotInGroup(@NotNull String groupId, int limit, int offset, String searchString) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return this.networkService.getFriendsNotInGroup(groupId, Integer.valueOf(limit), Integer.valueOf(offset), searchString, "display_name");
    }

    public final Object getGroupInfoInviteMembers(int i10, int i11, @NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<GroupInfoInvitesResponse>>> aVar) {
        return this.networkService.getGroupInfoInvitees(i11, i10, str, aVar);
    }

    @NotNull
    public final m<GroupMembersDto> getGroupMembers(@NotNull String groupId, int limit, int offset) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return this.networkService.getGroupMembers(groupId, "Joined", limit, offset, "Rogue", "small", true);
    }

    public final Object getGroupMessageLevelPermissions(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<UserGroupLevelPermissionsDto>>> aVar) {
        return this.networkService.getBigbossGroupMessageLevelPermissions(str, aVar);
    }

    @NotNull
    public final m<MessageListDto> getGroupPinnedMessages(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return this.networkService.getGroupPinnedMessages(groupId, true, true, "updated_at_micros");
    }

    public final Object getGroupTagList(@NotNull yt.a<? super v0<List<Tags>>> aVar) {
        return this.networkService.getGroupTagList(aVar);
    }

    public final Object getInviteTemplate(InviteTemplateDto inviteTemplateDto, @NotNull yt.a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar) {
        return this.networkService.getTemplateFromGooglyService(inviteTemplateDto, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<ArrayList<StockgroContact>>> getListOfAdmin() {
        return this.networkService.getListOfAdmin();
    }

    @NotNull
    public final m<MessageThreadInfoDto> getMessageThreadInfo(String messageId) {
        NetworkService networkService = this.networkService;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        return networkService.getMessageThreadInfo(messageId, bool, bool2, bool2, bool2);
    }

    @NotNull
    public final m<ReportUserReasonsDto> getReasonsToReportMessage() {
        return this.networkService.getReasonsToReportMessage();
    }

    @NotNull
    public final m<ReportUserReasonsDto> getReasonsToReportUser() {
        return this.networkService.getReasonsToReportUser();
    }

    @NotNull
    public final m<SocialCategoryDto> getSocialCategories() {
        return this.networkService.getSocialCategories();
    }

    @NotNull
    public final m<BaseResponseDto<ArrayList<SocialRoleResponseDto>>> getSocialGlobalRole() {
        return this.networkService.getSocialGlobalRole(new SocialGlobalRoleDto(1, x.a(this.userPreferences.getUuid())));
    }

    public final Object getSocialSearchData(@NotNull String str, @NotNull String str2, Integer num, Integer num2, @NotNull yt.a<? super v0<SocialSearchResponseDto>> aVar) {
        return this.networkService.getSocialSearchData(str, str2, num, num2, aVar);
    }

    public final Object getSocialSearchHistoryData(@NotNull yt.a<? super v0<SocialSearchHistoryResponseDto>> aVar) {
        return this.networkService.getSocialSearchHistoryData(aVar);
    }

    public final Object getSocialsHomeLevelPermissions(@NotNull yt.a<? super v0<BaseResponseDto<SocialHomePermissionsDto>>> aVar) {
        return this.networkService.getBigbossHomeLevelPermissions(aVar);
    }

    @NotNull
    public final m<MessageListDto> getStarredMessagesForUser(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return this.networkService.getStarredMessagesForUser(this.userPreferences.getUuid(), groupId, Boolean.TRUE, "updated_at_micros");
    }

    public final Object getStickerData(@NotNull yt.a<? super NetworkResult<BaseResponseDto<StickersDto>>> aVar) {
        return safeApiCall(new ChatRepository$getStickerData$2(this, null), aVar);
    }

    public final Object getUserGlobalRole(String str, String str2, @NotNull yt.a<? super v0<GroupMembersDto>> aVar) {
        return this.networkService.getUserGlobalRole(str, str2, true, aVar);
    }

    public final String getUserId() {
        return this.userPreferences.getUuid();
    }

    @NotNull
    public final String getUserName() {
        return this.userPreferences.getUserDisplayName();
    }

    @NotNull
    public final m<UserReportStatusDto> getUserReportedStatus(String userId) {
        return this.networkService.getUserReportedStatus(userId);
    }

    public final Object getUserSocialAuthStatus(@NotNull yt.a<? super v0<UserSocialAuthStatusDto>> aVar) {
        return this.networkService.getUserSocialAuthStatus(this.userPreferences.getUuid(), aVar);
    }

    public final Object getUsersBlockedList(int i10, int i11, @NotNull yt.a<? super v0<BaseResponseDto<BlockedUserListDto>>> aVar) {
        return this.networkService.getUsersBlockedList(i10, i11, aVar);
    }

    public final Object joinSocialGroup(String str, String str2, @NotNull yt.a<? super v0<UserGroupInfo>> aVar) {
        return this.networkService.joinSocialGroup(new JoinSocialGroupRequestDto(str, this.userPreferences.getUuid(), str2), aVar);
    }

    @NotNull
    public final m<MessageListDto> loadMessages(String groupId, long updatedAtLte) {
        NetworkService networkService = this.networkService;
        Long valueOf = Long.valueOf(updatedAtLte);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        return networkService.loadMessages(groupId, valueOf, "updated_at_micros", 50, bool, bool2, bool2, bool2, "small");
    }

    public final Object manageMember(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseV2Dto<ManageMemberResponse>>> aVar) {
        return this.networkService.manageMember(str, new ManageMemberRequest(str2), aVar);
    }

    @NotNull
    public final m<Object> markMessagesAsRead(String userId, String groupId, String lastReadMessageId, Long lastReadMessageServerTimeStamp) {
        return this.networkService.markMessagesAsRead(new MarkReadMessagesDto(groupId, userId, lastReadMessageServerTimeStamp, lastReadMessageId));
    }

    @NotNull
    public final m<Object> messageInteraction(String messageId, boolean isLiked, String groupId) {
        return this.networkService.messageInteraction(new MessageInteractionRequestDto(this.userPreferences.getUuid(), messageId, isLiked, groupId));
    }

    @NotNull
    public final m<Unit> pinMessageToGroup(String senderId, String groupId, String messageId, Boolean isPinned) {
        return this.networkService.pinMessageToGroup(new PinnedMessageDto(senderId, messageId, groupId, isPinned));
    }

    public final Object removeGroupMember(@NotNull String str, String str2, @NotNull yt.a<? super v0<Unit>> aVar) {
        return this.networkService.removeGroupMember(new RemoveMemberDto(str, str2, "Exited"), aVar);
    }

    public final Object reportChatGroup(boolean z10, @NotNull String str, @NotNull yt.a<? super v0<ReportChatGroupRequestDto>> aVar) {
        return this.networkService.reportChatGroup(new ReportChatGroupRequestDto(z10, str), aVar);
    }

    @NotNull
    public final m<ReportedEntityConfirmationDto> reportUser(boolean isReported, String userToBeReported, @NotNull String code, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        return this.networkService.reportUser(new ReportUserRequestDto(isReported, userToBeReported, code, subReasonCode, reasonText));
    }

    @NotNull
    public final m<ReportedEntityConfirmationDto> reportUserChatMessage(String code, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return this.networkService.reportUserChatMessage(code, messageId);
    }

    @NotNull
    public final m<ReportedEntityConfirmationDto> reportUserChatMessageV2(@NotNull String messageId, @NotNull String code, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        return this.networkService.reportUserChatMessageV2(new ReportMessageRequestDto(messageId, code, subReasonCode, reasonText));
    }

    @NotNull
    public final m<Object> saveUserSocialData(@NotNull SocialDataDto socialDataDto, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return this.networkService.saveUserSocialData(platform, socialDataDto);
    }

    @NotNull
    public final m<GroupMembersDto> searchGroupMembers(String groupId, @NotNull String searchString, int limit, int offset) {
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        return this.networkService.searchGroupMembers(groupId, searchString, limit, offset, "small");
    }

    @NotNull
    public final m<Object> starMessageForUser(String groupId, String messageId, Boolean isStarred) {
        return this.networkService.starMessageForUser(new StarMessageRequestDto(this.userPreferences.getUuid(), groupId, messageId, isStarred));
    }

    @NotNull
    public final m<AssetUploadResponse> uploadChatAssets(String groupId, @NotNull String messageId, @NotNull File file, @NotNull String type) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.networkService.uploadChatAssets(groupId, messageId, MultipartBody.Part.INSTANCE.createFormData("media", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(type))));
    }

    @NotNull
    public final m<AssetUploadResponse> uploadChatGroupAssets(String groupId, @NotNull File file, @NotNull String type, @NotNull GroupImageType imageType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        MultipartBody.Part createFormData = MultipartBody.Part.INSTANCE.createFormData("media", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(type)));
        return this.networkService.uploadChatGroupAssets(groupId, imageType.getParamName(), a3.a.d("toString(...)"), createFormData);
    }
}
