package ha;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import ba.ah;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewSecondaryCallRequestData;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionTypeKt;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.widget.RiaExpertiseWidget;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.social.domain.model.UserGroupLevelPermissions;
import com.assetgro.stockgro.widget.ChatToolbar;
import com.chaos.view.PinView;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import okhttp3.HttpUrl;
import vt.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18086d;

    public /* synthetic */ h(int i10, Object obj, Object obj2, Object obj3) {
        this.f18083a = i10;
        this.f18084b = obj;
        this.f18085c = obj2;
        this.f18086d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Double d10;
        FnoOption identifierInfo;
        PinView pinView;
        Editable text;
        String str2;
        HashMap hashMap;
        Boolean canReportGroupMessage;
        Boolean canShareGroupMessage;
        Media media;
        Boolean canPinGroupMessage;
        int i10;
        int i11 = 3;
        int i12 = this.f18083a;
        String str3 = null;
        Boolean bool = null;
        Object obj = this.f18086d;
        Object obj2 = this.f18085c;
        Object obj3 = this.f18084b;
        switch (i12) {
            case 0:
                ChipGroup this_addExpiryOptionChip = (ChipGroup) obj3;
                Chip chip = (Chip) obj2;
                OptionDetailFragment this$0 = (OptionDetailFragment) obj;
                int i13 = OptionDetailFragment.f8591h;
                Intrinsics.checkNotNullParameter(this_addExpiryOptionChip, "$this_addExpiryOptionChip");
                Intrinsics.checkNotNullParameter(chip, "$chip");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int childCount = this_addExpiryOptionChip.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = this_addExpiryOptionChip.getChildAt(i14);
                    Intrinsics.d(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                    Chip chip2 = (Chip) childAt;
                    chip2.setChecked(Intrinsics.a(chip2, chip));
                    String obj4 = chip.getTag().toString();
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("OptionDetailFragment", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g(obj4, "s", objArr, "params", "OptionDetailFragment").getClass();
                    ek.u.k(objArr);
                    if (chip2.isChecked()) {
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_expirydate_select", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        OptionDetailViewModel optionDetailViewModel = (OptionDetailViewModel) this$0.r();
                        String expiryDate = chip2.getTag().toString();
                        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
                        OptionOverview optionOverview = (OptionOverview) optionDetailViewModel.f8596q.getValue();
                        if (optionOverview == null || (identifierInfo = optionOverview.getIdentifierInfo()) == null || (str = identifierInfo.getIdentifier()) == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String stringType = OptionTypeKt.getStringType(optionDetailViewModel.i().getOptionType());
                        OptionContract optionContract = (OptionContract) optionDetailViewModel.D.getValue();
                        if (optionContract != null) {
                            d10 = Double.valueOf(optionContract.getStrikePrice());
                        } else {
                            d10 = null;
                        }
                        OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData = new OptionOverviewSecondaryCallRequestData(str, expiryDate, stringType, String.valueOf(d10));
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            optionDetailViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                        } else {
                            try {
                                yk.g.H(u0.f(optionDetailViewModel), null, null, new q(optionDetailViewModel, optionOverviewSecondaryCallRequestData, null), 3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                return;
            case 1:
                RiaProfileResponseDto.ExpertMeta.Expertise entry = (RiaProfileResponseDto.ExpertMeta.Expertise) obj3;
                RiaExpertiseWidget this$02 = (RiaExpertiseWidget) obj2;
                LinearLayout this_apply = (LinearLayout) obj;
                int i15 = RiaExpertiseWidget.f8852u;
                Intrinsics.checkNotNullParameter(entry, "$entry");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int i16 = i0.f24733j;
                String title = entry.getTitle();
                String description = entry.getDescription();
                Context context = this$02.f8853s;
                if (context != null) {
                    str3 = context.getString(R.string.got_it);
                }
                i0 L = kq.e.L(new ShowInfoData(title, description, str3, 0, 0, false, 24, null));
                Context context2 = this_apply.getContext();
                Intrinsics.d(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                L.show(((h.m) context2).getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
            case 2:
                h.j customDialog = (h.j) obj3;
                GroupDetailHostActivity context3 = (GroupDetailHostActivity) obj2;
                String str4 = (String) obj;
                int i17 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(customDialog, "$customDialog");
                Intrinsics.checkNotNullParameter(context3, "this$0");
                customDialog.dismiss();
                String text2 = context3.getString(R.string.text_blocking_user);
                Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText = Toast.makeText(context3, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context3.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) context3.x();
                groupChatHostViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(groupChatHostViewModel), null, null, new ie.a(groupChatHostViewModel, true, str4, null), 3);
                return;
            case 3:
                PortfolioDetailActivity this$03 = (PortfolioDetailActivity) obj3;
                PopupMenu popupMenuDefault = (PopupMenu) obj2;
                PopupMenu popupMenuLeague = (PopupMenu) obj;
                int i18 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(popupMenuDefault, "$popupMenuDefault");
                Intrinsics.checkNotNullParameter(popupMenuLeague, "$popupMenuLeague");
                if (kotlin.text.s.j(((PortfolioDetailViewModel) this$03.x()).f9781r, this$03.getResources().getString(R.string.text_unavailable), false)) {
                    popupMenuDefault.show();
                    return;
                } else {
                    popupMenuLeague.show();
                    return;
                }
            case 4:
                ah this_AndroidViewBinding = (ah) obj3;
                Function1 function1 = (Function1) obj2;
                Context context4 = (Context) obj;
                Intrinsics.checkNotNullParameter(this_AndroidViewBinding, "$this_AndroidViewBinding");
                Intrinsics.checkNotNullParameter(context4, "$context");
                Editable text3 = this_AndroidViewBinding.f4202t.getText();
                if (text3 != null && !kotlin.text.w.C(text3) && (text = (pinView = this_AndroidViewBinding.f4202t).getText()) != null && text.length() == 4) {
                    function1.invoke(String.valueOf(pinView.getText()));
                    pinView.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    this_AndroidViewBinding.f4201s.setTextInput(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                hl.f.S0(R.string.enter_four_digit_pin, context4);
                return;
            case 5:
                oc.k goToProfileListener = (oc.k) obj3;
                ArenaSection arenaSection = (ArenaSection) obj2;
                TextView this_moveToMyProfileSection = (TextView) obj;
                Intrinsics.checkNotNullParameter(goToProfileListener, "$goToProfileListener");
                Intrinsics.checkNotNullParameter(arenaSection, "$arenaSection");
                Intrinsics.checkNotNullParameter(this_moveToMyProfileSection, "$this_moveToMyProfileSection");
                pc.f fVar = (pc.f) goToProfileListener;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(arenaSection, "arenaSection");
                if (fVar.f30843h.size() == 1 && arenaSection.getArenaGames().isEmpty()) {
                    str2 = "app_arena_my_leagues_empty_state_cta";
                } else {
                    str2 = "app_arena_my_leagues_past_leagues";
                }
                if (fVar.f30843h.size() == 1 && arenaSection.getArenaGames().isEmpty()) {
                    hashMap = p0.f(new Pair("cta_label", fVar.getString(R.string.view_recent_performance)), new Pair("cta_redirection", fVar.getString(R.string.text_profile_analytics)));
                } else {
                    hashMap = new HashMap();
                }
                AnalyticEvent analyticEvent2 = new AnalyticEvent(str2, hashMap);
                if (fVar.f30843h.size() == 1 && arenaSection.getArenaGames().isEmpty()) {
                    fVar.z(analyticEvent2);
                    fVar.B(analyticEvent2);
                    fVar.A(analyticEvent2);
                } else {
                    fVar.z(analyticEvent2);
                    fVar.B(analyticEvent2);
                }
                this_moveToMyProfileSection.getContext().startActivity(new Intent(this_moveToMyProfileSection.getContext(), (Class<?>) MyProfileActivity.class));
                return;
            case 6:
                ChatToolbar this$04 = (ChatToolbar) obj3;
                ChatMessage message = (ChatMessage) obj2;
                String str5 = (String) obj;
                int i19 = ChatToolbar.F;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(message, "$message");
                this$04.getClass();
                m.w wVar = new m.w(new k.e(this$04.getContext(), R.style.SocialPopupTheme), this$04.C);
                new k.j((Context) wVar.f25760a).inflate(R.menu.menu_chat_toolbar_message, (l.o) wVar.f25761b);
                if (str5 != null && Intrinsics.a(str5, message.getSenderId()) && message.getMessage() != null) {
                    l.o oVar = (l.o) wVar.f25761b;
                    int i20 = this$04.f10593s;
                    oVar.add(0, i20, i20, R.string.text_edit_message);
                }
                UserGroupLevelPermissions userGroupLevelPermissions = this$04.E;
                if (userGroupLevelPermissions != null && (canPinGroupMessage = userGroupLevelPermissions.getCanPinGroupMessage()) != null && canPinGroupMessage.booleanValue()) {
                    if (message.isPinned()) {
                        i10 = R.string.text_unpin_message;
                    } else {
                        i10 = R.string.text_pin_message;
                    }
                    l.o oVar2 = (l.o) wVar.f25761b;
                    int i21 = this$04.f10594t;
                    oVar2.add(0, i21, i21, i10);
                }
                UserGroupLevelPermissions userGroupLevelPermissions2 = this$04.E;
                if (userGroupLevelPermissions2 != null && (canShareGroupMessage = userGroupLevelPermissions2.getCanShareGroupMessage()) != null && canShareGroupMessage.booleanValue() && (message.getMessage() != null || ((media = message.getMedia()) != null && kotlin.text.s.j(media.getType(), "image", false)))) {
                    l.o oVar3 = (l.o) wVar.f25761b;
                    int i22 = this$04.f10595u;
                    oVar3.add(0, i22, i22, R.string.text_share_message);
                }
                UserGroupLevelPermissions userGroupLevelPermissions3 = this$04.E;
                if (userGroupLevelPermissions3 != null && (canReportGroupMessage = userGroupLevelPermissions3.getCanReportGroupMessage()) != null) {
                    if (canReportGroupMessage.booleanValue()) {
                        if (str5 != null) {
                            bool = Boolean.valueOf(!Intrinsics.a(str5, message.getSenderId()));
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                    if (bool != null && bool.booleanValue()) {
                        l.o oVar4 = (l.o) wVar.f25761b;
                        int i23 = this$04.f10596v;
                        oVar4.add(0, i23, i23, R.string.text_report_message);
                    }
                }
                wVar.f25764e = new dj.e(this$04, i11);
                wVar.k();
                return;
            default:
                AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj3;
                ProviderSignInBase providerSignInBase = (ProviderSignInBase) obj2;
                zl.b bVar = (zl.b) obj;
                int i24 = AuthMethodPickerActivity.f10932h;
                ConnectivityManager connectivityManager = (ConnectivityManager) authMethodPickerActivity.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
                    providerSignInBase.j(authMethodPickerActivity.x().f42562b, authMethodPickerActivity, bVar.f42555a);
                    return;
                } else {
                    wo.m.g(authMethodPickerActivity.findViewById(android.R.id.content), authMethodPickerActivity.getString(R.string.fui_no_internet), -1).h();
                    return;
                }
        }
    }
}
