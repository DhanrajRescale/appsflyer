package hi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import iu.k;
import java.util.HashMap;
import java.util.Map;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f18487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SplashActivity splashActivity, int i10) {
        super(1);
        this.f18486a = i10;
        this.f18487b = splashActivity;
    }

    public final void a(j jVar) {
        Bundle extras;
        int i10 = this.f18486a;
        SplashActivity splashActivity = this.f18487b;
        switch (i10) {
            case 0:
                HashMap hashMap = (HashMap) jVar.a();
                if (hashMap != null) {
                    splashActivity.A(new AnalyticEvent("app_open", hashMap));
                    return;
                }
                return;
            case 1:
                if (((Map) jVar.a()) != null) {
                    Intent intent = new Intent(splashActivity, (Class<?>) LoginActivity.class);
                    intent.putExtra("PIN_LOGIN", true);
                    Intent intent2 = splashActivity.getIntent();
                    if (intent2 != null && (extras = intent2.getExtras()) != null) {
                        intent.putExtras(extras);
                    }
                    splashActivity.startActivity(intent);
                    splashActivity.finish();
                    return;
                }
                return;
            case 2:
                Bundle bundle = (Bundle) jVar.a();
                if (bundle != null) {
                    Intent intent3 = new Intent(splashActivity, (Class<?>) MainActivity.class);
                    intent3.putExtras(bundle);
                    splashActivity.startActivity(intent3);
                    splashActivity.finish();
                    return;
                }
                return;
            default:
                Intent intent4 = new Intent(splashActivity, (Class<?>) LoginActivity.class);
                intent4.putExtras(new za.c(true, 4).a());
                splashActivity.startActivity(intent4);
                splashActivity.finish();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18486a) {
            case 0:
                a((j) obj);
                return Unit.f23355a;
            case 1:
                a((j) obj);
                return Unit.f23355a;
            case 2:
                a((j) obj);
                return Unit.f23355a;
            case 3:
                a((j) obj);
                return Unit.f23355a;
            default:
                String text = (String) obj;
                Intrinsics.c(text);
                SplashActivity context = this.f18487b;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
        }
    }
}
