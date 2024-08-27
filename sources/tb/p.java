package tb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.presentation.SocialShareBroadcastReceiver;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qu.f0;
import t0.l3;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f35758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f35759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f35760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.n f35761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f35762e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l3 l3Var, FeedStreamViewModel feedStreamViewModel, Context context, c.n nVar, l3 l3Var2, yt.a aVar) {
        super(2, aVar);
        this.f35758a = l3Var;
        this.f35759b = feedStreamViewModel;
        this.f35760c = context;
        this.f35761d = nVar;
        this.f35762e = l3Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f35758a, this.f35759b, this.f35760c, this.f35761d, this.f35762e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        sb.m mVar = (sb.m) this.f35758a.getValue();
        boolean z10 = mVar instanceof sb.f;
        l3 l3Var = this.f35762e;
        if (z10) {
            sb.c cVar = sb.c.f34438b;
            String str = ((sb.d) l3Var.getValue()).f34460r;
            this.f35759b.j(cVar, Boolean.valueOf(((sb.d) l3Var.getValue()).f34461s), str, true);
        } else {
            boolean z11 = mVar instanceof sb.j;
            Context context = this.f35760c;
            if (z11) {
                String inviteTemplate = ((sb.d) l3Var.getValue()).f34451i;
                if (inviteTemplate != null) {
                    String title = context.getString(R.string.title_share);
                    Intrinsics.c(title);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(inviteTemplate, "inviteTemplate");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.SUBJECT", inviteTemplate);
                    intent.putExtra("android.intent.extra.TEXT", inviteTemplate);
                    Intent createChooser = Intent.createChooser(intent, title, PendingIntent.getBroadcast(context, 121, new Intent(context, (Class<?>) SocialShareBroadcastReceiver.class), 167772160).getIntentSender());
                    Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                    context.startActivity(createChooser);
                }
            } else if (mVar instanceof sb.k) {
                Intent intent2 = new Intent(context, (Class<?>) StockDetailHostActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("ADD_TO_PORTFOLIO", false);
                bundle.putBoolean("CALL_FROM_PORTFOLIO", false);
                bundle.putString("STOCK_NAME", ((sb.d) l3Var.getValue()).f34454l);
                intent2.putExtras(bundle);
                context.startActivity(intent2);
            } else if (mVar instanceof sb.l) {
                sb.l lVar = (sb.l) mVar;
                boolean z12 = lVar.f34511d;
                String str2 = lVar.f34509b;
                boolean z13 = lVar.f34510c;
                String str3 = lVar.f34508a;
                if (z12) {
                    Intent intent3 = new Intent(context, (Class<?>) RiaProfileActivity.class);
                    intent3.putExtra("USER_IDENTIFIER", str3);
                    intent3.putExtra("CALL_FROM_CHAT", z13);
                    intent3.putExtra("USER_NAME", str2);
                    context.startActivity(intent3);
                } else {
                    Intent intent4 = new Intent(context, (Class<?>) UserProfileActivity.class);
                    intent4.putExtra("USER_IDENTIFIER", str3);
                    intent4.putExtra("CALL_FROM_CHAT", z13);
                    intent4.putExtra("USER_NAME", str2);
                    this.f35761d.a(intent4);
                }
            } else if (mVar instanceof sb.e) {
                String text = context.getString(R.string.group_join_and_follow_message);
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
            } else if (mVar instanceof sb.g) {
                String text2 = context.getString(R.string.removing_saved_post);
                Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                }
            } else if (mVar instanceof sb.i) {
                String text3 = ((sb.d) l3Var.getValue()).f34457o;
                if (text3 != null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text3, "text");
                    if (text3.length() != 0) {
                        Toast makeText3 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService3 = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService3, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate3 = ((LayoutInflater) systemService3).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text3, (TextView) inflate3.findViewById(R.id.message), makeText3, inflate3);
                    }
                }
            } else {
                boolean z14 = mVar instanceof sb.h;
            }
        }
        return Unit.f23355a;
    }
}
