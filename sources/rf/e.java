package rf;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import ba.s2;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nf.r;
import okhttp3.HttpUrl;
import wo.m;
import x.p2;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationsActivity f33703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(NotificationsActivity notificationsActivity, int i10) {
        super(1);
        this.f33702a = i10;
        this.f33703b = notificationsActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f33702a;
        NotificationsActivity notificationsActivity = this.f33703b;
        switch (i10) {
            case 0:
                s2 s2Var = (s2) notificationsActivity.w();
                Intrinsics.c(bool);
                s2Var.f6036u.setRefreshing(bool.booleanValue());
                return;
            case 3:
                int i11 = NotificationsActivity.f9619m;
                m g10 = m.g(((s2) notificationsActivity.w()).f6036u, HttpUrl.FRAGMENT_ENCODE_SET, -2);
                Intrinsics.checkNotNullExpressionValue(g10, "make(...)");
                View inflate = notificationsActivity.getLayoutInflater().inflate(R.layout.layout_custom_snackbar, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                wo.j jVar = g10.f39390i;
                jVar.setBackgroundColor(0);
                Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) jVar;
                snackbar$SnackbarLayout.setPadding(0, 0, 0, 0);
                View findViewById = inflate.findViewById(R.id.snackbar_text);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                ((TextView) findViewById).setText(notificationsActivity.getString(R.string.text_install_app));
                View findViewById2 = inflate.findViewById(R.id.snackbar_action_button);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                TextView textView = (TextView) findViewById2;
                textView.setText(notificationsActivity.getString(R.string.text_install));
                textView.setOnClickListener(new bb.a(11, notificationsActivity, g10));
                snackbar$SnackbarLayout.addView(inflate, 0);
                g10.h();
                return;
            default:
                notificationsActivity.moveTaskToBack(true);
                Process.killProcess(Process.myPid());
                System.exit(1);
                return;
        }
    }

    public final void d(Integer num) {
        int i10 = this.f33702a;
        NotificationsActivity notificationsActivity = this.f33703b;
        switch (i10) {
            case 1:
                ((NotificationsViewModel) notificationsActivity.x()).h();
                return;
            default:
                NotificationsViewModel notificationsViewModel = (NotificationsViewModel) notificationsActivity.x();
                dp.e appUpdateManager = notificationsActivity.f9621l;
                if (appUpdateManager != null) {
                    Intrinsics.c(num);
                    int intValue = num.intValue();
                    Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
                    r rVar = new r(intValue, notificationsViewModel, 1);
                    synchronized (appUpdateManager) {
                        appUpdateManager.f14445b.a(rVar);
                    }
                    int intValue2 = num.intValue();
                    dp.e Y0 = dp.b.Y0(notificationsActivity);
                    Intrinsics.checkNotNullExpressionValue(Y0, "create(...)");
                    Task b10 = Y0.b();
                    Intrinsics.checkNotNullExpressionValue(b10, "getAppUpdateInfo(...)");
                    b10.addOnSuccessListener(new jf.g(23, new p2(intValue2, notificationsActivity, Y0)));
                    return;
                }
                Intrinsics.k("appUpdateManager");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33702a;
        NotificationsActivity notificationsActivity = this.f33703b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                d((Integer) obj);
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    LinearLayout noNotificationsContainer = ((s2) notificationsActivity.w()).f6034s;
                    Intrinsics.checkNotNullExpressionValue(noNotificationsContainer, "noNotificationsContainer");
                    zq.f.M(noNotificationsContainer);
                    RecyclerView notificationsRecyclerView = ((s2) notificationsActivity.w()).f6035t;
                    Intrinsics.checkNotNullExpressionValue(notificationsRecyclerView, "notificationsRecyclerView");
                    zq.f.m0(notificationsRecyclerView);
                    g gVar = notificationsActivity.f9620k;
                    if (gVar != null) {
                        gVar.u(list);
                        NotificationsViewModel notificationsViewModel = (NotificationsViewModel) notificationsActivity.x();
                        nt.h c10 = notificationsViewModel.f9624n.markAllNotificationsRead().c(((kq.e) notificationsViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new jf.g(26, d.f33699i), new jf.g(27, d.f33700j));
                        c10.a(dVar);
                        notificationsViewModel.f9080c.c(dVar);
                    } else {
                        Intrinsics.k("notificationsCategoryAdapter");
                        throw null;
                    }
                } else {
                    LinearLayout noNotificationsContainer2 = ((s2) notificationsActivity.w()).f6034s;
                    Intrinsics.checkNotNullExpressionValue(noNotificationsContainer2, "noNotificationsContainer");
                    zq.f.m0(noNotificationsContainer2);
                    RecyclerView notificationsRecyclerView2 = ((s2) notificationsActivity.w()).f6035t;
                    Intrinsics.checkNotNullExpressionValue(notificationsRecyclerView2, "notificationsRecyclerView");
                    zq.f.M(notificationsRecyclerView2);
                }
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                d((Integer) obj);
                return Unit.f23355a;
            default:
                NotificationDto it = (NotificationDto) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = NotificationsActivity.f9619m;
                notificationsActivity.getClass();
                String type = it.getType();
                if (Intrinsics.a(type, notificationsActivity.getString(R.string.text_payment))) {
                    notificationsActivity.startActivity(new Intent(notificationsActivity, (Class<?>) WalletHomeActivity.class));
                } else if (Intrinsics.a(type, notificationsActivity.getString(R.string.app_update)) || Intrinsics.a(type, notificationsActivity.getString(R.string.app_update_two))) {
                    NotificationsViewModel notificationsViewModel2 = (NotificationsViewModel) notificationsActivity.x();
                    at.m<BaseResponseDto<AppVersionResponseDto>> latestAppVersion = notificationsViewModel2.f9081d.getLatestAppVersion();
                    kq.e eVar = (kq.e) notificationsViewModel2.f9079b;
                    nt.h hVar = new nt.h(latestAppVersion.c(eVar.J()), eVar.Q(), 0);
                    jt.d dVar2 = new jt.d(new jf.g(28, new j(notificationsViewModel2, 0)), new jf.g(29, d.f33698h));
                    hVar.a(dVar2);
                    notificationsViewModel2.f9080c.c(dVar2);
                    Toast.makeText(notificationsActivity, notificationsActivity.getString(R.string.checking_app_update), 0).show();
                } else {
                    String redirectUrl = it.getRedirectUrl();
                    if (redirectUrl != null && redirectUrl.length() != 0) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(redirectUrl));
                        notificationsActivity.startActivity(intent);
                    }
                }
                return Unit.f23355a;
        }
    }
}
