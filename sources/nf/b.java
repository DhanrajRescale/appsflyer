package nf;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import ba.v1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.UserDrawerInfo;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MainActivity mainActivity, int i10) {
        super(1);
        this.f28635a = i10;
        this.f28636b = mainActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f28635a;
        MainActivity mainActivity = this.f28636b;
        switch (i10) {
            case 1:
                ((v1) mainActivity.w()).f6365s.f6521s.setSelectedItemId(R.id.portfolio_fragment);
                return;
            case 2:
                ((v1) mainActivity.w()).f6365s.f6521s.setSelectedItemId(R.id.arena_fragment);
                return;
            case 3:
                ((v1) mainActivity.w()).f6365s.f6521s.setSelectedItemId(R.id.social_fragment);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                de.d dVar = MainActivity.f9574r;
                mainActivity.P();
                return;
            case 6:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = mainActivity.f17255c;
                    if (fVar != null) {
                        fVar.d();
                        return;
                    }
                    return;
                }
                com.kaopiz.kprogresshud.f fVar2 = mainActivity.f17255c;
                if (fVar2 != null) {
                    fVar2.b();
                    return;
                }
                return;
            case 12:
                Intrinsics.c(bool);
                if (!bool.booleanValue()) {
                    return;
                }
                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName())));
                mainActivity.finishAffinity();
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 13:
                mainActivity.K().f9591v.postValue(Boolean.TRUE);
                return;
            case 14:
                mainActivity.K().f9590u.postValue(Boolean.TRUE);
                return;
            case 15:
                mainActivity.K().f9588s.postValue(Boolean.TRUE);
                return;
            case 16:
                mainActivity.K().f9589t.postValue(Boolean.TRUE);
                return;
            case 17:
                de.d dVar2 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.B(new AnalyticEvent("app_ham_menu_champions_chart", null, 2, null));
                jr.h.u(mainActivity, 1);
                return;
            case 18:
                de.d dVar3 = MainActivity.f9574r;
                mainActivity.L();
                return;
            case 19:
                de.d dVar4 = MainActivity.f9574r;
                mainActivity.Q();
                return;
            case 20:
                de.d dVar5 = MainActivity.f9574r;
                mainActivity.N();
                return;
            case 21:
                de.d dVar6 = MainActivity.f9574r;
                mainActivity.N();
                return;
            case 22:
                View e10 = ((v1) mainActivity.w()).f6367u.e(8388611);
                if (e10 != null && DrawerLayout.m(e10)) {
                    ((v1) mainActivity.w()).f6367u.b(8388611);
                    return;
                }
                DrawerLayout drawerLayout = ((v1) mainActivity.w()).f6367u;
                View e11 = drawerLayout.e(8388611);
                if (e11 != null) {
                    drawerLayout.o(e11);
                    return;
                } else {
                    throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388611));
                }
            case 23:
                de.d dVar7 = MainActivity.f9574r;
                mainActivity.O();
                return;
            case 24:
                de.d dVar8 = MainActivity.f9574r;
                mainActivity.M();
                return;
            case 25:
                de.d dVar9 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("invite_friend", null, 2, null));
                jr.h.u(mainActivity, 3);
                return;
            case 26:
                de.d dVar10 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("rate_app", null, 2, null));
                jr.h.u(mainActivity, 7);
                return;
            case 27:
                de.d dVar11 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("about", null, 2, null));
                jr.h.u(mainActivity, 0);
                return;
            case 28:
                de.d dVar12 = MainActivity.f9574r;
                mainActivity.getClass();
                mainActivity.A(new AnalyticEvent("faq", null, 2, null));
                jr.h.u(mainActivity, 2);
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = 4;
        int i11 = this.f28635a;
        boolean z10 = true;
        MainActivity context = this.f28636b;
        switch (i11) {
            case 4:
                if (((Map) jVar.a()) != null) {
                    context.G();
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) LoginActivity.class);
                    intent.putExtra("PIN_LOGIN", true);
                    intent.putExtras(new za.c(false, 6).a());
                    context.startActivity(intent);
                    context.finish();
                    return;
                }
                return;
            case 5:
            case 6:
            default:
                if (((Unit) jVar.a()) != null) {
                    Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) MaintenanceWindowActivity.class);
                    intent2.putExtra("DATA", qf.b.f31927b);
                    context.startActivity(intent2);
                    context.finish();
                    return;
                }
                return;
            case 7:
                context.G();
                if (((Unit) jVar.a()) != null) {
                    Intent intent3 = new Intent(context, (Class<?>) LoginActivity.class);
                    context.getIntent().setFlags(268468224);
                    intent3.putExtras(new za.c(z10, i10).a());
                    context.startActivity(intent3);
                    context.finish();
                    return;
                }
                return;
            case 8:
                String text = context.getString(R.string.contact_stockgro_admin);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
                context.finish();
                return;
            case 9:
                Intent intent4 = new Intent(context, (Class<?>) LoginActivity.class);
                intent4.putExtras(new za.c(z10, i10).a());
                context.startActivity(intent4);
                context.finish();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String tag;
        int i10 = this.f28635a;
        MainActivity mainActivity = this.f28636b;
        switch (i10) {
            case 0:
                if (((dp.a) obj).f14427b == 11) {
                    ((MainViewModel) mainActivity.x()).P.postValue(Boolean.TRUE);
                }
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                d((kj.j) obj);
                return Unit.f23355a;
            case 5:
                UserDrawerInfo userDrawerInfo = (UserDrawerInfo) obj;
                String displayName = userDrawerInfo.getDisplayName();
                String avatar = userDrawerInfo.getAvatar();
                ((v1) mainActivity.w()).f6366t.f5498s.f5030s.setText(displayName);
                switch (MainActivity.f9574r.f14317a) {
                    case 14:
                        tag = "MainActivity";
                        break;
                    default:
                        de.d dVar = KycWebViewActivity.f9704k;
                        tag = "KycActivity";
                        break;
                }
                String f10 = a3.a.f("User image+ ", avatar);
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter(tag, "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(f10, "s", objArr, "params", tag).getClass();
                ek.u.k(objArr);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.c(mainActivity).f(mainActivity).m(avatar).b()).l(R.drawable.ic_placeholder_user)).z(((v1) mainActivity.w()).f6366t.f5498s.f5034w);
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                d((kj.j) obj);
                return Unit.f23355a;
            case 8:
                d((kj.j) obj);
                return Unit.f23355a;
            case 9:
                d((kj.j) obj);
                return Unit.f23355a;
            case 10:
                d((kj.j) obj);
                return Unit.f23355a;
            case 11:
                Integer num = (Integer) obj;
                if (num != null) {
                    int intValue = num.intValue();
                    de.d dVar2 = MainActivity.f9574r;
                    mainActivity.getClass();
                    MainActivity.f9575s = intValue;
                    mainActivity.V();
                }
                return Unit.f23355a;
            case 12:
                a((Boolean) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            case 14:
                a((Boolean) obj);
                return Unit.f23355a;
            case 15:
                a((Boolean) obj);
                return Unit.f23355a;
            case 16:
                a((Boolean) obj);
                return Unit.f23355a;
            case 17:
                a((Boolean) obj);
                return Unit.f23355a;
            case 18:
                a((Boolean) obj);
                return Unit.f23355a;
            case 19:
                a((Boolean) obj);
                return Unit.f23355a;
            case 20:
                a((Boolean) obj);
                return Unit.f23355a;
            case 21:
                a((Boolean) obj);
                return Unit.f23355a;
            case 22:
                a((Boolean) obj);
                return Unit.f23355a;
            case 23:
                a((Boolean) obj);
                return Unit.f23355a;
            case 24:
                a((Boolean) obj);
                return Unit.f23355a;
            case 25:
                a((Boolean) obj);
                return Unit.f23355a;
            case 26:
                a((Boolean) obj);
                return Unit.f23355a;
            case 27:
                a((Boolean) obj);
                return Unit.f23355a;
            case 28:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
