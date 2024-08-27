package je;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.m;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.list.UserGroupListActivity;
import el.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserGroupListActivity f21327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UserGroupListActivity userGroupListActivity, int i10) {
        super(1);
        this.f21326a = i10;
        this.f21327b = userGroupListActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f21326a;
        UserGroupListActivity context = this.f21327b;
        switch (i10) {
            case 0:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    String text = context.getString(R.string.text_message_forwarded);
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
                    context.finish();
                    return;
                }
                String text2 = context.getString(R.string.error_forwarding_message);
                Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    return;
                }
                return;
            default:
                m mVar = (m) context.w();
                Intrinsics.c(bool);
                mVar.f5412t.setVisibility(l.u(bool.booleanValue()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f21326a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
