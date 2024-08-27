package ad;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.g0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.data.model.GroupInfoInviteItem;
import com.assetgro.stockgro.data.model.PrivacyLayerUserGroup;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.data.remote.response.BulletInDto;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.homepage.data.HomeTitleDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomepageTitleData;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationFragment;
import com.assetgro.stockgro.ui.subscription.nudge.SubscriptionNudgeItemViewModel;
import in.juspay.services.HyperServices;
import iu.k;
import iu.v;
import java.io.ByteArrayOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import pg.q;
import qu.f0;
import t0.g1;
import vt.p0;

/* loaded from: classes.dex */
public final class f extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        super(0);
        this.f362a = i10;
        this.f363b = obj;
        this.f364c = obj2;
    }

    public final void a() {
        int i10 = this.f362a;
        Class cls = UserProfileActivity.class;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        Uri uri = null;
        fj.c cVar = null;
        Object obj = this.f364c;
        Object obj2 = this.f363b;
        switch (i10) {
            case 0:
                g gVar = (g) obj2;
                Context context = (Context) obj;
                String str2 = gVar.f368c;
                Drawable drawable = gVar.f369d;
                Intrinsics.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap == null) {
                    Toast.makeText(context, gVar.getString(R.string.image_sharing_failed), 0).show();
                    return;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, new ByteArrayOutputStream());
                String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", (String) null);
                if (insertImage != null) {
                    uri = Uri.parse(insertImage);
                }
                if (uri == null) {
                    Toast.makeText(context, gVar.getString(R.string.image_sharing_failed), 0).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.invite_a_friend));
                intent.putExtra("android.intent.extra.TEXT", str2);
                String string = context.getString(R.string.game_start_invite_friends_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                context.startActivity(Intent.createChooser(intent, string));
                return;
            case 1:
                ((Function1) obj2).invoke((UserChatGroup) obj);
                return;
            case 2:
                ((Function1) obj2).invoke((CreateGroupUser) obj);
                return;
            case 3:
                ((g1) obj).setValue(Boolean.TRUE);
                ((v) obj2).f20556a = true;
                return;
            case 4:
                CreateGroupUser createGroupUser = (CreateGroupUser) obj2;
                if (createGroupUser.getIsExpert()) {
                    cls = RiaProfileActivity.class;
                }
                Context context2 = (Context) obj;
                Intent intent2 = new Intent(context2, (Class<?>) cls);
                intent2.putExtra("USER_IDENTIFIER", createGroupUser.getUserId());
                intent2.putExtra("USER_NAME", createGroupUser.getDisplayName());
                context2.startActivity(intent2);
                return;
            case 5:
                Context context3 = (Context) obj;
                Intent intent3 = new Intent(context3, (Class<?>) cls);
                GroupInfoInviteItem groupInfoInviteItem = (GroupInfoInviteItem) obj2;
                intent3.putExtra("USER_IDENTIFIER", groupInfoInviteItem.getUserId());
                intent3.putExtra("USER_NAME", groupInfoInviteItem.getDisplayName());
                context3.startActivity(intent3);
                return;
            case 6:
                ((Function1) obj2).invoke((StickerData) obj);
                return;
            case 7:
                ((Function1) obj2).invoke((PrivacyLayerUserGroup) obj);
                return;
            case 8:
            default:
                fj.e eVar = (fj.e) obj2;
                BulletInDto bulletInDto = (BulletInDto) ((SubscriptionNudgeItemViewModel) eVar.v()).f9075c.getValue();
                if (bulletInDto != null) {
                    cVar = new fj.c(bulletInDto.getPosterId(), eVar.c(), bulletInDto.getDeeplinkUrl());
                }
                Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(((BulletInDto) obj).getDeeplinkUrl()));
                Intrinsics.c(cVar);
                eVar.f16142x.invoke(intent4, cVar);
                return;
            case 9:
                String redirectionUrl = ((HomepageTitleData) obj2).getRedirectionUrl();
                if (redirectionUrl != null) {
                    ((Function2) obj).invoke(redirectionUrl, null);
                    return;
                }
                return;
            case 10:
                ((Function2) obj2).invoke((String) obj, null);
                return;
            case 11:
                String redirectionUrl2 = ((HomeTitleDto) obj2).getRedirectionUrl();
                if (redirectionUrl2 != null) {
                    ((Function2) obj).invoke(redirectionUrl2, null);
                    return;
                }
                return;
            case 12:
                Widget widget = (Widget) obj2;
                AnalyticEvent analyticEvent = new AnalyticEvent("app_home_section_cta_tapped", p0.f(new Pair("section_name", String.valueOf(widget.getTitle())), new Pair("cta_text", String.valueOf(widget.getExtraActionCtaTitle())), new Pair("redirection_uri", String.valueOf(widget.getExtraActionBehavior()))));
                Function2 function2 = (Function2) obj;
                String extraActionBehavior = widget.getExtraActionBehavior();
                if (extraActionBehavior != null) {
                    str = extraActionBehavior;
                }
                function2.invoke(str, analyticEvent);
                return;
            case 13:
                RechargeWalletActivity context4 = (RechargeWalletActivity) obj2;
                if (context4.L().isInitialised()) {
                    context4.L().process((JSONObject) obj);
                    return;
                }
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter("Retry", "text");
                Toast makeText = Toast.makeText(context4, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService = context4.getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c("Retry", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                return;
            case 14:
                yk.g.H((f0) obj2, null, null, new q((Function0) obj, null), 3);
                return;
            case 15:
                ((Function1) obj2).invoke((th.b) obj);
                return;
            case 16:
                SubscriptionPlanConfirmationFragment subscriptionPlanConfirmationFragment = (SubscriptionPlanConfirmationFragment) obj2;
                HyperServices hyperServices = subscriptionPlanConfirmationFragment.f10551h;
                if (hyperServices != null) {
                    if (hyperServices.isInitialised()) {
                        HyperServices hyperServices2 = subscriptionPlanConfirmationFragment.f10551h;
                        if (hyperServices2 != null) {
                            hyperServices2.process((JSONObject) obj);
                            return;
                        } else {
                            Intrinsics.k("hyperInstance");
                            throw null;
                        }
                    }
                    Context context5 = subscriptionPlanConfirmationFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "requireContext(...)");
                    String text = subscriptionPlanConfirmationFragment.getString(R.string.retry);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context5, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText2 = Toast.makeText(context5, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService2 = context5.getSystemService("layout_inflater");
                        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        return;
                    }
                    return;
                }
                Intrinsics.k("hyperInstance");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        y4.c cVar;
        switch (this.f362a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            case 8:
                Function0 function0 = (Function0) this.f363b;
                if (function0 == null || (cVar = (y4.c) function0.mo2invoke()) == null) {
                    y4.c defaultViewModelCreationExtras = ((g0) this.f364c).requireActivity().getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return cVar;
            case 9:
                a();
                return Unit.f23355a;
            case 10:
                a();
                return Unit.f23355a;
            case 11:
                a();
                return Unit.f23355a;
            case 12:
                a();
                return Unit.f23355a;
            case 13:
                a();
                return Unit.f23355a;
            case 14:
                a();
                return Unit.f23355a;
            case 15:
                a();
                return Unit.f23355a;
            case 16:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, GroupInfoInviteItem groupInfoInviteItem) {
        super(0);
        this.f362a = 5;
        this.f364c = context;
        this.f363b = groupInfoInviteItem;
    }
}
