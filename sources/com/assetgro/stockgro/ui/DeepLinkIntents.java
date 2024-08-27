package com.assetgro.stockgro.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.airbnb.deeplinkdispatch.DeepLink;
import com.airbnb.deeplinkdispatch.DeepLinkMethodResult;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.enums.TopPortfolioType;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.details.FeedPostStreamDetailActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamHostActivity;
import com.assetgro.stockgro.missions.presentation.MissionsHostActivity;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;
import com.assetgro.stockgro.ui.drawer.about.AppAboutSectionActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartActivity;
import com.assetgro.stockgro.ui.drawer.faq.FaqActivity;
import com.assetgro.stockgro.ui.drawer.invite.InviteActivity;
import com.assetgro.stockgro.ui.drawer.rate.RateAppActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.drawer.tutorials.TutorialsActivity;
import com.assetgro.stockgro.ui.hedwig.utils.PhotoViewerActivity;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListActivity;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import com.assetgro.stockgro.ui.home.v2.TransparentActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycHostActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.DefaultWebViewActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostActivity;
import com.assetgro.stockgro.ui.social.presentation.video.VideoFullScreenActivity;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenActivity;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.assetgro.stockgro.ui.stock.list.StockListHostActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.facebook.applinks.AppLinkData;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.net.URLDecoder;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import q3.b1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\bÇ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/ui/DeepLinkIntents;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/os/Bundle;", AppLinkData.ARGUMENTS_EXTRAS_KEY, "Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;", "intentForWallet", "intentForRiaPage", "Lq3/b1;", "intentForBottomNavModules", "intentForChats", "intentForLeague", "intentForMenuItems", "intentForRechargeWallet", "intentForWithdrawWallet", "intentForWithdrawWalletWithOption", "intentForWriteToUs", "intentForKYC", "intentForEditProfile", "intentForFeedPostSocialShare", "intentForFeedPostDetail", "intentForMarketFno", "intentForSgPlus", "intentForSgPlusConfirmation", "intentForUserProfile", "intentForStock", "intentForTopPortFolio", "intentForCenterPopUp", "intentForVideoRedirection", "intentForBrowserRedirection", "intentForInAppBrowserRedirection", "intentForYoutubeFullScreenRedirection", "intentForVideoFullScreenRedirection", "intentForImageRedirection", "intentForTopTrending", "intentForStockGyan", "intentForPortfolioDetail", "intentForSocialFeedStream", "intentForMissionsHome", "intentForMissionDetail", "intentForMissionHistoryDetail", "intentForGroupDetailFromMissions", "intentForFeedPostFromMissions", "intentForStockList", "intentForStockOptions", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DeepLinkIntents {

    /* renamed from: a, reason: collision with root package name */
    public static final StockGroApplication f8940a;

    static {
        StockGroApplication stockGroApplication = StockGroApplication.f8559c;
        if (stockGroApplication != null) {
            f8940a = stockGroApplication;
        } else {
            Intrinsics.k("instance");
            throw null;
        }
    }

    public static b1 a(Context context, Bundle bundle) {
        Intent action = new Intent(context, (Class<?>) SplashActivity.class).setAction("deep_link_complex");
        Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
        action.putExtras(bundle);
        b1 b1Var = new b1(context);
        Intrinsics.checkNotNullExpressionValue(b1Var, "create(...)");
        b1Var.b(action);
        return b1Var;
    }

    public static boolean b() {
        boolean z10;
        String uuid = ((UserPreferences) f8940a.a().f14258j.get()).getUuid();
        if (uuid != null && uuid.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }

    @DeepLink({"app.stockgro://stockgro.com/{path}"})
    @NotNull
    public static final b1 intentForBottomNavModules(@NotNull Context context, @NotNull Bundle extras) {
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent action = new Intent(context, (Class<?>) MainActivity.class).setAction("deep_link_complex");
            Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
            b1 b1Var = new b1(context);
            Intrinsics.checkNotNullExpressionValue(b1Var, "create(...)");
            b1Var.b(action);
            return b1Var;
        }
        Bundle h10 = h.h("is_deep_link_flag", true);
        h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
        return a(context, h10);
    }

    @DeepLink({"app.stockgro://stockgro.com/browser/{url}"})
    @NotNull
    public static final DeepLinkMethodResult intentForBrowserRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new DeepLinkMethodResult(new Intent("android.intent.action.VIEW", Uri.parse(URLDecoder.decode(extras.getString("url"), "UTF-8"))), null);
    }

    @DeepLink({"app.stockgro://stockgro.com/center_popup"})
    @NotNull
    public static final DeepLinkMethodResult intentForCenterPopUp(@NotNull Context context, @NotNull Bundle extras) {
        String str;
        String str2;
        String str3;
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("title");
        if (string != null) {
            str = URLDecoder.decode(string, "UTF-8");
        } else {
            str = null;
        }
        String string2 = extras.getString("image");
        if (string2 != null) {
            str2 = URLDecoder.decode(string2, "UTF-8");
        } else {
            str2 = null;
        }
        String string3 = extras.getString("auto_close");
        if (string3 != null) {
            str3 = URLDecoder.decode(string3, "UTF-8");
        } else {
            str3 = null;
        }
        if (b()) {
            intent = new Intent(context, (Class<?>) TransparentActivity.class);
            intent.setFlags(536870912);
            intent.putExtra("title", str);
            intent.putExtra("auto_close", str3);
            intent.putExtra("image", str2);
        } else {
            intent = new Intent();
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/chats/{groupId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForChats(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) GroupDetailActivity.class);
            intent2.putExtra("GROUP_CHAT_ID", extras.getString("groupId"));
            intent2.putExtra("HANDLE_BACKPRESS", true);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putString("path", "social");
            h10.putBoolean("HANDLE_BACKPRESS", true);
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/edit/profile"})
    @NotNull
    public static final DeepLinkMethodResult intentForEditProfile(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) EditProfileActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/feed/post/{groupId}/{postId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForFeedPostDetail(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String string = extras.getString("groupId");
            String string2 = extras.getString("postId");
            extras.putString("GROUP_CHAT_ID", string);
            extras.putString("POST_ID", string2);
            Intent intent2 = new Intent(context, (Class<?>) FeedPostStreamDetailActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/feed/post/detail/{groupId}/{postId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForFeedPostFromMissions(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String string = extras.getString("groupId");
            String string2 = extras.getString("postId");
            extras.putBoolean("HANDLE_BACKPRESS", false);
            extras.putString("GROUP_CHAT_ID", string);
            extras.putString("POST_ID", string2);
            extras.putBoolean("is_deep_link_flag", true);
            intent = new Intent(context, (Class<?>) FeedPostStreamDetailActivity.class);
        } else {
            intent = new Intent();
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/feed/{groupId}/{postId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForFeedPostSocialShare(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String string = extras.getString("groupId");
            String string2 = extras.getString("postId");
            extras.putString("GROUP_CHAT_ID", string);
            extras.putString("POST_ID", string2);
            extras.putBoolean("is_deep_link_flag", true);
            extras.putBoolean("HANDLE_BACKPRESS", true);
            Intent intent2 = new Intent(context, (Class<?>) FeedPostStreamDetailActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putString("path", "social");
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            h10.putBoolean("HANDLE_BACKPRESS", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/groups/{groupId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForGroupDetailFromMissions(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            intent = new Intent(context, (Class<?>) GroupDetailActivity.class);
            intent.putExtra("GROUP_CHAT_ID", extras.getString("groupId"));
            intent.putExtra("HANDLE_BACKPRESS", false);
        } else {
            intent = new Intent();
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/image/{image_url}"})
    @NotNull
    public static final DeepLinkMethodResult intentForImageRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String decode = URLDecoder.decode(extras.getString("image_url"), "UTF-8");
        if (b()) {
            intent = new Intent(context, (Class<?>) PhotoViewerActivity.class);
            intent.putExtra("url", decode);
            intent.putExtra("type", "image");
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/in_app_browser/{url}"})
    @NotNull
    public static final DeepLinkMethodResult intentForInAppBrowserRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String decode = URLDecoder.decode(extras.getString("url"), "UTF-8");
        Intent intent = new Intent(context, (Class<?>) DefaultWebViewActivity.class);
        intent.putExtra("WEB_URL", decode);
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/kyc"})
    @NotNull
    public static final DeepLinkMethodResult intentForKYC(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) KycHostActivity.class);
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("DESTINATION", "kyc");
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/arena/league/{leagueId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForLeague(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("path", "arena");
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putString("path", "arena");
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/market/{assetType}"})
    @NotNull
    public static final DeepLinkMethodResult intentForMarketFno(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String string = extras.getString("assetType");
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("path", "market");
            intent2.putExtra("ASSET_CLASS_TYPE", string);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putString("path", "market");
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @DeepLink({"app.stockgro://stockgro.com/menu/{destination}"})
    @NotNull
    public static final DeepLinkMethodResult intentForMenuItems(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent;
        Intent intent2 = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String string = extras.getString("destination");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1849961962:
                        if (string.equals("my_profile")) {
                            intent = new Intent(context, (Class<?>) MyProfileActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case -704332663:
                        if (string.equals("champions_chart")) {
                            intent = new Intent(context, (Class<?>) ChampionsChartActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case -600094315:
                        if (string.equals("friends")) {
                            intent = new Intent(context, (Class<?>) FollowerFollowingActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 101142:
                        if (string.equals("faq")) {
                            intent = new Intent(context, (Class<?>) FaqActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 193276766:
                        if (string.equals("tutorial")) {
                            intent = new Intent(context, (Class<?>) TutorialsActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 422610498:
                        if (string.equals("rate_app")) {
                            intent = new Intent(context, (Class<?>) RateAppActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 1268654261:
                        if (string.equals("stockgyan")) {
                            intent = new Intent(context, (Class<?>) StockGyanGroupsActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 1272354024:
                        if (string.equals("notifications")) {
                            intent = new Intent(context, (Class<?>) NotificationsActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 1825383407:
                        if (string.equals("app_about")) {
                            intent = new Intent(context, (Class<?>) AppAboutSectionActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 1986759828:
                        if (string.equals("invite_friend")) {
                            intent = new Intent(context, (Class<?>) InviteActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                    case 1989774883:
                        if (string.equals("exchange")) {
                            intent = new Intent(context, (Class<?>) RedemptionHostActivity.class).setAction("deep_link_complex");
                            Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
                            break;
                        }
                        break;
                }
                intent2 = intent;
                a10 = null;
            }
            intent = new Intent(context, (Class<?>) MainActivity.class);
            intent2 = intent;
            a10 = null;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent2, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/missions/detail/{taskId}"})
    @NotNull
    public static final DeepLinkMethodResult intentForMissionDetail(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) MissionsHostActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/missions/history/{status}"})
    @NotNull
    public static final DeepLinkMethodResult intentForMissionHistoryDetail(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) MissionsHostActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/missions/home"})
    @NotNull
    public static final DeepLinkMethodResult intentForMissionsHome(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) MissionsHostActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/portfolio/detail/{portfolio_id}"})
    @NotNull
    public static final DeepLinkMethodResult intentForPortfolioDetail(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("portfolio_id");
        if (b()) {
            intent = new Intent(context, (Class<?>) PortfolioDetailActivity.class);
            intent.putExtra("PORTFOLIO_ID", string);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/wallet/add"})
    @NotNull
    public static final DeepLinkMethodResult intentForRechargeWallet(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            intent = new Intent(context, (Class<?>) RechargeWalletActivity.class).setAction("deep_link_complex");
            a10 = null;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/ui/friend/{ria_userId}?is_ria=true"})
    @NotNull
    public static final DeepLinkMethodResult intentForRiaPage(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            intent = new Intent(context, (Class<?>) RiaProfileActivity.class);
            intent.putExtra("USER_IDENTIFIER", extras.getString("ria_userId"));
            intent.putExtra("IS_RIA", true);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/sg-plus", "app.stockgro://stockgro.com/sg-plus/{planName}/details"})
    @NotNull
    public static final DeepLinkMethodResult intentForSgPlus(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) ManageSubscriptionActivity.class);
            intent2.putExtra("planName", extras.getString("planName"));
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/sg-plus/{planName}/confirmation"})
    @NotNull
    public static final DeepLinkMethodResult intentForSgPlusConfirmation(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) ManageSubscriptionActivity.class);
            intent2.putExtra("confirmation", true);
            intent2.putExtra("planName", extras.getString("planName"));
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/social/feedview/stream/{entity}", "app.stockgro://stockgro.com/social/feedview/stream/{entity}/{entity_id}"})
    @NotNull
    public static final DeepLinkMethodResult intentForSocialFeedStream(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            String valueOf = String.valueOf(extras.getString("entity"));
            String valueOf2 = String.valueOf(extras.getString("entity_id"));
            Intent intent2 = new Intent(context, (Class<?>) FeedStreamHostActivity.class);
            int hashCode = valueOf.hashCode();
            String str = "FEED_STREAM_FAVOURITES";
            if (hashCode != 98629247) {
                if (hashCode != 586052842) {
                    if (hashCode == 1300380478 && valueOf.equals("subcategory")) {
                        str = "FEED_STREAM_SUBCATEGORY";
                    }
                } else {
                    valueOf.equals("favourites");
                }
            } else if (valueOf.equals("group")) {
                str = "FEED_STREAM_GROUP";
            }
            intent2.putExtra("FEED_STREAM_TYPE", str);
            intent2.putExtra("FEED_STREAM_ENTITY_ID", valueOf2);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/market/stocks/{stock_id}"})
    @NotNull
    public static final DeepLinkMethodResult intentForStock(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("stock_id");
        if (b()) {
            intent = new Intent(context, (Class<?>) StockDetailHostActivity.class);
            intent.putExtra("STOCK_NAME", string);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/menu/stockgyan/category/{category_id}"})
    @NotNull
    public static final DeepLinkMethodResult intentForStockGyan(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("category_id");
        if (b()) {
            intent = new Intent(context, (Class<?>) StockGyanActivity.class);
            intent.putExtra("category_id", string);
            intent.putExtra("CALLED_FROM_HOME_SCREEN", true);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/market/stocks"})
    @NotNull
    public static final DeepLinkMethodResult intentForStockList(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            extras.putBoolean("is_deep_link_flag", true);
            Intent intent2 = new Intent(context, (Class<?>) StockListHostActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/market/stocks/options"})
    @NotNull
    public static final DeepLinkMethodResult intentForStockOptions(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            extras.putBoolean("is_deep_link_flag", true);
            Intent intent2 = new Intent(context, (Class<?>) OptionsListHostActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/top_portfolios/{filter}"})
    @NotNull
    public static final DeepLinkMethodResult intentForTopPortFolio(@NotNull Context context, @NotNull Bundle extras) {
        TopPortfolioType topPortfolioType;
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("filter");
        if (Intrinsics.a(string, "today_top_portfolios")) {
            topPortfolioType = TopPortfolioType.TODAY;
        } else if (Intrinsics.a(string, "weekly_top_portfolios")) {
            topPortfolioType = TopPortfolioType.WEEKLY;
        } else {
            topPortfolioType = TopPortfolioType.WEEKLY;
        }
        if (b()) {
            intent = new Intent(context, (Class<?>) TopPortfolioListActivity.class);
            intent.putExtra("PORTFOLIO_TYPE", topPortfolioType);
            intent.putExtra("CALLED_FROM_HOME_SCREEN", true);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    @com.airbnb.deeplinkdispatch.DeepLink({"app.stockgro://stockgro.com/market/stocks/insights/{filter}"})
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.airbnb.deeplinkdispatch.DeepLinkMethodResult intentForTopTrending(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull android.os.Bundle r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "filter"
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "Top Trending"
            if (r6 == 0) goto L5f
            int r1 = r6.hashCode()
            switch(r1) {
                case -1038328675: goto L51;
                case -846961088: goto L43;
                case -325663213: goto L35;
                case 64437459: goto L27;
                case 1146385615: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L5f
        L1c:
            java.lang.String r1 = "top_trending"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L5f
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.TRENDING
            goto L61
        L27:
            java.lang.String r1 = "weekly_top_portfolios"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L30
            goto L5f
        L30:
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.WEEKLY_TOP_PORTFOLIOS
            java.lang.String r0 = "Top Portfolios (Weekly)"
            goto L61
        L35:
            java.lang.String r1 = "today_top_portfolios"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L3e
            goto L5f
        L3e:
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.DAILY_TOP_PORTFOLIOS
            java.lang.String r0 = "Top Portfolios (Today)"
            goto L61
        L43:
            java.lang.String r1 = "top_losers"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L4c
            goto L5f
        L4c:
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.LOSERS
            java.lang.String r0 = "Top Losers"
            goto L61
        L51:
            java.lang.String r1 = "top_gainers"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L5a
            goto L5f
        L5a:
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.GAINERS
            java.lang.String r0 = "Top Gainers"
            goto L61
        L5f:
            com.assetgro.stockgro.data.model.InsightListType r1 = com.assetgro.stockgro.data.model.InsightListType.TRENDING
        L61:
            boolean r2 = b()
            r3 = 0
            if (r2 == 0) goto L85
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailActivity> r4 = com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailActivity.class
            r2.<init>(r5, r4)
            java.lang.String r5 = "TYPE"
            r2.putExtra(r5, r1)
            java.lang.String r5 = "stocks_filter"
            r2.putExtra(r5, r6)
            java.lang.String r5 = "TITLE"
            r2.putExtra(r5, r0)
            java.lang.String r5 = "CALLED_FROM_HOME_SCREEN"
            r6 = 1
            r2.putExtra(r5, r6)
            goto L86
        L85:
            r2 = r3
        L86:
            com.airbnb.deeplinkdispatch.DeepLinkMethodResult r5 = new com.airbnb.deeplinkdispatch.DeepLinkMethodResult
            r5.<init>(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.DeepLinkIntents.intentForTopTrending(android.content.Context, android.os.Bundle):com.airbnb.deeplinkdispatch.DeepLinkMethodResult");
    }

    @DeepLink({"app.stockgro://stockgro.com/user_profile/{user_id}/{user_name}"})
    @NotNull
    public static final DeepLinkMethodResult intentForUserProfile(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("user_id");
        String decode = URLDecoder.decode(extras.getString("user_name"), "UTF-8");
        if (b()) {
            intent = new Intent(context, (Class<?>) UserProfileActivity.class);
            intent.putExtra("USER_IDENTIFIER", string);
            if (decode != null) {
                str = w.X(decode).toString();
            } else {
                str = null;
            }
            intent.putExtra("USER_NAME", str);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/video/storage/{url}"})
    @NotNull
    public static final DeepLinkMethodResult intentForVideoFullScreenRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String decode = URLDecoder.decode(extras.getString("url"), "UTF-8");
        Intent intent = new Intent(context, (Class<?>) VideoFullScreenActivity.class);
        intent.putExtra("VIDEO_URL", decode);
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/video/{video_url}"})
    @NotNull
    public static final DeepLinkMethodResult intentForVideoRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String decode = URLDecoder.decode(extras.getString("video_url"), "UTF-8");
        if (b()) {
            intent = new Intent(context, (Class<?>) MediaPlayerActivity.class);
            intent.putExtra("url", decode);
        } else {
            intent = null;
        }
        return new DeepLinkMethodResult(intent, null);
    }

    @DeepLink({"app.stockgro://stockgro.com/wallet"})
    @NotNull
    public static final DeepLinkMethodResult intentForWallet(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) WalletHomeActivity.class);
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/wallet/withdraw"})
    @NotNull
    public static final DeepLinkMethodResult intentForWithdrawWallet(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            intent = new Intent(context, (Class<?>) PaymentWithdrawalActivity.class).setAction("deep_link_complex");
            a10 = null;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/wallet/withdraw/{option}"})
    @NotNull
    public static final DeepLinkMethodResult intentForWithdrawWalletWithOption(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("option");
        String str = "TRANSFER_TO_BANK";
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != 116014) {
                if (hashCode != 3016252) {
                    if (hashCode == 106444065 && string.equals("paytm")) {
                        str = "TRANSFER_TO_PAYTM_WALLET";
                    }
                } else {
                    string.equals(PaymentConstants.BANK);
                }
            } else if (string.equals(PaymentConstants.WIDGET_UPI)) {
                str = "TRANSFER_TO_UPI";
            }
        }
        extras.putString("WITHDRAWAL_TRANSFER_MODE", str);
        if (b()) {
            Intent action = new Intent(context, (Class<?>) WithdrawalDetailActivity.class).setAction("deep_link_complex");
            Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
            a10 = new b1(context);
            a10.b(action);
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            h10.putBoolean("IS_DEFERRED_DEEP_LINK", true);
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(null, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/writetous"})
    @NotNull
    public static final DeepLinkMethodResult intentForWriteToUs(@NotNull Context context, @NotNull Bundle extras) {
        b1 a10;
        Intent intent = null;
        if (h.w(context, LogCategory.CONTEXT, extras, AppLinkData.ARGUMENTS_EXTRAS_KEY)) {
            Intent intent2 = new Intent(context, (Class<?>) KycHostActivity.class);
            intent2.putExtra("is_deep_link_flag", true);
            intent2.putExtra("DESTINATION", "help_center");
            a10 = null;
            intent = intent2;
        } else {
            Bundle h10 = h.h("is_deep_link_flag", true);
            h10.putString("deep_link_uri", extras.getString("deep_link_uri"));
            a10 = a(context, h10);
        }
        return new DeepLinkMethodResult(intent, a10);
    }

    @DeepLink({"app.stockgro://stockgro.com/video/youtube/{video_id}"})
    @NotNull
    public static final DeepLinkMethodResult intentForYoutubeFullScreenRedirection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String string = extras.getString("video_id");
        Intent intent = new Intent(context, (Class<?>) YoutubeVideoFullScreenActivity.class);
        intent.putExtra("YOUTUBE_VIDEO_URL", string);
        return new DeepLinkMethodResult(intent, null);
    }
}
