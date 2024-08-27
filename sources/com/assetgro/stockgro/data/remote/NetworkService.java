package com.assetgro.stockgro.data.remote;

import at.m;
import com.assetgro.stockgro.data.ArenaAchievementShareDto;
import com.assetgro.stockgro.data.model.AccountDeleteRequest;
import com.assetgro.stockgro.data.model.AccountDeleteResponse;
import com.assetgro.stockgro.data.model.AddGroupMembersDto;
import com.assetgro.stockgro.data.model.AssetInsightsDto;
import com.assetgro.stockgro.data.model.CancelOrderRequestDto;
import com.assetgro.stockgro.data.model.ChampionDto;
import com.assetgro.stockgro.data.model.ChatNotificationDto;
import com.assetgro.stockgro.data.model.ContactUpload;
import com.assetgro.stockgro.data.model.CountriesDto;
import com.assetgro.stockgro.data.model.CreateGroupSearchResponse;
import com.assetgro.stockgro.data.model.CreateGroupUsersResponse;
import com.assetgro.stockgro.data.model.DeactivatedMemberDto;
import com.assetgro.stockgro.data.model.DiscoverDto;
import com.assetgro.stockgro.data.model.FeedbackRequestDto;
import com.assetgro.stockgro.data.model.FollowerDto;
import com.assetgro.stockgro.data.model.FollowerFollowingData;
import com.assetgro.stockgro.data.model.FriendMemberDto;
import com.assetgro.stockgro.data.model.GeoDto;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupInfoInvitesResponse;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.InvitedFriendDto;
import com.assetgro.stockgro.data.model.KycEmailSupportRequestDto;
import com.assetgro.stockgro.data.model.KycFAQResponse;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.LinkedInEmailModel;
import com.assetgro.stockgro.data.model.LinkedInProfileModel;
import com.assetgro.stockgro.data.model.ManageMemberResponse;
import com.assetgro.stockgro.data.model.MarketSearchResponseDto;
import com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse;
import com.assetgro.stockgro.data.model.MessageListDto;
import com.assetgro.stockgro.data.model.MessageThreadInfoDto;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.model.OpenForAudienceDto;
import com.assetgro.stockgro.data.model.PinnedMessageDto;
import com.assetgro.stockgro.data.model.PrivateChatGroup;
import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.model.RedeemedOffers;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.model.RenamePortfolioDto;
import com.assetgro.stockgro.data.model.ReportEntityRequestDto;
import com.assetgro.stockgro.data.model.ReportUserReasonsDto;
import com.assetgro.stockgro.data.model.ReportedEntityConfirmationDto;
import com.assetgro.stockgro.data.model.ResetPortfolioDto;
import com.assetgro.stockgro.data.model.RogueUserDto;
import com.assetgro.stockgro.data.model.SocialCategoryDto;
import com.assetgro.stockgro.data.model.SocialChatGroup;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.data.model.SocialGlobalRoleDto;
import com.assetgro.stockgro.data.model.StickersDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockGyanDto;
import com.assetgro.stockgro.data.model.StockGyanInteractionDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.StockSellOrderRequestDto;
import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.model.SupportGroup;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.model.UserChatGroupsResponse;
import com.assetgro.stockgro.data.model.UserDefaultPortfolioDto;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.data.model.VideoTutorialDataResponse;
import com.assetgro.stockgro.data.model.WalletTransactionsDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaAllData;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.model.homedata.ScrollDepth;
import com.assetgro.stockgro.data.model.homedata.WidgetData;
import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.data.model.socialgroups.SocialGroupsItem;
import com.assetgro.stockgro.data.remote.request.ActiveMemberDto;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.data.remote.request.BanMemberDto;
import com.assetgro.stockgro.data.remote.request.BlockPrivateChatUserRequestDto;
import com.assetgro.stockgro.data.remote.request.CreatePostCommentRequestDto;
import com.assetgro.stockgro.data.remote.request.EditGroupCoverImageDto;
import com.assetgro.stockgro.data.remote.request.EditGroupDescriptionDto;
import com.assetgro.stockgro.data.remote.request.EditGroupDisplayImageDto;
import com.assetgro.stockgro.data.remote.request.EditGroupNameRequestDto;
import com.assetgro.stockgro.data.remote.request.ExitChatGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.FeedPostReactionDto;
import com.assetgro.stockgro.data.remote.request.FriendRequestDto;
import com.assetgro.stockgro.data.remote.request.JoinSocialGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.JusPayInitiateRequest;
import com.assetgro.stockgro.data.remote.request.JusPayTransactionStatusRequest;
import com.assetgro.stockgro.data.remote.request.LeagueExitRequestDto;
import com.assetgro.stockgro.data.remote.request.LeagueJoinRequestDto;
import com.assetgro.stockgro.data.remote.request.LeagueReportRequestDto;
import com.assetgro.stockgro.data.remote.request.ManageMemberRequest;
import com.assetgro.stockgro.data.remote.request.MarkReadMessagesDto;
import com.assetgro.stockgro.data.remote.request.MessageInteractionRequestDto;
import com.assetgro.stockgro.data.remote.request.ModifyOrderRequestDto;
import com.assetgro.stockgro.data.remote.request.MuteChatDto;
import com.assetgro.stockgro.data.remote.request.NotificationIdUpdateDto;
import com.assetgro.stockgro.data.remote.request.PinLoginRequestDto;
import com.assetgro.stockgro.data.remote.request.PinnedChatDto;
import com.assetgro.stockgro.data.remote.request.PostCommentReactionDto;
import com.assetgro.stockgro.data.remote.request.RemoveMemberDto;
import com.assetgro.stockgro.data.remote.request.ReportChatGroupRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportCommentRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportMessageRequestDto;
import com.assetgro.stockgro.data.remote.request.ReportUserRequestDto;
import com.assetgro.stockgro.data.remote.request.SocialShareTrackingRequestDto;
import com.assetgro.stockgro.data.remote.request.StarMessageRequestDto;
import com.assetgro.stockgro.data.remote.request.StockBuyOrderRequestDto;
import com.assetgro.stockgro.data.remote.request.SubscriptionPlanPurchaseRequestDto;
import com.assetgro.stockgro.data.remote.request.TransactionStatusRequestDto;
import com.assetgro.stockgro.data.remote.request.UnlockPortfolioRequest;
import com.assetgro.stockgro.data.remote.request.UpdatePinNumberRequestDtoV2;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import com.assetgro.stockgro.data.remote.request.WithdrawProcessDto;
import com.assetgro.stockgro.data.remote.response.AddResponse;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.data.remote.response.ContactResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.remote.response.JusPayInitiateResponse;
import com.assetgro.stockgro.data.remote.response.LeagueEligibiltyResponseDto;
import com.assetgro.stockgro.data.remote.response.LifetimeEarning;
import com.assetgro.stockgro.data.remote.response.LinkedInTokenResponseDto;
import com.assetgro.stockgro.data.remote.response.MaintenanceResponse;
import com.assetgro.stockgro.data.remote.response.MaintenanceResponseV2;
import com.assetgro.stockgro.data.remote.response.ReportEntityReasonsDto;
import com.assetgro.stockgro.data.remote.response.ServerTimeResponse;
import com.assetgro.stockgro.data.remote.response.SocialConfigResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialRoleResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialSearchResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionDowngradePromptResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionMaintenanceResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionNudgeResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse;
import com.assetgro.stockgro.data.remote.response.TokenRefreshResponseDto;
import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import com.assetgro.stockgro.data.remote.response.TransactionStatusResponse;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioResponse;
import com.assetgro.stockgro.data.remote.response.UpdatePostBookMarkStatusDto;
import com.assetgro.stockgro.data.remote.response.UserStatsAndResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawInitiateResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawOtpRegenerateResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawProcessResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawableLimitDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.MarketOptionDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionChainDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionHistoryDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewDto;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioFnoHoldingResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_onboarding.data.remote.NumberLoginRequestDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.OnboardingResponseDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.PhoneNumberDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.RegisterRequestDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedStoryResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedStreamDto;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.missions.data.remote.MissionDetailDto;
import com.assetgro.stockgro.missions.data.remote.MissionMetaDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHistoryByStatusDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHistoryConsolidatedDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHomeDto;
import com.assetgro.stockgro.ui.home.homepage.data.MainHomeDto;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioFnoHistoryData;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioFnoOrderResponse;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioPendingOrderCancelRequest;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfoliosDto;
import com.assetgro.stockgro.ui.social.data.remote.BlockedUserListDto;
import com.assetgro.stockgro.ui.social.data.remote.GroupMemberRoleDto;
import com.assetgro.stockgro.ui.social.data.remote.PostCommentsDto;
import com.assetgro.stockgro.ui.social.data.remote.SocialHomePermissionsDto;
import com.assetgro.stockgro.ui.social.data.remote.SubCategoryInteractionDto;
import com.assetgro.stockgro.ui.social.data.remote.UserGroupLevelPermissionsDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.MarketOverviewDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisBvpsConfigDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisCalculationType;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisEmaConfigDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartBaseDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartV2Dto;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import pv.b;
import pv.f;
import pv.h;
import pv.k;
import pv.l;
import pv.n;
import pv.o;
import pv.p;
import pv.q;
import pv.s;
import pv.t;
import sh.c;
import yt.a;

@Singleton
@Metadata(d1 = {"\u0000À\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\nH'J2\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\nH'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u001cH'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u001c2\b\b\u0001\u0010#\u001a\u00020\nH'J(\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u001c2\b\b\u0001\u0010#\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020&H'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u001c2\b\b\u0001\u0010#\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020&H'J(\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u001c2\b\b\u0001\u0010+\u001a\u00020\n2\b\b\u0001\u0010-\u001a\u00020,H'J(\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u001c2\b\b\u0001\u0010+\u001a\u00020\n2\b\b\u0001\u0010-\u001a\u00020,H'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u001c2\b\b\u0001\u0010#\u001a\u00020\nH'J(\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u001c2\b\b\u0001\u00102\u001a\u00020\n2\b\b\u0001\u0010+\u001a\u00020\nH'J&\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u00050\u001c2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\nH'J*\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u001c2\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0019\u001a\u00020\nH'J>\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00050\u001c2\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010;\u001a\u00020\n2\b\b\u0001\u0010<\u001a\u00020\nH'J^\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\bC\u0010DJ(\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00050\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\bF\u0010GJ:\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\bI\u0010JJ\u001e\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\b\b\u0001\u0010L\u001a\u00020KH'J&\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010O\u001a\u00020NH§@¢\u0006\u0004\bP\u0010QJ1\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u00050\u001c2\b\b\u0001\u0010R\u001a\u00020\n2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010SH'¢\u0006\u0004\bV\u0010WJ&\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u00050\u00042\b\b\u0001\u0010R\u001a\u00020\nH§@¢\u0006\u0004\bY\u0010GJ&\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00050\u00042\b\b\u0001\u0010R\u001a\u00020\nH§@¢\u0006\u0004\b[\u0010GJJ\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\u00050\u00042\b\b\u0001\u00102\u001a\u00020\n2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010@2\n\b\u0001\u0010]\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\b_\u0010`Jd\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\u00050\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010@2\n\b\u0001\u0010]\u001a\u0004\u0018\u00010@2\n\b\u0003\u0010a\u001a\u0004\u0018\u00010@2\n\b\u0003\u0010b\u001a\u0004\u0018\u00010@H§@¢\u0006\u0004\bc\u0010dJ(\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\b\b\u0001\u0010+\u001a\u00020\n2\b\b\u0001\u0010f\u001a\u00020eH'J&\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020hH§@¢\u0006\u0004\bi\u0010jJ&\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020kH§@¢\u0006\u0004\bl\u0010mJ&\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020kH§@¢\u0006\u0004\bn\u0010mJ0\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0q0\u00042\b\b\u0001\u0010o\u001a\u00020S2\b\b\u0001\u0010p\u001a\u00020SH§@¢\u0006\u0004\bs\u0010tJ:\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0q0\u00042\b\b\u0001\u0010o\u001a\u00020S2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010u\u001a\u00020\nH§@¢\u0006\u0004\bv\u0010wJ:\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0q0\u00042\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\b\b\u0001\u0010u\u001a\u00020\nH§@¢\u0006\u0004\by\u0010wJN\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0q0\u00042\b\b\u0001\u0010z\u001a\u00020\n2\b\b\u0001\u0010{\u001a\u00020S2\b\b\u0001\u0010|\u001a\u00020S2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020SH§@¢\u0006\u0004\b~\u0010\u007fJ[\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0q0\u00042\b\b\u0001\u0010z\u001a\u00020\n2\b\b\u0001\u0010{\u001a\u00020S2\b\b\u0001\u0010|\u001a\u00020S2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\b\b\u0001\u0010u\u001a\u00020\nH§@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001JJ\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010q0\u00042\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\t\b\u0003\u0010\u0082\u0001\u001a\u00020\n2\t\b\u0003\u0010\u0083\u0001\u001a\u00020@H§@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J)\u0010\u0089\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u0001060\u00050\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J!\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010\u00050\u001c2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\nH'J*\u0010\u008d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010\u00050\u00042\t\b\u0001\u0010\u008a\u0001\u001a\u00020\nH§@¢\u0006\u0005\b\u008d\u0001\u0010GJ%\u0010\u008f\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u0001060\u00050\u0004H§@¢\u0006\u0005\b\u008f\u0001\u0010\u0018J\u001f\u0010\u0091\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u00010\u00050\u0004H§@¢\u0006\u0005\b\u0091\u0001\u0010\u0018J\u001f\u0010\u0093\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u00010\u00050\u0004H§@¢\u0006\u0005\b\u0093\u0001\u0010\u0018J'\u0010\u0096\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u0001060\u00050\u001c2\t\b\u0001\u0010\u0094\u0001\u001a\u00020SH'J\u0015\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00050\u001cH'J\u0015\u0010\u0098\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00050\u001cH'J)\u0010\u0099\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0016\u0010\u009c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009b\u00010\u00050\u001cH'J8\u0010 \u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009f\u00010q0\u00042\u000b\b\u0001\u0010\u009d\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u009e\u0001\u001a\u00020\nH§@¢\u0006\u0006\b \u0001\u0010¡\u0001J@\u0010¥\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¤\u00010\u00050\u001c2\b\b\u0001\u00102\u001a\u00020\n2\b\b\u0001\u0010+\u001a\u00020\n2\t\b\u0001\u0010¢\u0001\u001a\u00020\n2\t\b\u0001\u0010£\u0001\u001a\u00020\nH'J\u0015\u0010¦\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001cH'J \u0010¨\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\t\b\u0001\u0010§\u0001\u001a\u00020\nH'J!\u0010«\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010ª\u0001\u001a\u00030©\u0001H'J\u0016\u0010\u00ad\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¬\u00010\u00050\u001cH'J*\u0010¯\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\b\b\u0001\u0010+\u001a\u00020\n2\t\b\u0001\u0010\u0003\u001a\u00030®\u0001H'J!\u0010²\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\n\b\u0001\u0010±\u0001\u001a\u00030°\u0001H'J!\u0010µ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\n\b\u0001\u0010´\u0001\u001a\u00030³\u0001H'J!\u0010¸\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\n\b\u0001\u0010·\u0001\u001a\u00030¶\u0001H'J!\u0010»\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010º\u0001\u001a\u00030¹\u0001H'J'\u0010¾\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030½\u0001060\u00050\u001c2\t\b\u0001\u0010¼\u0001\u001a\u00020\nH'J2\u0010Â\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Á\u0001060À\u00010\u001c2\b\b\u0001\u0010\u001a\u001a\u00020\n2\t\b\u0001\u0010¿\u0001\u001a\u00020\nH'J \u0010Ä\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\t\b\u0001\u0010Ã\u0001\u001a\u00020\nH'JK\u0010È\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ç\u00010q0\u00042\t\b\u0001\u0010\u0087\u0001\u001a\u00020\n2\t\b\u0001\u0010Å\u0001\u001a\u00020\n2\t\b\u0001\u0010Æ\u0001\u001a\u00020S2\b\b\u0001\u0010T\u001a\u00020SH§@¢\u0006\u0006\bÈ\u0001\u0010É\u0001Jx\u0010Ñ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ð\u00010\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\n2\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Ë\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Ì\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Í\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Î\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Ï\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J>\u0010Õ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\t\b\u0001\u0010Ó\u0001\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\t\b\u0001\u0010Ô\u0001\u001a\u00020\nH§@¢\u0006\u0005\bÕ\u0001\u0010\u0015JL\u0010×\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\t\b\u0001\u0010Ö\u0001\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000b\b\u0001\u0010Ó\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010Ô\u0001\u001a\u00020\nH§@¢\u0006\u0006\b×\u0001\u0010Ø\u0001J!\u0010Û\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010Ú\u0001\u001a\u00030Ù\u0001H'J!\u0010Þ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010Ý\u0001\u001a\u00030Ü\u0001H'J\u001c\u0010à\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ß\u0001060\u00050\u001cH'J\u0010\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030á\u00010\u001cH'J\u0016\u0010ä\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ã\u00010\u00050\u001cH'J!\u0010ç\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010æ\u0001\u001a\u00030å\u0001H'J\u0010\u0010é\u0001\u001a\t\u0012\u0005\u0012\u00030è\u00010\u001cH'J)\u0010ì\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030½\u00010ê\u0001j\n\u0012\u0005\u0012\u00030½\u0001`ë\u00010\u00050\u001cH'J#\u0010î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030í\u00010\u00050\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J#\u0010ð\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ï\u00010\u00050\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J)\u0010ò\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030ñ\u00010ê\u0001j\n\u0012\u0005\u0012\u00030ñ\u0001`ë\u00010\u00050\u001cH'J)\u0010ô\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030ó\u00010ê\u0001j\n\u0012\u0005\u0012\u00030ó\u0001`ë\u00010\u00050\u001cH'J!\u0010ö\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ñ\u00010\u00050\u001c2\t\b\u0001\u0010õ\u0001\u001a\u00020\nH'J \u0010÷\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\t\b\u0001\u0010õ\u0001\u001a\u00020\nH'J!\u0010ú\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001c2\n\b\u0001\u0010ù\u0001\u001a\u00030ø\u0001H'J\u0010\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\u001cH'J\u0088\u0001\u0010\u0083\u0002\u001a\t\u0012\u0005\u0012\u00030\u0082\u00020\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010ý\u0001\u001a\u00020@2\t\b\u0001\u0010þ\u0001\u001a\u00020@2\t\b\u0001\u0010ÿ\u0001\u001a\u00020@2\t\b\u0001\u0010Ì\u0001\u001a\u00020\n2\t\b\u0001\u0010\u0080\u0002\u001a\u00020\n2\t\b\u0001\u0010\u0082\u0001\u001a\u00020\n2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\t\b\u0001\u0010\u0081\u0002\u001a\u00020@H§@¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002JW\u0010\u008a\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00020\u00050\u001c2\b\b\u0001\u0010u\u001a\u00020\n2\t\b\u0001\u0010\u0085\u0002\u001a\u00020@2\t\b\u0001\u0010\u0086\u0002\u001a\u00020@2\t\b\u0001\u0010\u0087\u0002\u001a\u00020@2\t\b\u0001\u0010\u0088\u0002\u001a\u00020@2\t\b\u0001\u0010¼\u0001\u001a\u00020\nH'J!\u0010\u008d\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010\u008c\u0002\u001a\u00030\u008b\u0002H'J[\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u001c2\t\b\u0001\u0010\u008e\u0002\u001a\u00020\n2\t\b\u0001\u0010Ì\u0001\u001a\u00020\n2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\t\b\u0001\u0010\u0080\u0002\u001a\u00020\n2\t\b\u0001\u0010¼\u0001\u001a\u00020\n2\t\b\u0001\u0010\u008f\u0002\u001a\u00020@H'J3\u0010\u0096\u0002\u001a\t\u0012\u0005\u0012\u00030\u0095\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u0092\u0002\u001a\u00020\n2\n\b\u0001\u0010\u0094\u0002\u001a\u00030\u0093\u0002H'J>\u0010\u0099\u0002\u001a\t\u0012\u0005\u0012\u00030\u0095\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u0097\u0002\u001a\u00020\n2\t\b\u0001\u0010\u0098\u0002\u001a\u00020\n2\n\b\u0001\u0010\u0094\u0002\u001a\u00030\u0093\u0002H'J\u001f\u0010\u009b\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00020\u00050\u0004H§@¢\u0006\u0005\b\u009b\u0002\u0010\u0018JI\u0010\u009d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u001c2\u000b\b\u0001\u0010\u008e\u0002\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u009c\u0002\u001a\u00020\n2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\u000b\b\u0001\u0010¼\u0001\u001a\u0004\u0018\u00010\nH'J&\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010\u009f\u0002\u001a\u00030\u009e\u0002H§@¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001c\u0010¥\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u001c2\n\b\u0001\u0010¤\u0002\u001a\u00030£\u0002H'J\u001c\u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u001c2\n\b\u0001\u0010¤\u0002\u001a\u00030¦\u0002H'J\u001c\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u001c2\n\b\u0001\u0010¤\u0002\u001a\u00030¨\u0002H'J\u001c\u0010«\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u001c2\n\b\u0001\u0010¤\u0002\u001a\u00030ª\u0002H'J\u0010\u0010\u00ad\u0002\u001a\t\u0012\u0005\u0012\u00030¬\u00020\u001cH'J&\u0010°\u0002\u001a\t\u0012\u0005\u0012\u00030¯\u00020\u00042\n\b\u0001\u0010¤\u0002\u001a\u00030®\u0002H§@¢\u0006\u0006\b°\u0002\u0010±\u0002J&\u0010´\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010³\u0002\u001a\u00030²\u0002H§@¢\u0006\u0006\b´\u0002\u0010µ\u0002J&\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010·\u0002\u001a\u00030¶\u0002H§@¢\u0006\u0006\b¸\u0002\u0010¹\u0002J\u001b\u0010¼\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\n\b\u0001\u0010»\u0002\u001a\u00030º\u0002H'J3\u0010¿\u0002\u001a\t\u0012\u0005\u0012\u00030¾\u00020\u001c2\u000b\b\u0001\u0010\u008e\u0002\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010½\u0002\u001a\u00020@2\t\b\u0001\u0010Ì\u0001\u001a\u00020\nH'J&\u0010Â\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010Á\u0002\u001a\u00030À\u0002H§@¢\u0006\u0006\bÂ\u0002\u0010Ã\u0002JZ\u0010É\u0002\u001a\t\u0012\u0005\u0012\u00030È\u00020\u001c2\u000b\b\u0001\u0010\u008e\u0002\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Ä\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Å\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Æ\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Ç\u0002\u001a\u0004\u0018\u00010@H'¢\u0006\u0006\bÉ\u0002\u0010Ê\u0002J\u008d\u0001\u0010Î\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\f\b\u0001\u0010Ì\u0002\u001a\u0005\u0018\u00010Ë\u00022\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010S2\u000b\b\u0001\u0010Ä\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Å\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Æ\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Ç\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010¼\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0006\bÎ\u0002\u0010Ï\u0002J~\u0010Ð\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010S2\u000b\b\u0001\u0010Ä\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Å\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Æ\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Ç\u0002\u001a\u0004\u0018\u00010@2\n\b\u0001\u0010o\u001a\u0004\u0018\u00010SH'¢\u0006\u0006\bÐ\u0002\u0010Ñ\u0002J\u001b\u0010Ô\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\n\b\u0001\u0010Ó\u0002\u001a\u00030Ò\u0002H'J\u001c\u0010×\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u001c2\n\b\u0001\u0010Ö\u0002\u001a\u00030Õ\u0002H'J?\u0010Ù\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010Ø\u0002\u001a\u00020@2\t\b\u0001\u0010Å\u0002\u001a\u00020@2\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\nH'JW\u0010Û\u0002\u001a\t\u0012\u0005\u0012\u00030Ú\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010S2\n\b\u0001\u0010o\u001a\u0004\u0018\u00010S2\u000b\b\u0001\u0010\u009c\u0002\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0006\bÛ\u0002\u0010Ü\u0002J\u001b\u0010ß\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\n\b\u0001\u0010Þ\u0002\u001a\u00030Ý\u0002H'JL\u0010à\u0002\u001a\t\u0012\u0005\u0012\u00030Í\u00020\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Å\u0002\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\nH'¢\u0006\u0006\bà\u0002\u0010á\u0002JJ\u0010ã\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u001c2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010â\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010S2\n\b\u0001\u0010o\u001a\u0004\u0018\u00010SH'¢\u0006\u0006\bã\u0002\u0010ä\u0002J\u001b\u0010ç\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\n\b\u0001\u0010æ\u0002\u001a\u00030å\u0002H'J&\u0010ê\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010é\u0002\u001a\u00030è\u0002H§@¢\u0006\u0006\bê\u0002\u0010ë\u0002J(\u0010ï\u0002\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030î\u0002060\u00050\u001c2\n\b\u0001\u0010í\u0002\u001a\u00030ì\u0002H'J&\u0010ò\u0002\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010ñ\u0002\u001a\u00030ð\u0002H§@¢\u0006\u0006\bò\u0002\u0010ó\u0002J5\u0010÷\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0005\u0012\u00030ö\u00020ê\u0001j\n\u0012\u0005\u0012\u00030ö\u0002`ë\u00010\u00050\u001c2\n\b\u0001\u0010õ\u0002\u001a\u00030ô\u0002H'J>\u0010ø\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u008f\u0002\u001a\u00020@H§@¢\u0006\u0006\bø\u0002\u0010ù\u0002J\u001d\u0010û\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J\"\u0010ÿ\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030þ\u00020\u00050\u001c2\n\b\u0001\u0010ý\u0002\u001a\u00030ü\u0002H'J!\u0010\u0080\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010ý\u0002\u001a\u00030ü\u0002H'J!\u0010\u0083\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\n\b\u0001\u0010\u0082\u0003\u001a\u00030\u0081\u0003H'J\u0016\u0010\u0085\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00030\u00050\u001cH'J\"\u0010\u0088\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00030\u00050\u001c2\n\b\u0001\u0010\u0087\u0003\u001a\u00030\u0086\u0003H'J \u0010\u008a\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00030\u00050\u001c2\b\b\u0001\u0010R\u001a\u00020\nH'J&\u0010\u008e\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\t\b\u0001\u0010\u008b\u0003\u001a\u00020\n2\n\b\u0001\u0010\u008d\u0003\u001a\u00030\u008c\u0003H'J&\u0010\u0090\u0003\u001a\t\u0012\u0005\u0012\u00030\u008f\u00030\u00042\u000b\b\u0001\u0010\u008e\u0002\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\b\u0090\u0003\u0010GJ.\u0010\u0094\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00030\u00050\u00042\f\b\u0001\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0091\u0003H§@¢\u0006\u0006\b\u0094\u0003\u0010\u0095\u0003J\u0016\u0010\u0097\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00030\u00050\u001cH'J2\u0010\u009a\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0099\u0003060\u00050\u00042\u000b\b\u0003\u0010\u0098\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\b\u009a\u0003\u0010GJ\u001d\u0010\u009c\u0003\u001a\t\u0012\u0005\u0012\u00030\u009b\u00030\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J\u001d\u0010\u009d\u0003\u001a\t\u0012\u0005\u0012\u00030\u009b\u00030\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J.\u0010 \u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u009f\u0003\u001a\u00030\u009e\u0003H'J\u001f\u0010¢\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00030q0\u0004H§@¢\u0006\u0005\b¢\u0003\u0010\u0018J6\u0010¦\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00030q0\u00042\t\b\u0001\u0010£\u0003\u001a\u00020\n2\t\b\u0001\u0010¤\u0003\u001a\u00020@H§@¢\u0006\u0006\b¦\u0003\u0010§\u0003J,\u0010«\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ª\u00030q0\u00042\n\b\u0001\u0010©\u0003\u001a\u00030¨\u0003H§@¢\u0006\u0006\b«\u0003\u0010¬\u0003J*\u0010®\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u00030q0\u00042\t\b\u0001\u0010£\u0003\u001a\u00020\nH§@¢\u0006\u0005\b®\u0003\u0010GJ,\u0010²\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030±\u00030\u00050\u00042\n\b\u0001\u0010°\u0003\u001a\u00030¯\u0003H§@¢\u0006\u0006\b²\u0003\u0010³\u0003J0\u0010µ\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030´\u0003060q0\u00042\t\b\u0001\u0010\u0087\u0001\u001a\u00020\nH§@¢\u0006\u0005\bµ\u0003\u0010GJ0\u0010¶\u0003\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030´\u0003060q0\u00042\t\b\u0001\u0010\u0087\u0001\u001a\u00020\nH§@¢\u0006\u0005\b¶\u0003\u0010GJ*\u0010¹\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¸\u0003060\u00042\t\b\u0001\u0010·\u0003\u001a\u00020\nH§@¢\u0006\u0005\b¹\u0003\u0010GJ,\u0010½\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¼\u00030q0\u00042\n\b\u0001\u0010»\u0003\u001a\u00030º\u0003H§@¢\u0006\u0006\b½\u0003\u0010¾\u0003J(\u0010Á\u0003\u001a\t\u0012\u0005\u0012\u00030À\u00030\u001c2\u000b\b\u0001\u0010¿\u0003\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010\u0092\u0002\u001a\u00020\nH'J\u001c\u0010Ä\u0003\u001a\t\u0012\u0005\u0012\u00030À\u00030\u001c2\n\b\u0001\u0010Ã\u0003\u001a\u00030Â\u0003H'J\u001c\u0010Ç\u0003\u001a\t\u0012\u0005\u0012\u00030 \u00020\u001c2\n\b\u0001\u0010Æ\u0003\u001a\u00030Å\u0003H'J&\u0010È\u0003\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010Æ\u0003\u001a\u00030Å\u0003H§@¢\u0006\u0006\bÈ\u0003\u0010É\u0003J\u001d\u0010Ë\u0003\u001a\t\u0012\u0005\u0012\u00030Ê\u00030\u001c2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH'J,\u0010Í\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00030q0\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\bÍ\u0003\u0010GJ\u001c\u0010Ð\u0003\u001a\t\u0012\u0005\u0012\u00030À\u00030\u001c2\n\b\u0001\u0010Ï\u0003\u001a\u00030Î\u0003H'J\u0010\u0010Ò\u0003\u001a\t\u0012\u0005\u0012\u00030Ñ\u00030\u001cH'J\u0010\u0010Ó\u0003\u001a\t\u0012\u0005\u0012\u00030Ñ\u00030\u001cH'J\u0016\u0010Õ\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00030\u00050\u001cH'J)\u0010×\u0003\u001a\t\u0012\u0005\u0012\u00030\u0095\u00020\u001c2\u000b\b\u0001\u0010Ö\u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0094\u0002\u001a\u00030\u0093\u0002H'J)\u0010Ü\u0003\u001a\t\u0012\u0005\u0012\u00030Û\u00030\u001c2\u000b\b\u0001\u0010Ø\u0003\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010Ú\u0003\u001a\u00030Ù\u0003H'J\u0019\u0010Ý\u0003\u001a\t\u0012\u0005\u0012\u00030Û\u00030\u0004H§@¢\u0006\u0005\bÝ\u0003\u0010\u0018J,\u0010à\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ß\u00030q0\u00042\u000b\b\u0001\u0010Þ\u0003\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\bà\u0003\u0010GJ\u001f\u0010â\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030á\u00030q0\u0004H§@¢\u0006\u0005\bâ\u0003\u0010\u0018J&\u0010å\u0003\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010ä\u0003\u001a\u00030ã\u0003H§@¢\u0006\u0006\bå\u0003\u0010æ\u0003J\u001b\u0010é\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\n\b\u0001\u0010è\u0003\u001a\u00030ç\u0003H'JH\u0010ì\u0003\u001a\t\u0012\u0005\u0012\u00030ë\u00030\u00042\t\b\u0001\u0010ê\u0003\u001a\u00020\n2\t\b\u0001\u0010\u009c\u0002\u001a\u00020\n2\n\b\u0001\u0010o\u001a\u0004\u0018\u00010S2\n\b\u0001\u0010p\u001a\u0004\u0018\u00010SH§@¢\u0006\u0006\bì\u0003\u0010í\u0003J<\u0010ï\u0003\u001a\t\u0012\u0005\u0012\u00030î\u00030\u00042\b\b\u0001\u0010\u001f\u001a\u00020\n2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010SH§@¢\u0006\u0006\bï\u0003\u0010ð\u0003J\u0019\u0010ò\u0003\u001a\t\u0012\u0005\u0012\u00030ñ\u00030\u0004H§@¢\u0006\u0005\bò\u0003\u0010\u0018J\u000f\u0010ó\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH'JQ\u0010ù\u0003\u001a\t\u0012\u0005\u0012\u00030ø\u00030\u00042\t\b\u0001\u0010ô\u0003\u001a\u00020\n2\t\b\u0001\u0010¿\u0003\u001a\u00020\n2\t\b\u0001\u0010õ\u0003\u001a\u00020\n2\t\b\u0001\u0010ö\u0003\u001a\u00020\n2\t\b\u0001\u0010÷\u0003\u001a\u00020\nH§@¢\u0006\u0006\bù\u0003\u0010ú\u0003J$\u0010ý\u0003\u001a\t\u0012\u0005\u0012\u00030ü\u00030\u00042\t\b\u0001\u0010û\u0003\u001a\u00020\nH§@¢\u0006\u0005\bý\u0003\u0010GJ$\u0010ÿ\u0003\u001a\t\u0012\u0005\u0012\u00030þ\u00030\u00042\t\b\u0001\u0010û\u0003\u001a\u00020\nH§@¢\u0006\u0005\bÿ\u0003\u0010GJ&\u0010\u0082\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010\u0081\u0004\u001a\u00030\u0080\u0004H§@¢\u0006\u0006\b\u0082\u0004\u0010\u0083\u0004J&\u0010\u0086\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010\u0085\u0004\u001a\u00030\u0084\u0004H§@¢\u0006\u0006\b\u0086\u0004\u0010\u0087\u0004J&\u0010\u008a\u0004\u001a\t\u0012\u0005\u0012\u00030\u0088\u00040\u00042\n\b\u0001\u0010\u0089\u0004\u001a\u00030\u0088\u0004H§@¢\u0006\u0006\b\u008a\u0004\u0010\u008b\u0004J)\u0010\u008d\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00040\u00050\u00042\b\b\u0001\u0010#\u001a\u00020\nH§@¢\u0006\u0005\b\u008d\u0004\u0010GJ*\u0010\u008f\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00030\u00050\u00042\t\b\u0001\u0010\u008e\u0004\u001a\u00020\nH§@¢\u0006\u0005\b\u008f\u0004\u0010GJH\u0010\u0095\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0094\u00040\u0093\u00040\u00050\u0004\"\n\b\u0000\u0010\u0091\u0004*\u00030\u0090\u00042\t\b\u0001\u0010\u0092\u0004\u001a\u00020\n2\b\b\u0001\u0010#\u001a\u00020\nH§@¢\u0006\u0006\b\u0095\u0004\u0010¡\u0001JH\u0010\u0097\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00040\u0093\u00040\u00050\u0004\"\n\b\u0000\u0010\u0091\u0004*\u00030\u0090\u00042\t\b\u0001\u0010\u0092\u0004\u001a\u00020\n2\b\b\u0001\u0010#\u001a\u00020\nH§@¢\u0006\u0006\b\u0097\u0004\u0010¡\u0001JR\u0010\u009b\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00040q0\u00042\n\b\u0001\u00105\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010\u0098\u0004\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010\u0099\u0004\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u009b\u0004\u0010Ø\u0001J+\u0010\u009c\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00040q0\u00042\n\b\u0001\u00105\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\b\u009c\u0004\u0010GJ\u001f\u0010\u009e\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00040q0\u0004H§@¢\u0006\u0005\b\u009e\u0004\u0010\u0018JA\u0010¢\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00040\u00050\u00042\t\b\u0001\u0010\u009f\u0004\u001a\u00020\n2\b\b\u0001\u0010#\u001a\u00020\n2\u000b\b\u0001\u0010 \u0004\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\b¢\u0004\u0010\u0015J)\u0010¤\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030£\u00040\u00050\u00042\b\b\u0001\u0010#\u001a\u00020\nH§@¢\u0006\u0005\b¤\u0004\u0010GJ\u001f\u0010¦\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00040\u00050\u0004H§@¢\u0006\u0005\b¦\u0004\u0010\u0018J&\u0010©\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010¨\u0004\u001a\u00030§\u0004H§@¢\u0006\u0006\b©\u0004\u0010ª\u0004J$\u0010¬\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\t\b\u0001\u0010«\u0004\u001a\u00020\nH§@¢\u0006\u0005\b¬\u0004\u0010GJ0\u0010°\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0001\u0010®\u0004\u001a\u00030\u00ad\u00042\t\b\u0001\u0010¯\u0004\u001a\u00020\nH§@¢\u0006\u0006\b°\u0004\u0010±\u0004JU\u0010´\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030³\u00040\u00050\u00042\t\b\u0001\u0010²\u0004\u001a\u00020\n2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\t\b\u0001\u0010¯\u0004\u001a\u00020\n2\t\b\u0001\u0010¼\u0001\u001a\u00020\nH§@¢\u0006\u0006\b´\u0004\u0010µ\u0004J3\u0010·\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¶\u00040\u00050\u00042\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020SH§@¢\u0006\u0005\b·\u0004\u0010tJ0\u0010º\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\t\b\u0001\u0010«\u0004\u001a\u00020\n2\n\b\u0001\u0010¹\u0004\u001a\u00030¸\u0004H§@¢\u0006\u0006\bº\u0004\u0010»\u0004J\u001f\u0010½\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¼\u00040\u00050\u0004H§@¢\u0006\u0005\b½\u0004\u0010\u0018JB\u0010Á\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00020\u00050\u00042\t\b\u0001\u0010¾\u0004\u001a\u00020\n2\n\b\u0001\u0010À\u0004\u001a\u00030¿\u00042\t\b\u0001\u0010¯\u0004\u001a\u00020\nH§@¢\u0006\u0006\bÁ\u0004\u0010Â\u0004J6\u0010Ä\u0004\u001a\t\u0012\u0005\u0012\u00030\u0095\u00020\u001c2\u000b\b\u0001\u0010\u0092\u0002\u001a\u0004\u0018\u00010\n2\u000b\b\u0001\u0010Ã\u0004\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0094\u0002\u001a\u00030\u0093\u0002H'J<\u0010Ç\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\t\b\u0001\u0010¾\u0004\u001a\u00020\n2\t\b\u0001\u0010¯\u0004\u001a\u00020\n2\n\b\u0001\u0010Æ\u0004\u001a\u00030Å\u0004H§@¢\u0006\u0006\bÇ\u0004\u0010È\u0004J1\u0010Ë\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\t\b\u0001\u0010«\u0004\u001a\u00020\n2\n\b\u0001\u0010Ê\u0004\u001a\u00030É\u0004H§@¢\u0006\u0006\bË\u0004\u0010Ì\u0004J0\u0010Í\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\t\b\u0001\u0010¾\u0004\u001a\u00020\n2\t\b\u0001\u0010¯\u0004\u001a\u00020\nH§@¢\u0006\u0006\bÍ\u0004\u0010¡\u0001J\u001f\u0010Î\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¼\u00040\u00050\u0004H§@¢\u0006\u0005\bÎ\u0004\u0010\u0018J7\u0010Ó\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ò\u00040q0\u00042\t\b\u0001\u0010Ï\u0004\u001a\u00020\n2\n\b\u0001\u0010Ñ\u0004\u001a\u00030Ð\u0004H§@¢\u0006\u0006\bÓ\u0004\u0010Ô\u0004J,\u0010Ø\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030×\u00040\u00050\u00042\n\b\u0001\u0010Ö\u0004\u001a\u00030Õ\u0004H§@¢\u0006\u0006\bØ\u0004\u0010Ù\u0004J,\u0010Ý\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ü\u00040\u00050\u00042\n\b\u0001\u0010Û\u0004\u001a\u00030Ú\u0004H§@¢\u0006\u0006\bÝ\u0004\u0010Þ\u0004J*\u0010á\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030à\u00040\u00050\u00042\t\b\u0001\u0010ß\u0004\u001a\u00020\nH§@¢\u0006\u0005\bá\u0004\u0010GJa\u0010â\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00020\u00050\u00042\b\b\u0001\u0010u\u001a\u00020\n2\t\b\u0001\u0010\u0085\u0002\u001a\u00020@2\t\b\u0001\u0010\u0086\u0002\u001a\u00020@2\t\b\u0001\u0010\u0087\u0002\u001a\u00020@2\t\b\u0001\u0010\u0088\u0002\u001a\u00020@2\t\b\u0001\u0010¼\u0001\u001a\u00020\nH§@¢\u0006\u0006\bâ\u0004\u0010ã\u0004J&\u0010æ\u0004\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010å\u0004\u001a\u00030ä\u0004H§@¢\u0006\u0006\bæ\u0004\u0010ç\u0004J*\u0010ê\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030é\u00040\u00050\u00042\t\b\u0001\u0010è\u0004\u001a\u00020\nH§@¢\u0006\u0005\bê\u0004\u0010GJ+\u0010í\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\n\b\u0001\u0010ì\u0004\u001a\u00030ë\u0004H§@¢\u0006\u0006\bí\u0004\u0010î\u0004J\u001e\u0010ï\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010q0\u0004H§@¢\u0006\u0005\bï\u0004\u0010\u0018J\u001f\u0010ñ\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ð\u00040\u00050\u0004H§@¢\u0006\u0005\bñ\u0004\u0010\u0018J\u001f\u0010ó\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ò\u00040\u00050\u0004H§@¢\u0006\u0005\bó\u0004\u0010\u0018J3\u0010õ\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ô\u00040\u00050\u00042\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020SH§@¢\u0006\u0005\bõ\u0004\u0010tJ\u001f\u0010÷\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ö\u00040\u00050\u0004H§@¢\u0006\u0005\b÷\u0004\u0010\u0018J\u001f\u0010ù\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ø\u00040\u00050\u0004H§@¢\u0006\u0005\bù\u0004\u0010\u0018J)\u0010û\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ú\u00040\u00050\u00042\b\b\u0001\u0010u\u001a\u00020\nH§@¢\u0006\u0005\bû\u0004\u0010GJO\u0010þ\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ý\u00040\u00050\u00042\t\b\u0001\u0010ü\u0004\u001a\u00020\n2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010S2\n\b\u0003\u0010p\u001a\u0004\u0018\u00010S2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bþ\u0004\u0010ÿ\u0004J8\u0010\u0082\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0081\u00050\u00050\u00042\t\b\u0001\u0010\u0080\u0005\u001a\u00020\n2\u000b\b\u0003\u0010\u009f\u0004\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u0082\u0005\u0010¡\u0001Ja\u0010\u0088\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00050\u00050\u00042\u000b\b\u0001\u0010\u0083\u0005\u001a\u0004\u0018\u00010\n2\u000b\b\u0003\u0010\u0084\u0005\u001a\u0004\u0018\u00010\n2\u000b\b\u0003\u0010\u0085\u0005\u001a\u0004\u0018\u00010\n2\u000b\b\u0003\u0010ü\u0004\u001a\u0004\u0018\u00010\n2\u000b\b\u0003\u0010\u0086\u0005\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u0088\u0005\u0010ú\u0003JC\u0010\u008b\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00050\u00050\u00042\t\b\u0001\u0010\u0089\u0005\u001a\u00020\n2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0001\u00102\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\b\u008b\u0005\u0010\u008c\u0005J7\u0010\u0091\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u00050\u00050\u00042\t\b\u0001\u0010\u008d\u0005\u001a\u00020\n2\n\b\u0001\u0010\u008f\u0005\u001a\u00030\u008e\u0005H§@¢\u0006\u0006\b\u0091\u0005\u0010\u0092\u0005J7\u0010\u0096\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00050\u00050\u00042\t\b\u0001\u0010\u0093\u0005\u001a\u00020\n2\n\b\u0001\u0010\u008f\u0005\u001a\u00030\u0094\u0005H§@¢\u0006\u0006\b\u0096\u0005\u0010\u0097\u0005J7\u0010\u0098\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u00050\u00050\u00042\t\b\u0001\u0010ü\u0004\u001a\u00020\n2\n\b\u0001\u0010\u008f\u0005\u001a\u00030\u008e\u0005H§@¢\u0006\u0006\b\u0098\u0005\u0010\u0092\u0005J7\u0010\u009a\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u00050\u00050\u00042\t\b\u0001\u0010ü\u0004\u001a\u00020\n2\n\b\u0001\u0010\u008f\u0005\u001a\u00030\u0099\u0005H§@¢\u0006\u0006\b\u009a\u0005\u0010\u009b\u0005J?\u0010\u009d\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00050\u00050\u00042\t\b\u0001\u0010£\u0001\u001a\u00020\n2\b\b\u0001\u00102\u001a\u00020\n2\b\b\u0001\u0010A\u001a\u00020@H§@¢\u0006\u0006\b\u009d\u0005\u0010ù\u0002J*\u0010\u009f\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00050\u00050\u00042\t\b\u0001\u0010\u0083\u0005\u001a\u00020\nH§@¢\u0006\u0005\b\u009f\u0005\u0010GJ!\u0010¡\u0005\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030 \u0005\u0018\u0001060\u0004H§@¢\u0006\u0005\b¡\u0005\u0010\u0018J*\u0010¢\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00030\u00050\u00042\t\b\u0001\u0010«\u0004\u001a\u00020\nH§@¢\u0006\u0005\b¢\u0005\u0010GJ,\u0010¥\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00020\u00050\u00042\n\b\u0001\u0010¤\u0005\u001a\u00030£\u0005H§@¢\u0006\u0006\b¥\u0005\u0010¦\u0005J\u001f\u0010¨\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030§\u00050\u00050\u0004H§@¢\u0006\u0005\b¨\u0005\u0010\u0018J$\u0010«\u0005\u001a\t\u0012\u0005\u0012\u00030ª\u00050\u00042\t\b\u0001\u0010©\u0005\u001a\u00020\nH§@¢\u0006\u0005\b«\u0005\u0010GJU\u0010°\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00020\u00050\u00042\f\b\u0001\u0010¬\u0005\u001a\u0005\u0018\u00010\u0093\u00022\f\b\u0001\u0010®\u0005\u001a\u0005\u0018\u00010\u00ad\u00052\f\b\u0001\u0010¯\u0005\u001a\u0005\u0018\u00010\u00ad\u00052\t\b\u0001\u0010\u0087\u0001\u001a\u00020\nH§@¢\u0006\u0006\b°\u0005\u0010±\u0005J\u001f\u0010³\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030²\u00050\u00050\u0004H§@¢\u0006\u0005\b³\u0005\u0010\u0018J,\u0010µ\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030´\u00050\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\bµ\u0005\u0010GJ,\u0010·\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¶\u00050\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0005\b·\u0005\u0010GJ8\u0010º\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¹\u00050\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010¸\u0005\u001a\u00020\nH§@¢\u0006\u0006\bº\u0005\u0010¡\u0001JD\u0010½\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00020\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010¸\u0005\u001a\u00020\n2\n\b\u0001\u0010¼\u0005\u001a\u00030»\u0005H§@¢\u0006\u0006\b½\u0005\u0010¾\u0005J8\u0010À\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¿\u00050\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010Ì\u0001\u001a\u00020\nH§@¢\u0006\u0006\bÀ\u0005\u0010¡\u0001J8\u0010Á\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00020\u00050\u00042\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010\n2\t\b\u0001\u0010¸\u0005\u001a\u00020\nH§@¢\u0006\u0006\bÁ\u0005\u0010¡\u0001J\u001f\u0010Ã\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Â\u00050\u00050\u0004H§@¢\u0006\u0005\bÃ\u0005\u0010\u0018J\u001f\u0010Å\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ä\u00050\u00050\u0004H§@¢\u0006\u0005\bÅ\u0005\u0010\u0018J&\u0010È\u0005\u001a\t\u0012\u0005\u0012\u00030 \u00020\u00042\n\b\u0001\u0010Ç\u0005\u001a\u00030Æ\u0005H§@¢\u0006\u0006\bÈ\u0005\u0010É\u0005J\u0085\u0001\u0010Ï\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¶\u00040\u00050\u00042\t\b\u0001\u0010Ê\u0005\u001a\u00020\n2\b\b\u0001\u0010p\u001a\u00020S2\b\b\u0001\u0010o\u001a\u00020S2\u000b\b\u0001\u0010Ë\u0005\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\n2\u0011\b\u0001\u0010Ì\u0005\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001062\u000b\b\u0001\u0010Í\u0005\u001a\u0004\u0018\u00010@2\u000b\b\u0001\u0010Î\u0005\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0006\bÏ\u0005\u0010Ð\u0005J6\u0010Ó\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ò\u00050\u00050\u00042\t\b\u0001\u0010\u0087\u0001\u001a\u00020\n2\t\b\u0001\u0010Ñ\u0005\u001a\u00020\nH§@¢\u0006\u0006\bÓ\u0005\u0010¡\u0001J*\u0010Õ\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00050\u00050\u00042\t\b\u0001\u0010\u0087\u0001\u001a\u00020\nH§@¢\u0006\u0005\bÕ\u0005\u0010GJ*\u0010×\u0005\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ö\u00050\u00050\u00042\t\b\u0001\u0010\u008e\u0002\u001a\u00020\nH§@¢\u0006\u0005\b×\u0005\u0010G¨\u0006Ø\u0005"}, d2 = {"Lcom/assetgro/stockgro/data/remote/NetworkService;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_onboarding/data/remote/NumberLoginRequestDto;", "request", "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/OnboardingResponseDto;", "numberLogin", "(Lcom/assetgro/stockgro/feature_onboarding/data/remote/NumberLoginRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/RegisterRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "mixpanelDistinctId", "register", "(Lcom/assetgro/stockgro/feature_onboarding/data/remote/RegisterRequestDto;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/PhoneNumberDto;", "phoneNumberDto", "verifyMobile", "(Lcom/assetgro/stockgro/feature_onboarding/data/remote/PhoneNumberDto;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "secret", "otp", "verifyOtp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/UserInfoResponseDto;", "userInfo", "(Lyt/a;)Ljava/lang/Object;", "sort", "page", "index", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/StocksListResponse;", "getStocks", "searchParam", "getStocksSearch", "Lcom/assetgro/stockgro/data/remote/response/HomePageTopDataResponse;", "getTrendingStocks", "stockName", "Lcom/assetgro/stockgro/data/model/StockDetailDto;", "getStockDetails", "Lcom/assetgro/stockgro/data/remote/request/StockBuyOrderRequestDto;", "stockBuyOrderRequestDto", "Lcom/assetgro/stockgro/data/remote/response/StockOrderResponse;", "buyStockOrder", "shortSellStockOrder", "stockId", "Lcom/assetgro/stockgro/data/model/StockSellOrderRequestDto;", "stockSellOrderRequestDto", "sellStockOrder", "squareOffStock", "Lcom/assetgro/stockgro/data/remote/response/StockOrderInfoResponseDto;", "getStockOrderInfo", "portfolioId", "Lcom/assetgro/stockgro/data/remote/response/StockSellSelectOrderResponseDto;", "getStockOrderInfoForPortfolio", "assetClass", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "getUserPortfolios", "Lcom/assetgro/stockgro/data/model/portfolio/orders/PortfolioOrdersDto;", "getPortfolioOrders", "tradeType", "executionDate", "Lcom/assetgro/stockgro/data/model/portfolio/PortfolioHistoryDto;", "getPortfolioHistory", "filter", HttpUrl.FRAGMENT_ENCODE_SET, "isModel", "Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioFnoHistoryData;", "getFnoPortfolioHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioFnoHoldingResponseDto;", "getPortfolioFnoHolding", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioFnoOrderResponse;", "getFnoPortfolioOrders", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/RenamePortfolioDto;", "renamePortfolioDto", "renamePortfolio", "Lcom/assetgro/stockgro/data/remote/request/LeagueJoinRequestDto;", "leagueJoinRequestDto", "joinLeagueWithAutomaticPortfolioSelection", "(Lcom/assetgro/stockgro/data/remote/request/LeagueJoinRequestDto;Lyt/a;)Ljava/lang/Object;", "leagueId", HttpUrl.FRAGMENT_ENCODE_SET, "pageNumber", "Lcom/assetgro/stockgro/data/model/TopLeaguesDto;", "getWinners", "(Ljava/lang/String;Ljava/lang/Integer;)Lat/m;", "Lcom/assetgro/stockgro/data/ArenaAchievementShareDto;", "shareYourAchievementCta", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaGame;", "getLeagueInfo", "withLeaderBoard", "ignoreSquaredValues", "Lcom/assetgro/stockgro/data/model/LeagueUnifiedResponseDto;", "getPrepZoneEquityPortfolioData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "optionsPortfolio", "leagueFlow", "getPrepZoneOptionPortfolioData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/CancelOrderRequestDto;", "cancelOrderRequestDto", "cancelOrder", "Lcom/assetgro/stockgro/data/remote/request/UpdatePinNumberRequestDtoV2;", "updatePinV2", "(Lcom/assetgro/stockgro/data/remote/request/UpdatePinNumberRequestDtoV2;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/FriendRequestDto;", "addFriend", "(Lcom/assetgro/stockgro/data/remote/request/FriendRequestDto;Lyt/a;)Ljava/lang/Object;", "unfriend", "offset", "limit", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;", "getCreateGroupFollowers", "(IILyt/a;)Ljava/lang/Object;", "groupId", "getCreateGroupFollowersAddMembers", "(IILjava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/GroupInfoInvitesResponse;", "getGroupInfoInvitees", "searchStr", "fOffset", "fLimit", "Lcom/assetgro/stockgro/data/model/CreateGroupSearchResponse;", "getCreateGroupUniversalFollowers", "(Ljava/lang/String;IIIILyt/a;)Ljava/lang/Object;", "getCreateGroupUniversalFollowersAddMembers", "(Ljava/lang/String;IIIILjava/lang/String;Lyt/a;)Ljava/lang/Object;", "sortDesc", "withInviteCount", "Lcom/assetgro/stockgro/data/model/MemberInvitedGroupsResponse;", "getMemberInvitedGroups", "(IILjava/lang/String;ZLyt/a;)Ljava/lang/Object;", "userId", "Lcom/assetgro/stockgro/data/model/FollowerDto;", "getFriends", "profileId", "Lcom/assetgro/stockgro/data/model/ProfileStatsDto;", "getProfileStats", "getProfileStatsV2", "Lcom/assetgro/stockgro/data/model/ChampionDto;", "getChampionsList", "Lcom/assetgro/stockgro/data/model/homedata/WidgetData;", "getHomePageDataV2", "Lcom/assetgro/stockgro/ui/home/homepage/data/MainHomeDto;", "getHomePageDataV3", "category", "Lcom/assetgro/stockgro/data/model/NotificationDto;", "getNotificationsList", "getUnreadNotificationsCount", "markAllNotificationsRead", "resetPasswordOtp", "(Lcom/assetgro/stockgro/feature_onboarding/data/remote/PhoneNumberDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;", "getWalletBalance", "uuid", "appVersionCode", "Lcom/assetgro/stockgro/data/remote/response/TokenRefreshResponseDto;", "updateTokenV2", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "transactionType", PaymentConstants.ORDER_ID_CAMEL, "Lcom/assetgro/stockgro/data/model/StockModifyInfoDto;", "getOrderDetails", "logout", "firebaseToken", "updateFirebaseToken", "Lcom/assetgro/stockgro/data/model/FeedbackRequestDto;", "feedbackRequestDto", "submitFeedback", "Lcom/assetgro/stockgro/data/remote/response/AppVersionResponseDto;", "getLatestAppVersion", "Lcom/assetgro/stockgro/data/remote/request/ModifyOrderRequestDto;", "modifyOrder", "Lcom/assetgro/stockgro/data/model/ResetPortfolioDto;", "resetPortfolioDto", "resetPortfolio", "Lcom/assetgro/stockgro/data/remote/request/LeagueExitRequestDto;", "leagueExitRequestDto", "exitLeague", "Lcom/assetgro/stockgro/data/remote/request/LeagueReportRequestDto;", "leagueReportRequestDto", "reportLeague", "Lcom/assetgro/stockgro/data/model/ContactUpload;", "uploadContactsBody", "uploadContacts", "imageSize", "Lcom/assetgro/stockgro/data/remote/response/StockgroContact;", "getContacts", "search", "Lcom/assetgro/stockgro/data/remote/response/ContactResponseDto;", "Lcom/assetgro/stockgro/data/model/NonStockgroContact;", "getPhoneContacts", "contact", "getInviteUserDetails", "trailingDays", "pageLimit", "Lcom/assetgro/stockgro/data/remote/response/UserStatsAndResponseDto;", "getUserStatsAndRecentPerformance", "(Ljava/lang/String;Ljava/lang/String;IILyt/a;)Ljava/lang/Object;", "wallet", "txnType", "status", "reason", "startDate", "endDate", "Lcom/assetgro/stockgro/data/model/WalletTransactionsDto;", "getWalletTransactions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "phoneNumber", "countryCode", "getPhoneNumberStatus", "invitationCode", "checkInvitationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/PinLoginRequestDto;", "pinLoginRequestDto", "withdrawalPinVerify", "Lcom/assetgro/stockgro/data/model/GeoDto;", "geoDto", "getUserStatus", "Lcom/assetgro/stockgro/data/model/InvitedFriendDto;", "getInvitedFriends", "Lcom/assetgro/stockgro/data/remote/response/ServerTimeResponse;", "getIndianTimeZoneTime", "Lcom/assetgro/stockgro/data/remote/response/UnlockPortfolioResponse;", "getPortfolioUnlockDetails", "Lcom/assetgro/stockgro/data/remote/request/UnlockPortfolioRequest;", "unlockPortfolioRequest", "unlockPortfolio", "Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponse;", "getMaintenanceConfig", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListOfAdmin", "Lcom/assetgro/stockgro/data/remote/response/LifetimeEarning;", "lifetimeEarning", "Lcom/assetgro/stockgro/data/remote/response/ConfigDto;", "getConfig", "Lcom/assetgro/stockgro/data/model/RedemptionOffer;", "getCoupons", "Lcom/assetgro/stockgro/data/model/RedeemedOffers;", "getRedeemed", "couponId", "getCouponDetails", "purchaseCoupon", "Lcom/assetgro/stockgro/data/remote/request/NotificationIdUpdateDto;", "notificationIdUpdateDto", "updateNotificationId", "Lcom/assetgro/stockgro/data/model/DiscoverDto;", "getDiscoverHomeData", "withGroupMetaData", "unreadCount", "withLastMessage", "roleNotEqualTo", "withWriteRoleOnly", "Lcom/assetgro/stockgro/data/model/UserChatGroupsResponse;", "getChatGroups", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLyt/a;)Ljava/lang/Object;", "withAdminInfo", "withStatusInfo", "nonSearch", "withWriteAccess", "Lcom/assetgro/stockgro/data/model/Group;", "getChatGroupById", "Lcom/assetgro/stockgro/data/model/AddGroupMembersDto;", "addGroupMembersDto", "addMembersToGroup", "id", "withGlobalRole", "Lcom/assetgro/stockgro/data/model/GroupMembersDto;", "getGroupMembers", "messageId", "Lokhttp3/MultipartBody$Part;", "part", "Lcom/assetgro/stockgro/data/remote/response/AssetUploadResponse;", "uploadChatAssets", "imageType", "imageId", "uploadChatGroupAssets", "Lcom/assetgro/stockgro/data/model/StickersDto;", "getStickers", "searchString", "searchGroupMembers", "Lcom/assetgro/stockgro/data/model/OpenForAudienceDto;", "openForAudienceDto", HttpUrl.FRAGMENT_ENCODE_SET, "editIsOpenForAudience", "(Lcom/assetgro/stockgro/data/model/OpenForAudienceDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/PrivateChatGroup;", "group", "createPrivateChatGroup", "Lcom/assetgro/stockgro/data/model/SocialChatGroup;", "createSocialChatGroup", "Lcom/assetgro/stockgro/data/model/OneToOneChatGroup;", "createOneToOneChatGroup", "Lcom/assetgro/stockgro/data/model/SupportGroup;", "contactStockgroAdmin", "Lcom/assetgro/stockgro/data/model/SocialCategoryDto;", "getSocialCategories", "Lcom/assetgro/stockgro/data/remote/request/JoinSocialGroupRequestDto;", "Lcom/assetgro/stockgro/data/model/UserGroupInfo;", "joinSocialGroup", "(Lcom/assetgro/stockgro/data/remote/request/JoinSocialGroupRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/PinnedChatDto;", "pinnedChatDto", "changeChatPinnedStatus", "(Lcom/assetgro/stockgro/data/remote/request/PinnedChatDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/MuteChatDto;", "muteChatDto", "changeChatMuteStatus", "(Lcom/assetgro/stockgro/data/remote/request/MuteChatDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/MarkReadMessagesDto;", "markReadMessagesDto", "markMessagesAsRead", "totalUnread", "Lcom/assetgro/stockgro/data/model/ChatNotificationDto;", "getChatTotalUnreadCount", "Lcom/assetgro/stockgro/data/remote/request/ExitChatGroupRequestDto;", "exitChatGroupRequestDto", "exitGroup", "(Lcom/assetgro/stockgro/data/remote/request/ExitChatGroupRequestDto;Lyt/a;)Ljava/lang/Object;", "isDeleted", "withSenderInfo", "withInteractionData", "withLikesCount", "Lcom/assetgro/stockgro/data/model/MessageThreadInfoDto;", "getMessageThreadInfo", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lat/m;", HttpUrl.FRAGMENT_ENCODE_SET, "updatedAtLte", "Lcom/assetgro/stockgro/data/model/MessageListDto;", "loadMessages", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lat/m;", "fetchRecentMessages", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lat/m;", "Lcom/assetgro/stockgro/data/remote/request/MessageInteractionRequestDto;", "messageInteractionRequestDto", "messageInteraction", "Lcom/assetgro/stockgro/data/model/PinnedMessageDto;", "pinnedMessageDto", "pinMessageToGroup", "isPinned", "getGroupPinnedMessages", "Lcom/assetgro/stockgro/data/model/FriendMemberDto;", "getFriendsNotInGroup", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lat/m;", "Lcom/assetgro/stockgro/data/remote/request/StarMessageRequestDto;", "starMessageRequestDto", "starMessageForUser", "getStarredMessagesForUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lat/m;", "role", "getBannedGroupMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lat/m;", "Lcom/assetgro/stockgro/data/remote/request/BanMemberDto;", "banMemberDto", "banUnbanGroupMember", "Lcom/assetgro/stockgro/data/remote/request/RemoveMemberDto;", "removeMemberDto", "removeGroupMember", "(Lcom/assetgro/stockgro/data/remote/request/RemoveMemberDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/DeactivatedMemberDto;", "deactivatedMemberDto", "Lcom/assetgro/stockgro/data/model/RogueUserDto;", "getDeactivatedMembers", "Lcom/assetgro/stockgro/data/remote/request/ActiveMemberDto;", "activeMemberDto", "changeMemberActiveStatus", "(Lcom/assetgro/stockgro/data/remote/request/ActiveMemberDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/SocialGlobalRoleDto;", "socialGlobalRoleDto", "Lcom/assetgro/stockgro/data/remote/response/SocialRoleResponseDto;", "getSocialGlobalRole", "getUserGlobalRole", "(Ljava/lang/String;Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/UserDefaultPortfolioDto;", "getUserDefaultPortfolio", "Lcom/assetgro/stockgro/data/remote/request/JusPayInitiateRequest;", "jusPayInitiateRequest", "Lcom/assetgro/stockgro/data/remote/response/JusPayInitiateResponse;", "initiateJustPayPayload", "processJustPayPayload", "Lcom/assetgro/stockgro/data/remote/request/JusPayTransactionStatusRequest;", "jusPayInitiateRequestRequest", "updateJustPayTransactionStatus", "Lcom/assetgro/stockgro/data/model/StockGyanDto;", "getStockGyanGroups", "Lcom/assetgro/stockgro/data/model/StockGyanInteractionDto;", "stockGyanInteractionDto", "putStockGyanIndexInteraction", "Lcom/assetgro/stockgro/data/remote/response/LeagueEligibiltyResponseDto;", "checkLeagueEligibilty", "platform", "Lcom/assetgro/stockgro/data/model/SocialDataDto;", "socialDataDto", "saveUserSocialData", "Lcom/assetgro/stockgro/data/model/UserSocialAuthStatusDto;", "getUserSocialAuthStatus", "Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", "inviteTemplateDto", "Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "getTemplateFromGooglyService", "(Lcom/assetgro/stockgro/data/model/InviteTemplateDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/AssetInsightsDto;", "getStockInsights", "sectionParams", "Lcom/assetgro/stockgro/data/model/StockDto;", "getStockInsightsV2", "Lcom/assetgro/stockgro/data/model/KycResponseDto;", "createKyc", "getKyc", "Lcom/assetgro/stockgro/data/remote/request/AppCloneDataRequest;", "appCloneDataRequest", "postAppData", "Lcom/assetgro/stockgro/data/model/MySubscriptionResponse;", "getMySubscription", "packageId", "mandate_setup", "Lcom/assetgro/stockgro/data/model/SubscriptionPlanConfirmationResponse;", "getSubscriptionConfirmation", "(Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/SubscriptionPlanPurchaseRequestDto;", "subscriptionPlanPurchaseRequestDto", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionPurchaseResponse;", "purchaseSubscriptionPlan", "(Lcom/assetgro/stockgro/data/remote/request/SubscriptionPlanPurchaseRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionDowngradePromptResponse;", "getPackageDowngrade", "Lcom/assetgro/stockgro/data/remote/request/TransactionStatusRequestDto;", "transactionStatusRequestDto", "Lcom/assetgro/stockgro/data/remote/response/TransactionStatusResponse;", "getTransactionStatus", "(Lcom/assetgro/stockgro/data/remote/request/TransactionStatusRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/FollowerFollowingData;", "getFollowersDetails", "getFollowingDetails", "usedId", "Lcom/assetgro/stockgro/data/model/socialgroups/SocialGroupsItem;", "getSocialGroupsDetails", "Lcom/assetgro/stockgro/data/model/AccountDeleteRequest;", "requestBody", "Lcom/assetgro/stockgro/data/model/AccountDeleteResponse;", "removeUserAccount", "(Lcom/assetgro/stockgro/data/model/AccountDeleteRequest;Lyt/a;)Ljava/lang/Object;", "code", "Lcom/assetgro/stockgro/data/model/ReportedEntityConfirmationDto;", "reportUserChatMessage", "Lcom/assetgro/stockgro/data/remote/request/ReportMessageRequestDto;", "reportMessageRequestDto", "reportUserChatMessageV2", "Lcom/assetgro/stockgro/data/remote/request/BlockPrivateChatUserRequestDto;", "blockPrivateChatUserRequestDto", "blockUserOnPrivateChat", "blockUserOnPrivateChatV2", "(Lcom/assetgro/stockgro/data/remote/request/BlockPrivateChatUserRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/UserReportStatusDto;", "getUserReportedStatus", "Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", "getUserBlockedStatus", "Lcom/assetgro/stockgro/data/remote/request/ReportUserRequestDto;", "reportUserRequestDto", "reportUser", "Lcom/assetgro/stockgro/data/model/ReportUserReasonsDto;", "getReasonsToReportUser", "getReasonsToReportMessage", "Lcom/assetgro/stockgro/data/model/KycFAQResponse;", "getKycFaqs", "assetId", "uploadKycFaqAssets", "kycStatus", "Lcom/assetgro/stockgro/data/model/KycEmailSupportRequestDto;", "kycEmailSupportRequestDto", "Lcom/assetgro/stockgro/data/model/KycSupportTicketResponseDto;", "createKycSupportTicket", "getKycTicketStatus", "screenTag", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionNudgeResponse;", "getSubscriptionPrompt", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionMaintenanceResponse;", "getSubwayMaintenance", "Lcom/assetgro/stockgro/data/remote/request/EditGroupNameRequestDto;", "editGroupNameRequestDto", "editGroupNameAndTags", "(Lcom/assetgro/stockgro/data/remote/request/EditGroupNameRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/EditGroupDescriptionDto;", "editGroupDescriptionDto", "editGroupDescription", "searchIn", "Lcom/assetgro/stockgro/data/remote/response/SocialSearchResponseDto;", "getSocialSearchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/MarketSearchResponseDto;", "getMarketSearchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/SocialSearchHistoryResponseDto;", "getSocialSearchHistoryData", "deleteSocialSearchHistoryData", "grantType", "redirectUri", PaymentConstants.CLIENT_ID_CAMEL, "clientSecret", "Lcom/assetgro/stockgro/data/remote/response/LinkedInTokenResponseDto;", "getLinkedInAccessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "accessToken", "Lcom/assetgro/stockgro/data/model/LinkedInProfileModel;", "getLinkedInUserProfile", "Lcom/assetgro/stockgro/data/model/LinkedInEmailModel;", "getLinkedInEmailAddress", "Lcom/assetgro/stockgro/data/remote/request/EditGroupCoverImageDto;", "editGroupCoverImageDto", "editGroupCoverImage", "(Lcom/assetgro/stockgro/data/remote/request/EditGroupCoverImageDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/EditGroupDisplayImageDto;", "editGroupDisplayImageDto", "editGroupDisplayImage", "(Lcom/assetgro/stockgro/data/remote/request/EditGroupDisplayImageDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/ReportChatGroupRequestDto;", "reportChatGroupRequestDto", "reportChatGroup", "(Lcom/assetgro/stockgro/data/remote/request/ReportChatGroupRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketOverviewDto;", "getStockOverviewData", "categoryId", "getStockGyanCardData", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "T", "calculationType", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisEmaConfigDto;", "getStockAnalysisData", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisBvpsConfigDto;", "getStockAnalysisDataBvps", "sortBy", "sortDirection", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;", "getAllUpcomingLeaguesWithAssets", "getAllMyLeaguesWithAssets", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaSortOptions;", "getAllSortOptions", "type", "duration", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;", "getStockChartV2", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartBaseDto;", "getStocksAllChartsData", "Lcom/assetgro/stockgro/data/remote/response/WithdrawableLimitDto;", "getWalletLimit", "Lcom/assetgro/stockgro/data/remote/request/FeedPostReactionDto;", "feedPostReactionDto", "handleFeedPostReaction", "(Lcom/assetgro/stockgro/data/remote/request/FeedPostReactionDto;Lyt/a;)Ljava/lang/Object;", "postId", "deleteFeedPost", "Lcom/assetgro/stockgro/data/remote/request/CreatePostCommentRequestDto;", "createPostCommentRequestDto", "section", "createPostComment", "(Lcom/assetgro/stockgro/data/remote/request/CreatePostCommentRequestDto;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "entityId", "Lcom/assetgro/stockgro/ui/social/data/remote/PostCommentsDto;", "getPostComments", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;", "getBookmarkedPosts", "Lcom/assetgro/stockgro/data/remote/response/UpdatePostBookMarkStatusDto;", "updatePostBookMarkStatusDto", "changePostBookmarkStatus", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/response/UpdatePostBookMarkStatusDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/ReportEntityReasonsDto;", "getReasonsToReportComment", "commentId", "Lcom/assetgro/stockgro/data/remote/request/PostCommentReactionDto;", "postCommentReactionDto", "handlePostCommentReaction", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/PostCommentReactionDto;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "filename", "uploadFeedPostAssets", "Lcom/assetgro/stockgro/data/remote/request/ReportCommentRequestDto;", "reportCommentRequestDto", "reportPostComment", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/ReportCommentRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/ReportEntityRequestDto;", "reportEntityRequestDto", "reportPost", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ReportEntityRequestDto;Lyt/a;)Ljava/lang/Object;", "deletePostComment", "getReasonsToReportPost", LogCategory.ACTION, "Lcom/assetgro/stockgro/data/remote/request/ManageMemberRequest;", "manageMemberRequest", "Lcom/assetgro/stockgro/data/model/ManageMemberResponse;", "manageMember", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/ManageMemberRequest;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/WithdrawInitiateDto;", "withdrawInitiateDto", "Lcom/assetgro/stockgro/data/remote/response/WithdrawInitiateResponseDto;", "withdrawInitiate", "(Lcom/assetgro/stockgro/data/remote/request/WithdrawInitiateDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/WithdrawProcessDto;", "withdrawProcessDto", "Lcom/assetgro/stockgro/data/remote/response/WithdrawProcessResponseDto;", "withdrawProcess", "(Lcom/assetgro/stockgro/data/remote/request/WithdrawProcessDto;Lyt/a;)Ljava/lang/Object;", "emptyBody", "Lcom/assetgro/stockgro/data/remote/response/WithdrawOtpRegenerateResponseDto;", "resendOtp", "getChatGroupInfoV2", "(Ljava/lang/String;ZZZZLjava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/social/data/remote/GroupMemberRoleDto;", "groupMemberRoleDto", "changeMemberGroupRole", "(Lcom/assetgro/stockgro/ui/social/data/remote/GroupMemberRoleDto;Lyt/a;)Ljava/lang/Object;", "transactionId", "Lcom/assetgro/stockgro/data/remote/response/TransactionDetailResponse;", "getTransactionDetails", "Lcom/assetgro/stockgro/data/model/homedata/ScrollDepth;", "scrollData", "postScrollDepth", "(Lcom/assetgro/stockgro/data/model/homedata/ScrollDepth;Lyt/a;)Ljava/lang/Object;", "ping", "Lcom/assetgro/stockgro/data/remote/response/SocialConfigResponseDto;", "getSocialConfig", "Lcom/assetgro/stockgro/data/remote/response/AddResponse;", "getAddData", "Lcom/assetgro/stockgro/ui/social/data/remote/BlockedUserListDto;", "getUsersBlockedList", "Lcom/assetgro/stockgro/data/model/VideoTutorialDataResponse;", "getVideoTutorials", "Lcom/assetgro/stockgro/ui/social/data/remote/SocialHomePermissionsDto;", "getBigbossHomeLevelPermissions", "Lcom/assetgro/stockgro/ui/social/data/remote/UserGroupLevelPermissionsDto;", "getBigbossGroupMessageLevelPermissions", "optionType", "Lcom/assetgro/stockgro/feature_market/data/remote/MarketOptionDto;", "getOptionListData", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "optionIdentifier", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionChainDto;", "getOptionChain", "contractSymbol", "symbol", "expiry", "strikePrice", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewDto;", "getOptionOverview", "parentSymbol", "Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioReviewResponse;", "getOrderReview", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "actionType", "Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;", "body", "Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoResponseDto;", "buySellOptionFno", "(Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;Lyt/a;)Ljava/lang/Object;", "operationType", "Ljg/a;", "Ljg/b;", "modifyFnoPortfolio", "(Ljava/lang/String;Ljg/a;Lyt/a;)Ljava/lang/Object;", "modifyOptionFno", "Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioPendingOrderCancelRequest;", "cancelOption", "(Ljava/lang/String;Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioPendingOrderCancelRequest;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOrderInfoResponseDto;", "getOrderInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionHistoryDto;", "getOptionOhlc", "Lcom/assetgro/stockgro/data/model/Tags;", "getGroupTagList", "getPostShareTemplate", "Lcom/assetgro/stockgro/data/remote/request/SocialShareTrackingRequestDto;", "socialShareTrackingRequestDto", "sendSocialShareTrackingData", "(Lcom/assetgro/stockgro/data/remote/request/SocialShareTrackingRequestDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfoliosDto;", "getPortfoliosV2", "path", "Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponseV2;", "getMaintenanceConfigV2", "image", "Lokhttp3/RequestBody;", "bio", "displayName", "updateUserProfile", "(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/CountriesDto;", "updateAvailableCountriesList", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHomeDto;", "getUserMissions", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryConsolidatedDto;", "getUserMissionsHistoryConsolidated", "taskId", "Lcom/assetgro/stockgro/missions/data/remote/MissionDetailDto;", "getUserMissionDetails", "Lcom/assetgro/stockgro/missions/data/remote/MissionMetaDto;", "missionMeta", "startMission", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/data/remote/MissionMetaDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryByStatusDto;", "getUserMissionsHistoryByStatus", "retryMission", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto;", "getSocialHome", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedStoryResponseDto;", "getSocialHomeStories", "Lcom/assetgro/stockgro/ui/social/data/remote/SubCategoryInteractionDto;", "subCategoryInteractionDto", "subCategoryInteraction", "(Lcom/assetgro/stockgro/ui/social/data/remote/SubCategoryInteractionDto;Lyt/a;)Ljava/lang/Object;", "typeOf", "subCategoryId", "postIds", "isExpired", "filterBy", "getSocialFeedItems", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "scratchCardId", "Lsh/a;", "claimScratchCardReward", "Lsh/c;", "getUnclaimedScratchCardsForMainDashBoard", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto;", "getRiaProfileData", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface NetworkService {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getMemberInvitedGroups$default(NetworkService networkService, int i10, int i11, String str, boolean z10, a aVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    str = "last_group_msg_time";
                }
                String str2 = str;
                if ((i12 & 8) != 0) {
                    z10 = true;
                }
                return networkService.getMemberInvitedGroups(i10, i11, str2, z10, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMemberInvitedGroups");
        }

        public static /* synthetic */ Object getOptionChain$default(NetworkService networkService, String str, String str2, a aVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return networkService.getOptionChain(str, str2, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptionChain");
        }

        public static /* synthetic */ Object getOptionListData$default(NetworkService networkService, String str, Integer num, Integer num2, String str2, a aVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = 1;
                }
                Integer num3 = num;
                if ((i10 & 4) != 0) {
                    num2 = 10;
                }
                Integer num4 = num2;
                if ((i10 & 8) != 0) {
                    str2 = null;
                }
                return networkService.getOptionListData(str, num3, num4, str2, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptionListData");
        }

        public static /* synthetic */ Object getOptionOverview$default(NetworkService networkService, String str, String str2, String str3, String str4, String str5, a aVar, int i10, Object obj) {
            String str6;
            String str7;
            String str8;
            String str9;
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if ((i10 & 4) != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if ((i10 & 8) != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if ((i10 & 16) != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                return networkService.getOptionOverview(str, str6, str7, str8, str9, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptionOverview");
        }

        public static /* synthetic */ Object getPrepZoneOptionPortfolioData$default(NetworkService networkService, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar, int i10, Object obj) {
            Boolean bool5;
            Boolean bool6;
            if (obj == null) {
                if ((i10 & 16) != 0) {
                    bool5 = Boolean.TRUE;
                } else {
                    bool5 = bool3;
                }
                if ((i10 & 32) != 0) {
                    bool6 = Boolean.TRUE;
                } else {
                    bool6 = bool4;
                }
                return networkService.getPrepZoneOptionPortfolioData(str, str2, bool, bool2, bool5, bool6, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrepZoneOptionPortfolioData");
        }

        public static /* synthetic */ Object getStockInsightsV2$default(NetworkService networkService, String str, a aVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return networkService.getStockInsightsV2(str, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStockInsightsV2");
        }
    }

    @o("/auth/user/friend/add")
    Object addFriend(@NotNull @pv.a FriendRequestDto friendRequestDto, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @o("/bigboss/api/v1/member/batch")
    @NotNull
    m<BaseResponseDto<Object>> addMembersToGroup(@NotNull @pv.a AddGroupMembersDto addGroupMembersDto);

    @p("/bigboss/api/v1/member")
    @NotNull
    m<Object> banUnbanGroupMember(@NotNull @pv.a BanMemberDto banMemberDto);

    @p("/bigboss/api/v1/social/block")
    @NotNull
    m<Unit> blockUserOnPrivateChat(@NotNull @pv.a BlockPrivateChatUserRequestDto blockPrivateChatUserRequestDto);

    @p("/bigboss/api/v1/social/block")
    Object blockUserOnPrivateChatV2(@NotNull @pv.a BlockPrivateChatUserRequestDto blockPrivateChatUserRequestDto, @NotNull a<? super v0<Unit>> aVar);

    @o("/portman/api/v1/option/{actionType}")
    Object buySellOptionFno(@s("actionType") @NotNull String str, @NotNull @pv.a BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, @NotNull a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar);

    @o("/api/v1/stocks/{stockName}/order/buy")
    @NotNull
    m<BaseResponseDto<StockOrderResponse>> buyStockOrder(@s("stockName") @NotNull String stockName, @NotNull @pv.a StockBuyOrderRequestDto stockBuyOrderRequestDto);

    @p("/portman/api/v1/option/{optionType}/cancel")
    Object cancelOption(@s("optionType") @NotNull String str, @NotNull @pv.a PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest, @NotNull a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar);

    @n("/api/v1/stocks/{stockId}/order/cancel")
    @NotNull
    m<BaseResponseDto<String>> cancelOrder(@s("stockId") @NotNull String stockId, @NotNull @pv.a CancelOrderRequestDto cancelOrderRequestDto);

    @p("/bigboss/api/v1/member")
    Object changeChatMuteStatus(@NotNull @pv.a MuteChatDto muteChatDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/member")
    Object changeChatPinnedStatus(@NotNull @pv.a PinnedChatDto pinnedChatDto, @NotNull a<? super v0<Unit>> aVar);

    @o("auth/roles/social")
    Object changeMemberActiveStatus(@NotNull @pv.a ActiveMemberDto activeMemberDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/member")
    Object changeMemberGroupRole(@NotNull @pv.a GroupMemberRoleDto groupMemberRoleDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/postie/api/v1/post/bookmark/toggle/{post_id}")
    Object changePostBookmarkStatus(@s("post_id") @NotNull String str, @NotNull @pv.a UpdatePostBookMarkStatusDto updatePostBookMarkStatusDto, @NotNull a<? super v0<Object>> aVar);

    @f("/auth/referral/{invitationCode}")
    Object checkInvitationCode(@s("invitationCode") @NotNull String str, @t("mixpanelDistinctId") @NotNull String str2, @t("phone_number") String str3, @t("country_code") @NotNull String str4, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @f("/loki/games/eligible/{league_id}")
    @NotNull
    m<BaseResponseDto<LeagueEligibiltyResponseDto>> checkLeagueEligibilty(@s("league_id") @NotNull String leagueId);

    @o("/rewards/v1/users/{userId}/scratch-cards/{id}/claim")
    Object claimScratchCardReward(@s("userId") @NotNull String str, @s("id") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<sh.a>>> aVar);

    @o("/bigboss/api/v1/group/support")
    @NotNull
    m<Group> contactStockgroAdmin(@NotNull @pv.a SupportGroup group);

    @o("/usermeta/api/v1/kyc/profile/{userId}")
    @NotNull
    m<KycResponseDto> createKyc(@s("userId") String userId);

    @o("/usermeta/api/v1/kyc/profile/support/{kyc_status}")
    @NotNull
    m<KycSupportTicketResponseDto> createKycSupportTicket(@s("kyc_status") String kycStatus, @NotNull @pv.a KycEmailSupportRequestDto kycEmailSupportRequestDto);

    @o("/bigboss/api/v1/group/1on1")
    @NotNull
    m<Group> createOneToOneChatGroup(@NotNull @pv.a OneToOneChatGroup group);

    @o("/parrot/api/v1/items")
    Object createPostComment(@NotNull @pv.a CreatePostCommentRequestDto createPostCommentRequestDto, @t("section") @NotNull String str, @NotNull a<? super v0<Object>> aVar);

    @o("/bigboss/api/v1/group/private")
    @NotNull
    m<Group> createPrivateChatGroup(@NotNull @pv.a PrivateChatGroup group);

    @o("/bigboss/api/v1/group/social")
    @NotNull
    m<Group> createSocialChatGroup(@NotNull @pv.a SocialChatGroup group);

    @b("/postie/api/v1/post/{post_id}")
    Object deleteFeedPost(@s("post_id") @NotNull String str, @NotNull a<? super v0<Unit>> aVar);

    @b("/parrot/api/v1/items/{comment_id}")
    Object deletePostComment(@s("comment_id") @NotNull String str, @t("section") @NotNull String str2, @NotNull a<? super v0<Unit>> aVar);

    @b("/bigboss/api/v1/search/history")
    @NotNull
    m<Object> deleteSocialSearchHistoryData();

    @p("/bigboss/api/v1/group")
    Object editGroupCoverImage(@NotNull @pv.a EditGroupCoverImageDto editGroupCoverImageDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/group")
    @NotNull
    m<Object> editGroupDescription(@NotNull @pv.a EditGroupDescriptionDto editGroupDescriptionDto);

    @p("/bigboss/api/v1/group")
    Object editGroupDisplayImage(@NotNull @pv.a EditGroupDisplayImageDto editGroupDisplayImageDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/group")
    Object editGroupNameAndTags(@NotNull @pv.a EditGroupNameRequestDto editGroupNameRequestDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/group")
    Object editIsOpenForAudience(@NotNull @pv.a OpenForAudienceDto openForAudienceDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/member")
    Object exitGroup(@NotNull @pv.a ExitChatGroupRequestDto exitChatGroupRequestDto, @NotNull a<? super v0<Unit>> aVar);

    @o("loki/games/exit")
    @NotNull
    m<BaseResponseDto<String>> exitLeague(@NotNull @pv.a LeagueExitRequestDto leagueExitRequestDto);

    @f("/bigboss/api/v2/messages")
    @NotNull
    m<MessageListDto> fetchRecentMessages(@t("group_id") String groupId, @t("sort_desc") String sortDesc, @t("limit") Integer limit, @t("is_deleted") Boolean isDeleted, @t("with_sender_info") Boolean withSenderInfo, @t("with_interaction_data") Boolean withInteractionData, @t("with_likes_count") Boolean withLikesCount, @t("offset") Integer offset);

    @f("/godfather/v1/ads")
    Object getAddData(@NotNull a<? super v0<BaseResponseDto<AddResponse>>> aVar);

    @f("loki/games")
    Object getAllMyLeaguesWithAssets(@t("ac") String str, @NotNull a<? super v0<BaseResponseV2Dto<ArenaAllData>>> aVar);

    @f("loki/games/sortOpts")
    Object getAllSortOptions(@NotNull a<? super v0<BaseResponseV2Dto<ArenaSortOptions>>> aVar);

    @f("loki/games/upcoming")
    Object getAllUpcomingLeaguesWithAssets(@t("ac") String str, @t("pn") String str2, @t("sb") String str3, @t("sd") String str4, @NotNull a<? super v0<BaseResponseV2Dto<ArenaAllData>>> aVar);

    @f("/bigboss/api/v1/member")
    @NotNull
    m<GroupMembersDto> getBannedGroupMembers(@t("group_id") String groupId, @t("role") String role, @t("limit") Integer limit, @t("offset") Integer offset);

    @f("/bigboss/api/v1/message/permission/{group_id}")
    Object getBigbossGroupMessageLevelPermissions(@s("group_id") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<UserGroupLevelPermissionsDto>>> aVar);

    @f("/bigboss/api/v1/member/permission")
    Object getBigbossHomeLevelPermissions(@NotNull a<? super v0<BaseResponseDto<SocialHomePermissionsDto>>> aVar);

    @f("/rhino/v2/social/posts/bookmarked")
    Object getBookmarkedPosts(@t("limit") int i10, @t("offset") int i11, @NotNull a<? super v0<BaseResponseDto<FeedStreamDto>>> aVar);

    @f("/abacus/champions")
    Object getChampionsList(@NotNull a<? super v0<BaseResponseDto<List<ChampionDto>>>> aVar);

    @f("/bigboss/api/v1/group/info/{group_id}")
    @NotNull
    m<BaseResponseDto<Group>> getChatGroupById(@s("group_id") @NotNull String groupId, @t("with_admin_info") boolean withAdminInfo, @t("with_status_info") boolean withStatusInfo, @t("non_search") boolean nonSearch, @t("with_write_access") boolean withWriteAccess, @t("image_size") @NotNull String imageSize);

    @f("/bigboss/api/v2/group/info/{group_id}")
    Object getChatGroupInfoV2(@s("group_id") @NotNull String str, @t("with_admin_info") boolean z10, @t("with_status_info") boolean z11, @t("non_search") boolean z12, @t("with_write_access") boolean z13, @t("image_size") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<Group>>> aVar);

    @f("/bigboss/api/v1/member")
    Object getChatGroups(@t("user_id") String str, @t("with_group_meta") boolean z10, @t("with_unread_count") boolean z11, @t("with_last_message") boolean z12, @t("status") @NotNull String str2, @t("role_ne") @NotNull String str3, @t("sort_desc") @NotNull String str4, @t("limit") int i10, @t("offset") int i11, @t("with_write_role_only") boolean z13, @NotNull a<? super v0<UserChatGroupsResponse>> aVar);

    @f("/bigboss/api/v1/member")
    @NotNull
    m<ChatNotificationDto> getChatTotalUnreadCount(@t("user_id") String id2, @t("with_total_unread_only") boolean totalUnread, @t("status") @NotNull String status);

    @f("/fox/v1/wallet/config")
    @NotNull
    m<BaseResponseDto<ConfigDto>> getConfig(@t("user_id") String userId);

    @f("/auth/v2/import-contacts")
    @NotNull
    m<BaseResponseDto<List<StockgroContact>>> getContacts(@t("image_size") @NotNull String imageSize);

    @f("/steve/v1/entity/coupons/{couponId}")
    @NotNull
    m<BaseResponseDto<RedemptionOffer>> getCouponDetails(@s("couponId") @NotNull String couponId);

    @f("/steve/v1/entity/coupons")
    @NotNull
    m<BaseResponseDto<ArrayList<RedemptionOffer>>> getCoupons();

    @f("/bigboss/api/v1/search/followers")
    Object getCreateGroupFollowers(@t("offset") int i10, @t("limit") int i11, @NotNull a<? super v0<BaseResponseV2Dto<CreateGroupUsersResponse>>> aVar);

    @f("/bigboss/api/v1/search/followers")
    Object getCreateGroupFollowersAddMembers(@t("offset") int i10, @t("limit") int i11, @t("group_id") @NotNull String str, @NotNull a<? super v0<BaseResponseV2Dto<CreateGroupUsersResponse>>> aVar);

    @f("/bigboss/api/v1/search/users")
    Object getCreateGroupUniversalFollowers(@t("search_str") @NotNull String str, @t("f_offset") int i10, @t("f_limit") int i11, @t("limit") int i12, @t("offset") int i13, @NotNull a<? super v0<BaseResponseV2Dto<CreateGroupSearchResponse>>> aVar);

    @f("/bigboss/api/v1/search/users")
    Object getCreateGroupUniversalFollowersAddMembers(@t("search_str") @NotNull String str, @t("f_offset") int i10, @t("f_limit") int i11, @t("limit") int i12, @t("offset") int i13, @t("group_id") @NotNull String str2, @NotNull a<? super v0<BaseResponseV2Dto<CreateGroupSearchResponse>>> aVar);

    @o("auth/roles/social/get")
    @NotNull
    m<BaseResponseDto<List<RogueUserDto>>> getDeactivatedMembers(@NotNull @pv.a DeactivatedMemberDto deactivatedMemberDto);

    @f("/bigboss/api/v2/home")
    @NotNull
    m<DiscoverDto> getDiscoverHomeData();

    @f("/portman/api/v1/option/history/orders")
    Object getFnoPortfolioHistory(@t("portfolio_id") String str, @t("filter") String str2, @t("sort") String str3, @t("trade_type") String str4, @t("execution_date") String str5, @t("is_model") Boolean bool, @NotNull a<? super v0<PortfolioFnoHistoryData>> aVar);

    @f("/portman/api/v1/option/list/orders")
    Object getFnoPortfolioOrders(@t("portfolio_id") String str, @t("filter") String str2, @t("is_model") Boolean bool, @NotNull a<? super v0<PortfolioFnoOrderResponse>> aVar);

    @f("auth/user/followers/list")
    Object getFollowersDetails(@t("user") @NotNull String str, @NotNull a<? super v0<BaseResponseV2Dto<List<FollowerFollowingData>>>> aVar);

    @f("auth/user/following/list")
    Object getFollowingDetails(@t("user") @NotNull String str, @NotNull a<? super v0<BaseResponseV2Dto<List<FollowerFollowingData>>>> aVar);

    @f("/auth/user/contacts/list")
    @NotNull
    m<BaseResponseDto<List<FollowerDto>>> getFriends(@t("user") String userId);

    @f("/bigboss/api/v1/social/friends")
    @NotNull
    m<FriendMemberDto> getFriendsNotInGroup(@t("not_in_group") String groupId, @t("limit") Integer limit, @t("offset") Integer offset, @t("name_sub_str") String searchString, @t("sort_desc") String sortDesc);

    @f("/bigboss/api/v1/member/invitees")
    Object getGroupInfoInvitees(@t("limit") int i10, @t("offset") int i11, @t("group_id") @NotNull String str, @NotNull a<? super v0<BaseResponseV2Dto<GroupInfoInvitesResponse>>> aVar);

    @f("/bigboss/api/v1/member")
    @NotNull
    m<GroupMembersDto> getGroupMembers(@t("group_id") @NotNull String id2, @t("status") @NotNull String status, @t("limit") int limit, @t("offset") int offset, @t("role_ne") @NotNull String roleNotEqualTo, @t("image_size") @NotNull String imageSize, @t("with_global_role") boolean withGlobalRole);

    @f("/bigboss/api/v2/messages")
    @NotNull
    m<MessageListDto> getGroupPinnedMessages(@t("group_id") String groupId, @t("is_pinned") boolean isPinned, @t("with_sender_info") boolean withSenderInfo, @t("sort_desc") String sortDesc);

    @f("/bigboss/api/v1/group/tags")
    Object getGroupTagList(@NotNull a<? super v0<List<Tags>>> aVar);

    @f("/rhino/v1/home")
    Object getHomePageDataV2(@NotNull a<? super v0<BaseResponseDto<WidgetData>>> aVar);

    @f("/rhino/v2/home")
    Object getHomePageDataV3(@NotNull a<? super v0<BaseResponseDto<MainHomeDto>>> aVar);

    @f("http://worldtimeapi.org/api/timezone/Asia/Kolkata")
    @NotNull
    m<ServerTimeResponse> getIndianTimeZoneTime();

    @f("/auth/send/invite-user/{contact}")
    @NotNull
    m<BaseResponseDto<String>> getInviteUserDetails(@s("contact") @NotNull String contact);

    @f("auth/invitees")
    @NotNull
    m<BaseResponseDto<List<InvitedFriendDto>>> getInvitedFriends();

    @f("/usermeta/api/v1/kyc/profile/{userId}")
    @NotNull
    m<KycResponseDto> getKyc(@s("userId") String userId);

    @f("/bollywood/v1/kycfaq")
    @NotNull
    m<BaseResponseDto<KycFAQResponse>> getKycFaqs();

    @f("/usermeta/api/v1/kyc/profile/support")
    Object getKycTicketStatus(@NotNull a<? super v0<KycSupportTicketResponseDto>> aVar);

    @f("/auth/app/version")
    @NotNull
    m<BaseResponseDto<AppVersionResponseDto>> getLatestAppVersion();

    @f("loki/games/info/{leagueId}")
    Object getLeagueInfo(@s("leagueId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<ArenaGame>>> aVar);

    @k({"isAuthorizable: false"})
    @o("https://www.linkedin.com/oauth/v2/accessToken")
    Object getLinkedInAccessToken(@t("grant_type") @NotNull String str, @t("code") @NotNull String str2, @t("redirect_uri") @NotNull String str3, @t("client_id") @NotNull String str4, @t("client_secret") @NotNull String str5, @NotNull a<? super v0<LinkedInTokenResponseDto>> aVar);

    @k({"isAuthorizable: false"})
    @f("https://api.linkedin.com/v2/emailAddress?q=members&projection=(elements*(handle~))")
    Object getLinkedInEmailAddress(@t("oauth2_access_token") @NotNull String str, @NotNull a<? super v0<LinkedInEmailModel>> aVar);

    @k({"isAuthorizable: false"})
    @f("https://api.linkedin.com/v2/me?projection=(id,firstName,lastName,profilePicture(displayImage~:playableStreams))")
    Object getLinkedInUserProfile(@t("oauth2_access_token") @NotNull String str, @NotNull a<? super v0<LinkedInProfileModel>> aVar);

    @f("auth/v2/users/admin")
    @NotNull
    m<BaseResponseDto<ArrayList<StockgroContact>>> getListOfAdmin();

    @f("https://storage.googleapis.com/stockgro-config/status.json")
    @NotNull
    m<MaintenanceResponse> getMaintenanceConfig();

    @f("https://storage.googleapis.com/stockgro-config/{path}")
    Object getMaintenanceConfigV2(@s("path") @NotNull String str, @NotNull a<? super v0<MaintenanceResponseV2>> aVar);

    @f("/rhino/v1/market/search")
    Object getMarketSearchData(@t("search_param") @NotNull String str, @t("asset_class") String str2, @t("page") Integer num, @NotNull a<? super v0<MarketSearchResponseDto>> aVar);

    @f("/bigboss/api/v1/member/invite/groups")
    Object getMemberInvitedGroups(@t("limit") int i10, @t("offset") int i11, @t("sort_desc") @NotNull String str, @t("with_invite_count") boolean z10, @NotNull a<? super v0<BaseResponseV2Dto<MemberInvitedGroupsResponse>>> aVar);

    @f("/bigboss/api/v1/message/thread")
    @NotNull
    m<MessageThreadInfoDto> getMessageThreadInfo(@t("message_id") String id2, @t("is_deleted") Boolean isDeleted, @t("with_sender_info") Boolean withSenderInfo, @t("with_interaction_data") Boolean withInteractionData, @t("with_likes_count") Boolean withLikesCount);

    @f("subway/v1/user/packages")
    Object getMySubscription(@NotNull a<? super v0<BaseResponseV2Dto<MySubscriptionResponse>>> aVar);

    @f("/pigeon/v1/notify/list/{type_id}")
    @NotNull
    m<BaseResponseDto<List<NotificationDto>>> getNotificationsList(@s("type_id") int category);

    @f("/rhino/v1/fno/api/chain/{optionIdentifier}")
    Object getOptionChain(@s("optionIdentifier") @NotNull String str, @t("type") String str2, @NotNull a<? super v0<BaseResponseDto<OptionChainDto>>> aVar);

    @f("/rhino/v1/fno/api/snapshot/{optionType}")
    Object getOptionListData(@s("optionType") @NotNull String str, @t("page") Integer num, @t("limit") Integer num2, @t("search_param") String str2, @NotNull a<? super v0<BaseResponseDto<MarketOptionDto>>> aVar);

    @f("/rhino/v1/fno/api/olhcv/history")
    Object getOptionOhlc(@t("contract_sym") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<OptionHistoryDto>>> aVar);

    @f("/rhino/v1/fno/api/overview")
    Object getOptionOverview(@t("contract_sym") String str, @t("symbol") String str2, @t("expiry") String str3, @t("option_type") String str4, @t("strike_price") String str5, @NotNull a<? super v0<BaseResponseDto<OptionOverviewDto>>> aVar);

    @f("/api/v1/portfolio/{portfolioId}/stocks/{stockId}/order/{transactionType}/{orderId}/modify")
    @NotNull
    m<BaseResponseDto<StockModifyInfoDto>> getOrderDetails(@s("portfolioId") @NotNull String portfolioId, @s("stockId") @NotNull String stockId, @s("transactionType") @NotNull String transactionType, @s("orderId") @NotNull String orderId);

    @f("/portman/api/v1/option/order")
    Object getOrderInfo(@t("order_id") @NotNull String str, @t("portfolio_id") @NotNull String str2, @t("is_model") boolean z10, @NotNull a<? super v0<BaseResponseDto<FnoOrderInfoResponseDto>>> aVar);

    @f("/portman/api/v1/option/holdings/open-positions")
    Object getOrderReview(@t("parent_symbol") @NotNull String str, @t("is_model") Boolean bool, @t("portfolio_id") String str2, @NotNull a<? super v0<BaseResponseDto<PortfolioReviewResponse>>> aVar);

    @f("subway/v1/package/downgrade/{packageId}")
    Object getPackageDowngrade(@s("packageId") @NotNull String str, @NotNull a<? super v0<BaseResponseV2Dto<SubscriptionDowngradePromptResponse>>> aVar);

    @f("/auth/contacts")
    @NotNull
    m<ContactResponseDto<List<NonStockgroContact>>> getPhoneContacts(@t("page") @NotNull String page, @t("search") @NotNull String search);

    @f("auth/v2/phone/{phoneNumber}")
    Object getPhoneNumberStatus(@s("phoneNumber") @NotNull String str, @t("mixpanelDistinctId") @NotNull String str2, @t("country_code") @NotNull String str3, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @f("/jury/api/v2/options/portfolio/summary")
    Object getPortfolioFnoHolding(@t("portfolio_id") String str, @NotNull a<? super v0<BaseResponseDto<PortfolioFnoHoldingResponseDto>>> aVar);

    @f("/api/v1/portfolio/{portfolioId}/history")
    @NotNull
    m<BaseResponseDto<PortfolioHistoryDto>> getPortfolioHistory(@s("portfolioId") String portfolioId, @t("sort") @NotNull String sort, @t("trade_type") @NotNull String tradeType, @t("execution_date") @NotNull String executionDate);

    @f("/api/v1/portfolio/{portfolioId}/orders")
    @NotNull
    m<BaseResponseDto<PortfolioOrdersDto>> getPortfolioOrders(@s("portfolioId") String portfolioId, @t("order_status") @NotNull String sort);

    @f("/api/v1/portfolio/unlock")
    @NotNull
    m<BaseResponseDto<UnlockPortfolioResponse>> getPortfolioUnlockDetails();

    @f("/rhino/v1/portfolios")
    Object getPortfoliosV2(@NotNull a<? super v0<BaseResponseDto<PortfoliosDto>>> aVar);

    @f("/parrot/api/v1/items")
    Object getPostComments(@t("entity_id") @NotNull String str, @t("limit") int i10, @t("offset") int i11, @t("section") @NotNull String str2, @t("image_size") @NotNull String str3, @NotNull a<? super v0<BaseResponseDto<PostCommentsDto>>> aVar);

    @f("/rhino/v1/invite/post")
    Object getPostShareTemplate(@t("post_id") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar);

    @f("jury/api/v2/pl")
    Object getPrepZoneEquityPortfolioData(@t("portfolio_id") @NotNull String str, @t("league_id") String str2, @t("with_leader_board") Boolean bool, @t("ignore_squared") Boolean bool2, @NotNull a<? super v0<BaseResponseDto<LeagueUnifiedResponseDto>>> aVar);

    @f("jury/api/v2/options/prepzone/summary")
    Object getPrepZoneOptionPortfolioData(@t("portfolio_id") String str, @t("league_id") String str2, @t("with_leader_board") Boolean bool, @t("ignore_squared") Boolean bool2, @t("optionsPortfolio") Boolean bool3, @t("leagueFlow") Boolean bool4, @NotNull a<? super v0<BaseResponseDto<LeagueUnifiedResponseDto>>> aVar);

    @f("/auth/user/stats")
    @NotNull
    m<BaseResponseDto<ProfileStatsDto>> getProfileStats(@t("uuid") @NotNull String profileId);

    @f("/auth/user/stats")
    Object getProfileStatsV2(@t("uuid") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<ProfileStatsDto>>> aVar);

    @f("/parrot/api/v1/items/interaction/report/post")
    Object getReasonsToReportComment(@NotNull a<? super v0<BaseResponseDto<ReportEntityReasonsDto>>> aVar);

    @f("/bigboss/api/v1/message/report/reasons")
    @NotNull
    m<ReportUserReasonsDto> getReasonsToReportMessage();

    @f("/postie/api/v1/post/report/reasons")
    Object getReasonsToReportPost(@NotNull a<? super v0<BaseResponseDto<ReportEntityReasonsDto>>> aVar);

    @f("/bigboss/api/v1/social/user/report/reasons")
    @NotNull
    m<ReportUserReasonsDto> getReasonsToReportUser();

    @f("/steve/v1/user/entity/coupons")
    @NotNull
    m<BaseResponseDto<ArrayList<RedeemedOffers>>> getRedeemed();

    @f("rhino/v1/expert/public/profile/{id}")
    Object getRiaProfileData(@s("id") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<RiaProfileResponseDto>>> aVar);

    @f("/bigboss/api/v1/category")
    @NotNull
    m<SocialCategoryDto> getSocialCategories();

    @f("/bigboss/api/v1/social/config")
    Object getSocialConfig(@NotNull a<? super v0<BaseResponseDto<SocialConfigResponseDto>>> aVar);

    @f("/rhino/v2/social/feed/{type_of}")
    Object getSocialFeedItems(@s("type_of") @NotNull String str, @t("limit") int i10, @t("offset") int i11, @t("sub_category_id") String str2, @t("group_id") String str3, @t("post_ids") List<String> list, @t("is_expired") Boolean bool, @t("filter") String str4, @NotNull a<? super v0<BaseResponseDto<FeedStreamDto>>> aVar);

    @o("auth/roles/social/get")
    @NotNull
    m<BaseResponseDto<ArrayList<SocialRoleResponseDto>>> getSocialGlobalRole(@NotNull @pv.a SocialGlobalRoleDto socialGlobalRoleDto);

    @f("bigboss/api/v1/member/social-groups")
    Object getSocialGroupsDetails(@t("user_id") @NotNull String str, @NotNull a<? super v0<List<SocialGroupsItem>>> aVar);

    @f("/rhino/v2/social/home")
    Object getSocialHome(@NotNull a<? super v0<BaseResponseDto<SocialHomeFeedResponseDto>>> aVar);

    @f("/rhino/v2/social/stories")
    Object getSocialHomeStories(@NotNull a<? super v0<BaseResponseDto<SocialHomeFeedStoryResponseDto>>> aVar);

    @f("/bigboss/api/v1/search")
    Object getSocialSearchData(@t("search_in") @NotNull String str, @t("search_str") @NotNull String str2, @t("offset") Integer num, @t("limit") Integer num2, @NotNull a<? super v0<SocialSearchResponseDto>> aVar);

    @f("/bigboss/api/v1/search/history")
    Object getSocialSearchHistoryData(@NotNull a<? super v0<SocialSearchHistoryResponseDto>> aVar);

    @f("/bigboss/api/v2/messages")
    @NotNull
    m<MessageListDto> getStarredMessagesForUser(@t("pinned_user") String userId, @t("group_id") String groupId, @t("with_sender_info") Boolean withSenderInfo, @t("sort_desc") String sortDesc);

    @f("bigboss/api/v1/sticker/desi")
    Object getStickers(@NotNull a<? super v0<BaseResponseDto<StickersDto>>> aVar);

    @f("sticker/api/v2/stocks/analysis/{calculationType}/{stockName}")
    <T extends StockAnalysisCalculationType> Object getStockAnalysisData(@s("calculationType") @NotNull String str, @s("stockName") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<StockAnalysisDto<StockAnalysisEmaConfigDto>>>> aVar);

    @f("sticker/api/v2/stocks/analysis/{calculationType}/{stockName}")
    <T extends StockAnalysisCalculationType> Object getStockAnalysisDataBvps(@s("calculationType") @NotNull String str, @s("stockName") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<StockAnalysisDto<StockAnalysisBvpsConfigDto>>>> aVar);

    @f("/sticker/api/v2/stocks/history/{type}/{stockName}")
    Object getStockChartV2(@s("type") @NotNull String str, @s("stockName") @NotNull String str2, @t("duration") String str3, @NotNull a<? super v0<BaseResponseDto<StockChartV2Dto>>> aVar);

    @f("/sticker/api/v1/stocks/overview/{stockName}")
    @NotNull
    m<BaseResponseDto<StockDetailDto>> getStockDetails(@s("stockName") @NotNull String stockName);

    @f("/bollywood/v1/group/homescreen")
    Object getStockGyanCardData(@t("index_id") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<StockGyanDto>>> aVar);

    @f("/bollywood/v1/group/library")
    @NotNull
    m<BaseResponseDto<StockGyanDto>> getStockGyanGroups();

    @f("sticker/api/v1/stocks/insights")
    @NotNull
    m<BaseResponseDto<AssetInsightsDto>> getStockInsights();

    @f("/api/v1/stocks/insights")
    Object getStockInsightsV2(@t("section_param") String str, @NotNull a<? super v0<BaseResponseDto<List<StockDto>>>> aVar);

    @f("/api/v1/stocks/{stockName}/select-order")
    @NotNull
    m<BaseResponseDto<StockOrderInfoResponseDto>> getStockOrderInfo(@s("stockName") @NotNull String stockName);

    @f("/api/v1/portfolio/{portfolioId}/stocks/{stockId}/select-order")
    @NotNull
    m<BaseResponseDto<StockSellSelectOrderResponseDto>> getStockOrderInfoForPortfolio(@s("portfolioId") @NotNull String portfolioId, @s("stockId") @NotNull String stockId);

    @f("/sticker/api/v2/stocks/overview/{stockName}")
    Object getStockOverviewData(@s("stockName") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<MarketOverviewDto>>> aVar);

    @f("/sticker/api/v1/stocks/snapshot")
    @NotNull
    m<BaseResponseDto<StocksListResponse>> getStocks(@t("sort") @NotNull String sort, @t("page") @NotNull String page, @t("index") @NotNull String index);

    @f("sticker/api/v2/stocks/charts/{stockName}")
    Object getStocksAllChartsData(@s("stockName") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<StockChartBaseDto>>> aVar);

    @f("/api/v1/stocks")
    @NotNull
    m<BaseResponseDto<StocksListResponse>> getStocksSearch(@t("sort") @NotNull String sort, @t("page") @NotNull String page, @t("search_param") @NotNull String searchParam);

    @f("subway/v1/package/purchase/info/{packageId}")
    Object getSubscriptionConfirmation(@s("packageId") @NotNull String str, @t("mandate_setup") boolean z10, @NotNull a<? super v0<BaseResponseV2Dto<SubscriptionPlanConfirmationResponse>>> aVar);

    @f("subway/v1/package/user/bulletins")
    Object getSubscriptionPrompt(@t("screen_tag") String str, @NotNull a<? super v0<BaseResponseV2Dto<SubscriptionNudgeResponse>>> aVar);

    @f("subway/v1/maintenance")
    Object getSubwayMaintenance(@NotNull a<? super v0<BaseResponseV2Dto<SubscriptionMaintenanceResponse>>> aVar);

    @o("/googly/template")
    Object getTemplateFromGooglyService(@pv.a InviteTemplateDto inviteTemplateDto, @NotNull a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar);

    @f("/fox/v1/transaction/{transactionId}")
    Object getTransactionDetails(@s("transactionId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<TransactionDetailResponse>>> aVar);

    @o("/fox/v1/gateway/status")
    Object getTransactionStatus(@NotNull @pv.a TransactionStatusRequestDto transactionStatusRequestDto, @NotNull a<? super v0<BaseResponseDto<TransactionStatusResponse>>> aVar);

    @f("/api/v1/home")
    @NotNull
    m<BaseResponseDto<HomePageTopDataResponse>> getTrendingStocks();

    @f("/rewards/v1/users/{userId}/scratch-cards")
    Object getUnclaimedScratchCardsForMainDashBoard(@s("userId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<c>>> aVar);

    @f("/pigeon/v1/notify/count/unread")
    @NotNull
    m<BaseResponseDto<Integer>> getUnreadNotificationsCount();

    @f("/bigboss/api/v1/social/block/status/{user_id}")
    Object getUserBlockedStatus(@s("user_id") String str, @NotNull a<? super v0<BaseResponseV2Dto<UserBlockStatusDao>>> aVar);

    @f("/jury/api/v1/portfolios/default/{userId}")
    @NotNull
    m<UserDefaultPortfolioDto> getUserDefaultPortfolio(@s("userId") String userId);

    @f("/bigboss/api/v1/member")
    Object getUserGlobalRole(@t("user_id") String str, @t("group_id") String str2, @t("with_global_role") boolean z10, @NotNull a<? super v0<GroupMembersDto>> aVar);

    @f("/mario/public/api/v1/users/{userId}/tasks/{taskId}")
    Object getUserMissionDetails(@s("userId") String str, @s("taskId") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<MissionDetailDto>>> aVar);

    @f("/mario/public/api/v1/users/{userId}/tasks")
    Object getUserMissions(@s("userId") String str, @NotNull a<? super v0<BaseResponseDto<MissionsHomeDto>>> aVar);

    @f("/mario/public/api/v1/users/{userId}/tasks/history")
    Object getUserMissionsHistoryByStatus(@s("userId") String str, @t("status") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<MissionsHistoryByStatusDto>>> aVar);

    @f("/mario/public/api/v1/users/{userId}/tasks/history/count")
    Object getUserMissionsHistoryConsolidated(@s("userId") String str, @NotNull a<? super v0<BaseResponseDto<MissionsHistoryConsolidatedDto>>> aVar);

    @f("/api/v1/portfolios?status=all")
    @NotNull
    m<BaseResponseDto<List<Portfolio>>> getUserPortfolios(@t("asset_class") String assetClass);

    @f("/bigboss/api/v1/social/user/report/status/{user_id}")
    @NotNull
    m<UserReportStatusDto> getUserReportedStatus(@s("user_id") String userId);

    @f("/usermeta/api/v1/social/user")
    Object getUserSocialAuthStatus(@t("user_id") String str, @NotNull a<? super v0<UserSocialAuthStatusDto>> aVar);

    @f("jury/api/v1/stats/prepzone/user/{userId}")
    Object getUserStatsAndRecentPerformance(@s("userId") @NotNull String str, @t("trailing_days") @NotNull String str2, @t("page_limit") int i10, @t("page_number") int i11, @NotNull a<? super v0<BaseResponseV2Dto<UserStatsAndResponseDto>>> aVar);

    @o("auth/geo")
    @NotNull
    m<BaseResponseDto<Object>> getUserStatus(@NotNull @pv.a GeoDto geoDto);

    @f("/bigboss/api/v1/social/user/blocked")
    Object getUsersBlockedList(@t("limit") int i10, @t("offset") int i11, @NotNull a<? super v0<BaseResponseDto<BlockedUserListDto>>> aVar);

    @f("/backstage/stockgro/tutorials")
    Object getVideoTutorials(@NotNull a<? super v0<BaseResponseDto<VideoTutorialDataResponse>>> aVar);

    @f("/fox/v2/wallet")
    @NotNull
    m<BaseResponseDto<WalletBalanceResponseDto>> getWalletBalance();

    @f("fox/v1/wallet/limit")
    Object getWalletLimit(@NotNull a<? super v0<BaseResponseDto<WithdrawableLimitDto>>> aVar);

    @f("/fox/v2/wallet/history")
    Object getWalletTransactions(@t("page_number") @NotNull String str, @t("wallet") String str2, @t("txn_type") String str3, @t("status") String str4, @t("reason") String str5, @t("start_date") String str6, @t("end_date") String str7, @NotNull a<? super v0<BaseResponseDto<WalletTransactionsDto>>> aVar);

    @f("/abacus/stats/league/winners/{leagueId}")
    @NotNull
    m<BaseResponseDto<TopLeaguesDto>> getWinners(@s("leagueId") @NotNull String leagueId, @t("page_number") Integer pageNumber);

    @p("/postie/api/v1/post/react")
    Object handleFeedPostReaction(@NotNull @pv.a FeedPostReactionDto feedPostReactionDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/parrot/api/v1/items/interaction/reaction/{comment_id}")
    Object handlePostCommentReaction(@s("comment_id") @NotNull String str, @NotNull @pv.a PostCommentReactionDto postCommentReactionDto, @t("section") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<Unit>>> aVar);

    @o("/fox/v1/gateway/initiate")
    @NotNull
    m<BaseResponseDto<JusPayInitiateResponse>> initiateJustPayPayload(@NotNull @pv.a JusPayInitiateRequest jusPayInitiateRequest);

    @o("loki/games/v1/join")
    Object joinLeagueWithAutomaticPortfolioSelection(@NotNull @pv.a LeagueJoinRequestDto leagueJoinRequestDto, @NotNull a<? super v0<BaseResponseDto<String>>> aVar);

    @o("/bigboss/api/v1/member")
    Object joinSocialGroup(@NotNull @pv.a JoinSocialGroupRequestDto joinSocialGroupRequestDto, @NotNull a<? super v0<UserGroupInfo>> aVar);

    @f("abacus/stats/winnings/lifetime")
    @NotNull
    m<BaseResponseDto<LifetimeEarning>> lifetimeEarning(@t("user_id") String userId);

    @f("/bigboss/api/v2/messages")
    @NotNull
    m<MessageListDto> loadMessages(@t("group_id") String groupId, @t("updated_at_micros_lte") Long updatedAtLte, @t("sort_desc") String sortDesc, @t("limit") Integer limit, @t("is_deleted") Boolean isDeleted, @t("with_sender_info") Boolean withSenderInfo, @t("with_interaction_data") Boolean withInteractionData, @t("with_likes_count") Boolean withLikesCount, @t("image_size") String imageSize);

    @f("/auth/v2/logout")
    @NotNull
    m<BaseResponseDto<Object>> logout();

    @p("/bigboss/api/v1/member/{action}")
    Object manageMember(@s("action") @NotNull String str, @NotNull @pv.a ManageMemberRequest manageMemberRequest, @NotNull a<? super v0<BaseResponseV2Dto<ManageMemberResponse>>> aVar);

    @p("/pigeon/v1/notify/readall")
    @NotNull
    m<BaseResponseDto<Integer>> markAllNotificationsRead();

    @p("/bigboss/api/v1/member")
    @NotNull
    m<Object> markMessagesAsRead(@NotNull @pv.a MarkReadMessagesDto markReadMessagesDto);

    @p("/bigboss/api/v1/msginteraction")
    @NotNull
    m<Object> messageInteraction(@NotNull @pv.a MessageInteractionRequestDto messageInteractionRequestDto);

    @p("/portman/api/v1/portfolio/{operationType}")
    Object modifyFnoPortfolio(@s("operationType") @NotNull String str, @NotNull @pv.a jg.a aVar, @NotNull a<? super v0<BaseResponseDto<jg.b>>> aVar2);

    @p("/portman/api/v1/option/{optionType}/modify")
    Object modifyOptionFno(@s("optionType") @NotNull String str, @NotNull @pv.a BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, @NotNull a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar);

    @p("/api/v1/stocks/{stockId}/order/modify")
    @NotNull
    m<BaseResponseDto<String>> modifyOrder(@s("stockId") @NotNull String stockId, @NotNull @pv.a ModifyOrderRequestDto request);

    @o("/auth/v2/login")
    Object numberLogin(@NotNull @pv.a NumberLoginRequestDto numberLoginRequestDto, @NotNull a<? super v0<BaseResponseDto<OnboardingResponseDto>>> aVar);

    @p("/bigboss/api/v1/message")
    @NotNull
    m<Unit> pinMessageToGroup(@NotNull @pv.a PinnedMessageDto pinnedMessageDto);

    @f("auth/ping")
    Object ping(@NotNull a<? super v0<BaseResponseV2Dto<Object>>> aVar);

    @o("/auth/app/instance/{userId}")
    @NotNull
    m<BaseResponseDto<Object>> postAppData(@s("userId") String userId, @NotNull @pv.a AppCloneDataRequest appCloneDataRequest);

    @o("/chitragupt/scroll_depth/home")
    Object postScrollDepth(@NotNull @pv.a ScrollDepth scrollDepth, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @o("/fox/v1/gateway/process")
    @NotNull
    m<BaseResponseDto<Object>> processJustPayPayload(@NotNull @pv.a JusPayInitiateRequest jusPayInitiateRequest);

    @o("/steve/v1/entity/coupons/purchase/{couponId}")
    @NotNull
    m<BaseResponseDto<Object>> purchaseCoupon(@s("couponId") @NotNull String couponId);

    @o("subway/v1/package/purchase")
    Object purchaseSubscriptionPlan(@NotNull @pv.a SubscriptionPlanPurchaseRequestDto subscriptionPlanPurchaseRequestDto, @NotNull a<? super v0<BaseResponseV2Dto<SubscriptionPurchaseResponse>>> aVar);

    @p("/bollywood/v1/group/interaction")
    @NotNull
    m<BaseResponseDto<StockGyanDto>> putStockGyanIndexInteraction(@NotNull @pv.a StockGyanInteractionDto stockGyanInteractionDto);

    @o("/auth/v2/register")
    Object register(@NotNull @pv.a RegisterRequestDto registerRequestDto, @t("mixpanelDistinctId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<OnboardingResponseDto>>> aVar);

    @p("/bigboss/api/v1/member")
    Object removeGroupMember(@NotNull @pv.a RemoveMemberDto removeMemberDto, @NotNull a<? super v0<Unit>> aVar);

    @h(hasBody = m4.m.f27484o, method = "DELETE", path = "auth/user/remove")
    Object removeUserAccount(@NotNull @pv.a AccountDeleteRequest accountDeleteRequest, @NotNull a<? super v0<BaseResponseV2Dto<AccountDeleteResponse>>> aVar);

    @o("/api/v1/portfolio/rename")
    @NotNull
    m<BaseResponseDto<String>> renamePortfolio(@NotNull @pv.a RenamePortfolioDto renamePortfolioDto);

    @o("/bigboss/api/v1/group/report")
    Object reportChatGroup(@NotNull @pv.a ReportChatGroupRequestDto reportChatGroupRequestDto, @NotNull a<? super v0<ReportChatGroupRequestDto>> aVar);

    @o("loki/games/report")
    @NotNull
    m<BaseResponseDto<String>> reportLeague(@NotNull @pv.a LeagueReportRequestDto leagueReportRequestDto);

    @p("/postie/api/v1/post/report/{post_id}")
    Object reportPost(@s("post_id") @NotNull String str, @NotNull @pv.a ReportEntityRequestDto reportEntityRequestDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/parrot/api/v1/items/interaction/report/{comment_id}")
    Object reportPostComment(@s("comment_id") @NotNull String str, @t("section") @NotNull String str2, @NotNull @pv.a ReportCommentRequestDto reportCommentRequestDto, @NotNull a<? super v0<Unit>> aVar);

    @p("/bigboss/api/v1/social/user/report")
    @NotNull
    m<ReportedEntityConfirmationDto> reportUser(@NotNull @pv.a ReportUserRequestDto reportUserRequestDto);

    @p("/bigboss/api/v1/message/report")
    @NotNull
    m<ReportedEntityConfirmationDto> reportUserChatMessage(@t("code") String code, @t("message_id") @NotNull String messageId);

    @p("/bigboss/api/v1/message/report")
    @NotNull
    m<ReportedEntityConfirmationDto> reportUserChatMessageV2(@NotNull @pv.a ReportMessageRequestDto reportMessageRequestDto);

    @o("fox/v2/wallet/otp/generate")
    Object resendOtp(@NotNull @pv.a String str, @NotNull a<? super v0<BaseResponseDto<WithdrawOtpRegenerateResponseDto>>> aVar);

    @o("/auth/v2/2fa/reset/otp")
    Object resetPasswordOtp(@NotNull @pv.a PhoneNumberDto phoneNumberDto, @NotNull a<? super v0<BaseResponseDto<String>>> aVar);

    @o("/api/v1/portfolio/reset")
    @NotNull
    m<BaseResponseDto<String>> resetPortfolio(@NotNull @pv.a ResetPortfolioDto resetPortfolioDto);

    @p("/mario/public/api/v1/users/{userId}/tasks/{taskId}/review")
    Object retryMission(@s("userId") String str, @s("taskId") @NotNull String str2, @NotNull a<? super v0<BaseResponseDto<Unit>>> aVar);

    @o("/usermeta/api/v1/social/user")
    @NotNull
    m<Object> saveUserSocialData(@t("platform") @NotNull String platform, @NotNull @pv.a SocialDataDto socialDataDto);

    @f("/bigboss/api/v1/member/byname")
    @NotNull
    m<GroupMembersDto> searchGroupMembers(@t("group_id") String id2, @t("search_str") @NotNull String searchString, @t("limit") int limit, @t("offset") int offset, @t("image_size") String imageSize);

    @o("/api/v1/stocks/{stockId}/order/sell")
    @NotNull
    m<BaseResponseDto<StockOrderResponse>> sellStockOrder(@s("stockId") @NotNull String stockId, @NotNull @pv.a StockSellOrderRequestDto stockSellOrderRequestDto);

    @o("postie/api/v1/post/share")
    Object sendSocialShareTrackingData(@NotNull @pv.a SocialShareTrackingRequestDto socialShareTrackingRequestDto, @NotNull a<? super v0<BaseResponseDto<Unit>>> aVar);

    @f("jury/api/v1/achievement/{league_id}")
    Object shareYourAchievementCta(@s("league_id") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<ArenaAchievementShareDto>>> aVar);

    @o("/api/v1/stocks/{stockName}/order/sell")
    @NotNull
    m<BaseResponseDto<StockOrderResponse>> shortSellStockOrder(@s("stockName") @NotNull String stockName, @NotNull @pv.a StockBuyOrderRequestDto stockBuyOrderRequestDto);

    @o("/api/v1/stocks/{stockId}/order/buy")
    @NotNull
    m<BaseResponseDto<StockOrderResponse>> squareOffStock(@s("stockId") @NotNull String stockId, @NotNull @pv.a StockSellOrderRequestDto stockSellOrderRequestDto);

    @p("/bigboss/api/v1/msginteraction")
    @NotNull
    m<Object> starMessageForUser(@NotNull @pv.a StarMessageRequestDto starMessageRequestDto);

    @o("/mario/public/api/v1/users/{userId}/tasks/{taskId}")
    Object startMission(@s("userId") String str, @s("taskId") @NotNull String str2, @NotNull @pv.a MissionMetaDto missionMetaDto, @NotNull a<? super v0<BaseResponseDto<Unit>>> aVar);

    @p("/postie/api/v2/subcat/interaction")
    Object subCategoryInteraction(@NotNull @pv.a SubCategoryInteractionDto subCategoryInteractionDto, @NotNull a<? super v0<Unit>> aVar);

    @o("/auth/v2/app/feedback")
    @NotNull
    m<BaseResponseDto<Object>> submitFeedback(@NotNull @pv.a FeedbackRequestDto feedbackRequestDto);

    @o("/auth/user/friend/remove")
    Object unfriend(@NotNull @pv.a FriendRequestDto friendRequestDto, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @o("/api/v1/portfolio/unlock")
    @NotNull
    m<BaseResponseDto<Object>> unlockPortfolio(@NotNull @pv.a UnlockPortfolioRequest unlockPortfolioRequest);

    @f("/heimdall/public/v1/countries")
    Object updateAvailableCountriesList(@NotNull a<? super v0<BaseResponseDto<CountriesDto>>> aVar);

    @p("/auth/v2/update-device-token")
    @NotNull
    m<BaseResponseDto<String>> updateFirebaseToken(@t("device_id") @NotNull String firebaseToken);

    @o("/fox/v1/gateway/callback")
    @NotNull
    m<BaseResponseDto<Object>> updateJustPayTransactionStatus(@NotNull @pv.a JusPayTransactionStatusRequest jusPayInitiateRequestRequest);

    @o("/auth/token/notification")
    @NotNull
    m<BaseResponseDto<String>> updateNotificationId(@NotNull @pv.a NotificationIdUpdateDto notificationIdUpdateDto);

    @p("/auth/v3/update-pin")
    Object updatePinV2(@NotNull @pv.a UpdatePinNumberRequestDtoV2 updatePinNumberRequestDtoV2, @NotNull a<? super v0<BaseResponseDto<Object>>> aVar);

    @f("/auth/v2/refresh/{uuid}")
    Object updateTokenV2(@s("uuid") String str, @t("app_version_code") @NotNull String str2, @NotNull a<? super v0<BaseResponseV2Dto<TokenRefreshResponseDto>>> aVar);

    @l
    @p("/heimdall/public/v1/users/{userId}")
    Object updateUserProfile(@q MultipartBody.Part part, @q("bio") RequestBody requestBody, @q("display_name") RequestBody requestBody2, @s("userId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<Unit>>> aVar);

    @l
    @o("/falcon/v1/media/chat/message")
    @NotNull
    m<AssetUploadResponse> uploadChatAssets(@t("group_id") String groupId, @t("message_id") @NotNull String messageId, @NotNull @q MultipartBody.Part part);

    @l
    @o("/falcon/v1/media/chat/message")
    @NotNull
    m<AssetUploadResponse> uploadChatGroupAssets(@t("group_id") String groupId, @t("image_type") @NotNull String imageType, @t("image_id") @NotNull String imageId, @NotNull @q MultipartBody.Part part);

    @o("/auth/contacts")
    @NotNull
    m<BaseResponseDto<Object>> uploadContacts(@NotNull @pv.a ContactUpload uploadContactsBody);

    @l
    @o("/falcon/v1/media/feed/post")
    @NotNull
    m<AssetUploadResponse> uploadFeedPostAssets(@t("image_id") String messageId, @t("filename") String filename, @NotNull @q MultipartBody.Part part);

    @l
    @o("/falcon/v1/media/kycsupport/asset")
    @NotNull
    m<AssetUploadResponse> uploadKycFaqAssets(@t("asset_id") String assetId, @NotNull @q MultipartBody.Part part);

    @f("/auth/v2/user")
    Object userInfo(@NotNull a<? super v0<BaseResponseDto<UserInfoResponseDto>>> aVar);

    @o("/auth/v2/2fa/signup/otp")
    Object verifyMobile(@NotNull @pv.a PhoneNumberDto phoneNumberDto, @t("mixpanelDistinctId") @NotNull String str, @NotNull a<? super v0<BaseResponseDto<String>>> aVar);

    @f("/auth/2fa/{secret}/verify/{otp}")
    Object verifyOtp(@s("secret") @NotNull String str, @s("otp") @NotNull String str2, @t("mixpanelDistinctId") @NotNull String str3, @NotNull a<? super v0<BaseResponseDto<String>>> aVar);

    @o("fox/v2/wallet/withdraw/initiate")
    Object withdrawInitiate(@NotNull @pv.a WithdrawInitiateDto withdrawInitiateDto, @NotNull a<? super v0<BaseResponseDto<WithdrawInitiateResponseDto>>> aVar);

    @o("fox/v2/wallet/withdraw/process")
    Object withdrawProcess(@NotNull @pv.a WithdrawProcessDto withdrawProcessDto, @NotNull a<? super v0<BaseResponseDto<WithdrawProcessResponseDto>>> aVar);

    @o("/auth/verify-pin")
    @NotNull
    m<BaseResponseDto<Object>> withdrawalPinVerify(@NotNull @pv.a PinLoginRequestDto pinLoginRequestDto);
}
