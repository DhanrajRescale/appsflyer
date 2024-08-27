package gd;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.AuthUiModel;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.auth.util.linkedin.helpers.LinkedInAuthenticationActivity;
import com.facebook.login.LoginManager;
import com.google.android.gms.common.Scopes;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.p0;
import vt.y;

/* loaded from: classes.dex */
public abstract class f extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final ArrayList f17265m = y.h(Scopes.EMAIL, "public_profile");

    /* renamed from: k, reason: collision with root package name */
    public final LoginManager f17266k = LoginManager.f10882f.m();

    /* renamed from: l, reason: collision with root package name */
    public final nl.j f17267l = new nl.j();

    public final void K(AuthType authType) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        int i10 = e.f17264a[authType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                C(new AnalyticEvent("social_auth_init", p0.f(new Pair("platform", AuthType.LINKEDIN), new Pair("userId", M()))));
                Intrinsics.checkNotNullParameter(this, "context");
                Intent intent = new Intent(this, (Class<?>) LinkedInAuthenticationActivity.class);
                intent.putExtra(PaymentConstants.CLIENT_ID, "8689q2q53gx356");
                intent.putExtra("client_secret", "XgpNzVl3J6mfS49I");
                intent.putExtra("redirect_uri", "https://stockgro.onelink.me/vNON/mega6my1");
                if (intent.getStringExtra(PaymentConstants.CLIENT_ID) != null && intent.getStringExtra("client_secret") != null && intent.getStringExtra("redirect_uri") != null) {
                    Random random = new Random();
                    StringBuilder sb2 = new StringBuilder(16);
                    for (int i11 = 0; i11 < 16; i11++) {
                        sb2.append("0123456789qwertyuiopasdfghjklzxcvbnmMNBVCXZLKJHGFDSAQWERTYUIOP".charAt(random.nextInt(62)));
                    }
                    intent.putExtra("state", sb2.toString());
                    startActivityForResult(intent, 1234);
                    return;
                }
                return;
            }
            return;
        }
        C(new AnalyticEvent("social_auth_init", p0.f(new Pair("platform", AuthType.FACEBOOK), new Pair("userId", M()))));
        this.f17266k.b(this, f17265m);
    }

    public abstract void L();

    public abstract String M();

    public abstract void N();

    public abstract void O();

    public abstract void P(SocialDataDto socialDataDto);

    public final void Q() {
        h.i iVar = new h.i(this, R.style.StockgroDialogTheme);
        iVar.f17693a.f17611f = getString(R.string.text_social_auth_error);
        iVar.setPositiveButton(R.string.ok, new ab.h(1)).c();
    }

    public final void R(AuthUiModel authModel) {
        Pair pair;
        Intrinsics.checkNotNullParameter(authModel, "authModel");
        if (authModel.getSuccess()) {
            String text = getString(R.string.text_auth_successful);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            AuthType authType = null;
            if (text.length() != 0) {
                Toast makeText = Toast.makeText(this, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService = getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
            }
            xh.a error = authModel.getError();
            if (error != null && (pair = (Pair) error.f40260a) != null) {
                authType = (AuthType) pair.f23353a;
            }
            if (authType == AuthType.FACEBOOK) {
                O();
            }
            N();
            return;
        }
        if (authModel.getError() != null) {
            authModel.getError().getClass();
            Q();
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Unit unit;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1234 && i11 == -1 && intent != null) {
            yh.a aVar = (yh.a) intent.getParcelableExtra("social_login");
            if (aVar != null) {
                P(new SocialDataDto(M(), aVar.f41638c, aVar.f41637b, aVar.f41640e));
                C(new AnalyticEvent("social_auth_success", p0.f(new Pair("platform", AuthType.LINKEDIN), new Pair("userId", M()), new Pair("EVENT_TYPE", "EVENT_SUCCESS"))));
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit == null) {
                R(new AuthUiModel(new xh.a(new Pair(AuthType.LINKEDIN, getString(R.string.error_verifying))), false));
                return;
            }
            return;
        }
        if (i10 == 1234 && i11 == 0) {
            if (intent != null) {
                int intExtra = intent.getIntExtra("err_code", 0);
                if (intExtra != 11) {
                    if (intExtra == 12) {
                        intent.getStringExtra("error");
                        Pair pair = new Pair("platform", AuthType.LINKEDIN);
                        Pair pair2 = new Pair("userId", M());
                        Pair pair3 = new Pair("social_auth_error", "social_auth_error");
                        L();
                        C(new AnalyticEvent("social_auth_error", p0.f(pair, pair2, pair3, new Pair("description", Unit.f23355a), new Pair("EVENT_TYPE", "ERROR_FAILED"))));
                        return;
                    }
                    return;
                }
                C(new AnalyticEvent("social_auth_error", p0.f(new Pair("platform", AuthType.LINKEDIN), new Pair("userId", M()), new Pair("EVENT_TYPE", "ERROR_USER_DENIED"))));
                return;
            }
            return;
        }
        this.f17267l.a(i10, i11, intent);
    }
}
